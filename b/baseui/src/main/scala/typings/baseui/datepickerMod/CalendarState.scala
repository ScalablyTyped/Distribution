package typings.baseui.datepickerMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarState extends StObject {
  
  var date: Date = js.native
  
  var focused: Boolean = js.native
  
  var highlightedDate: Date = js.native
  
  var quickSelectId: js.UndefOr[String] = js.native
}
object CalendarState {
  
  @scala.inline
  def apply(date: Date, focused: Boolean, highlightedDate: Date): CalendarState = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
  
  @scala.inline
  implicit class CalendarStateMutableBuilder[Self <: CalendarState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedDate(value: Date): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectId(value: String): Self = StObject.set(x, "quickSelectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectIdUndefined: Self = StObject.set(x, "quickSelectId", js.undefined)
  }
}
