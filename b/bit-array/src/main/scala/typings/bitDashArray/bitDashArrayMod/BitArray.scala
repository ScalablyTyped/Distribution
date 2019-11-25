package typings.bitDashArray.bitDashArrayMod

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
  def count(): Double
  /**
    * Returns true if this BitArray equals another. Two BitArrays are considered
    * equal if both have the same length and bit pattern.
    */
  def equals(x: BitArray): Boolean
  /**
    * Returns the value of the bit at index (boolean.)
    */
  def get(index: Double): Boolean
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
  def set(index: Double, value: Boolean): BitArray
  /**
    * Returns the total number of bits in this BitArray.
    */
  def size(): Double
  /**
    * Convert the BitArray to an Array of boolean values (slow).
    */
  def toArray(): js.Array[Boolean]
  /**
    * Returns a string representation of the BitArray with bits
    * in mathemetical order.
    */
  def toBinaryString(): String
  /**
    * Returns a hexadecimal string representation of the BitArray
    * with bits in logical order.
    */
  def toHexString(): String
  /**
    * Returns the JSON representation of this BitArray.
    */
  def toJSON(): String
  /**
    * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
    */
  def toggle(index: Double): BitArray
  /**
    * Bitwise XOR on the values of this BitArray using BitArray x.
    */
  def xor(x: BitArray): BitArray
}

object BitArray {
  @scala.inline
  def apply(
    and: BitArray => BitArray,
    copy: () => BitArray,
    count: () => Double,
    equals: BitArray => Boolean,
    get: Double => Boolean,
    not: () => BitArray,
    or: BitArray => BitArray,
    reset: () => BitArray,
    set: (Double, Boolean) => BitArray,
    size: () => Double,
    toArray: () => js.Array[Boolean],
    toBinaryString: () => String,
    toHexString: () => String,
    toJSON: () => String,
    toggle: Double => BitArray,
    xor: BitArray => BitArray
  ): BitArray = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), equals = js.Any.fromFunction1(equals), get = js.Any.fromFunction1(get), not = js.Any.fromFunction0(not), or = js.Any.fromFunction1(or), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), toBinaryString = js.Any.fromFunction0(toBinaryString), toHexString = js.Any.fromFunction0(toHexString), toJSON = js.Any.fromFunction0(toJSON), toggle = js.Any.fromFunction1(toggle), xor = js.Any.fromFunction1(xor))
  
    __obj.asInstanceOf[BitArray]
  }
}

