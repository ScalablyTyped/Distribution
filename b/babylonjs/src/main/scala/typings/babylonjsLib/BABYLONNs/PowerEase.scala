package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with a power shape (see link below).
     * @see https://easings.net/#easeInQuad
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSGlobal("BABYLON.PowerEase")
@js.native
class PowerEase () extends EasingFunction {
  /**
           * Instantiates an power base easing function
           * @see https://easings.net/#easeInQuad
           * @param power Defines the power of the function
           */
  def this(/** Defines the power of the function */
  power: scala.Double) = this()
  /** Defines the power of the function */
  var power: scala.Double = js.native
}

