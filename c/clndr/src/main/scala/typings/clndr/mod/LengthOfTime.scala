package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthOfTime extends js.Object {
  
  /**
    * Set to an integer if you want to render one or more days, otherwise
    * leave this null. Setting this to 14 would render a 2-week calendar.
    *
    */
  var days: js.UndefOr[Double | Null] = js.native
  
  /**
    * This is the amount of months or days that will move forward/back when
    * paging the calendar. With days=14 and interval=7, you would have a
    * 2-week calendar that pages forward and backward 1 week at a time.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * Set to an integer if you want to render one or more months, otherwise
    * leave this null
    */
  var months: js.UndefOr[Double | Null] = js.native
}
object LengthOfTime {
  
  @scala.inline
  def apply(): LengthOfTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthOfTime]
  }
  
  @scala.inline
  implicit class LengthOfTimeOps[Self <: LengthOfTime] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setDaysNull: Self = this.set("days", null)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMonthsNull: Self = this.set("months", null)
  }
}
