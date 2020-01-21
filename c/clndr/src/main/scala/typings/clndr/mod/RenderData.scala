package typings.clndr.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderData extends js.Object {
  var days: js.Array[CalendarDay]
  var daysOfTheWeek: js.Array[String]
  var eventsLastMonth: js.Array[_]
  var eventsNextMonth: js.Array[_]
  var eventsThisInterval: js.UndefOr[js.Array[_]] = js.undefined
  var eventsThisMonth: js.Array[_]
  var extras: js.UndefOr[js.Any] = js.undefined
  var intervalEnd: js.UndefOr[Moment] = js.undefined
  var intervalStart: js.UndefOr[Moment] = js.undefined
  var month: String
  var months: js.Array[Month]
  var numberOfRows: Double
  var year: Double
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
    year: Double,
    eventsThisInterval: js.Array[_] = null,
    extras: js.Any = null,
    intervalEnd: Moment = null,
    intervalStart: Moment = null
  ): RenderData = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysOfTheWeek = daysOfTheWeek.asInstanceOf[js.Any], eventsLastMonth = eventsLastMonth.asInstanceOf[js.Any], eventsNextMonth = eventsNextMonth.asInstanceOf[js.Any], eventsThisMonth = eventsThisMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    if (eventsThisInterval != null) __obj.updateDynamic("eventsThisInterval")(eventsThisInterval.asInstanceOf[js.Any])
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (intervalEnd != null) __obj.updateDynamic("intervalEnd")(intervalEnd.asInstanceOf[js.Any])
    if (intervalStart != null) __obj.updateDynamic("intervalStart")(intervalStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
}

