package typings.bitArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitArray extends js.Object {
  /**
    * Bitwise AND on the values of this BitArray using BitArray x.
    */
  def and(x: BitArray): BitArray = js.native
  /**
    * Returns a copy of this BitArray.
    */
  def copy(): BitArray = js.native
  /**
    * Returns the total number of bits set to one in this BitArray.
    */
  def count(): Double = js.native
  /**
    * Returns true if this BitArray equals another. Two BitArrays are considered
    * equal if both have the same length and bit pattern.
    */
  def equals(x: BitArray): Boolean = js.native
  /**
    * Returns the value of the bit at index (boolean.)
    */
  def get(index: Double): Boolean = js.native
  /**
    * Inverts this BitArray.
    */
  def not(): BitArray = js.native
  /**
    * Bitwise OR on the values of this BitArray using BitArray x.
    */
  def or(x: BitArray): BitArray = js.native
  /**
    * Resets the BitArray so that it is empty and can be re-used.
    */
  def reset(): BitArray = js.native
  /**
    * Sets the bit at index to a value (boolean.)
    */
  def set(index: Double, value: Boolean): BitArray = js.native
  /**
    * Returns the total number of bits in this BitArray.
    */
  def size(): Double = js.native
  /**
    * Convert the BitArray to an Array of boolean values (slow).
    */
  def toArray(): js.Array[Boolean] = js.native
  /**
    * Returns a string representation of the BitArray with bits
    * in mathemetical order.
    */
  def toBinaryString(): String = js.native
  /**
    * Returns a hexadecimal string representation of the BitArray
    * with bits in logical order.
    */
  def toHexString(): String = js.native
  /**
    * Returns the JSON representation of this BitArray.
    */
  def toJSON(): String = js.native
  /**
    * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
    */
  def toggle(index: Double): BitArray = js.native
  /**
    * Bitwise XOR on the values of this BitArray using BitArray x.
    */
  def xor(x: BitArray): BitArray = js.native
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
  @scala.inline
  implicit class BitArrayOps[Self <: BitArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnd(value: BitArray => BitArray): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: () => BitArray): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def setEquals(value: BitArray => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Double => Boolean): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setNot(value: () => BitArray): Self = this.set("not", js.Any.fromFunction0(value))
    @scala.inline
    def setOr(value: BitArray => BitArray): Self = this.set("or", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => BitArray): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, Boolean) => BitArray): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[Boolean]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setToBinaryString(value: () => String): Self = this.set("toBinaryString", js.Any.fromFunction0(value))
    @scala.inline
    def setToHexString(value: () => String): Self = this.set("toHexString", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: Double => BitArray): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def setXor(value: BitArray => BitArray): Self = this.set("xor", js.Any.fromFunction1(value))
  }
  
}

