package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStepAreaSeriesHoverStyle
  extends StObject
     with dxChartSeriesTypesCommonSeriesHoverStyle {
  
  /**
    * Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series.
    */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyleBorder] = js.undefined
}
object dxChartSeriesTypesStepAreaSeriesHoverStyle {
  
  inline def apply(): dxChartSeriesTypesStepAreaSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesHoverStyle]
  }
  
  extension [Self <: dxChartSeriesTypesStepAreaSeriesHoverStyle](x: Self) {
    
    inline def setBorder(value: dxChartSeriesTypesStepAreaSeriesHoverStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
