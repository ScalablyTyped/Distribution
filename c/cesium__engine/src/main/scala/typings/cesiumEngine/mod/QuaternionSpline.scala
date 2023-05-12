package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.PointsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "QuaternionSpline")
@js.native
open class QuaternionSpline protected () extends StObject {
  def this(options: PointsArray) = this()
  
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
  def evaluate(time: Double): Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Quaternion = js.native
  
  /**
    * Finds an index <code>i</code> in <code>times</code> such that the parameter
    * <code>time</code> is in the interval <code>[times[i], times[i + 1]]</code>.
    * @param time - The time.
    * @returns The index for the element at the start of the interval.
    */
  def findTimeInterval(time: Double): Double = js.native
  
  /**
    * An array of {@link Quaternion} control points.
    */
  val points: js.Array[Quaternion] = js.native
  
  /**
    * An array of times for the control points.
    */
  val times: js.Array[Double] = js.native
  
  /**
    * Wraps the given time to the period covered by the spline.
    * @param time - The time.
    * @returns The time, wrapped around to the updated animation.
    */
  def wrapTime(time: Double): Double = js.native
}
