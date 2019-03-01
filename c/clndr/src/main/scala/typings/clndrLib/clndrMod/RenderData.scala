package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderData extends js.Object {
  var days: js.Array[CalendarDay]
  var daysOfTheWeek: js.Array[java.lang.String]
  var eventsLastMonth: js.Array[_]
  var eventsNextMonth: js.Array[_]
  var eventsThisInterval: js.UndefOr[js.Array[_]] = js.undefined
  var eventsThisMonth: js.Array[_]
  var extras: js.UndefOr[js.Any] = js.undefined
  var intervalEnd: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var intervalStart: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var month: java.lang.String
  var months: js.Array[Month]
  var numberOfRows: scala.Double
  var year: scala.Double
}

object RenderData {
  @scala.inline
  def apply(
    days: js.Array[CalendarDay],
    daysOfTheWeek: js.Array[java.lang.String],
    eventsLastMonth: js.Array[_],
    eventsNextMonth: js.Array[_],
    eventsThisMonth: js.Array[_],
    month: java.lang.String,
    months: js.Array[Month],
    numberOfRows: scala.Double,
    year: scala.Double,
    eventsThisInterval: js.Array[_] = null,
    extras: js.Any = null,
    intervalEnd: momentLib.momentMod.momentNs.Moment = null,
    intervalStart: momentLib.momentMod.momentNs.Moment = null
  ): RenderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("daysOfTheWeek")(daysOfTheWeek)
    __obj.updateDynamic("eventsLastMonth")(eventsLastMonth)
    __obj.updateDynamic("eventsNextMonth")(eventsNextMonth)
    __obj.updateDynamic("eventsThisMonth")(eventsThisMonth)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("numberOfRows")(numberOfRows)
    __obj.updateDynamic("year")(year)
    if (eventsThisInterval != null) __obj.updateDynamic("eventsThisInterval")(eventsThisInterval)
    if (extras != null) __obj.updateDynamic("extras")(extras)
    if (intervalEnd != null) __obj.updateDynamic("intervalEnd")(intervalEnd)
    if (intervalStart != null) __obj.updateDynamic("intervalStart")(intervalStart)
    __obj.asInstanceOf[RenderData]
  }
}

