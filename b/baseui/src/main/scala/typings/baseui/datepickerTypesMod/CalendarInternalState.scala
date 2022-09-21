package typings.baseui.datepickerTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarInternalState[T] extends StObject {
  
  var date: T
  
  var focused: Boolean
  
  var highlightedDate: T
  
  var quickSelectId: js.UndefOr[String | Null] = js.undefined
  
  var rootElement: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var time: js.Array[js.UndefOr[T | Null]]
}
object CalendarInternalState {
  
  inline def apply[T](date: T, focused: Boolean, highlightedDate: T, time: js.Array[js.UndefOr[T | Null]]): CalendarInternalState[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarInternalState[T]]
  }
  
  extension [Self <: CalendarInternalState[?], T](x: Self & CalendarInternalState[T]) {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDate(value: T): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectId(value: String): Self = StObject.set(x, "quickSelectId", value.asInstanceOf[js.Any])
    
    inline def setQuickSelectIdNull: Self = StObject.set(x, "quickSelectId", null)
    
    inline def setQuickSelectIdUndefined: Self = StObject.set(x, "quickSelectId", js.undefined)
    
    inline def setRootElement(value: HTMLElement): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
    
    inline def setRootElementNull: Self = StObject.set(x, "rootElement", null)
    
    inline def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
    
    inline def setTime(value: js.Array[js.UndefOr[T | Null]]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "time", js.Array(value*))
  }
}
