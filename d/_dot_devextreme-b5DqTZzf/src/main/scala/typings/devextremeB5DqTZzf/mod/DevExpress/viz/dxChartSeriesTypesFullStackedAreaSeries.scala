package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.excludePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.includePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.nearestPoint
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedAreaSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * An object defining the label configuration properties.
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesLabel] = js.undefined
  
  /**
    * Configures series points in scatter, line- and area-like series.
    */
  @JSName("point")
  var point_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesPoint] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}
object dxChartSeriesTypesFullStackedAreaSeries {
  
  inline def apply(): dxChartSeriesTypesFullStackedAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedAreaSeries]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedAreaSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesFullStackedAreaSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesFullStackedAreaSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPoint(value: dxChartSeriesTypesFullStackedAreaSeriesPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
