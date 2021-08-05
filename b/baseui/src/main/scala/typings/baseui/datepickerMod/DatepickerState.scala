package typings.baseui.datepickerMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerState extends StObject {
  
  var calendarFocused: Boolean
  
  var isOpen: Boolean
  
  var isPseudoFocused: Boolean
  
  var lastActiveElm: js.UndefOr[HTMLElement] = js.undefined
}
object DatepickerState {
  
  inline def apply(calendarFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerState]
  }
  
  extension [Self <: DatepickerState](x: Self) {
    
    inline def setCalendarFocused(value: Boolean): Self = StObject.set(x, "calendarFocused", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
    
    inline def setLastActiveElm(value: HTMLElement): Self = StObject.set(x, "lastActiveElm", value.asInstanceOf[js.Any])
    
    inline def setLastActiveElmUndefined: Self = StObject.set(x, "lastActiveElm", js.undefined)
  }
}
