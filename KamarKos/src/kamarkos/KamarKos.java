/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kamarkos;

/**
 *
 * @author Win 10
 */
import java.io.*;

class KamarKos {
 public static void main (String [] args) throws IOException{
  String nama="",kamar="";
  int jenis=0,lama=0,tarif=0;
  double bayar=0;
  
  BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
  
  //input
  System.out.println("--**-- APLIKASI SEWA KAMAR KOS --**--");
  System.out.print("Nama Pelanggan \t\t\t: ");
  nama = br.readLine();
  
  System.out.println("\nPilih Jenis Kamar");
  System.out.println("1. Standart Room Rp 600.000/bulan");
  System.out.println("2. Deluxe Room Rp 700.000/bulan");
  System.out.println("3. Suite Room Rp 850.000/bulan");
  System.out.println("4. President Room Rp 1.000.000/bulan");
  System.out.print("Jenis kamar yang dipesan \t: ");
  jenis = Integer.parseInt(br.readLine());
  
  System.out.print("\nLama Menginap Berapa bulan \t: ");
  lama = Integer.parseInt(br.readLine());
  
  
  //proses perhitungan
  if (jenis==1){
   tarif = lama*600000;
   kamar="Standart Room";
  }else if (jenis==2){
   tarif = lama*700000;
   kamar="Deluxe Room";
  }
  else if (jenis==3) {
    tarif = lama*850000;
    kamar="Suite Room";
  }
  else if (jenis==4){
   tarif = lama*1000000;
   kamar="President Room";
  }
  
  bayar = tarif;
  
  //output
  System.out.println("\n\n---***--- NOTA PEMBAYARAN KAMAR KOS ---***---");
  System.out.println("Nama Pelanggan \t\t\t: " + nama);
  System.out.println("Jenis Kamar \t\t\t: " + kamar);
  System.out.println("Tarif Penginapan \t\t: Rp " + tarif + ",-");
  System.out.println("Nominal yang harus dibayar \t: Rp " + bayar + ",-");
  System.out.println("====================================================");
 }
}
