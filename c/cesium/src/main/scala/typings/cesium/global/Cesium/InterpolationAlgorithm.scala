package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSGlobal("Cesium.InterpolationAlgorithm")
@js.native
class InterpolationAlgorithm ()
  extends typings.cesium.mod.InterpolationAlgorithm
object InterpolationAlgorithm {
  
  @JSGlobal("Cesium.InterpolationAlgorithm")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getRequiredDataPoints(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any], outputOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double,
    result: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any], outputOrder.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def interpolateOrderZero(x: Double, xTable: js.Array[Double], yTable: js.Array[Double], yStride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateOrderZero")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolateOrderZero(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    result: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateOrderZero")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @JSGlobal("Cesium.InterpolationAlgorithm.type")
  @js.native
  val `type`: String = js.native
}
