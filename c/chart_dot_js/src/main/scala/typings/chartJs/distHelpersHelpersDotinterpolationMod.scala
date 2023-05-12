package typings.chartJs

import typings.chartJs.anon.X
import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesGeometricMod.SplinePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotinterpolationMod {
  
  @JSImport("chart.js/dist/helpers/helpers.interpolation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def pointInLine(p1: Point, p2: Point, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def pointInLine(p1: Point, p2: Point, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def steppedInterpolation(p1: Point, p2: Point, t: Double, mode: middle | after): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def steppedInterpolation(p1: Point, p2: Point, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
}
