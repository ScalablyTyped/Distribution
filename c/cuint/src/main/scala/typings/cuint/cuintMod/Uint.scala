package typings.cuint.cuintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint extends js.Object {
  var _high: Double = js.native
  var _low: Double = js.native
  // Math
  def add(x: this.type): this.type = js.native
  def and(x: this.type): this.type = js.native
  def div(x: this.type): this.type = js.native
  def eq(x: this.type): Boolean = js.native
  // Compare
  def equals(x: this.type): Boolean = js.native
  def fromBits(bits: Double*): this.type = js.native
  // Deserialize
  def fromNumber(n: Double): this.type = js.native
  def fromString(integer: String): this.type = js.native
  def fromString(integer: String, radix: Double): this.type = js.native
  def greaterThan(x: this.type): Boolean = js.native
  def gt(x: this.type): Boolean = js.native
  def lessThan(x: this.type): Boolean = js.native
  def lt(x: this.type): Boolean = js.native
  def multiply(x: this.type): this.type = js.native
  // Bitwise
  def negate(): this.type = js.native
  def not(x: this.type): this.type = js.native
  def or(x: this.type): this.type = js.native
  def rorateLeft(n: Double): this.type = js.native
  def rorateRight(n: Double): this.type = js.native
  def rotl(n: Double): this.type = js.native
  def rotr(n: Double): this.type = js.native
  def shiftLeft(n: Double): this.type = js.native
  def shiftRight(n: Double): this.type = js.native
  def shiftl(n: Double): this.type = js.native
  def shiftr(n: Double): this.type = js.native
  def subtract(x: this.type): this.type = js.native
  // Serialize
  def toNumber(): Double = js.native
  def toString(base: Double): String = js.native
  def xor(x: this.type): this.type = js.native
}

