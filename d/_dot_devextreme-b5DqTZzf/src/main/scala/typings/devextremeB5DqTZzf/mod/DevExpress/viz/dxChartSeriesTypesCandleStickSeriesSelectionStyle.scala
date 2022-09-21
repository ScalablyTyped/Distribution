package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCandleStickSeriesSelectionStyle
  extends StObject
     with dxChartSeriesTypesCommonSeriesSelectionStyle {
  
  /**
    * Configures hatching that applies when a user selects the series.
    */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching] = js.undefined
}
object dxChartSeriesTypesCandleStickSeriesSelectionStyle {
  
  inline def apply(): dxChartSeriesTypesCandleStickSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesSelectionStyle]
  }
  
  extension [Self <: dxChartSeriesTypesCandleStickSeriesSelectionStyle](x: Self) {
    
    inline def setHatching(value: dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
