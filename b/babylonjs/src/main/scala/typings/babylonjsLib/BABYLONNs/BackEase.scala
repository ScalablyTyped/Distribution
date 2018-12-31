package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Easing function with a ease back shape (see link below).
  * @see https://easings.net/#easeInBack
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSGlobal("BABYLON.BackEase")
@js.native
/**
  * Instantiates a back ease easing
  * @see https://easings.net/#easeInBack
  * @param amplitude Defines the amplitude of the function
  */
class BackEase () extends EasingFunction {
  def this(/** Defines the amplitude of the function */
  amplitude: scala.Double) = this()
  /** Defines the amplitude of the function */
  var amplitude: scala.Double = js.native
}

