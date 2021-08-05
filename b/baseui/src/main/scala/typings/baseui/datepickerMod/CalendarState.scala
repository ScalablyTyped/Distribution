package typings.baseui.datepickerMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarState extends StObject {
  
  var date: Date
  
  var focused: Boolean
  
  var highlightedDate: Date
  
  var quickSelectId: js.UndefOr[String] = js.undefined
}
object CalendarState {
  
  inline def apply(date: Date, focused: Boolean, highlightedDate: Date): CalendarState = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
  
  extension [Self <: CalendarState](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDate(value: Date): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectId(value: String): Self = StObject.set(x, "quickSelectId", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectIdUndefined: Self = StObject.set(x, "quickSelectId", js.undefined)
  }
}
