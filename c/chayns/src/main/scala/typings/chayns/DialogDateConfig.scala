package typings.chayns

import typings.chayns.chayns.dialog.dateType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.date()
trait DialogDateConfig extends StObject {
  
  var dateType: typings.chayns.chayns.dialog.dateType
  
  var maxDate: js.UndefOr[Date] = js.undefined
  
  var minDate: js.UndefOr[Date] = js.undefined
  
  var preSelect: js.UndefOr[Date] = js.undefined
}
object DialogDateConfig {
  
  @scala.inline
  def apply(dateType: dateType): DialogDateConfig = {
    val __obj = js.Dynamic.literal(dateType = dateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateConfig]
  }
  
  @scala.inline
  implicit class DialogDateConfigMutableBuilder[Self <: DialogDateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateType(value: dateType): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setPreSelect(value: Date): Self = StObject.set(x, "preSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSelectUndefined: Self = StObject.set(x, "preSelect", js.undefined)
  }
}
