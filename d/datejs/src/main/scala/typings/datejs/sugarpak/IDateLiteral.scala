package typings.datejs.sugarpak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateLiteral extends ITimeLiteral {
  var day: Double = js.native
  var month: Double = js.native
  var week: Double = js.native
  var year: Double = js.native
}

object IDateLiteral {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    week: Double,
    year: Double
  ): IDateLiteral = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateLiteral]
  }
  @scala.inline
  implicit class IDateLiteralOps[Self <: IDateLiteral] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: Double): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

