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
    val __obj = js.Dynamic.literal(day = day, days = days, hour = hour, hours = hours, millisecond = millisecond, milliseconds = milliseconds, minute = minute, minutes = minutes, month = month, months = months, second = second, seconds = seconds, week = week, weeks = weeks, year = year, years = years)
  
    __obj.asInstanceOf[IAddOrientation]
  }
}

