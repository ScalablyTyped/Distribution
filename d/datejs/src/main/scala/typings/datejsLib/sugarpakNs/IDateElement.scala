package typings
package datejsLib.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateElement extends js.Object {
  def day(): IDateElementEvaluator
  def days(): IDateElementEvaluator
  def hour(): IDateElementEvaluator
  def hours(): IDateElementEvaluator
  def millisecond(): IDateElementEvaluator
  def milliseconds(): IDateElementEvaluator
  def minute(): IDateElementEvaluator
  def minutes(): IDateElementEvaluator
  def month(): IDateElementEvaluator
  def months(): IDateElementEvaluator
  def second(): IDateElementEvaluator
  def seconds(): IDateElementEvaluator
  def week(): IDateElementEvaluator
  def weeks(): IDateElementEvaluator
  def year(): IDateElementEvaluator
  def years(): IDateElementEvaluator
}

object IDateElement {
  @scala.inline
  def apply(
    day: js.Function0[IDateElementEvaluator],
    days: js.Function0[IDateElementEvaluator],
    hour: js.Function0[IDateElementEvaluator],
    hours: js.Function0[IDateElementEvaluator],
    millisecond: js.Function0[IDateElementEvaluator],
    milliseconds: js.Function0[IDateElementEvaluator],
    minute: js.Function0[IDateElementEvaluator],
    minutes: js.Function0[IDateElementEvaluator],
    month: js.Function0[IDateElementEvaluator],
    months: js.Function0[IDateElementEvaluator],
    second: js.Function0[IDateElementEvaluator],
    seconds: js.Function0[IDateElementEvaluator],
    week: js.Function0[IDateElementEvaluator],
    weeks: js.Function0[IDateElementEvaluator],
    year: js.Function0[IDateElementEvaluator],
    years: js.Function0[IDateElementEvaluator]
  ): IDateElement = {
    val __obj = js.Dynamic.literal(day = day, days = days, hour = hour, hours = hours, millisecond = millisecond, milliseconds = milliseconds, minute = minute, minutes = minutes, month = month, months = months, second = second, seconds = seconds, week = week, weeks = weeks, year = year, years = years)
  
    __obj.asInstanceOf[IDateElement]
  }
}

