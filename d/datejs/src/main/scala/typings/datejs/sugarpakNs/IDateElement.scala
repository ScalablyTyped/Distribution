package typings.datejs.sugarpakNs

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
    day: () => IDateElementEvaluator,
    days: () => IDateElementEvaluator,
    hour: () => IDateElementEvaluator,
    hours: () => IDateElementEvaluator,
    millisecond: () => IDateElementEvaluator,
    milliseconds: () => IDateElementEvaluator,
    minute: () => IDateElementEvaluator,
    minutes: () => IDateElementEvaluator,
    month: () => IDateElementEvaluator,
    months: () => IDateElementEvaluator,
    second: () => IDateElementEvaluator,
    seconds: () => IDateElementEvaluator,
    week: () => IDateElementEvaluator,
    weeks: () => IDateElementEvaluator,
    year: () => IDateElementEvaluator,
    years: () => IDateElementEvaluator
  ): IDateElement = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
  
    __obj.asInstanceOf[IDateElement]
  }
}

