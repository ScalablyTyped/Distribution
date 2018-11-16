package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with an exponential shape (see link below).
     * @see https://easings.net/#easeInExpo
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSImport("babylonjs", "ExponentialEase")
@js.native
class ExponentialEase ()
  extends babylonjsLib.BABYLONNs.ExponentialEase {
  /**
           * Instantiates an exponential easing function
           * @see https://easings.net/#easeInExpo
           * @param exponent Defines the exponent of the function
           */
  def this(/** Defines the exponent of the function */
  exponent: scala.Double) = this()
}

