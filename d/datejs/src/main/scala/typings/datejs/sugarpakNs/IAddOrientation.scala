package typings.datejs.sugarpakNs

import typings.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddOrientation extends js.Object {
  def day(): Date
  def days(): Date
  def hour(): Date
  def hours(): Date
  def millisecond(): Date
  def milliseconds(): Date
  def minute(): Date
  def minutes(): Date
  def month(): Date
  def months(): Date
  def second(): Date
  def seconds(): Date
  def week(): Date
  def weeks(): Date
  def year(): Date
  def years(): Date
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
}

