package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.excludePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.includePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.nearestPoint
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedSplineSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}
object dxChartSeriesTypesFullStackedSplineSeries {
  
  inline def apply(): dxChartSeriesTypesFullStackedSplineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineSeries]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedSplineSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesFullStackedSplineSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesFullStackedSplineSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
