package typings.baseui.datepickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarState extends js.Object {
  
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
  implicit class CalendarStateOps[Self <: CalendarState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedDate(value: Date): Self = this.set("highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectId(value: String): Self = this.set("quickSelectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickSelectId: Self = this.set("quickSelectId", js.undefined)
  }
}
