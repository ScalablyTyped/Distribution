package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesScatterSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesAggregation] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesLabel] = js.undefined
}
object dxChartSeriesTypesScatterSeries {
  
  inline def apply(): dxChartSeriesTypesScatterSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesScatterSeries]
  }
  
  extension [Self <: dxChartSeriesTypesScatterSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesScatterSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesScatterSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
