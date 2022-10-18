package typings.chartJs.mod

import typings.chartJs.typesUtilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableTooltipContext[TType /* <: ChartType */] extends StObject {
  
  var chart: UnionToIntersection[Chart[TType, DefaultDataPoint[TType], Any]]
  
  var tooltip: UnionToIntersection[TooltipModel[TType]]
  
  var tooltipItems: js.Array[TooltipItem[TType]]
}
object ScriptableTooltipContext {
  
  inline def apply[TType /* <: ChartType */](
    chart: UnionToIntersection[Chart[TType, DefaultDataPoint[TType], Any]],
    tooltip: UnionToIntersection[TooltipModel[TType]],
    tooltipItems: js.Array[TooltipItem[TType]]
  ): ScriptableTooltipContext[TType] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipItems = tooltipItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableTooltipContext[TType]]
  }
  
  extension [Self <: ScriptableTooltipContext[?], TType /* <: ChartType */](x: Self & ScriptableTooltipContext[TType]) {
    
    inline def setChart(value: UnionToIntersection[Chart[TType, DefaultDataPoint[TType], Any]]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: UnionToIntersection[TooltipModel[TType]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipItems(value: js.Array[TooltipItem[TType]]): Self = StObject.set(x, "tooltipItems", value.asInstanceOf[js.Any])
    
    inline def setTooltipItemsVarargs(value: TooltipItem[TType]*): Self = StObject.set(x, "tooltipItems", js.Array(value*))
  }
}
