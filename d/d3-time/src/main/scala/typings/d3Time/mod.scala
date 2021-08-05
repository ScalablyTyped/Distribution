package typings.d3Time

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("d3-time", "timeDay")
  @js.native
  val timeDay: CountableTimeInterval = js.native
  
  inline def timeDays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeDays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeFriday")
  @js.native
  val timeFriday: CountableTimeInterval = js.native
  
  inline def timeFridays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeFridays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeHour")
  @js.native
  val timeHour: CountableTimeInterval = js.native
  
  inline def timeHours(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeHours(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  inline def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit]
  ): TimeInterval_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TimeInterval_]
  inline def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double]
  ): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  inline def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double],
    field: js.Function1[/* date */ Date, Double]
  ): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(floor.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  
  @JSImport("d3-time", "timeMillisecond")
  @js.native
  val timeMillisecond: CountableTimeInterval = js.native
  
  inline def timeMilliseconds(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeMinute")
  @js.native
  val timeMinute: CountableTimeInterval = js.native
  
  inline def timeMinutes(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeMonday")
  @js.native
  val timeMonday: CountableTimeInterval = js.native
  
  inline def timeMondays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeMondays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeMonth")
  @js.native
  val timeMonth: CountableTimeInterval = js.native
  
  inline def timeMonths(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeMonths(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeSaturday")
  @js.native
  val timeSaturday: CountableTimeInterval = js.native
  
  inline def timeSaturdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeSecond")
  @js.native
  val timeSecond: CountableTimeInterval = js.native
  
  inline def timeSeconds(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeSunday")
  @js.native
  val timeSunday: CountableTimeInterval = js.native
  
  inline def timeSundays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeSundays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeThursday")
  @js.native
  val timeThursday: CountableTimeInterval = js.native
  
  inline def timeThursdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeTuesday")
  @js.native
  val timeTuesday: CountableTimeInterval = js.native
  
  inline def timeTuesdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeWednesday")
  @js.native
  val timeWednesday: CountableTimeInterval = js.native
  
  inline def timeWednesdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeWeek")
  @js.native
  val timeWeek: CountableTimeInterval = js.native
  
  inline def timeWeeks(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "timeYear")
  @js.native
  val timeYear: CountableTimeInterval = js.native
  
  inline def timeYears(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def timeYears(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcDay")
  @js.native
  val utcDay: CountableTimeInterval = js.native
  
  inline def utcDays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcDays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcDays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcFriday")
  @js.native
  val utcFriday: CountableTimeInterval = js.native
  
  inline def utcFridays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcFridays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcFridays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcHour")
  @js.native
  val utcHour: CountableTimeInterval = js.native
  
  inline def utcHours(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcHours(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcHours")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcMillisecond")
  @js.native
  val utcMillisecond: CountableTimeInterval = js.native
  
  inline def utcMilliseconds(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMilliseconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcMinute")
  @js.native
  val utcMinute: CountableTimeInterval = js.native
  
  inline def utcMinutes(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMinutes")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcMonday")
  @js.native
  val utcMonday: CountableTimeInterval = js.native
  
  inline def utcMondays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcMondays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMondays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcMonth")
  @js.native
  val utcMonth: CountableTimeInterval = js.native
  
  inline def utcMonths(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcMonths(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcMonths")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcSaturday")
  @js.native
  val utcSaturday: CountableTimeInterval = js.native
  
  inline def utcSaturdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSaturdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcSecond")
  @js.native
  val utcSecond: CountableTimeInterval = js.native
  
  inline def utcSeconds(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSeconds")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcSunday")
  @js.native
  val utcSunday: CountableTimeInterval = js.native
  
  inline def utcSundays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcSundays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcSundays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcThursday")
  @js.native
  val utcThursday: CountableTimeInterval = js.native
  
  inline def utcThursdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcThursdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcTuesday")
  @js.native
  val utcTuesday: CountableTimeInterval = js.native
  
  inline def utcTuesdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcTuesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcWednesday")
  @js.native
  val utcWednesday: CountableTimeInterval = js.native
  
  inline def utcWednesdays(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWednesdays")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcWeek")
  @js.native
  val utcWeek: CountableTimeInterval = js.native
  
  inline def utcWeeks(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcWeeks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("d3-time", "utcYear")
  @js.native
  val utcYear: CountableTimeInterval = js.native
  
  inline def utcYears(start: Date, stop: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def utcYears(start: Date, stop: Date, step: Double): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("utcYears")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @js.native
  trait CountableTimeInterval
    extends StObject
       with TimeInterval_ {
    
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
  trait TimeInterval_ extends StObject {
    
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
