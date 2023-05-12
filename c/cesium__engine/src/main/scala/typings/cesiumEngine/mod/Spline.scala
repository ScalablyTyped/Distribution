package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Spline")
@js.native
open class Spline () extends StObject {
  
  /**
    * Clamps the given time to the period covered by the spline.
    * @param time - The time.
    * @returns The time, clamped to the animation period.
    */
  def clampTime(time: Double): Double = js.native
  
  /**
    * Evaluates the curve at a given time.
    * @param time - The time at which to evaluate the curve.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new instance of the point on the curve at the given time.
    */
  def evaluate(time: Double): Cartesian3 | Quaternion | js.Array[Double] = js.native
  def evaluate(time: Double, result: js.Array[Double]): Cartesian3 | Quaternion | js.Array[Double] = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 | Quaternion | js.Array[Double] = js.native
  def evaluate(time: Double, result: Quaternion): Cartesian3 | Quaternion | js.Array[Double] = js.native
  
  /**
    * Finds an index <code>i</code> in <code>times</code> such that the parameter
    * <code>time</code> is in the interval <code>[times[i], times[i + 1]]</code>.
    * @param time - The time.
    * @param startIndex - The index from which to start the search.
    * @returns The index for the element at the start of the interval.
    */
  def findTimeInterval(time: Double, startIndex: Double): Double = js.native
  
  /**
    * An array of control points.
    */
  var points: js.Array[Cartesian3 | Quaternion] = js.native
  
  /**
    * An array of times for the control points.
    */
  var times: js.Array[Double] = js.native
  
  /**
    * Wraps the given time to the period covered by the spline.
    * @param time - The time.
    * @returns The time, wrapped around the animation period.
    */
  def wrapTime(time: Double): Double = js.native
}
