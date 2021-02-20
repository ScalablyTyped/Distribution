package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "InterpolationAlgorithm")
@js.native
class InterpolationAlgorithm () extends StObject
object InterpolationAlgorithm {
  
  /* static member */
  @JSImport("cesium", "InterpolationAlgorithm.getRequiredDataPoints")
  @js.native
  def getRequiredDataPoints(degree: Double): Double = js.native
  
  /* static member */
  @JSImport("cesium", "InterpolationAlgorithm.interpolate")
  @js.native
  def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double
  ): js.Array[Double] = js.native
  @JSImport("cesium", "InterpolationAlgorithm.interpolate")
  @js.native
  def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "InterpolationAlgorithm.interpolateOrderZero")
  @js.native
  def interpolateOrderZero(x: Double, xTable: js.Array[Double], yTable: js.Array[Double], yStride: Double): js.Array[Double] = js.native
  @JSImport("cesium", "InterpolationAlgorithm.interpolateOrderZero")
  @js.native
  def interpolateOrderZero(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "InterpolationAlgorithm.type")
  @js.native
  val `type`: String = js.native
}
