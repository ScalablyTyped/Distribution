package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allArgumentPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allSeriesPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypesStackedbarpolarseries
  extends StObject
     with dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /**
    * Specifies series elements to be highlighted when a user points to the series.
    */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  
  /**
    * An object defining the label configuration properties.
    */
  @JSName("label")
  var label_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects the series.
    */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
}
object dxPolarChartSeriesTypesStackedbarpolarseries {
  
  inline def apply(): dxPolarChartSeriesTypesStackedbarpolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesStackedbarpolarseries]
  }
  
  extension [Self <: dxPolarChartSeriesTypesStackedbarpolarseries](x: Self) {
    
    inline def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxPolarChartSeriesTypesStackedbarpolarseriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
