package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  var field: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.Field] = js.undefined
  
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object Field {
  
  inline def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setField(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
