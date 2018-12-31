package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedBN extends js.Object {
  def fromRed(): BN
  def redAdd(b: RedBN): RedBN
  def redIAdd(b: RedBN): RedBN
  def redIMul(b: RedBN): RedBN
  def redISqr(): RedBN
  def redISub(b: RedBN): RedBN
  /**
    * @description  modular inverse of the number
    */
  def redInvm(): RedBN
  def redMul(b: RedBN): RedBN
  def redNeg(): RedBN
  /**
    * @description modular exponentiation
    */
  def redPow(b: RedBN): RedBN
  def redShl(num: scala.Double): RedBN
  def redSqr(): RedBN
  /**
    * @description square root modulo reduction context's prime
    */
  def redSqrt(): RedBN
  def redSub(b: RedBN): RedBN
}

