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
    day: () => datejsLib.Date,
    days: () => datejsLib.Date,
    hour: () => datejsLib.Date,
    hours: () => datejsLib.Date,
    millisecond: () => datejsLib.Date,
    milliseconds: () => datejsLib.Date,
    minute: () => datejsLib.Date,
    minutes: () => datejsLib.Date,
    month: () => datejsLib.Date,
    months: () => datejsLib.Date,
    second: () => datejsLib.Date,
    seconds: () => datejsLib.Date,
    week: () => datejsLib.Date,
    weeks: () => datejsLib.Date,
    year: () => datejsLib.Date,
    years: () => datejsLib.Date
  ): IAddOrientation = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
  
    __obj.asInstanceOf[IAddOrientation]
  }
}

