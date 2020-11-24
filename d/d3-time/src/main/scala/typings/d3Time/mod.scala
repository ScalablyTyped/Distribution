package typings.d3Time

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-time", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val timeDay: CountableTimeInterval = js.native
  
  def timeDays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeDays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeFriday: CountableTimeInterval = js.native
  
  def timeFridays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeFridays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeHour: CountableTimeInterval = js.native
  
  def timeHours(start: Date, stop: Date): js.Array[Date] = js.native
  def timeHours(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit]
  ): TimeInterval_ = js.native
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double]
  ): CountableTimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double],
    field: js.Function1[/* date */ Date, Double]
  ): CountableTimeInterval = js.native
  
  val timeMillisecond: CountableTimeInterval = js.native
  
  def timeMilliseconds(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeMinute: CountableTimeInterval = js.native
  
  def timeMinutes(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeMonday: CountableTimeInterval = js.native
  
  def timeMondays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMondays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeMonth: CountableTimeInterval = js.native
  
  def timeMonths(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMonths(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeSaturday: CountableTimeInterval = js.native
  
  def timeSaturdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeSecond: CountableTimeInterval = js.native
  
  def timeSeconds(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeSunday: CountableTimeInterval = js.native
  
  def timeSundays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSundays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeThursday: CountableTimeInterval = js.native
  
  def timeThursdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeTuesday: CountableTimeInterval = js.native
  
  def timeTuesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeWednesday: CountableTimeInterval = js.native
  
  def timeWednesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeWeek: CountableTimeInterval = js.native
  
  def timeWeeks(start: Date, stop: Date): js.Array[Date] = js.native
  def timeWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val timeYear: CountableTimeInterval = js.native
  
  def timeYears(start: Date, stop: Date): js.Array[Date] = js.native
  def timeYears(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcDay: CountableTimeInterval = js.native
  
  def utcDays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcDays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcFriday: CountableTimeInterval = js.native
  
  def utcFridays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcFridays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcHour: CountableTimeInterval = js.native
  
  def utcHours(start: Date, stop: Date): js.Array[Date] = js.native
  def utcHours(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcMillisecond: CountableTimeInterval = js.native
  
  def utcMilliseconds(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcMinute: CountableTimeInterval = js.native
  
  def utcMinutes(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcMonday: CountableTimeInterval = js.native
  
  def utcMondays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMondays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcMonth: CountableTimeInterval = js.native
  
  def utcMonths(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMonths(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcSaturday: CountableTimeInterval = js.native
  
  def utcSaturdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcSecond: CountableTimeInterval = js.native
  
  def utcSeconds(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcSunday: CountableTimeInterval = js.native
  
  def utcSundays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSundays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcThursday: CountableTimeInterval = js.native
  
  def utcThursdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcTuesday: CountableTimeInterval = js.native
  
  def utcTuesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcWednesday: CountableTimeInterval = js.native
  
  def utcWednesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcWeek: CountableTimeInterval = js.native
  
  def utcWeeks(start: Date, stop: Date): js.Array[Date] = js.native
  def utcWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  val utcYear: CountableTimeInterval = js.native
  
  def utcYears(start: Date, stop: Date): js.Array[Date] = js.native
  def utcYears(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  
  @js.native
  trait CountableTimeInterval extends TimeInterval_ {
    
    /**
      * Returns the number of interval boundaries after start (exclusive) and before or equal to end (inclusive).
      *
      * Note that this behavior is slightly different than interval.range,
      * because its purpose is to return the zero-based number of the specified end date relative to the specified start date.
      *
      * @param start A start date object.
      * @param end An end date object.
      */
    def count(start: Date, end: Date): Double = js.native
    
    /**
      * Returns a filtered view of this interval representing every stepth date.
      *
      * The meaning of step is dependent on this interval’s parent interval as defined by the field function.
      *
      * For example, timeMinute.every(15) returns an interval representing every fifteen minutes,
      * starting on the hour: :00, :15, :30, :45, etc. Note that for some intervals,
      * the resulting dates may not be uniformly-spaced;
      * timeDay’s parent interval is timeMonth, and thus the interval number resets at the start of each month.
      *
      * If step is not valid, returns null. If step is one, returns this interval.
      *
      * This method can be used in conjunction with interval.range to ensure that two overlapping ranges are consistent.
      *
      * The returned filtered interval does not support interval.count. See also interval.filter.
      *
      * @param step Number of steps.
      */
    def every(step: Double): TimeInterval_ | Null = js.native
  }
  
  @js.native
  trait TimeInterval_ extends js.Object {
    
    /**
      * Returns a new date representing the latest interval boundary date before or equal to date.
      * Equivalent to interval.floor, except it date is not specified, it defaults to the current time.
      * For example, d3.timeYear(date) and d3.timeYear.floor(date) are equivalent.
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
    def apply(): Date = js.native
    def apply(date: Date): Date = js.native
    
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
    def ceil(date: Date): Date = js.native
    
    /**
      * Returns a new interval that is a filtered subset of this interval using the specified test function.
      *
      * @param test A test function which is passed a date and should return true if and only if
      * the specified date should be considered part of the interval.
      */
    def filter(test: js.Function1[/* date */ Date, Boolean]): TimeInterval_ = js.native
    
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
    def floor(date: Date): Date = js.native
    
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
    def offset(date: Date): Date = js.native
    def offset(date: Date, step: Double): Date = js.native
    
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
    def range(start: Date, stop: Date): js.Array[Date] = js.native
    def range(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
    
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
    def round(date: Date): Date = js.native
  }
}
