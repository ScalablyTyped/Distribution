package typings.bigi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bigi", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.bigi.mod.bigi {
    def this(a: Any, b: Any, c: Any) = this()
  }
  @JSImport("bigi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bigi", "ONE")
  @js.native
  val ONE: typings.bigi.mod.bigi & Constants = js.native
  
  @JSImport("bigi", "ZERO")
  @js.native
  val ZERO: typings.bigi.mod.bigi & Constants = js.native
  
  /* static member */
  inline def fromBuffer(buffer: Any): typings.bigi.mod.bigi = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.bigi.mod.bigi]
  
  /* static member */
  inline def fromByteArrayUnsigned(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArrayUnsigned")().asInstanceOf[js.Array[Double]]
  inline def fromByteArrayUnsigned(byteArray: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArrayUnsigned")(byteArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def fromDERInteger(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDERInteger")().asInstanceOf[Double]
  inline def fromDERInteger(byteArray: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDERInteger")(byteArray.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def fromHex(hex: String): typings.bigi.mod.bigi = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.bigi.mod.bigi]
  
  /* static member */
  inline def isBigInteger(obj: Any, check_ver: Any): /* is bigi.bigi.bigi */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBigInteger")(obj.asInstanceOf[js.Any], check_ver.asInstanceOf[js.Any])).asInstanceOf[/* is bigi.bigi.bigi */ Boolean]
  
  /* static member */
  inline def valueOf_(i: Any): typings.bigi.mod.bigi = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(i.asInstanceOf[js.Any]).asInstanceOf[typings.bigi.mod.bigi]
  
  trait Constants extends StObject {
    
    val DB: Double
    
    val DM: Double
    
    val DV: Double
    
    val F1: Double
    
    val F2: Double
    
    val FV: Double
    
    val s: Double
    
    val t: Double
  }
  object Constants {
    
    inline def apply(DB: Double, DM: Double, DV: Double, F1: Double, F2: Double, FV: Double, s: Double, t: Double): Constants = {
      val __obj = js.Dynamic.literal(DB = DB.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DV = DV.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], FV = FV.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    extension [Self <: Constants](x: Self) {
      
      inline def setDB(value: Double): Self = StObject.set(x, "DB", value.asInstanceOf[js.Any])
      
      inline def setDM(value: Double): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDV(value: Double): Self = StObject.set(x, "DV", value.asInstanceOf[js.Any])
      
      inline def setF1(value: Double): Self = StObject.set(x, "F1", value.asInstanceOf[js.Any])
      
      inline def setF2(value: Double): Self = StObject.set(x, "F2", value.asInstanceOf[js.Any])
      
      inline def setFV(value: Double): Self = StObject.set(x, "FV", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait bigi extends StObject {
    
    def abs(): Any = js.native
    
    def add(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def addTo(a: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def am(i: Any, x: Any, w: Any, j: Any, c: Any, n: Any): Any = js.native
    
    def and(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def andNot(a: Any): Any = js.native
    
    def bitCount(): Any = js.native
    
    def bitLength(): Any = js.native
    
    def bitwiseTo(a: Any, op: Any, r: Any): Unit = js.native
    
    def byteLength(): Any = js.native
    
    def byteValue(): Any = js.native
    
    def changeBit(n: Any, op: Any): Any = js.native
    
    def chunkSize(r: Any): Any = js.native
    
    def clamp(): Unit = js.native
    
    def clearBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def compareTo(a: typings.bigi.mod.bigi): Double = js.native
    
    def copyTo(r: Any): Unit = js.native
    
    def dAddOffset(n: Any, w: Any): Unit = js.native
    
    def dMultiply(n: Double): Unit = js.native
    
    def divRemTo(m: Any, q: Any, r: Any): Unit = js.native
    
    def divide(a: Any): Any = js.native
    
    def divideAndRemainder(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def dlShiftTo(n: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def drShiftTo(n: typings.bigi.mod.bigi, r: Double): Unit = js.native
    
    def equals(a: typings.bigi.mod.bigi): Boolean = js.native
    
    def exp(e: Any, z: Any): Any = js.native
    
    def flipBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def fromInt(x: Any): Unit = js.native
    
    def fromNumber(a: Any, b: Any, c: Any): Unit = js.native
    
    def fromRadix(s: Any, b: Any): Unit = js.native
    
    def fromString(s: Any, b: Any): Unit = js.native
    
    def gcd(a: Any): Any = js.native
    
    def getLowestSetBit(): Any = js.native
    
    def intValue(): Double = js.native
    
    def invDigit(): Any = js.native
    
    def isEven(): Boolean = js.native
    
    def isProbablePrime(t: Any): Boolean = js.native
    
    def lShiftTo(n: Any, r: Any): Unit = js.native
    
    def max(a: Any): Any = js.native
    
    def millerRabin(t: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def min(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def mod(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def modInt(n: Double): typings.bigi.mod.bigi = js.native
    
    def modInverse(m: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def modPow(e: Any, m: Any): Any = js.native
    
    def modPowInt(e: Any, m: Any): Any = js.native
    
    def multiply(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def multiplyLowerTo(a: typings.bigi.mod.bigi, n: Any, r: Any): Unit = js.native
    
    def multiplyTo(a: typings.bigi.mod.bigi, r: Any): Unit = js.native
    
    def multiplyUpperTo(a: typings.bigi.mod.bigi, n: Any, r: Any): Unit = js.native
    
    def negate(): typings.bigi.mod.bigi = js.native
    
    def not(): typings.bigi.mod.bigi = js.native
    
    def or(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def pow(e: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def rShiftTo(n: typings.bigi.mod.bigi, r: Any): Unit = js.native
    
    def remainder(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def setBit(n: Double): typings.bigi.mod.bigi = js.native
    
    def shiftLeft(n: Double): typings.bigi.mod.bigi = js.native
    
    def shiftRight(n: Double): typings.bigi.mod.bigi = js.native
    
    def shortValue(): typings.bigi.mod.bigi = js.native
    
    def signum(): typings.bigi.mod.bigi = js.native
    
    def square(): typings.bigi.mod.bigi = js.native
    
    def squareTo(r: Any): Unit = js.native
    
    def subTo(a: Any, r: Any): Unit = js.native
    
    def subtract(a: typings.bigi.mod.bigi): typings.bigi.mod.bigi = js.native
    
    def testBit(n: Any): Any = js.native
    
    def toBuffer(size: Double): Any = js.native
    
    def toByteArray(): Any = js.native
    
    def toByteArrayUnsigned(): Any = js.native
    
    def toDERInteger(): Any = js.native
    
    def toHex(): String = js.native
    def toHex(size: Double): String = js.native
    
    def toRadix(b: Double): String = js.native
    
    def toString(b: Any): String = js.native
    
    def xor(a: Any): Any = js.native
  }
}
