package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Easing function with a bezier shape (see link below).
     * @see http://cubic-bezier.com/#.17,.67,.83,.67
     * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
     */
@JSGlobal("BABYLON.BezierCurveEase")
@js.native
class BezierCurveEase () extends EasingFunction {
  /**
           * Instantiates a bezier function
           * @see http://cubic-bezier.com/#.17,.67,.83,.67
           * @param x1 Defines the x component of the start tangent in the bezier curve
           * @param y1 Defines the y component of the start tangent in the bezier curve
           * @param x2 Defines the x component of the end tangent in the bezier curve
           * @param y2 Defines the y component of the end tangent in the bezier curve
           */
  def this(/** Defines the x component of the start tangent in the bezier curve */
  x1: scala.Double) = this()
  /**
           * Instantiates a bezier function
           * @see http://cubic-bezier.com/#.17,.67,.83,.67
           * @param x1 Defines the x component of the start tangent in the bezier curve
           * @param y1 Defines the y component of the start tangent in the bezier curve
           * @param x2 Defines the x component of the end tangent in the bezier curve
           * @param y2 Defines the y component of the end tangent in the bezier curve
           */
  def this(/** Defines the x component of the start tangent in the bezier curve */
  x1: scala.Double, /** Defines the y component of the start tangent in the bezier curve */
  y1: scala.Double) = this()
  /**
           * Instantiates a bezier function
           * @see http://cubic-bezier.com/#.17,.67,.83,.67
           * @param x1 Defines the x component of the start tangent in the bezier curve
           * @param y1 Defines the y component of the start tangent in the bezier curve
           * @param x2 Defines the x component of the end tangent in the bezier curve
           * @param y2 Defines the y component of the end tangent in the bezier curve
           */
  def this(/** Defines the x component of the start tangent in the bezier curve */
  x1: scala.Double, /** Defines the y component of the start tangent in the bezier curve */
  y1: scala.Double, /** Defines the x component of the end tangent in the bezier curve */
  x2: scala.Double) = this()
  /**
           * Instantiates a bezier function
           * @see http://cubic-bezier.com/#.17,.67,.83,.67
           * @param x1 Defines the x component of the start tangent in the bezier curve
           * @param y1 Defines the y component of the start tangent in the bezier curve
           * @param x2 Defines the x component of the end tangent in the bezier curve
           * @param y2 Defines the y component of the end tangent in the bezier curve
           */
  def this(/** Defines the x component of the start tangent in the bezier curve */
  x1: scala.Double, /** Defines the y component of the start tangent in the bezier curve */
  y1: scala.Double, /** Defines the x component of the end tangent in the bezier curve */
  x2: scala.Double, /** Defines the y component of the end tangent in the bezier curve */
  y2: scala.Double) = this()
  /** Defines the x component of the start tangent in the bezier curve */
  var x1: scala.Double = js.native
  /** Defines the x component of the end tangent in the bezier curve */
  var x2: scala.Double = js.native
  /** Defines the y component of the start tangent in the bezier curve */
  var y1: scala.Double = js.native
  /** Defines the y component of the end tangent in the bezier curve */
  var y2: scala.Double = js.native
}

