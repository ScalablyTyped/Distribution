package typings.chartJs

import typings.chartJs.anon.Count
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.line
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.scatter
import typings.chartJs.chartJsStrings.start
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartMeta
import typings.chartJs.distTypesIndexMod.PointElement
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotextrasMod {
  
  @JSImport("chart.js/dist/helpers/helpers.extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alignStartEnd(align: start | end | center, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_alignStartEnd")(align.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def debounce[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], delay: Double): js.Function1[/* args */ TArgs, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Double]]
  
  inline def fontString(pixelSize: Double, fontStyle: String, fontFamily: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fontString")(pixelSize.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], fontFamily.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStartAndCountOfVisiblePoints(
    meta: ChartMeta[line | scatter, default[AnyObject, AnyObject], default[AnyObject, AnyObject]],
    points: js.Array[PointElement],
    animationsDisabled: Boolean
  ): Count = (^.asInstanceOf[js.Dynamic].applyDynamic("_getStartAndCountOfVisiblePoints")(meta.asInstanceOf[js.Any], points.asInstanceOf[js.Any], animationsDisabled.asInstanceOf[js.Any])).asInstanceOf[Count]
  
  @JSImport("chart.js/dist/helpers/helpers.extras", "requestAnimFrame")
  @js.native
  val requestAnimFrame: js.Function1[(/* callback */ Any) | (/* callback */ FrameRequestCallback), Any | Double] = js.native
  
  inline def scaleRangesChanged(meta: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scaleRangesChanged")(meta.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def textX(align: left | right | center, left: Double, right: Double, rtl: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_textX")(align.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def throttled[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], thisArg: Any): js.Function1[/* args */ TArgs, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Unit]]
  
  inline def toLeftRightCenter(align: start | end | center): center | left | right = ^.asInstanceOf[js.Dynamic].applyDynamic("_toLeftRightCenter")(align.asInstanceOf[js.Any]).asInstanceOf[center | left | right]
}
