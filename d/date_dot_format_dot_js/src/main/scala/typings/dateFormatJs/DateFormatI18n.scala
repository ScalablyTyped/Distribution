package typings.dateFormatJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internationalization strings
@js.native
trait DateFormatI18n extends js.Object {
  var dayNames: js.Array[String] = js.native
  var monthNames: js.Array[String] = js.native
}

object DateFormatI18n {
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any])
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
  }
  
}

