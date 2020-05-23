package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BezierCurveEase extends EasingFunction {
  /** Defines the x component of the start tangent in the bezier curve */
  var x1: Double
  /** Defines the x component of the end tangent in the bezier curve */
  var x2: Double
  /** Defines the y component of the start tangent in the bezier curve */
  var y1: Double
  /** Defines the y component of the end tangent in the bezier curve */
  var y2: Double
}

object BezierCurveEase {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): BezierCurveEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode), x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurveEase]
  }
}

