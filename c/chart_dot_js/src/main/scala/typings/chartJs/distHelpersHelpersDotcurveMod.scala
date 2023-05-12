package typings.chartJs

import typings.chartJs.anon.Next
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.SplinePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotcurveMod {
  
  @JSImport("chart.js/dist/helpers/helpers.curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splineCurve(firstPoint: SplinePoint, middlePoint: SplinePoint, afterPoint: SplinePoint, t: Double): Next = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurve")(firstPoint.asInstanceOf[js.Any], middlePoint.asInstanceOf[js.Any], afterPoint.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Next]
  
  inline def splineCurveMonotone(points: js.Array[SplinePoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def splineCurveMonotone(points: js.Array[SplinePoint], indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateBezierControlPoints(points: js.Array[SplinePoint], options: Any, area: ChartArea, loop: Boolean, indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updateBezierControlPoints")(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any], area.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
