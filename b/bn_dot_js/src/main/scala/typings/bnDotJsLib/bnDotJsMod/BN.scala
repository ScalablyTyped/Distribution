package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BN extends js.Object {
  /**
    * @description absolute value
    */
  def abs(): BN = js.native
  /**
    * @description addition
    */
  def add(b: BN): BN = js.native
  /**
    * @description addition
    */
  def addn(b: scala.Double): BN = js.native
  /**
    * @description and
    */
  def and(b: BN): BN = js.native
  /**
    * @description and (NOTE: `andln` is going to be replaced with `andn` in future)
    */
  def andln(b: scala.Double): BN = js.native
  /**
    * @description add `1 << b` to the number
    */
  def bincn(b: scala.Double): BN = js.native
  /**
    * @description get number of bits occupied
    */
  def bitLength(): scala.Double = js.native
  /**
    * @description return number of bytes occupied
    */
  def byteLength(): scala.Double = js.native
  /**
    * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
    */
  def cmp(b: BN): bnDotJsLib.bnDotJsLibNumbers.`-1` | bnDotJsLib.bnDotJsLibNumbers.`0` | bnDotJsLib.bnDotJsLibNumbers.`1` = js.native
  /**
    * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
    */
  def cmpn(b: scala.Double): bnDotJsLib.bnDotJsLibNumbers.`-1` | bnDotJsLib.bnDotJsLibNumbers.`0` | bnDotJsLib.bnDotJsLibNumbers.`1` = js.native
  /**
    * @description divide
    */
  def div(b: BN): BN = js.native
  /**
    * @description  rounded division
    */
  def divRound(b: BN): BN = js.native
  /**
    * @description divide
    */
  def divn(b: scala.Double): BN = js.native
  /**
    * @description Extended GCD results `({ a: ..., b: ..., gcd: ... })`
    */
  def egcd(b: BN): bnDotJsLib.Anon_A = js.native
  /**
    * @description a equals b
    */
  def eq(b: BN): scala.Boolean = js.native
  /**
    * @description a equals b
    */
  def eqn(b: scala.Double): scala.Boolean = js.native
  /**
    * @description  convert from two's complement representation, where width is the bit width
    */
  def fromTwos(width: scala.Double): BN = js.native
  /**
    * @description GCD
    */
  def gcd(b: BN): BN = js.native
  /**
    * @description a greater than b
    */
  def gt(b: BN): scala.Boolean = js.native
  /**
    * @description a greater than or equals b
    */
  def gte(b: BN): scala.Boolean = js.native
  /**
    * @description a greater than or equals b
    */
  def gten(b: scala.Double): scala.Boolean = js.native
  /**
    * @description a greater than b
    */
  def gtn(b: scala.Double): scala.Boolean = js.native
  /**
    * @description absolute value
    */
  def iabs(): BN = js.native
  /**
    * @description  addition
    */
  def iadd(b: BN): BN = js.native
  /**
    * @description addition
    */
  def iaddn(b: scala.Double): BN = js.native
  /**
    * @description and
    */
  def iand(b: BN): BN = js.native
  /**
    * @description divide
    */
  def idivn(b: scala.Double): BN = js.native
  /**
    * @description clear bits with indexes higher or equal to `b`
    */
  def imaskn(b: scala.Double): BN = js.native
  /**
    * @description multiply
    */
  def imul(b: BN): BN = js.native
  /**
    * @description multiply
    */
  def imuln(b: scala.Double): BN = js.native
  /**
    * @description negate sign
    */
  def ineg(): BN = js.native
  /**
    * @description not (for the width specified by `w`)
    */
  def inotn(w: scala.Double): BN = js.native
  /**
    * @description inverse `a` modulo `b`
    */
  def invm(b: BN): BN = js.native
  /**
    * @description or
    */
  def ior(b: BN): BN = js.native
  /**
    * @description  check if value is even
    */
  def isEven(): scala.Boolean = js.native
  /**
    * @description  true if the number is negative
    */
  def isNeg(): scala.Boolean = js.native
  /**
    * @description   check if value is odd
    */
  def isOdd(): scala.Boolean = js.native
  /**
    * @description  check if value is zero
    */
  def isZero(): scala.Boolean = js.native
  /**
    * @description shift left
    */
  def ishln(b: scala.Double): BN = js.native
  /**
    * @description shift right (unimplemented https://github.com/indutny/bn.js/blob/master/lib/bn.js#L2086)
    */
  def ishrn(b: scala.Double): BN = js.native
  /**
    * @description square
    */
  def isqr(): BN = js.native
  /**
    * @description subtraction
    */
  def isub(b: BN): BN = js.native
  /**
    * @description subtraction
    */
  def isubn(b: scala.Double): BN = js.native
  /**
    * @description and
    */
  def iuand(b: BN): BN = js.native
  /**
    * @description or
    */
  def iuor(b: BN): BN = js.native
  /**
    * @description shift left
    */
  def iushln(b: scala.Double): BN = js.native
  /**
    * @description shift right
    */
  def iushrn(b: scala.Double): BN = js.native
  /**
    * @description xor
    */
  def iuxor(b: BN): BN = js.native
  /**
    * @description xor
    */
  def ixor(b: BN): BN = js.native
  /**
    * @description a less than b
    */
  def lt(b: BN): scala.Boolean = js.native
  /**
    * @description a less than or equals b
    */
  def lte(b: BN): scala.Boolean = js.native
  /**
    * @description a less than or equals b
    */
  def lten(b: scala.Double): scala.Boolean = js.native
  /**
    * @description a less than b
    */
  def ltn(b: scala.Double): scala.Boolean = js.native
  /**
    * @description clear bits with indexes higher or equal to `b`
    */
  def maskn(b: scala.Double): BN = js.native
  /**
    * @description reduct
    */
  def mod(b: BN): BN = js.native
  /**
    * @see API consistency https://github.com/indutny/bn.js/pull/130
    * @description reduct
    */
  def modn(b: scala.Double): scala.Double = js.native
  /**
    * @description multiply
    */
  def mul(b: BN): BN = js.native
  /**
    * @description multiply
    */
  def muln(b: scala.Double): BN = js.native
  /**
    * @description negate sign
    */
  def neg(): BN = js.native
  /**
    * @description not (for the width specified by `w`)
    */
  def notn(w: scala.Double): BN = js.native
  /**
    * @description or
    */
  def or(b: BN): BN = js.native
  /**
    * @description raise `a` to the power of `b`
    */
  def pow(b: BN): BN = js.native
  /**
    * @description set specified bit to 1
    */
  def setn(b: scala.Double): BN = js.native
  /**
    * @description shift left
    */
  def shln(b: scala.Double): BN = js.native
  /**
    * @description shift right
    */
  def shrn(b: scala.Double): BN = js.native
  /**
    * @description square
    */
  def sqr(): BN = js.native
  /**
    * @description subtraction
    */
  def sub(b: BN): BN = js.native
  /**
    * @description subtraction
    */
  def subn(b: scala.Double): BN = js.native
  /**
    * @description  test if specified bit is set
    */
  def testn(b: scala.Double): scala.Boolean = js.native
  /**
    * @description  convert to byte Array, and optionally zero pad to length, throwing if already exceeding
    */
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(endian: Endianness): js.Array[scala.Double] = js.native
  def toArray(endian: Endianness, length: scala.Double): js.Array[scala.Double] = js.native
  /**
    * @description convert to an instance of `type`, which must behave like an Array
    */
  def toArrayLike(ArrayType: bnDotJsLib.Anon_Alloc): nodeLib.Buffer = js.native
  def toArrayLike(ArrayType: bnDotJsLib.Anon_Alloc, endian: Endianness): nodeLib.Buffer = js.native
  def toArrayLike(ArrayType: bnDotJsLib.Anon_Alloc, endian: Endianness, length: scala.Double): nodeLib.Buffer = js.native
  def toArrayLike(ArrayType: js.Array[_]): js.Array[_] = js.native
  def toArrayLike(ArrayType: js.Array[_], endian: Endianness): js.Array[_] = js.native
  def toArrayLike(ArrayType: js.Array[_], endian: Endianness, length: scala.Double): js.Array[_] = js.native
  /**
    * @description  convert to Node.js Buffer (if available). For compatibility with browserify and similar tools, use this instead: a.toArrayLike(Buffer, endian, length)
    */
  def toBuffer(): nodeLib.Buffer = js.native
  def toBuffer(endian: Endianness): nodeLib.Buffer = js.native
  def toBuffer(endian: Endianness, length: scala.Double): nodeLib.Buffer = js.native
  /**
    * @description convert to JSON compatible hex string (alias of toString(16))
    */
  def toJSON(): java.lang.String = js.native
  /**
    * @description convert to Javascript Number (limited to 53 bits)
    */
  def toNumber(): scala.Double = js.native
  /**
    * @description Convert number to red
    */
  def toRed(reductionContext: ReductionContext): RedBN = js.native
  def toString(base: scala.Double): java.lang.String = js.native
  def toString(base: scala.Double, length: scala.Double): java.lang.String = js.native
  @JSName("toString")
  def toString_hex(base: bnDotJsLib.bnDotJsLibStrings.hex): java.lang.String = js.native
  @JSName("toString")
  def toString_hex(base: bnDotJsLib.bnDotJsLibStrings.hex, length: scala.Double): java.lang.String = js.native
  /**
    * @description convert to two's complement representation, where width is bit width
    */
  def toTwos(width: scala.Double): BN = js.native
  /**
    * @description and
    */
  def uand(b: BN): BN = js.native
  /**
    * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
    */
  def ucmp(b: BN): bnDotJsLib.bnDotJsLibNumbers.`-1` | bnDotJsLib.bnDotJsLibNumbers.`0` | bnDotJsLib.bnDotJsLibNumbers.`1` = js.native
  /**
    * @description reduct
    */
  def umod(b: BN): BN = js.native
  /**
    * @description or
    */
  def uor(b: BN): BN = js.native
  /**
    * @description shift left
    */
  def ushln(b: scala.Double): BN = js.native
  /**
    * @description shift right
    */
  def ushrn(b: scala.Double): BN = js.native
  /**
    * @description xor
    */
  def uxor(b: BN): BN = js.native
  /**
    * @description xor
    */
  def xor(b: BN): BN = js.native
  /**
    * @description return number of less-significant consequent zero bits (example: 1010000 has 4 zero bits)
    */
  def zeroBits(): scala.Double = js.native
}

