package typings
package bignumLib.bignumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abs(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): bignumLib.bignumMod.BigNum = js.native
  def add(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def and(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def bitLength(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Double = js.native
  def cmp(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Double = js.native
  def div(
    dividend: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    divisor: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def eq(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Boolean = js.native
  def gcd(left: bignumLib.bignumMod.BigNumNs.BigNumCompatible, right: bignumLib.bignumMod.BigNum): bignumLib.bignumMod.BigNum = js.native
  def ge(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Boolean = js.native
  def gt(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Boolean = js.native
  def invertm(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible, m: bignumLib.bignumMod.BigNumNs.BigNumCompatible): bignumLib.bignumMod.BigNum = js.native
  def jacobi(a: bignumLib.bignumMod.BigNumNs.BigNumCompatible, n: bignumLib.bignumMod.BigNum): scala.Double = js.native
  def le(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Boolean = js.native
  def lt(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): scala.Boolean = js.native
  def mod(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def mul(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def neg(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): bignumLib.bignumMod.BigNum = js.native
  def or(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def pow(
    base: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    exponent: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def powm(
    base: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    exponent: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    m: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def probPrime(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean | java.lang.String = js.native
  def rand(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): bignumLib.bignumMod.BigNum = js.native
  def rand(
    n: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    upperBound: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def shiftLeft(
    n: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    bits: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def shiftRight(
    n: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    bits: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def sub(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
  def toBuffer(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): nodeLib.Buffer = js.native
  def toBuffer(
    n: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    options: bignumLib.bignumMod.BigNumNs.BufferOptions
  ): nodeLib.Buffer = js.native
  def toNumber(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Double = js.native
  def xor(
    left: bignumLib.bignumMod.BigNumNs.BigNumCompatible,
    right: bignumLib.bignumMod.BigNumNs.BigNumCompatible
  ): bignumLib.bignumMod.BigNum = js.native
}

