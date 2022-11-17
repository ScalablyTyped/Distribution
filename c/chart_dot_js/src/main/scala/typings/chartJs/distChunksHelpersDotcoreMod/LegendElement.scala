package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendElement[TType /* <: ChartType */]
  extends StObject
     with Element[AnyObject, LegendOptions[TType]]
     with LayoutItem {
  
  var chart: Chart4[TType, DefaultDataPoint[TType], Any] = js.native
  
  var ctx: CanvasRenderingContext2D = js.native
  
  var legendItems: js.UndefOr[js.Array[LegendItem]] = js.native
}
