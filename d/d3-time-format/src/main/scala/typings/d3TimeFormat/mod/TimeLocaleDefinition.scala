package typings.d3TimeFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeLocaleDefinition extends js.Object {
  
  /**
    * The date (%x) format specifier (e.g., "%m/%d/%Y").
    */
  var date: String = js.native
  
  /**
    * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
    */
  var dateTime: String = js.native
  
  /**
    * The full names of the weekdays, starting with Sunday.
    */
  var days: js.Tuple7[String, String, String, String, String, String, String] = js.native
  
  /**
    * The full names of the months (starting with January).
    */
  var months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  
  /**
    * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
    */
  var periods: js.Tuple2[String, String] = js.native
  
  /**
    * The abbreviated names of the weekdays, starting with Sunday.
    */
  var shortDays: js.Tuple7[String, String, String, String, String, String, String] = js.native
  
  /**
    * the abbreviated names of the months (starting with January).
    */
  var shortMonths: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  
  /**
    *  The time (%X) format specifier (e.g., "%H:%M:%S").
    */
  var time: String = js.native
}
object TimeLocaleDefinition {
  
  @scala.inline
  def apply(
    date: String,
    dateTime: String,
    days: js.Tuple7[String, String, String, String, String, String, String],
    months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    periods: js.Tuple2[String, String],
    shortDays: js.Tuple7[String, String, String, String, String, String, String],
    shortMonths: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    time: String
  ): TimeLocaleDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLocaleDefinition]
  }
  
  @scala.inline
  implicit class TimeLocaleDefinitionOps[Self <: TimeLocaleDefinition] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: js.Tuple7[String, String, String, String, String, String, String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriods(value: js.Tuple2[String, String]): Self = this.set("periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDays(value: js.Tuple7[String, String, String, String, String, String, String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonths(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
