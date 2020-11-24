package typings.blueprintjsDatetime.datePickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerState extends js.Object {
  
  var displayMonth: Double = js.native
  
  var displayYear: Double = js.native
  
  var selectedDay: Double | Null = js.native
  
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  var value: Date | Null = js.native
}
object IDatePickerState {
  
  @scala.inline
  def apply(displayMonth: Double, displayYear: Double): IDatePickerState = {
    val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], displayYear = displayYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerState]
  }
  
  @scala.inline
  implicit class IDatePickerStateOps[Self <: IDatePickerState] (val x: Self) extends AnyVal {
    
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
    def setDisplayMonth(value: Double): Self = this.set("displayMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayYear(value: Double): Self = this.set("displayYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDay(value: Double): Self = this.set("selectedDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDayNull: Self = this.set("selectedDay", null)
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
