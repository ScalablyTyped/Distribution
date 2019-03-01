package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the main contract an easing function should follow.
  * Easing functions are used throughout the animation system.
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
trait IEasingFunction extends js.Object {
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  def ease(gradient: scala.Double): scala.Double
}

object IEasingFunction {
  @scala.inline
  def apply(ease: js.Function1[scala.Double, scala.Double]): IEasingFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ease")(ease)
    __obj.asInstanceOf[IEasingFunction]
  }
}

