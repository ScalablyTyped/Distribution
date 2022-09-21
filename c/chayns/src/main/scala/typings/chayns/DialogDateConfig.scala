package typings.chayns

import typings.chayns.chayns.dialog.dateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.date()
trait DialogDateConfig extends StObject {
  
  var dateType: typings.chayns.chayns.dialog.dateType
  
  var maxDate: js.UndefOr[js.Date] = js.undefined
  
  var minDate: js.UndefOr[js.Date] = js.undefined
  
  var preSelect: js.UndefOr[js.Date] = js.undefined
}
object DialogDateConfig {
  
  inline def apply(dateType: dateType): DialogDateConfig = {
    val __obj = js.Dynamic.literal(dateType = dateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateConfig]
  }
  
  extension [Self <: DialogDateConfig](x: Self) {
    
    inline def setDateType(value: dateType): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setPreSelect(value: js.Date): Self = StObject.set(x, "preSelect", value.asInstanceOf[js.Any])
    
    inline def setPreSelectUndefined: Self = StObject.set(x, "preSelect", js.undefined)
  }
}
