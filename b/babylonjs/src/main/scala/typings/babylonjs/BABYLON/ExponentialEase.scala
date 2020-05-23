package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentialEase extends EasingFunction {
  /** Defines the exponent of the function */
  var exponent: Double
}

object ExponentialEase {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    exponent: Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): ExponentialEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), exponent = exponent.asInstanceOf[js.Any], getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[ExponentialEase]
  }
}

