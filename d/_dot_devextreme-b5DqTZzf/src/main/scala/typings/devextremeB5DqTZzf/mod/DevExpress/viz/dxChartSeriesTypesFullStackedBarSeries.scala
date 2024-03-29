package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allArgumentPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allSeriesPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedBarSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a bar.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
}
object dxChartSeriesTypesFullStackedBarSeries {
  
  inline def apply(): dxChartSeriesTypesFullStackedBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedBarSeries]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedBarSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesFullStackedBarSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesFullStackedBarSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
