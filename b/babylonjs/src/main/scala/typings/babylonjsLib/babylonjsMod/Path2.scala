package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a 2D path made up of multiple 2D points
  */
@JSImport("babylonjs", "Path2")
@js.native
class Path2 protected ()
  extends babylonjsLib.BABYLONNs.Path2 {
  /**
    * Creates a Path2 object from the starting 2D coordinates x and y.
    * @param x the starting points x value
    * @param y the starting points y value
    */
  def this(x: scala.Double, y: scala.Double) = this()
}

/**
  * Represents a 2D path made up of multiple 2D points
  */
@JSImport("babylonjs", "Path2")
@js.native
object Path2 extends js.Object {
  /**
    * Creates a new path starting from an x and y position
    * @param x starting x value
    * @param y starting y value
    * @returns a new Path2 starting at the coordinates (x, y).
    */
  def StartingAt(x: scala.Double, y: scala.Double): babylonjsLib.BABYLONNs.Path2 = js.native
}

