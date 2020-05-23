package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceEase extends EasingFunction {
  /** Defines the number of bounces */
  var bounces: Double
  /** Defines the amplitude of the bounce */
  var bounciness: Double
}

object BounceEase {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    bounces: Double,
    bounciness: Double,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): BounceEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], bounces = bounces.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[BounceEase]
  }
}

