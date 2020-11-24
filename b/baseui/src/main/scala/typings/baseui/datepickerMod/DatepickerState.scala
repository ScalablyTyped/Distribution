package typings.baseui.datepickerMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerState extends js.Object {
  
  var calendarFocused: Boolean = js.native
  
  var isOpen: Boolean = js.native
  
  var isPseudoFocused: Boolean = js.native
  
  var lastActiveElm: js.UndefOr[HTMLElement] = js.native
}
object DatepickerState {
  
  @scala.inline
  def apply(calendarFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerState]
  }
  
  @scala.inline
  implicit class DatepickerStateOps[Self <: DatepickerState] (val x: Self) extends AnyVal {
    
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
    def setCalendarFocused(value: Boolean): Self = this.set("calendarFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoFocused(value: Boolean): Self = this.set("isPseudoFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActiveElm(value: HTMLElement): Self = this.set("lastActiveElm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastActiveElm: Self = this.set("lastActiveElm", js.undefined)
  }
}
