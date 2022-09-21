package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartValueAxisStrips
  extends StObject
     with dxPolarChartCommonAxisSettingsStripStyle {
  
  /**
    * Specifies a color for a strip.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an end value for a strip.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * An object that defines the label configuration properties of a strip.
    */
  @JSName("label")
  var label_dxPolarChartValueAxisStrips: js.UndefOr[dxPolarChartValueAxisStripsLabel] = js.undefined
  
  /**
    * Specifies a start value for a strip.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object dxPolarChartValueAxisStrips {
  
  inline def apply(): dxPolarChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisStrips]
  }
  
  extension [Self <: dxPolarChartValueAxisStrips](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLabel(value: dxPolarChartValueAxisStripsLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
