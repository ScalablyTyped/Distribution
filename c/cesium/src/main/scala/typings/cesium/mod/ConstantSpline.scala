package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ConstantSpline")
@js.native
open class ConstantSpline protected () extends StObject {
  def this(value: Double) = this()
  def this(value: Cartesian3) = this()
  def this(value: Quaternion) = this()
  
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
    * @returns The modified result parameter or the value that the constant spline represents.
    */
  def evaluate(time: Double): Double | Cartesian3 | Quaternion = js.native
  def evaluate(time: Double, result: Cartesian3): Double | Cartesian3 | Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Double | Cartesian3 | Quaternion = js.native
  
  /**
    * Finds an index <code>i</code> in <code>times</code> such that the parameter
    * <code>time</code> is in the interval <code>[times[i], times[i + 1]]</code>.
    *
    * Since a constant spline has no internal times array, this will throw an error.
    * @param time - The time.
    */
  def findTimeInterval(time: Double): Unit = js.native
  
  /**
    * The constant value that the spline evaluates to.
    */
  val value: Double | Cartesian3 | Quaternion = js.native
  
  /**
    * Wraps the given time to the period covered by the spline.
    * @param time - The time.
    * @returns The time, wrapped around to the updated animation.
    */
  def wrapTime(time: Double): Double = js.native
}
