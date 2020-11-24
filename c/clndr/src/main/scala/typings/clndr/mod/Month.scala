package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Month extends js.Object {
  
  var days: js.Array[CalendarDay] = js.native
  
  var month: Moment = js.native
}
object Month {
  
  @scala.inline
  def apply(days: js.Array[CalendarDay], month: Moment): Month = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
  
  @scala.inline
  implicit class MonthOps[Self <: Month] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: CalendarDay*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[CalendarDay]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Moment): Self = this.set("month", value.asInstanceOf[js.Any])
  }
}
