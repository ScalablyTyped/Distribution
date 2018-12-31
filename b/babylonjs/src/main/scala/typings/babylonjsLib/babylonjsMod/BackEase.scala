package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Easing function with a ease back shape (see link below).
  * @see https://easings.net/#easeInBack
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSImport("babylonjs", "BackEase")
@js.native
/**
  * Instantiates a back ease easing
  * @see https://easings.net/#easeInBack
  * @param amplitude Defines the amplitude of the function
  */
class BackEase ()
  extends babylonjsLib.BABYLONNs.BackEase {
  def this(/** Defines the amplitude of the function */
  amplitude: scala.Double) = this()
}

