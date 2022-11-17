package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.Chart4
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.TooltipModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart[TType /* <: ChartType */] extends StObject {
  
  var chart: Chart4[
    ChartType, 
    typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
    Any
  ]
  
  var tooltip: TooltipModel[TType]
}
object Chart {
  
  inline def apply[TType /* <: ChartType */](
    chart: Chart4[
      ChartType, 
      typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
      Any
    ],
    tooltip: TooltipModel[TType]
  ): Chart[TType] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart[TType]]
  }
  
  extension [Self <: Chart[?], TType /* <: ChartType */](x: Self & Chart[TType]) {
    
    inline def setChart(
      value: Chart4[
          ChartType, 
          typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
          Any
        ]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: TooltipModel[TType]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
