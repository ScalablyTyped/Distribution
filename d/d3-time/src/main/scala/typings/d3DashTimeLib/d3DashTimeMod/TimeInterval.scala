package typings
package d3DashTimeLib.d3DashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInterval extends js.Object {
  /**
    * Returns a new date representing the latest interval boundary date before or equal to date.
    * This function is an alias for "TimeInterval.floor(date)". For example, timeYear(date) and timeYear.floor(date) are equivalent.
    *
    * For example, timeDay(date) typically returns 12:00 AM local time on the given date.
    *
    * This function is idempotent: if the specified date is already floored to the current interval,
    * a new date with an identical time is returned.
    * Furthermore, the returned date is the minimum expressible value of the associated interval,
    * such that interval.floor(interval.floor(date) - 1) returns the preceding interval boundary date.
    *
    * Note that the == and === operators do not compare by value with Date objects,
    * and thus you cannot use them to tell whether the specified date has already been floored.
    * Instead, coerce to a number and then compare.
    *
    * This is more reliable than testing whether the time is 12:00 AM, as in some time zones midnight may not exist due to daylight saving.
    *
    * @param date A date object.
    */
  def apply(date: stdLib.Date): stdLib.Date = js.native
  /**
    * Returns a new date representing the earliest interval boundary date after or equal to date.
    *
    * For example, timeDay.ceil(date) typically returns 12:00 AM local time on the date following the given date.
    *
    * This method is idempotent: if the specified date is already ceilinged to the current interval,
    * a new date with an identical time is returned. Furthermore,
    * the returned date is the maximum expressible value of the associated interval,
    * such that interval.ceil(interval.ceil(date) + 1) returns the following interval boundary date.
    *
    * @param date A date object.
    */
  def ceil(date: stdLib.Date): stdLib.Date = js.native
  /**
    * Returns a new interval that is a filtered subset of this interval using the specified test function.
    *
    * @param test A test function which is passed a date and should return true if and only if
    * the specified date should be considered part of the interval.
    */
  def filter(test: js.Function1[/* date */ stdLib.Date, scala.Boolean]): TimeInterval = js.native
  /**
    * Returns a new date representing the latest interval boundary date before or equal to date.
    *
    * For example, timeDay.floor(date) typically returns 12:00 AM local time on the given date.
    *
    * This method is idempotent: if the specified date is already floored to the current interval,
    * a new date with an identical time is returned.
    * Furthermore, the returned date is the minimum expressible value of the associated interval,
    * such that interval.floor(interval.floor(date) - 1) returns the preceding interval boundary date.
    *
    * Note that the == and === operators do not compare by value with Date objects,
    * and thus you cannot use them to tell whether the specified date has already been floored.
    * Instead, coerce to a number and then compare.
    *
    * This is more reliable than testing whether the time is 12:00 AM, as in some time zones midnight may not exist due to daylight saving.
    *
    * @param date A date object.
    */
  def floor(date: stdLib.Date): stdLib.Date = js.native
  /**
    * Returns a new date equal to date plus step intervals.
    *
    * If step is not specified it defaults to 1.
    *
    * This method does not round the specified date to the interval. For example, if date is today at 5:34 PM,
    * then timeDay.offset(date, 1) returns 5:34 PM tomorrow (even if daylight saving changes!).
    *
    * @param date A date object.
    * @param step An optional number of steps to apply when calculating the offset date.
    * If step is negative, then the returned date will be before the specified date;
    * if step is zero, then a copy of the specified date is returned; if step is not an integer, it is floored.
    */
  def offset(date: stdLib.Date): stdLib.Date = js.native
  def offset(date: stdLib.Date, step: scala.Double): stdLib.Date = js.native
  /**
    * Returns an array of dates representing every interval boundary after or equal to start (inclusive) and before stop (exclusive).
    *
    * If step is specified, then every step-th boundary will be returned; for example,
    * for the timeDay interval a step of 2 will return every other day.
    * If step is not an integer, it is floored.
    *
    * The first date in the returned array is the earliest boundary after or equal to start;
    * subsequent dates are offset by step intervals and floored.
    * Thus, two overlapping ranges may be inconsistent.
    *
    * To make ranges consistent when a step is specified, use CountableInterval.every instead.
    *
    * @param start A start date object for the range.
    * @param stop A stop date object for the range.
    * @param step An optional number of steps to apply when calculating the dates in the range.
    */
  def range(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def range(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  /**
    * Returns a new date representing the closest interval boundary date to date.
    *
    * For example, timeDay.round(date) typically returns 12:00 AM local time on the given date if it is on or before noon,
    * and 12:00 AM of the following day if it is after noon.
    *
    * This method is idempotent: if the specified date is already rounded to the current interval, a new date with an identical time is returned.
    *
    * @param date A date object.
    */
  def round(date: stdLib.Date): stdLib.Date = js.native
}

