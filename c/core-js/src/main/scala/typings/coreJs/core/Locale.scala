package typings.coreJs.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  var months: String = js.native
  var weekdays: String = js.native
}

object Locale {
  @scala.inline
  def apply(months: String, weekdays: String): Locale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdays(value: String): Self = this.set("weekdays", value.asInstanceOf[js.Any])
  }
  
}

