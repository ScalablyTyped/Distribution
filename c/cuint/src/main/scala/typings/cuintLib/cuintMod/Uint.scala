package typings
package cuintLib.cuintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint extends js.Object {
  var _high: scala.Double = js.native
  var _low: scala.Double = js.native
  // Math
  def add(x: this.type): this.type = js.native
  def and(x: this.type): this.type = js.native
  def div(x: this.type): this.type = js.native
  def eq(x: this.type): scala.Boolean = js.native
  // Compare
  def equals(x: this.type): scala.Boolean = js.native
  def fromBits(bits: scala.Double*): this.type = js.native
  // Deserialize
  def fromNumber(n: scala.Double): this.type = js.native
  def fromString(integer: java.lang.String): this.type = js.native
  def fromString(integer: java.lang.String, radix: scala.Double): this.type = js.native
  def greaterThan(x: this.type): scala.Boolean = js.native
  def gt(x: this.type): scala.Boolean = js.native
  def lessThan(x: this.type): scala.Boolean = js.native
  def lt(x: this.type): scala.Boolean = js.native
  def multiply(x: this.type): this.type = js.native
  // Bitwise
  def negate(): this.type = js.native
  def not(x: this.type): this.type = js.native
  def or(x: this.type): this.type = js.native
  def rorateLeft(n: scala.Double): this.type = js.native
  def rorateRight(n: scala.Double): this.type = js.native
  def rotl(n: scala.Double): this.type = js.native
  def rotr(n: scala.Double): this.type = js.native
  def shiftLeft(n: scala.Double): this.type = js.native
  def shiftRight(n: scala.Double): this.type = js.native
  def shiftl(n: scala.Double): this.type = js.native
  def shiftr(n: scala.Double): this.type = js.native
  def subtract(x: this.type): this.type = js.native
  // Serialize
  def toNumber(): scala.Double = js.native
  def toString(base: scala.Double): java.lang.String = js.native
  def xor(x: this.type): this.type = js.native
}

