package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValueText extends StObject {
  
  var value: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object ValueValueText {
  
  inline def apply(): ValueValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValueText]
  }
  
  extension [Self <: ValueValueText](x: Self) {
    
    inline def setValue(value: js.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
