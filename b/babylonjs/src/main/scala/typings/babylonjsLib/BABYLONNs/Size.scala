package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Size containing widht and height
     */
@JSGlobal("BABYLON.Size")
@js.native
class Size protected () extends ISize {
  /**
           * Creates a Size object from the given width and height (floats).
           * @param width width of the new size
           * @param height height of the new size
           */
  def this(width: scala.Double, height: scala.Double) = this()
  /**
           * Heighht
           */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
           * The surface of the Size : width * height (float).
           */
  val surface: scala.Double = js.native
  /**
           * Width
           */
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
           * Sums the width and height of two sizes
           * @param otherSize size to add to this size
           * @returns a new Size set as the addition result of the current Size and the given one.
           */
  def add(otherSize: Size): Size = js.native
  /**
           * Updates the current size from the given one.
           * @param src the given size
           */
  def copyFrom(src: Size): scala.Unit = js.native
  /**
           * Updates in place the current Size from the given floats.
           * @param width width of the new size
           * @param height height of the new size
           * @returns the updated Size.
           */
  def copyFromFloats(width: scala.Double, height: scala.Double): Size = js.native
  /**
           * True if the current Size and the given one width and height are strictly equal.
           * @param other the other size to compare against
           * @returns True if the current Size and the given one width and height are strictly equal.
           */
  def equals(other: Size): scala.Boolean = js.native
  /**
           * "Size"
           * @returns the string "Size"
           */
  def getClassName(): java.lang.String = js.native
  /**
           * Returns the Size hash code.
           * @returns a hash code for a unique width and height
           */
  def getHashCode(): scala.Double = js.native
  /**
           * Multiplies the width and height by numbers
           * @param w factor to multiple the width by
           * @param h factor to multiple the height by
           * @returns a new Size set with the multiplication result of the current Size and the given floats.
           */
  def multiplyByFloats(w: scala.Double, h: scala.Double): Size = js.native
  /**
           * Updates in place the current Size from the given floats.
           * @param width width to set
           * @param height height to set
           * @returns the updated Size.
           */
  def set(width: scala.Double, height: scala.Double): Size = js.native
  /**
           * Subtracts the width and height of two
           * @param otherSize size to subtract to this size
           * @returns a new Size set as the subtraction result of  the given one from the current Size.
           */
  def subtract(otherSize: Size): Size = js.native
}

/**
     * Size containing widht and height
     */
@JSGlobal("BABYLON.Size")
@js.native
object Size extends js.Object {
  /**
           * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
           * @param start starting size to lerp between
           * @param end end size to lerp between
           * @param amount amount to lerp between the start and end values
           * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
           */
  def Lerp(start: babylonjsLib.BABYLONNs.Size, end: babylonjsLib.BABYLONNs.Size, amount: scala.Double): babylonjsLib.BABYLONNs.Size = js.native
  /**
           * Create a new size of zero
           * @returns a new Size set to (0.0, 0.0)
           */
  def Zero(): babylonjsLib.BABYLONNs.Size = js.native
}

