package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticEase extends EasingFunction {
  /** Defines the number of oscillations*/
  var oscillations: Double
  /** Defines the amplitude of the oscillations*/
  var springiness: Double
}

object ElasticEase {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    oscillations: Double,
    setEasingMode: Double => Unit,
    springiness: Double
  ): ElasticEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), oscillations = oscillations.asInstanceOf[js.Any], setEasingMode = js.Any.fromFunction1(setEasingMode), springiness = springiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticEase]
  }
}

