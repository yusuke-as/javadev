package my.util;
import java.util.*;
public class Common{
	public static void reverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void shuffle(int[] arr){
		Random rand=new Random();
		for(int i=0;i<arr.length-1;i++){
			int index=rand.nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void sort(int[] arr,boolean isDesc){
		if(!isDesc){
			sort(arr);	
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[index]>arr[j]){
					index=j;
				}
			}
			if(index!=i){
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
		}
	}
	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int pick=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>pick){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=pick;
		}
	}
	public static int maxOf(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	public static int minOf(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}
	public static int gcdOf(int a,int b){
		int mod=a%b;
		if(mod==0){
			return b;
		}else{
			return gcdOf(b,mod);
		}
	}
	public static void print(String msg){
		System.out.println(msg);
	}
	public static void print(int msg){
		System.out.println(msg);
	}
	public static void print(double msg){
		System.out.println(msg);
	}
	public static void print(String msg,String delimiter){
		System.out.print(msg+delimiter);
	}
	public static void print(int i,String delimiter){
		System.out.print(i+delimiter);
	}
	public static void print(double d,String delimiter){
		System.out.print(d+delimiter);
	}
	public static int input(String msg){
		print(msg,"");
		int n=new java.util.Scanner(System.in).nextInt();
		return n;
	}
	public static String inputStr(String msg){
		print(msg,"");
		String str=new java.util.Scanner(System.in).next();
		return str;
	}
	public static String inputLine(String msg){
		print(msg,"");
		String str=new java.util.Scanner(System.in).nextLine();
		return str;
	}
	public static int rand(int a,int b){
		Random rand =new Random();
		return rand.nextInt(b-a+1)+a;
	}
}
