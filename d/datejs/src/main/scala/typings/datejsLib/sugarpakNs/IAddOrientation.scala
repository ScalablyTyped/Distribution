package typings
package datejsLib.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddOrientation extends js.Object {
  def day(): datejsLib.Date
  def days(): datejsLib.Date
  def hour(): datejsLib.Date
  def hours(): datejsLib.Date
  def millisecond(): datejsLib.Date
  def milliseconds(): datejsLib.Date
  def minute(): datejsLib.Date
  def minutes(): datejsLib.Date
  def month(): datejsLib.Date
  def months(): datejsLib.Date
  def second(): datejsLib.Date
  def seconds(): datejsLib.Date
  def week(): datejsLib.Date
  def weeks(): datejsLib.Date
  def year(): datejsLib.Date
  def years(): datejsLib.Date
}

object IAddOrientation {
  @scala.inline
  def apply(
    day: js.Function0[datejsLib.Date],
    days: js.Function0[datejsLib.Date],
    hour: js.Function0[datejsLib.Date],
    hours: js.Function0[datejsLib.Date],
    millisecond: js.Function0[datejsLib.Date],
    milliseconds: js.Function0[datejsLib.Date],
    minute: js.Function0[datejsLib.Date],
    minutes: js.Function0[datejsLib.Date],
    month: js.Function0[datejsLib.Date],
    months: js.Function0[datejsLib.Date],
    second: js.Function0[datejsLib.Date],
    seconds: js.Function0[datejsLib.Date],
    week: js.Function0[datejsLib.Date],
    weeks: js.Function0[datejsLib.Date],
    year: js.Function0[datejsLib.Date],
    years: js.Function0[datejsLib.Date]
  ): IAddOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("hour")(hour)
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("millisecond")(millisecond)
    __obj.updateDynamic("milliseconds")(milliseconds)
    __obj.updateDynamic("minute")(minute)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("seconds")(seconds)
    __obj.updateDynamic("week")(week)
    __obj.updateDynamic("weeks")(weeks)
    __obj.updateDynamic("year")(year)
    __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[IAddOrientation]
  }
}

