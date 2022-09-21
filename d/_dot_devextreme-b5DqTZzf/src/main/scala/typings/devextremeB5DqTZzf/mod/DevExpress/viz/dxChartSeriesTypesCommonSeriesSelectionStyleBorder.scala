package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesSelectionStyleBorder extends StObject {
  
  /**
    * Colors the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a dash style for the series border (in area-like series) or for the series point border (in bar-like and bubble series) when a user selects the series.
    */
  var dashStyle: js.UndefOr[DashStyleType] = js.undefined
  
  /**
    * Shows the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets a pixel-measured width for the series border (in area-like series) or for the series point border (in bar-like and bubble series) when a user selects the series.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartSeriesTypesCommonSeriesSelectionStyleBorder {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesSelectionStyleBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyleBorder]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeriesSelectionStyleBorder](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyleType): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
