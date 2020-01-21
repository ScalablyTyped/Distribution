package typings.bnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Big-Number class with additionnal methods that are using modular
  * operation.
  */
@js.native
trait RedBN extends BN {
  /**
    * @description Convert back a number using a reduction context
    */
  def fromRed(): BN = js.native
  /**
    * @description modular addition
    */
  def redAdd(b: BN): RedBN = js.native
  /**
    * @description in-place modular addition
    */
  def redIAdd(b: BN): RedBN = js.native
  /**
    * @description in-place modular multiplication
    */
  def redIMul(b: BN): RedBN = js.native
  /**
    * @description in-place modular square
    */
  def redISqr(): RedBN = js.native
  /**
    * @description in-place modular subtraction
    */
  def redISub(b: BN): RedBN = js.native
  /**
    * @description modular inverse of the number
    */
  def redInvm(): RedBN = js.native
  /**
    * @description modular multiplication
    */
  def redMul(b: BN): RedBN = js.native
  /**
    * @description modular negation
    */
  def redNeg(): RedBN = js.native
  /**
    * @description modular exponentiation
    */
  def redPow(b: BN): RedBN = js.native
  /**
    * @description modular shift left
    */
  def redShl(num: Double): RedBN = js.native
  /**
    * @description modular square
    */
  def redSqr(): RedBN = js.native
  /**
    * @description modular square root
    */
  def redSqrt(): RedBN = js.native
  /**
    * @description modular subtraction
    */
  def redSub(b: BN): RedBN = js.native
}

