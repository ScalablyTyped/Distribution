package typings.bigint

import typings.bigint.BigInt.IRandom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BigInt {
    
    @JSGlobal("BigInt.GCD")
    @js.native
    def GCD(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.GCD_")
    @js.native
    def GCD_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.add")
    @js.native
    def add(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.addInt")
    @js.native
    def addInt(x: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.addInt_")
    @js.native
    def addInt_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSGlobal("BigInt.addShift_")
    @js.native
    def addShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = js.native
    
    @JSGlobal("BigInt.add_")
    @js.native
    def add_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.bigInt2str")
    @js.native
    def bigInt2str(x: typings.bigint.BigInt.BigInt, base: String): String = js.native
    @JSGlobal("BigInt.bigInt2str")
    @js.native
    def bigInt2str(x: typings.bigint.BigInt.BigInt, base: Double): String = js.native
    
    @JSGlobal("BigInt.bitSize")
    @js.native
    def bitSize(x: typings.bigint.BigInt.BigInt): Double = js.native
    
    @JSGlobal("BigInt.carry_")
    @js.native
    def carry(x: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.copy_")
    @js.native
    def copy(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.copyInt_")
    @js.native
    def copyInt(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSGlobal("BigInt.divInt_")
    @js.native
    def divInt(x: typings.bigint.BigInt.BigInt, n: Double): Double = js.native
    
    @JSGlobal("BigInt.divide_")
    @js.native
    def divide(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      q: typings.bigint.BigInt.BigInt,
      r: typings.bigint.BigInt.BigInt
    ): Unit = js.native
    
    @JSGlobal("BigInt.dup")
    @js.native
    def dup(x: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.eGCD_")
    @js.native
    def eGCD(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      d: typings.bigint.BigInt.BigInt,
      a: typings.bigint.BigInt.BigInt,
      b: typings.bigint.BigInt.BigInt
    ): Unit = js.native
    
    @JSGlobal("BigInt.equalsInt")
    @js.native
    def equalsInt(x: typings.bigint.BigInt.BigInt, y: Double): Boolean = js.native
    
    @JSGlobal("BigInt.equals")
    @js.native
    def equals_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.expand")
    @js.native
    def expand(value: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.findPrimes")
    @js.native
    def findPrimes(n: Double): js.Array[Double] = js.native
    
    @JSGlobal("BigInt.greater")
    @js.native
    def greater(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.greaterShift")
    @js.native
    def greaterShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, shift: Double): Boolean = js.native
    
    @JSGlobal("BigInt.halve_")
    @js.native
    def halve(x: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.int2bigInt")
    @js.native
    def int2bigInt(t: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.int2bigInt")
    @js.native
    def int2bigInt(t: Double, n: js.UndefOr[scala.Nothing], m: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.int2bigInt")
    @js.native
    def int2bigInt(t: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.int2bigInt")
    @js.native
    def int2bigInt(t: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.inverseMod")
    @js.native
    def inverseMod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.inverseModInt")
    @js.native
    def inverseModInt(x: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.inverseMod_")
    @js.native
    def inverseMod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.isZero")
    @js.native
    def isZero(x: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.leftShift_")
    @js.native
    def leftShift(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSGlobal("BigInt.linComb_")
    @js.native
    def linComb(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, a: Double, b: Double): Unit = js.native
    
    @JSGlobal("BigInt.linCombShift_")
    @js.native
    def linCombShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, b: Double, ys: Double): Unit = js.native
    
    @JSGlobal("BigInt.millerRabin")
    @js.native
    def millerRabin(x: typings.bigint.BigInt.BigInt, b: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.millerRabinInt")
    @js.native
    def millerRabinInt(x: Double, b: Double): Boolean = js.native
    
    @JSGlobal("BigInt.mod")
    @js.native
    def mod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.modInt")
    @js.native
    def modInt(x: typings.bigint.BigInt.BigInt, n: Double): Double = js.native
    
    @JSGlobal("BigInt.mod_")
    @js.native
    def mod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.mont_")
    @js.native
    def mont(
      x: typings.bigint.BigInt.BigInt,
      y: typings.bigint.BigInt.BigInt,
      n: typings.bigint.BigInt.BigInt,
      np: Double
    ): Unit = js.native
    
    @JSGlobal("BigInt.mult")
    @js.native
    def mult(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.multInt_")
    @js.native
    def multInt(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSGlobal("BigInt.multMod")
    @js.native
    def multMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.multMod_")
    @js.native
    def multMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.mult_")
    @js.native
    def mult_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.negative")
    @js.native
    def negative(x: typings.bigint.BigInt.BigInt): Boolean = js.native
    
    @JSGlobal("BigInt.powMod")
    @js.native
    def powMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.powMod_")
    @js.native
    def powMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.randBigInt")
    @js.native
    def randBigInt(n: Double, s: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.randBigInt_")
    @js.native
    def randBigInt_(b: typings.bigint.BigInt.BigInt, n: Double, s: Double): Unit = js.native
    
    @JSGlobal("BigInt.randProbPrime")
    @js.native
    def randProbPrime(k: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.randTruePrime")
    @js.native
    def randTruePrime(k: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.randTruePrime_")
    @js.native
    def randTruePrime_(ans: typings.bigint.BigInt.BigInt, k: Double): Unit = js.native
    
    @JSGlobal("BigInt.rightShift_")
    @js.native
    def rightShift(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
    
    @JSGlobal("BigInt.setRandom")
    @js.native
    def setRandom(random: IRandom): Unit = js.native
    
    @JSGlobal("BigInt.squareMod_")
    @js.native
    def squareMod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: String): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: String, n: js.UndefOr[scala.Nothing], m: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: String, n: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: String, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: Double, n: js.UndefOr[scala.Nothing], m: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
    @JSGlobal("BigInt.str2bigInt")
    @js.native
    def str2bigInt(s: String, b: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.sub")
    @js.native
    def sub(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
    
    @JSGlobal("BigInt.subShift_")
    @js.native
    def subShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = js.native
    
    @JSGlobal("BigInt.sub_")
    @js.native
    def sub_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
    
    @JSGlobal("BigInt.trim")
    @js.native
    def trim(x: typings.bigint.BigInt.BigInt, k: Double): typings.bigint.BigInt.BigInt = js.native
  }
}
