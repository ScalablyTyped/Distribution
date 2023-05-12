package typings.chartJs.distTypesIndexMod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesLayoutMod.LayoutItem
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendElement[TType /* <: ChartType */]
  extends default[AnyObject, LegendOptions[TType]]
     with LayoutItem {
  
  var chart: Chart[TType, DefaultDataPoint[TType], Any] = js.native
  
  var ctx: CanvasRenderingContext2D = js.native
  
  var legendItems: js.UndefOr[js.Array[LegendItem]] = js.native
}
