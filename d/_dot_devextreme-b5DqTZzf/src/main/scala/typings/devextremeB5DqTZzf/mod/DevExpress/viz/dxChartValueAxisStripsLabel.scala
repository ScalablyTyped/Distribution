package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisStripsLabel
  extends StObject
     with dxChartCommonAxisSettingsStripStyleLabel {
  
  /**
    * Specifies the text of the strip label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxChartValueAxisStripsLabel {
  
  inline def apply(): dxChartValueAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisStripsLabel]
  }
  
  extension [Self <: dxChartValueAxisStripsLabel](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
