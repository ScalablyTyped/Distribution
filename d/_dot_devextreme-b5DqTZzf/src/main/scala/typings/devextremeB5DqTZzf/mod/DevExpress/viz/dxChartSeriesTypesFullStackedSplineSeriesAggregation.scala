package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxChart.ChartSingleValueSeriesAggregationMethodType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedSplineSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesFullStackedSplineSeriesAggregation: js.UndefOr[ChartSingleValueSeriesAggregationMethodType] = js.undefined
}
object dxChartSeriesTypesFullStackedSplineSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesFullStackedSplineSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedSplineSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartSingleValueSeriesAggregationMethodType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
