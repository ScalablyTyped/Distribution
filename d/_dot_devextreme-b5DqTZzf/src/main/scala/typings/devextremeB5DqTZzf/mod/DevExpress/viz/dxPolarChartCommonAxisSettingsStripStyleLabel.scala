package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsStripStyleLabel extends StObject {
  
  /**
    * Specifies font properties for a strip label.
    */
  var font: js.UndefOr[Font] = js.undefined
}
object dxPolarChartCommonAxisSettingsStripStyleLabel {
  
  inline def apply(): dxPolarChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyleLabel]
  }
  
  extension [Self <: dxPolarChartCommonAxisSettingsStripStyleLabel](x: Self) {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
