package typings.dateFns

import typings.dateFns.anon.AdditionalDigits
import typings.dateFns.anon.Format
import typings.dateFns.anon.FractionDigits
import typings.dateFns.anon.Hours
import typings.dateFns.anon.IncludeSeconds
import typings.dateFns.anon.Inclusive
import typings.dateFns.anon.NearestTo
import typings.dateFns.anon.Representation
import typings.dateFns.anon.Step
import typings.dateFns.anon.Unit
import typings.dateFns.anon.UseAdditionalDayOfYearTokens
import typings.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import typings.dateFns.anon.WeekStartsOn
import typings.dateFns.dateFnsNumbers.`0`
import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ECMAScript Module Functions
object esmMod {
  
  @JSImport("date-fns/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(date: Double, duration: Duration): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def add(date: Date, duration: Duration): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addBusinessDays(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addBusinessDays(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addDays(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addDays(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addHours(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addHours(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addISOWeekYears(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addISOWeekYears(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addMilliseconds(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addMilliseconds(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addMinutes(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addMinutes(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addMonths(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addMonths(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addQuarters(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addQuarters(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addSeconds(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addSeconds(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addWeeks(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addWeeks(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addYears(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def addYears(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntervalsOverlapping")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntervalsOverlapping")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def closestIndexTo(dateToCompare: Double, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("closestIndexTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def closestIndexTo(dateToCompare: Date, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("closestIndexTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def closestTo(dateToCompare: Double, datesArray: js.Array[Date | Double]): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def closestTo(dateToCompare: Date, datesArray: js.Array[Date | Double]): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def compareAsc(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareAsc(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareAsc(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareAsc(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def compareDesc(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareDesc(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareDesc(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareDesc(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInBusinessDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInBusinessDays(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInBusinessDays(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInBusinessDays(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarDays(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarDays(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarDays(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeekYears(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeekYears(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeeks(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarISOWeeks(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarMonths(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarMonths(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarMonths(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarMonths(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarQuarters(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarQuarters(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInCalendarYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarYears(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarYears(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInCalendarYears(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInDays(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInDays(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInDays(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInHours(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInHours(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInHours(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInHours(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInISOWeekYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInISOWeekYears(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInISOWeekYears(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInISOWeekYears(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInMilliseconds(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMilliseconds(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMilliseconds(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMilliseconds(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInMinutes(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMinutes(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMinutes(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMinutes(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInMonths(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMonths(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMonths(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInMonths(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInQuarters(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInQuarters(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInQuarters(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInQuarters(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInSeconds(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInSeconds(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInSeconds(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInSeconds(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInWeeks(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInWeeks(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInWeeks(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def differenceInYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInYears(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInYears(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def differenceInYears(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def eachDayOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachDayOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def eachDayOfInterval(interval: Interval, options: Step): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachDayOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachHourOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachHourOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def eachHourOfInterval(interval: Interval, options: Step): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachHourOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachMonthOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachMonthOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachQuarterOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachQuarterOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachWeekOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def eachWeekOfInterval(interval: Interval, options: WeekStartsOn): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachWeekendOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachWeekendOfMonth(date: Double): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def eachWeekendOfMonth(date: Date): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachWeekendOfYear(date: Double): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def eachWeekendOfYear(date: Date): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def eachYearOfInterval(interval: Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachYearOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def endOfDay(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfDay(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfDecade(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfDecade(date: Double, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def endOfDecade(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfDecade(date: Date, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def endOfHour(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfHour(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfISOWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfISOWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfISOWeekYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfISOWeekYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfMinute(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfMinute(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfMonth(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfQuarter(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfQuarter(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfSecond(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfSecond(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfToday(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfToday")().asInstanceOf[Date]
  
  @scala.inline
  def endOfTomorrow(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfTomorrow")().asInstanceOf[Date]
  
  @scala.inline
  def endOfWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfWeek(date: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def endOfWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfWeek(date: Date, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def endOfYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def endOfYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def endOfYesterday(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYesterday")().asInstanceOf[Date]
  
  @scala.inline
  def format(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(date: Date, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatDistance(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Double, baseDate: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Double, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Double, baseDate: Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Date, baseDate: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Date, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistance(date: Date, baseDate: Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatDistanceStrict(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Double, baseDate: Double, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Double, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Double, baseDate: Date, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Date, baseDate: Double, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Date, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceStrict(date: Date, baseDate: Date, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatDistanceToNow(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNow(date: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNow(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNow(date: Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatDistanceToNowStrict(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNowStrict(date: Double, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNowStrict(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatDistanceToNowStrict(date: Date, options: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatDuration(duration: Duration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatDuration(duration: Duration, options: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDuration")(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatISO(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatISO(date: Double, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatISO(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatISO(date: Date, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatISO9075(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatISO9075(date: Double, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatISO9075(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatISO9075(date: Date, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatISODuration(duration: Duration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISODuration")(duration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatRFC3339(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatRFC3339(date: Double, options: FractionDigits): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRFC3339(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatRFC3339(date: Date, options: FractionDigits): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatRFC7231(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC7231")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatRFC7231(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC7231")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatRelative(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Double, baseDate: Double, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Double, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Double, baseDate: Date, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Date, baseDate: Double, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Date, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelative(date: Date, baseDate: Date, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fromUnixTime(unixTime: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnixTime")(unixTime.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getDate(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getDate(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getDay(date: Double): `0` | `1` | `2` | `3` | `4` | `5` | `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("getDay")(date.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2` | `3` | `4` | `5` | `6`]
  @scala.inline
  def getDay(date: Date): `0` | `1` | `2` | `3` | `4` | `5` | `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("getDay")(date.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2` | `3` | `4` | `5` | `6`]
  
  @scala.inline
  def getDayOfYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getDayOfYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getDaysInMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getDaysInMonth(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getDaysInYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getDaysInYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getDecade(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getDecade(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getHours(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getHours(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getISODay(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISODay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getISODay(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISODay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getISOWeek(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getISOWeek(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getISOWeekYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getISOWeekYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getISOWeeksInYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeeksInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getISOWeeksInYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeeksInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getMilliseconds(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getMilliseconds(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getMinutes(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getMinutes(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getMonth(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getOverlappingDaysInIntervals(intervalLeft: Interval, intervalRight: Interval): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlappingDaysInIntervals")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getQuarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getQuarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getSeconds(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getSeconds(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getTime(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getTime(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getUnixTime(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getUnixTime(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getWeek(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeek(date: Double, options: typings.dateFns.anon.`0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getWeek(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeek(date: Date, options: typings.dateFns.anon.`0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getWeekOfMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeekOfMonth(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getWeekOfMonth(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeekOfMonth(date: Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getWeekYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeekYear(date: Double, options: typings.dateFns.anon.`0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getWeekYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeekYear(date: Date, options: typings.dateFns.anon.`0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getWeeksInMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeeksInMonth(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getWeeksInMonth(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getWeeksInMonth(date: Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def intervalToDuration(interval: Interval): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("intervalToDuration")(interval.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  @scala.inline
  def isAfter(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isAfter(date: Double, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isAfter(date: Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isAfter(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isBefore(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isBefore(date: Double, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isBefore(date: Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isBefore(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isDate(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEqual(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEqual(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEqual(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEqual(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isExists(year: Double, month: Double, day: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExists")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isFirstDayOfMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isFirstDayOfMonth(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFriday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFriday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isFriday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFriday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFuture(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFuture")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isFuture(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFuture")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLastDayOfMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isLastDayOfMonth(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLeapYear(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isLeapYear(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMatch(dateString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isMatch(dateString: String, formatString: String, options: UseAdditionalWeekYearTokensWeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isMonday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isMonday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPast(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPast")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isPast(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPast")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameDay(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameDay(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameDay(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameDay(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameHour(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameHour(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameHour(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameHour(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameISOWeek(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeek(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeek(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeek(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameISOWeekYear(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeekYear(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeekYear(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameISOWeekYear(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameMinute(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMinute(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMinute(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMinute(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameMonth(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMonth(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMonth(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameMonth(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameQuarter(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameQuarter(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameQuarter(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameQuarter(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameSecond(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameSecond(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameSecond(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameSecond(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameWeek(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Double, dateRight: Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Date, dateRight: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameWeek(dateLeft: Date, dateRight: Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameYear(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameYear(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameYear(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSameYear(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSaturday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isSaturday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSunday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSunday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isSunday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSunday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisHour(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisHour")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisHour(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisHour")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisISOWeek(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisISOWeek(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisMinute(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisMinute(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisMonth(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisQuarter(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisQuarter(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisSecond(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisSecond(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisWeek(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisWeek(date: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isThisWeek(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisWeek(date: Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isThisYear(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThisYear(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isThursday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThursday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isThursday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThursday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isToday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isToday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTomorrow(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTomorrow")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isTomorrow(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTomorrow")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTuesday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isTuesday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValid(date: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isWednesday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isWednesday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isWeekend(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isWeekend(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isWithinInterval(date: Double, interval: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinInterval")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWithinInterval(date: Date, interval: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinInterval")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isYesterday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYesterday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isYesterday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYesterday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def lastDayOfDecade(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfDecade(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfISOWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfISOWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfISOWeekYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfISOWeekYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfMonth(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfQuarter(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfQuarter(date: Double, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def lastDayOfQuarter(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfQuarter(date: Date, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfWeek(date: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def lastDayOfWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfWeek(date: Date, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def lastDayOfYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def lastDayOfYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def lightFormat(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightFormat")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def lightFormat(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightFormat")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def max(datesArray: js.Array[Date | Double]): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(datesArray.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @JSImport("date-fns/esm", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  @scala.inline
  def min(datesArray: js.Array[Date | Double]): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(datesArray.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @JSImport("date-fns/esm", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @scala.inline
  def parse(dateString: String, formatString: String, referenceDate: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def parse(
    dateString: String,
    formatString: String,
    referenceDate: Double,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def parse(dateString: String, formatString: String, referenceDate: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def parse(
    dateString: String,
    formatString: String,
    referenceDate: Date,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def parseISO(argument: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseISO")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def parseISO(argument: String, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseISO")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def parseJSON(argument: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def parseJSON(argument: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def parseJSON(argument: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def roundToNearestMinutes(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def roundToNearestMinutes(date: Double, options: NearestTo): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def roundToNearestMinutes(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def roundToNearestMinutes(date: Date, options: NearestTo): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def set(date: Double, values: Hours): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def set(date: Date, values: Hours): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setDate(date: Double, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setDate(date: Date, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setDay(date: Double, day: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setDay(date: Double, day: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setDay(date: Date, day: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setDay(date: Date, day: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setDayOfYear(date: Double, dayOfYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfYear")(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setDayOfYear(date: Date, dayOfYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfYear")(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setHours(date: Double, hours: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setHours(date: Date, hours: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setISODay(date: Double, day: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISODay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setISODay(date: Date, day: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISODay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setISOWeek(date: Double, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeek")(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setISOWeek(date: Date, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeek")(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setISOWeekYear(date: Double, isoWeekYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeekYear")(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setISOWeekYear(date: Date, isoWeekYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeekYear")(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setMilliseconds(date: Double, milliseconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMilliseconds")(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setMilliseconds(date: Date, milliseconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMilliseconds")(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setMinutes(date: Double, minutes: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setMinutes(date: Date, minutes: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setMonth(date: Double, month: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setMonth(date: Date, month: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setQuarter(date: Double, quarter: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuarter")(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setQuarter(date: Date, quarter: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuarter")(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setSeconds(date: Double, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setSeconds")(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setSeconds(date: Date, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setSeconds")(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setWeek(date: Double, week: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeek(date: Double, week: Double, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeek(date: Date, week: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeek(date: Date, week: Double, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setWeekYear(date: Double, weekYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeekYear(date: Double, weekYear: Double, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeekYear(date: Date, weekYear: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setWeekYear(date: Date, weekYear: Double, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setYear(date: Double, year: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setYear")(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def setYear(date: Date, year: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setYear")(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def startOfDay(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfDay(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfDecade(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfDecade(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfHour(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfHour(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfISOWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfISOWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfISOWeekYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfISOWeekYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfMinute(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfMinute(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfMonth(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfQuarter(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfQuarter(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfSecond(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfSecond(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfToday(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfToday")().asInstanceOf[Date]
  
  @scala.inline
  def startOfTomorrow(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfTomorrow")().asInstanceOf[Date]
  
  @scala.inline
  def startOfWeek(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfWeek(date: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def startOfWeek(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfWeek(date: Date, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def startOfWeekYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfWeekYear(date: Double, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def startOfWeekYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfWeekYear(date: Date, options: typings.dateFns.anon.`0`): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def startOfYear(date: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def startOfYear(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def startOfYesterday(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYesterday")().asInstanceOf[Date]
  
  @scala.inline
  def sub(date: Double, duration: Duration): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def sub(date: Date, duration: Duration): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subBusinessDays(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subBusinessDays(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subDays(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subDays(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subHours(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subHours(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subISOWeekYears(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subISOWeekYears(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subMilliseconds(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subMilliseconds(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subMinutes(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subMinutes(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subMonths(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subMonths(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subQuarters(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subQuarters(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subSeconds(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subSeconds(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subWeeks(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subWeeks(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def subYears(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def subYears(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def toDate(argument: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def toDate(argument: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
}
