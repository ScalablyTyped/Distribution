package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartValueAxisStripsLabel
  extends StObject
     with dxPolarChartCommonAxisSettingsStripStyleLabel {
  
  /**
    * Specifies the text displayed in a strip.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxPolarChartValueAxisStripsLabel {
  
  inline def apply(): dxPolarChartValueAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisStripsLabel]
  }
  
  extension [Self <: dxPolarChartValueAxisStripsLabel](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
