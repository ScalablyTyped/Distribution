package typings.bigint

import typings.bigint.BigInt.IRandom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BigInt {
    
    @JSGlobal("BigInt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def GCD(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("GCD")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def GCD_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("GCD_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def addInt(x: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("addInt")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def addInt_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInt_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addShift_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def add_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bigInt2str(x: typings.bigint.BigInt.BigInt, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bigInt2str")(x.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def bigInt2str(x: typings.bigint.BigInt.BigInt, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bigInt2str")(x.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def bitSize(x: typings.bigint.BigInt.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitSize")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def carry(x: typings.bigint.BigInt.BigInt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("carry_")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def copy(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def copyInt(x: typings.bigint.BigInt.BigInt, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyInt_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def divInt(x: typings.bigint.BigInt.BigInt, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("divInt_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def divide(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      q: typings.bigint.BigInt.BigInt,
      r: typings.bigint.BigInt.BigInt
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("divide_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], q.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dup(x: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("dup")(x.asInstanceOf[js.Any]).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def eGCD(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      d: typings.bigint.BigInt.BigInt,
      a: typings.bigint.BigInt.BigInt,
      b: typings.bigint.BigInt.BigInt
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eGCD_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def equalsInt(x: typings.bigint.BigInt.BigInt, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsInt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def equals_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def expand(value: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(value.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def findPrimes(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPrimes")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def greater(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def greaterShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, shift: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterShift")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def halve(x: typings.bigint.BigInt.BigInt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("halve_")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def int2bigInt(t: Double): typings.bigint.BigInt.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("int2bigInt")(t.asInstanceOf[js.Any]).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def int2bigInt(t: Double, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("int2bigInt")(t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def int2bigInt(t: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("int2bigInt")(t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def int2bigInt(t: Double, n: Unit, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("int2bigInt")(t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def inverseMod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseMod")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def inverseModInt(x: Double, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseModInt")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def inverseMod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseMod_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isZero(x: typings.bigint.BigInt.BigInt): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZero")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def leftShift(x: typings.bigint.BigInt.BigInt, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("leftShift_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def linComb(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, a: Double, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linComb_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def linCombShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, b: Double, ys: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linCombShift_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def millerRabin(x: typings.bigint.BigInt.BigInt, b: typings.bigint.BigInt.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("millerRabin")(x.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def millerRabinInt(x: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("millerRabinInt")(x.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def mod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def modInt(x: typings.bigint.BigInt.BigInt, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modInt")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def mod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mod_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mont(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      n: typings.bigint.BigInt.BigInt,
      np: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mont_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], n.asInstanceOf[js.Any], np.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mult(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mult")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def multInt(x: typings.bigint.BigInt.BigInt, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("multInt_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def multMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("multMod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def multMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("multMod_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mult_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mult_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def negative(x: typings.bigint.BigInt.BigInt): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def powMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("powMod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def powMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("powMod_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def randBigInt(n: Double, s: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("randBigInt")(n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def randBigInt_(b: typings.bigint.BigInt.BigInt, n: Double, s: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randBigInt_")(b.asInstanceOf[js.Any], n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def randProbPrime(k: Double): typings.bigint.BigInt.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("randProbPrime")(k.asInstanceOf[js.Any]).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def randTruePrime(k: Double): typings.bigint.BigInt.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("randTruePrime")(k.asInstanceOf[js.Any]).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def randTruePrime_(ans: typings.bigint.BigInt.BigInt, k: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randTruePrime_")(ans.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rightShift(x: typings.bigint.BigInt.BigInt, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rightShift_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setRandom(random: IRandom): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRandom")(random.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def squareMod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("squareMod_")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def str2bigInt(s: String, b: String): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: String, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: String, n: Double, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: String, n: Unit, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: Double, n: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    inline def str2bigInt(s: String, b: Double, n: Unit, m: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("str2bigInt")(s.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def sub(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
    
    inline def subShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subShift_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sub_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sub_")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trim(x: typings.bigint.BigInt.BigInt, k: Double): typings.bigint.BigInt.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[typings.bigint.BigInt.BigInt]
  }
}
