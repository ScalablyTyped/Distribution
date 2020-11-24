package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeDisplayFormat extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var millisecond: js.UndefOr[String] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var quarter: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var week: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object TimeDisplayFormat {
  
  @scala.inline
  def apply(): TimeDisplayFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDisplayFormat]
  }
  
  @scala.inline
  implicit class TimeDisplayFormatOps[Self <: TimeDisplayFormat] (val x: Self) extends AnyVal {
    
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
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setMillisecond(value: String): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setQuarter(value: String): Self = this.set("quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarter: Self = this.set("quarter", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
