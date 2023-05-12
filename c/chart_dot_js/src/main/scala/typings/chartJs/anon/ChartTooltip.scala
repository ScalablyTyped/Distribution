package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltip[TType /* <: typings.chartJs.distTypesIndexMod.ChartType */] extends StObject {
  
  var chart: typings.chartJs.distTypesIndexMod.Chart[
    typings.chartJs.distTypesIndexMod.ChartType, 
    typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
    Any
  ]
  
  var tooltip: typings.chartJs.distTypesIndexMod.TooltipModel[TType]
}
object ChartTooltip {
  
  inline def apply[TType /* <: typings.chartJs.distTypesIndexMod.ChartType */](
    chart: typings.chartJs.distTypesIndexMod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ],
    tooltip: typings.chartJs.distTypesIndexMod.TooltipModel[TType]
  ): ChartTooltip[TType] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltip[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartTooltip[?], TType /* <: typings.chartJs.distTypesIndexMod.ChartType */] (val x: Self & ChartTooltip[TType]) extends AnyVal {
    
    inline def setChart(
      value: typings.chartJs.distTypesIndexMod.Chart[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: typings.chartJs.distTypesIndexMod.TooltipModel[TType]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
