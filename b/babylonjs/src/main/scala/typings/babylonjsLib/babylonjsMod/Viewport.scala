package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent a viewport on screen
  */
@JSImport("babylonjs", "Viewport")
@js.native
class Viewport protected ()
  extends babylonjsLib.BABYLONNs.Viewport {
  /**
    * Creates a Viewport object located at (x, y) and sized (width, height)
    * @param x defines viewport left coordinate
    * @param y defines viewport top coordinate
    * @param width defines the viewport width
    * @param height defines the viewport height
    */
  def this(/** viewport left coordinate */
  x: scala.Double, /** viewport top coordinate */
  y: scala.Double, /**viewport width */
  width: scala.Double, /** viewport height */
  height: scala.Double) = this()
}

