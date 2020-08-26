package typings.datejs.sugarpak

import typings.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddOrientation extends js.Object {
  def day(): Date = js.native
  def days(): Date = js.native
  def hour(): Date = js.native
  def hours(): Date = js.native
  def millisecond(): Date = js.native
  def milliseconds(): Date = js.native
  def minute(): Date = js.native
  def minutes(): Date = js.native
  def month(): Date = js.native
  def months(): Date = js.native
  def second(): Date = js.native
  def seconds(): Date = js.native
  def week(): Date = js.native
  def weeks(): Date = js.native
  def year(): Date = js.native
  def years(): Date = js.native
}

object IAddOrientation {
  @scala.inline
  def apply(
    day: () => Date,
    days: () => Date,
    hour: () => Date,
    hours: () => Date,
    millisecond: () => Date,
    milliseconds: () => Date,
    minute: () => Date,
    minutes: () => Date,
    month: () => Date,
    months: () => Date,
    second: () => Date,
    seconds: () => Date,
    week: () => Date,
    weeks: () => Date,
    year: () => Date,
    years: () => Date
  ): IAddOrientation = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
    __obj.asInstanceOf[IAddOrientation]
  }
  @scala.inline
  implicit class IAddOrientationOps[Self <: IAddOrientation] (val x: Self) extends AnyVal {
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
    def setDay(value: () => Date): Self = this.set("day", js.Any.fromFunction0(value))
    @scala.inline
    def setDays(value: () => Date): Self = this.set("days", js.Any.fromFunction0(value))
    @scala.inline
    def setHour(value: () => Date): Self = this.set("hour", js.Any.fromFunction0(value))
    @scala.inline
    def setHours(value: () => Date): Self = this.set("hours", js.Any.fromFunction0(value))
    @scala.inline
    def setMillisecond(value: () => Date): Self = this.set("millisecond", js.Any.fromFunction0(value))
    @scala.inline
    def setMilliseconds(value: () => Date): Self = this.set("milliseconds", js.Any.fromFunction0(value))
    @scala.inline
    def setMinute(value: () => Date): Self = this.set("minute", js.Any.fromFunction0(value))
    @scala.inline
    def setMinutes(value: () => Date): Self = this.set("minutes", js.Any.fromFunction0(value))
    @scala.inline
    def setMonth(value: () => Date): Self = this.set("month", js.Any.fromFunction0(value))
    @scala.inline
    def setMonths(value: () => Date): Self = this.set("months", js.Any.fromFunction0(value))
    @scala.inline
    def setSecond(value: () => Date): Self = this.set("second", js.Any.fromFunction0(value))
    @scala.inline
    def setSeconds(value: () => Date): Self = this.set("seconds", js.Any.fromFunction0(value))
    @scala.inline
    def setWeek(value: () => Date): Self = this.set("week", js.Any.fromFunction0(value))
    @scala.inline
    def setWeeks(value: () => Date): Self = this.set("weeks", js.Any.fromFunction0(value))
    @scala.inline
    def setYear(value: () => Date): Self = this.set("year", js.Any.fromFunction0(value))
    @scala.inline
    def setYears(value: () => Date): Self = this.set("years", js.Any.fromFunction0(value))
  }
  
}

