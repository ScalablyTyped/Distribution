package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxChart.ChartSingleValueSeriesAggregationMethodType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedAreaSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesFullStackedAreaSeriesAggregation: js.UndefOr[ChartSingleValueSeriesAggregationMethodType] = js.undefined
}
object dxChartSeriesTypesFullStackedAreaSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesFullStackedAreaSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedAreaSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedAreaSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartSingleValueSeriesAggregationMethodType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
