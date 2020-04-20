package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasingFunction extends js.Object {
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  def ease(gradient: Double): Double
}

object IEasingFunction {
  @scala.inline
  def apply(ease: Double => Double): IEasingFunction = {
    val __obj = js.Dynamic.literal(ease = js.Any.fromFunction1(ease))
    __obj.asInstanceOf[IEasingFunction]
  }
}

