package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Size containing widht and height
     */
@JSImport("babylonjs", "Size")
@js.native
class Size protected ()
  extends babylonjsLib.BABYLONNs.Size {
  /**
           * Creates a Size object from the given width and height (floats).
           * @param width width of the new size
           * @param height height of the new size
           */
  def this(width: scala.Double, height: scala.Double) = this()
}

/**
     * Size containing widht and height
     */
@JSImport("babylonjs", "Size")
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

