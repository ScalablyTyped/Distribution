package typings.datejs.sugarpak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateElement extends js.Object {
  def day(): IDateElementEvaluator = js.native
  def days(): IDateElementEvaluator = js.native
  def hour(): IDateElementEvaluator = js.native
  def hours(): IDateElementEvaluator = js.native
  def millisecond(): IDateElementEvaluator = js.native
  def milliseconds(): IDateElementEvaluator = js.native
  def minute(): IDateElementEvaluator = js.native
  def minutes(): IDateElementEvaluator = js.native
  def month(): IDateElementEvaluator = js.native
  def months(): IDateElementEvaluator = js.native
  def second(): IDateElementEvaluator = js.native
  def seconds(): IDateElementEvaluator = js.native
  def week(): IDateElementEvaluator = js.native
  def weeks(): IDateElementEvaluator = js.native
  def year(): IDateElementEvaluator = js.native
  def years(): IDateElementEvaluator = js.native
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
  @scala.inline
  implicit class IDateElementOps[Self <: IDateElement] (val x: Self) extends AnyVal {
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
    def setDay(value: () => IDateElementEvaluator): Self = this.set("day", js.Any.fromFunction0(value))
    @scala.inline
    def setDays(value: () => IDateElementEvaluator): Self = this.set("days", js.Any.fromFunction0(value))
    @scala.inline
    def setHour(value: () => IDateElementEvaluator): Self = this.set("hour", js.Any.fromFunction0(value))
    @scala.inline
    def setHours(value: () => IDateElementEvaluator): Self = this.set("hours", js.Any.fromFunction0(value))
    @scala.inline
    def setMillisecond(value: () => IDateElementEvaluator): Self = this.set("millisecond", js.Any.fromFunction0(value))
    @scala.inline
    def setMilliseconds(value: () => IDateElementEvaluator): Self = this.set("milliseconds", js.Any.fromFunction0(value))
    @scala.inline
    def setMinute(value: () => IDateElementEvaluator): Self = this.set("minute", js.Any.fromFunction0(value))
    @scala.inline
    def setMinutes(value: () => IDateElementEvaluator): Self = this.set("minutes", js.Any.fromFunction0(value))
    @scala.inline
    def setMonth(value: () => IDateElementEvaluator): Self = this.set("month", js.Any.fromFunction0(value))
    @scala.inline
    def setMonths(value: () => IDateElementEvaluator): Self = this.set("months", js.Any.fromFunction0(value))
    @scala.inline
    def setSecond(value: () => IDateElementEvaluator): Self = this.set("second", js.Any.fromFunction0(value))
    @scala.inline
    def setSeconds(value: () => IDateElementEvaluator): Self = this.set("seconds", js.Any.fromFunction0(value))
    @scala.inline
    def setWeek(value: () => IDateElementEvaluator): Self = this.set("week", js.Any.fromFunction0(value))
    @scala.inline
    def setWeeks(value: () => IDateElementEvaluator): Self = this.set("weeks", js.Any.fromFunction0(value))
    @scala.inline
    def setYear(value: () => IDateElementEvaluator): Self = this.set("year", js.Any.fromFunction0(value))
    @scala.inline
    def setYears(value: () => IDateElementEvaluator): Self = this.set("years", js.Any.fromFunction0(value))
  }
  
}

