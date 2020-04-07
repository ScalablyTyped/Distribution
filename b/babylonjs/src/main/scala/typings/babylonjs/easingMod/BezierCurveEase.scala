package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/easing", "BezierCurveEase")
@js.native
/**
  * Instantiates a bezier function
  * @see http://cubic-bezier.com/#.17,.67,.83,.67
  * @param x1 Defines the x component of the start tangent in the bezier curve
  * @param y1 Defines the y component of the start tangent in the bezier curve
  * @param x2 Defines the x component of the end tangent in the bezier curve
  * @param y2 Defines the y component of the end tangent in the bezier curve
  */
class BezierCurveEase () extends EasingFunction {
  def this(/** Defines the x component of the start tangent in the bezier curve */
  x1: Double) = this()
  def this(
    /** Defines the x component of the start tangent in the bezier curve */
  x1: Double,
    /** Defines the y component of the start tangent in the bezier curve */
  y1: Double
  ) = this()
  def this(
    /** Defines the x component of the start tangent in the bezier curve */
  x1: Double,
    /** Defines the y component of the start tangent in the bezier curve */
  y1: Double,
    /** Defines the x component of the end tangent in the bezier curve */
  x2: Double
  ) = this()
  def this(
    /** Defines the x component of the start tangent in the bezier curve */
  x1: Double,
    /** Defines the y component of the start tangent in the bezier curve */
  y1: Double,
    /** Defines the x component of the end tangent in the bezier curve */
  x2: Double,
    /** Defines the y component of the end tangent in the bezier curve */
  y2: Double
  ) = this()
  /** Defines the x component of the start tangent in the bezier curve */
  var x1: Double = js.native
  /** Defines the x component of the end tangent in the bezier curve */
  var x2: Double = js.native
  /** Defines the y component of the start tangent in the bezier curve */
  var y1: Double = js.native
  /** Defines the y component of the end tangent in the bezier curve */
  var y2: Double = js.native
}

