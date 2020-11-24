package typings.blueprintjsDatetime.dateRangePickerMod

import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.blueprintjsDatetime.monthAndYearMod.MonthAndYear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateRangePickerState extends js.Object {
  
  var hoverValue: js.UndefOr[DateRange] = js.native
  
  var leftView: js.UndefOr[MonthAndYear] = js.native
  
  var rightView: js.UndefOr[MonthAndYear] = js.native
  
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  
  var time: js.UndefOr[DateRange] = js.native
  
  var value: js.UndefOr[DateRange] = js.native
}
object IDateRangePickerState {
  
  @scala.inline
  def apply(): IDateRangePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangePickerState]
  }
  
  @scala.inline
  implicit class IDateRangePickerStateOps[Self <: IDateRangePickerState] (val x: Self) extends AnyVal {
    
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
    def setHoverValue(value: DateRange): Self = this.set("hoverValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverValue: Self = this.set("hoverValue", js.undefined)
    
    @scala.inline
    def setLeftView(value: MonthAndYear): Self = this.set("leftView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftView: Self = this.set("leftView", js.undefined)
    
    @scala.inline
    def setRightView(value: MonthAndYear): Self = this.set("rightView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightView: Self = this.set("rightView", js.undefined)
    
    @scala.inline
    def setSelectedShortcutIndex(value: Double): Self = this.set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedShortcutIndex: Self = this.set("selectedShortcutIndex", js.undefined)
    
    @scala.inline
    def setTime(value: DateRange): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setValue(value: DateRange): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
