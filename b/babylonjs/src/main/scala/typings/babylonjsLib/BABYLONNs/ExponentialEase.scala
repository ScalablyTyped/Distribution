package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Easing function with an exponential shape (see link below).
  * @see https://easings.net/#easeInExpo
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSGlobal("BABYLON.ExponentialEase")
@js.native
/**
  * Instantiates an exponential easing function
  * @see https://easings.net/#easeInExpo
  * @param exponent Defines the exponent of the function
  */
class ExponentialEase () extends EasingFunction {
  def this(/** Defines the exponent of the function */
  exponent: scala.Double) = this()
  /** Defines the exponent of the function */
  var exponent: scala.Double = js.native
}

