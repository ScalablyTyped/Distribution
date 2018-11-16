package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with a power shape (see link below).
     * @see https://easings.net/#easeInQuad
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSImport("babylonjs", "PowerEase")
@js.native
class PowerEase ()
  extends babylonjsLib.BABYLONNs.PowerEase {
  /**
           * Instantiates an power base easing function
           * @see https://easings.net/#easeInQuad
           * @param power Defines the power of the function
           */
  def this(/** Defines the power of the function */
  power: scala.Double) = this()
}

