package typings.bigi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bigi", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.bigi.mod.bigi {
    def this(a: js.Any, b: js.Any, c: js.Any) = this()
  }
  
  @JSImport("bigi", "ONE")
  @js.native
  val ONE: typings.bigi.mod.bigi with Constants = js.native
  
  @JSImport("bigi", "ZERO")
  @js.native
  val ZERO: typings.bigi.mod.bigi with Constants = js.native
  
  /* static member */
  @JSImport("bigi", "fromBuffer")
  @js.native
  def fromBuffer(buffer: js.Any): typings.bigi.mod.bigi = js.native
  
  /* static member */
  @JSImport("bigi", "fromByteArrayUnsigned")
  @js.native
  def fromByteArrayUnsigned(): js.Array[Double] = js.native
  @JSImport("bigi", "fromByteArrayUnsigned")
  @js.native
  def fromByteArrayUnsigned(byteArray: js.Any): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("bigi", "fromDERInteger")
  @js.native
  def fromDERInteger(): Double = js.native
  @JSImport("bigi", "fromDERInteger")
  @js.native
  def fromDERInteger(byteArray: js.Any): Double = js.native
  
  /* static member */
  @JSImport("bigi", "fromHex")
  @js.native
  def fromHex(hex: String): typings.bigi.mod.bigi = js.native
  
  /* static member */
  @JSImport("bigi", "isBigInteger")
  @js.native
  def isBigInteger(obj: js.Any, check_ver: js.Any): /* is bigi.bigi.bigi */ Boolean = js.native
  
  /* static member */
  @JSImport("bigi", "valueOf")
  @js.native
  def valueOf_(i: js.Any): typings.bigi.mod.bigi = js.native
  
  @js.native
  trait Constants extends StObject {
    
    val DB: Double = js.native
    
    val DM: Double = js.native
    
    val DV: Double = js.native
    
    val F1: Double = js.native
    
    val F2: Double = js.native
    
    val FV: Double = js.native
    
    val s: Double = js.native
    
    val t: Double = js.native
  }
  object Constants {
    
    @scala.inline
    def apply(DB: Double, DM: Double, DV: Double, F1: Double, F2: Double, FV: Double, s: Double, t: Double): Constants = {
      val __obj = js.Dynamic.literal(DB = DB.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DV = DV.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], FV = FV.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDB(value: Double): Self = StObject.set(x, "DB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDM(value: Double): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDV(value: Double): Self = StObject.set(x, "DV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF1(value: Double): Self = StObject.set(x, "F1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF2(value: Double): Self = StObject.set(x, "F2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFV(value: Double): Self = StObject.set(x, "FV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait bigi extends StObject {
    
    def abs(): js.Any = js.native
    
    def add(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def addTo(a: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def am(i: js.Any, x: js.Any, w: js.Any, j: js.Any, c: js.Any, n: js.Any): js.Any = js.native
    
    def and(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def andNot(a: js.Any): js.Any = js.native
    
    def bitCount(): js.Any = js.native
    
    def bitLength(): js.Any = js.native
    
    def bitwiseTo(a: js.Any, op: js.Any, r: js.Any): Unit = js.native
    
    def byteLength(): js.Any = js.native
    
    def byteValue(): js.Any = js.native
    
    def changeBit(n: js.Any, op: js.Any): js.Any = js.native
    
    def chunkSize(r: js.Any): js.Any = js.native
    
    def clamp(): Unit = js.native
    
    def clearBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def compareTo(a: typings.bigi.mod.bigi): Double = js.native
    
    def copyTo(r: js.Any): Unit = js.native
    
    def dAddOffset(n: js.Any, w: js.Any): Unit = js.native
    
    def dMultiply(n: Double): Unit = js.native
    
    def divRemTo(m: js.Any, q: js.Any, r: js.Any): Unit = js.native
    
    def divide(a: js.Any): js.Any = js.native
    
    def divideAndRemainder(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def dlShiftTo(n: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def drShiftTo(n: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def equals(a: typings.bigi.mod.bigi): Boolean = js.native
    
    def exp(e: js.Any, z: js.Any): js.Any = js.native
    
    def flipBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def fromInt(x: js.Any): Unit = js.native
    
    def fromNumber(a: js.Any, b: js.Any, c: js.Any): Unit = js.native
    
    def fromRadix(s: js.Any, b: js.Any): Unit = js.native
    
    def fromString(s: js.Any, b: js.Any): Unit = js.native
    
    def gcd(a: js.Any): js.Any = js.native
    
    def getLowestSetBit(): js.Any = js.native
    
    def intValue(): Double = js.native
    
    def invDigit(): js.Any = js.native
    
    def isEven(): Boolean = js.native
    
    def isProbablePrime(t: js.Any): Boolean = js.native
    
    def lShiftTo(n: js.Any, r: js.Any): Unit = js.native
    
    def max(a: js.Any): js.Any = js.native
    
    def millerRabin(t: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def min(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def mod(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def modInt(n: Double): typings.bigi.mod.bigi = js.native
    
    def modInverse(m: Double): typings.bigi.mod.bigi = js.native
    
    def modPow(e: js.Any, m: js.Any): js.Any = js.native
    
    def modPowInt(e: js.Any, m: js.Any): js.Any = js.native
    
    def multiply(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def multiplyLowerTo(a: typings.bigi.mod.bigi, n: js.Any, r: js.Any): Unit = js.native
    
    def multiplyTo(a: typings.bigi.mod.bigi, r: js.Any): Unit = js.native
    
    def multiplyUpperTo(a: typings.bigi.mod.bigi, n: js.Any, r: js.Any): Unit = js.native
    
    def negate(): typings.bigi.mod.bigi = js.native
    
    def not(): typings.bigi.mod.bigi = js.native
    
    def or(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def pow(e: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def rShiftTo(n: typings.bigi.mod.bigi, r: js.Any): Unit = js.native
    
    def remainder(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def setBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def shiftLeft(n: Double): typings.bigi.mod.bigi = js.native
    
    def shiftRight(n: Double): typings.bigi.mod.bigi = js.native
    
    def shortValue(): typings.bigi.mod.bigi = js.native
    
    def signum(): typings.bigi.mod.bigi = js.native
    
    def square(): typings.bigi.mod.bigi = js.native
    
    def squareTo(r: js.Any): Unit = js.native
    
    def subTo(a: js.Any, r: js.Any): Unit = js.native
    
    def subtract(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def testBit(n: js.Any): js.Any = js.native
    
    def toBuffer(size: Double): js.Any = js.native
    
    def toByteArray(): js.Any = js.native
    
    def toByteArrayUnsigned(): js.Any = js.native
    
    def toDERInteger(): js.Any = js.native
    
    def toHex(): String = js.native
    def toHex(size: Double): String = js.native
    
    def toRadix(b: Double): String = js.native
    
    def toString(b: js.Any): String = js.native
    
    def xor(a: js.Any): js.Any = js.native
  }
}
