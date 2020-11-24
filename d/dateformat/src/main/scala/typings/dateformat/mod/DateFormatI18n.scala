package typings.dateformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * dateFormat.i18n
  *
  * Internationalization strings
  *
  * Example:
  *
  * @example ```
  * dateFormat.i18n = {
  *     dayNames: [
  *         'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat',
  *         'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'
  *     ],
  *     monthNames: [
  *         'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec',
  *         'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'
  *     ],
  *     timeNames: [
  *         'a', 'p', 'am', 'pm', 'A', 'P', 'AM', 'PM'
  *     ]
  * };```
  *
  * @see https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L124
  */
@js.native
trait DateFormatI18n extends js.Object {
  
  var dayNames: js.Array[String] = js.native
  
  var monthNames: js.Array[String] = js.native
  
  var timeNames: js.Array[String] = js.native
}
object DateFormatI18n {
  
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String], timeNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], timeNames = timeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatI18n]
  }
  
  @scala.inline
  implicit class DateFormatI18nOps[Self <: DateFormatI18n] (val x: Self) extends AnyVal {
    
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
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNamesVarargs(value: String*): Self = this.set("timeNames", js.Array(value :_*))
    
    @scala.inline
    def setTimeNames(value: js.Array[String]): Self = this.set("timeNames", value.asInstanceOf[js.Any])
  }
}
