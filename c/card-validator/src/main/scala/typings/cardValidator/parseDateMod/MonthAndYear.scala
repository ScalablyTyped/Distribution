package typings.cardValidator.parseDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthAndYear extends js.Object {
  var month: String = js.native
  var year: String = js.native
}

object MonthAndYear {
  @scala.inline
  def apply(month: String, year: String): MonthAndYear = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthAndYear]
  }
  @scala.inline
  implicit class MonthAndYearOps[Self <: MonthAndYear] (val x: Self) extends AnyVal {
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
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

