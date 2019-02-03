package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class used for every default easing function.
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSImport("babylonjs", "EasingFunction")
@js.native
class EasingFunction ()
  extends babylonjsLib.BABYLONNs.EasingFunction

/* static members */
@JSImport("babylonjs", "EasingFunction")
@js.native
object EasingFunction extends js.Object {
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  val EASINGMODE_EASEIN: scala.Double = js.native
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  val EASINGMODE_EASEINOUT: scala.Double = js.native
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  val EASINGMODE_EASEOUT: scala.Double = js.native
}

