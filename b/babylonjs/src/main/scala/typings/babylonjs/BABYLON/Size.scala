package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends ISize {
  /**
    * Sums the width and height of two sizes
    * @param otherSize size to add to this size
    * @returns a new Size set as the addition result of the current Size and the given one.
    */
  def add(otherSize: Size): Size
  /**
    * Updates the current size from the given one.
    * @param src the given size
    */
  def copyFrom(src: Size): Unit
  /**
    * Updates in place the current Size from the given floats.
    * @param width width of the new size
    * @param height height of the new size
    * @returns the updated Size.
    */
  def copyFromFloats(width: Double, height: Double): Size
  /**
    * True if the current Size and the given one width and height are strictly equal.
    * @param other the other size to compare against
    * @returns True if the current Size and the given one width and height are strictly equal.
    */
  def equals(other: Size): Boolean
  /**
    * "Size"
    * @returns the string "Size"
    */
  def getClassName(): String
  /**
    * Returns the Size hash code.
    * @returns a hash code for a unique width and height
    */
  def getHashCode(): Double
  /**
    * Multiplies the width and height by numbers
    * @param w factor to multiple the width by
    * @param h factor to multiple the height by
    * @returns a new Size set with the multiplication result of the current Size and the given floats.
    */
  def multiplyByFloats(w: Double, h: Double): Size
  /**
    * Updates in place the current Size from the given floats.
    * @param width width to set
    * @param height height to set
    * @returns the updated Size.
    */
  def set(width: Double, height: Double): Size
  /**
    * Subtracts the width and height of two
    * @param otherSize size to subtract to this size
    * @returns a new Size set as the subtraction result of  the given one from the current Size.
    */
  def subtract(otherSize: Size): Size
  /**
    * The surface of the Size : width * height (float).
    */
  def surface: Double
}

object Size {
  @scala.inline
  def apply(
    add: Size => Size,
    copyFrom: Size => Unit,
    copyFromFloats: (Double, Double) => Size,
    equals: Size => Boolean,
    getClassName: () => String,
    getHashCode: () => Double,
    height: Double,
    multiplyByFloats: (Double, Double) => Size,
    set: (Double, Double) => Size,
    subtract: Size => Size,
    surface: () => Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), copyFrom = js.Any.fromFunction1(copyFrom), copyFromFloats = js.Any.fromFunction2(copyFromFloats), equals = js.Any.fromFunction1(equals), getClassName = js.Any.fromFunction0(getClassName), getHashCode = js.Any.fromFunction0(getHashCode), height = height.asInstanceOf[js.Any], multiplyByFloats = js.Any.fromFunction2(multiplyByFloats), set = js.Any.fromFunction2(set), subtract = js.Any.fromFunction1(subtract), surface = js.Any.fromFunction0(surface), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

