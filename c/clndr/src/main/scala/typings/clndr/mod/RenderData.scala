package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderData extends js.Object {
  var days: js.Array[CalendarDay] = js.native
  var daysOfTheWeek: js.Array[String] = js.native
  var eventsLastMonth: js.Array[_] = js.native
  var eventsNextMonth: js.Array[_] = js.native
  var eventsThisInterval: js.UndefOr[js.Array[_]] = js.native
  var eventsThisMonth: js.Array[_] = js.native
  var extras: js.UndefOr[js.Any] = js.native
  var intervalEnd: js.UndefOr[Moment] = js.native
  var intervalStart: js.UndefOr[Moment] = js.native
  var month: String = js.native
  var months: js.Array[Month] = js.native
  var numberOfRows: Double = js.native
  var year: Double = js.native
}

object RenderData {
  @scala.inline
  def apply(
    days: js.Array[CalendarDay],
    daysOfTheWeek: js.Array[String],
    eventsLastMonth: js.Array[_],
    eventsNextMonth: js.Array[_],
    eventsThisMonth: js.Array[_],
    month: String,
    months: js.Array[Month],
    numberOfRows: Double,
    year: Double
  ): RenderData = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysOfTheWeek = daysOfTheWeek.asInstanceOf[js.Any], eventsLastMonth = eventsLastMonth.asInstanceOf[js.Any], eventsNextMonth = eventsNextMonth.asInstanceOf[js.Any], eventsThisMonth = eventsThisMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
  @scala.inline
  implicit class RenderDataOps[Self <: RenderData] (val x: Self) extends AnyVal {
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
    def setDaysOfTheWeekVarargs(value: String*): Self = this.set("daysOfTheWeek", js.Array(value :_*))
    @scala.inline
    def setDaysOfTheWeek(value: js.Array[String]): Self = this.set("daysOfTheWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsLastMonthVarargs(value: js.Any*): Self = this.set("eventsLastMonth", js.Array(value :_*))
    @scala.inline
    def setEventsLastMonth(value: js.Array[_]): Self = this.set("eventsLastMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsNextMonthVarargs(value: js.Any*): Self = this.set("eventsNextMonth", js.Array(value :_*))
    @scala.inline
    def setEventsNextMonth(value: js.Array[_]): Self = this.set("eventsNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsThisMonthVarargs(value: js.Any*): Self = this.set("eventsThisMonth", js.Array(value :_*))
    @scala.inline
    def setEventsThisMonth(value: js.Array[_]): Self = this.set("eventsThisMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsVarargs(value: Month*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[Month]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfRows(value: Double): Self = this.set("numberOfRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsThisIntervalVarargs(value: js.Any*): Self = this.set("eventsThisInterval", js.Array(value :_*))
    @scala.inline
    def setEventsThisInterval(value: js.Array[_]): Self = this.set("eventsThisInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsThisInterval: Self = this.set("eventsThisInterval", js.undefined)
    @scala.inline
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    @scala.inline
    def setIntervalEnd(value: Moment): Self = this.set("intervalEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalEnd: Self = this.set("intervalEnd", js.undefined)
    @scala.inline
    def setIntervalStart(value: Moment): Self = this.set("intervalStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalStart: Self = this.set("intervalStart", js.undefined)
  }
  
}

