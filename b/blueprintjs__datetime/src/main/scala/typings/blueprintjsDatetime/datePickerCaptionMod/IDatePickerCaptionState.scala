package typings.blueprintjsDatetime.datePickerCaptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerCaptionState extends js.Object {
  
  var monthRightOffset: Double = js.native
}
object IDatePickerCaptionState {
  
  @scala.inline
  def apply(monthRightOffset: Double): IDatePickerCaptionState = {
    val __obj = js.Dynamic.literal(monthRightOffset = monthRightOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionState]
  }
  
  @scala.inline
  implicit class IDatePickerCaptionStateOps[Self <: IDatePickerCaptionState] (val x: Self) extends AnyVal {
    
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
    def setMonthRightOffset(value: Double): Self = this.set("monthRightOffset", value.asInstanceOf[js.Any])
  }
}
