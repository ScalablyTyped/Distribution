package typings
package bitDashArrayLib.bitDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  /**
    * Bitwise AND on the values of this BitArray using BitArray x.
    */
  def and(x: BitArray): BitArray
  /**
    * Returns a copy of this BitArray.
    */
  def copy(): BitArray
  /**
    * Returns the total number of bits set to one in this BitArray.
    */
  def count(): scala.Double
  /**
    * Returns true if this BitArray equals another. Two BitArrays are considered
    * equal if both have the same length and bit pattern.
    */
  def equals(x: BitArray): scala.Boolean
  /**
    * Returns the value of the bit at index (boolean.)
    */
  def get(index: scala.Double): scala.Boolean
  /**
    * Inverts this BitArray.
    */
  def not(): BitArray
  /**
    * Bitwise OR on the values of this BitArray using BitArray x.
    */
  def or(x: BitArray): BitArray
  /**
    * Resets the BitArray so that it is empty and can be re-used.
    */
  def reset(): BitArray
  /**
    * Sets the bit at index to a value (boolean.)
    */
  def set(index: scala.Double, value: scala.Boolean): BitArray
  /**
    * Returns the total number of bits in this BitArray.
    */
  def size(): scala.Double
  /**
    * Convert the BitArray to an Array of boolean values (slow).
    */
  def toArray(): js.Array[scala.Boolean]
  /**
    * Returns a string representation of the BitArray with bits
    * in mathemetical order.
    */
  def toBinaryString(): java.lang.String
  /**
    * Returns a hexadecimal string representation of the BitArray
    * with bits in logical order.
    */
  def toHexString(): java.lang.String
  /**
    * Returns the JSON representation of this BitArray.
    */
  def toJSON(): java.lang.String
  /**
    * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
    */
  def toggle(index: scala.Double): BitArray
  /**
    * Bitwise XOR on the values of this BitArray using BitArray x.
    */
  def xor(x: BitArray): BitArray
}

object BitArray {
  @scala.inline
  def apply(
    and: js.Function1[BitArray, BitArray],
    copy: js.Function0[BitArray],
    count: js.Function0[scala.Double],
    equals: js.Function1[BitArray, scala.Boolean],
    get: js.Function1[scala.Double, scala.Boolean],
    not: js.Function0[BitArray],
    or: js.Function1[BitArray, BitArray],
    reset: js.Function0[BitArray],
    set: js.Function2[scala.Double, scala.Boolean, BitArray],
    size: js.Function0[scala.Double],
    toArray: js.Function0[js.Array[scala.Boolean]],
    toBinaryString: js.Function0[java.lang.String],
    toHexString: js.Function0[java.lang.String],
    toJSON: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    toggle: js.Function1[scala.Double, BitArray],
    xor: js.Function1[BitArray, BitArray]
  ): BitArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("or")(or)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("toArray")(toArray)
    __obj.updateDynamic("toBinaryString")(toBinaryString)
    __obj.updateDynamic("toHexString")(toHexString)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("xor")(xor)
    __obj.asInstanceOf[BitArray]
  }
}

