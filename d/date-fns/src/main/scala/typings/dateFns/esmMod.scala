package typings.dateFns

import typings.dateFns.anon.AddSuffixLocale
import typings.dateFns.anon.AdditionalDigits
import typings.dateFns.anon.Era
import typings.dateFns.anon.Format
import typings.dateFns.anon.FractionDigits
import typings.dateFns.anon.Hours
import typings.dateFns.anon.IncludeSeconds
import typings.dateFns.anon.Inclusive
import typings.dateFns.anon.NearestToRoundingMethod
import typings.dateFns.anon.Numeric
import typings.dateFns.anon.Representation
import typings.dateFns.anon.RoundingMethod
import typings.dateFns.anon.Step
import typings.dateFns.anon.UseAdditionalDayOfYearTokens
import typings.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import typings.dateFns.anon.WeekStartsOn
import typings.dateFns.dateFnsInts.`0`
import typings.dateFns.dateFnsInts.`1`
import typings.dateFns.dateFnsInts.`2`
import typings.dateFns.dateFnsInts.`3`
import typings.dateFns.dateFnsInts.`4`
import typings.dateFns.dateFnsInts.`5`
import typings.dateFns.dateFnsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ECMAScript Module Functions
object esmMod {
  
  @JSImport("date-fns/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(date: js.Date, duration: Duration): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def add(date: Double, duration: Duration): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addBusinessDays(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addBusinessDays(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addDays(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addDays(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addHours(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addHours(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addISOWeekYears(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addISOWeekYears(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMilliseconds(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addMilliseconds(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMinutes(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addMinutes(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addMonths(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addQuarters(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addQuarters(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addSeconds(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addSeconds(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addWeeks(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addWeeks(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def addYears(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntervalsOverlapping")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntervalsOverlapping")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clamp(date: js.Date, interval: Interval): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def clamp(date: Double, interval: Interval): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def closestIndexTo(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestIndexTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def closestIndexTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestIndexTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def closestTo(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
  inline def closestTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def compareAsc(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareAsc(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareAsc(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareAsc(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareDesc(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareDesc(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareDesc(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareDesc(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDesc")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("date-fns/esm", "daysInWeek")
  @js.native
  val daysInWeek: Double = js.native
  
  @JSImport("date-fns/esm", "daysInYear")
  @js.native
  val daysInYear: Double = js.native
  
  inline def daysToWeeks(days: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("daysToWeeks")(days.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def differenceInBusinessDays(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInBusinessDays(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInBusinessDays(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInBusinessDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInBusinessDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarDays(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarDays(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarDays(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarISOWeekYears(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeekYears(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarISOWeeks(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeeks(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarISOWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarMonths(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarMonths(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarMonths(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarMonths(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarQuarters(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarQuarters(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarQuarters(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarQuarters(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: js.Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: Double, dateRight: js.Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInCalendarYears(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarYears(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarYears(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInCalendarYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInCalendarYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInDays(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInDays(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInDays(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInDays(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInDays")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInHours(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInHours(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInHours")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInISOWeekYears(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInISOWeekYears(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInISOWeekYears(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInISOWeekYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInISOWeekYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInMilliseconds(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMilliseconds(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMilliseconds(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMilliseconds(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMilliseconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInMinutes(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMinutes(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMinutes")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInMonths(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMonths(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMonths(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInMonths(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInMonths")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInQuarters(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInQuarters(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInQuarters")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInSeconds(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInSeconds(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInSeconds")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInWeeks(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInWeeks(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInWeeks")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceInYears(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInYears(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInYears(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def differenceInYears(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceInYears")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def eachDayOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachDayOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachDayOfInterval(interval: Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachDayOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def eachHourOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachHourOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachHourOfInterval(interval: Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachHourOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def eachMinuteOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachMinuteOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachMinuteOfInterval(interval: Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachMinuteOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def eachMonthOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachMonthOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def eachQuarterOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachQuarterOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def eachWeekOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachWeekOfInterval(interval: Interval, options: WeekStartsOn): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekOfInterval")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def eachWeekendOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def eachWeekendOfMonth(date: js.Date): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachWeekendOfMonth(date: Double): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def eachWeekendOfYear(date: js.Date): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def eachWeekendOfYear(date: Double): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachWeekendOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def eachYearOfInterval(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("eachYearOfInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def endOfDay(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfDay(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfDecade(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfDecade(date: js.Date, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def endOfDecade(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfDecade(date: Double, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfDecade")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def endOfHour(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfHour(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfISOWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfISOWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfISOWeekYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfISOWeekYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfMinute(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfMinute(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfMonth(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfMonth(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfQuarter(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfQuarter(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfSecond(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfSecond(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfToday(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfToday")().asInstanceOf[js.Date]
  
  inline def endOfTomorrow(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfTomorrow")().asInstanceOf[js.Date]
  
  inline def endOfWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfWeek(date: js.Date, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def endOfWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfWeek(date: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def endOfYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def endOfYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def endOfYesterday(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("endOfYesterday")().asInstanceOf[js.Date]
  
  inline def format(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: js.Date, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDistance(date: js.Date, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: js.Date, baseDate: js.Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: js.Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: js.Date, baseDate: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: Double, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: Double, baseDate: js.Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistance(date: Double, baseDate: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDistanceStrict(date: js.Date, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: js.Date, baseDate: js.Date, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: js.Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: js.Date, baseDate: Double, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: Double, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: Double, baseDate: js.Date, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceStrict(date: Double, baseDate: Double, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceStrict")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDistanceToNow(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDistanceToNow(date: js.Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceToNow(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDistanceToNow(date: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNow")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDistanceToNowStrict(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDistanceToNowStrict(date: js.Date, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDistanceToNowStrict(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDistanceToNowStrict(date: Double, options: AddSuffixLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDistanceToNowStrict")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDuration(duration: Duration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDuration(duration: Duration, options: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDuration")(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatISO(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatISO(date: js.Date, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatISO(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatISO(date: Double, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatISO9075(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatISO9075(date: js.Date, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatISO9075(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatISO9075(date: Double, options: Representation): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatISO9075")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatISODuration(duration: Duration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatISODuration")(duration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatRFC3339(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatRFC3339(date: js.Date, options: FractionDigits): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRFC3339(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatRFC3339(date: Double, options: FractionDigits): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC3339")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatRFC7231(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC7231")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatRFC7231(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRFC7231")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatRelative(date: js.Date, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: js.Date, baseDate: js.Date, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: js.Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: js.Date, baseDate: Double, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: Double, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: Double, baseDate: js.Date, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelative(date: Double, baseDate: Double, options: WeekStartsOn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelative")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromUnixTime(unixTime: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnixTime")(unixTime.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDate(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDate(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDay(date: js.Date): `0` | `1` | `2` | `3` | `4` | `5` | `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("getDay")(date.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2` | `3` | `4` | `5` | `6`]
  inline def getDay(date: Double): `0` | `1` | `2` | `3` | `4` | `5` | `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("getDay")(date.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2` | `3` | `4` | `5` | `6`]
  
  inline def getDayOfYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDayOfYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDaysInMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDaysInMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDaysInYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDaysInYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDecade(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDecade(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDefaultOptions(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[js.Object]
  
  inline def getHours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getHours(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getISODay(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISODay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getISODay(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISODay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getISOWeek(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getISOWeek(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getISOWeekYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getISOWeekYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getISOWeeksInYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeeksInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getISOWeeksInYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOWeeksInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMilliseconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getMilliseconds(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMinutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getMinutes(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getOverlappingDaysInIntervals(intervalLeft: Interval, intervalRight: Interval): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlappingDaysInIntervals")(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getQuarter(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getQuarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSeconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getSeconds(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTime(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTime(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getUnixTime(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getUnixTime(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getWeek(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeek(date: js.Date, options: typings.dateFns.anon.`1`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWeek(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeek(date: Double, options: typings.dateFns.anon.`1`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekOfMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeekOfMonth(date: js.Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWeekOfMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeekOfMonth(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeekYear(date: js.Date, options: typings.dateFns.anon.`1`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWeekYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeekYear(date: Double, options: typings.dateFns.anon.`1`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeeksInMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeeksInMonth(date: js.Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWeeksInMonth(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeeksInMonth(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeeksInMonth")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getYear(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hoursToMilliseconds(hours: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hoursToMilliseconds")(hours.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hoursToMinutes(hours: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hoursToMinutes")(hours.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hoursToSeconds(hours: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hoursToSeconds")(hours.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def intervalToDuration(interval: Interval): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("intervalToDuration")(interval.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def intlFormat(argument: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def intlFormat(argument: js.Date, formatOptions: Unit, localeOptions: typings.dateFns.anon.`0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormat(argument: js.Date, formatOptions: Era): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormat(argument: js.Date, formatOptions: Era, localeOptions: typings.dateFns.anon.`0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormat(argument: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def intlFormat(argument: Double, formatOptions: Unit, localeOptions: typings.dateFns.anon.`0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormat(argument: Double, formatOptions: Era): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormat(argument: Double, formatOptions: Era, localeOptions: typings.dateFns.anon.`0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormat")(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def intlFormatDistance(date: js.Date, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: js.Date, baseDate: js.Date, options: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: js.Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: js.Date, baseDate: Double, options: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: Double, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: Double, baseDate: js.Date, options: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def intlFormatDistance(date: Double, baseDate: Double, options: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intlFormatDistance")(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isAfter(date: js.Date, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAfter(date: js.Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAfter(date: Double, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAfter(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBefore(date: js.Date, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBefore(date: js.Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBefore(date: Double, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBefore(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEqual(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEqual(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEqual(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExists(year: Double, month: Double, day: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExists")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFirstDayOfMonth(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFirstDayOfMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFriday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFriday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFriday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFriday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFuture(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFuture")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFuture(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFuture")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLastDayOfMonth(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isLastDayOfMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLeapYear(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isLeapYear(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMatch(dateString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(dateString: String, formatString: String, options: UseAdditionalWeekYearTokensWeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMonday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMonday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPast(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPast")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPast(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPast")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameDay(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameDay(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameDay(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameDay(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameHour(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameHour(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameHour(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameHour(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHour")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameISOWeek(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeek(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeek(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeek(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameISOWeekYear(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeekYear(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeekYear(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameISOWeekYear(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameISOWeekYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameMinute(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMinute(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMinute(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMinute(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMinute")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameMonth(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMonth(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMonth(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMonth(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameQuarter(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameQuarter(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameQuarter(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameQuarter(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameSecond(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameSecond(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameSecond(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameSecond(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameSecond")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameWeek(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: js.Date, dateRight: js.Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: js.Date, dateRight: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: Double, dateRight: js.Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameWeek(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameYear(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameYear(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameYear(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameYear(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSaturday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSaturday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSunday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSunday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSunday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSunday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisHour(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisHour")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisHour(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisHour")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisISOWeek(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisISOWeek(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisMinute(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisMinute(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMinute")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisMonth(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisMonth(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisQuarter(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisQuarter(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisSecond(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisSecond(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisSecond")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThisWeek(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisWeek(date: js.Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThisWeek(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisWeek(date: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isThisYear(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThisYear(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThursday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThursday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThursday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThursday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isToday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isToday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTomorrow(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTomorrow")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTomorrow(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTomorrow")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTuesday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTuesday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(date: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWednesday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWednesday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWeekend(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWeekend(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWithinInterval(date: js.Date, interval: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinInterval")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWithinInterval(date: Double, interval: Interval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinInterval")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isYesterday(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYesterday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isYesterday(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYesterday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastDayOfDecade(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfDecade(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def lastDayOfISOWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfISOWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def lastDayOfISOWeekYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfISOWeekYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def lastDayOfMonth(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfMonth(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def lastDayOfQuarter(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfQuarter(date: js.Date, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def lastDayOfQuarter(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfQuarter(date: Double, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfQuarter")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def lastDayOfWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfWeek(date: js.Date, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def lastDayOfWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfWeek(date: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def lastDayOfYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def lastDayOfYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def lightFormat(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightFormat")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lightFormat(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightFormat")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def max(datesArray: js.Array[js.Date | Double]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(datesArray.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  @JSImport("date-fns/esm", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  inline def milliseconds(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("date-fns/esm", "millisecondsInHour")
  @js.native
  val millisecondsInHour: Double = js.native
  
  @JSImport("date-fns/esm", "millisecondsInMinute")
  @js.native
  val millisecondsInMinute: Double = js.native
  
  @JSImport("date-fns/esm", "millisecondsInSecond")
  @js.native
  val millisecondsInSecond: Double = js.native
  
  inline def millisecondsToHours(milliseconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToHours")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsToMinutes(milliseconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToMinutes")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsToSeconds(milliseconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToSeconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(datesArray: js.Array[js.Date | Double]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(datesArray.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  @JSImport("date-fns/esm", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @JSImport("date-fns/esm", "minutesInHour")
  @js.native
  val minutesInHour: Double = js.native
  
  inline def minutesToHours(minutes: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutesToHours")(minutes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minutesToMilliseconds(minutes: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutesToMilliseconds")(minutes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minutesToSeconds(minutes: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutesToSeconds")(minutes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("date-fns/esm", "monthsInQuarter")
  @js.native
  val monthsInQuarter: Double = js.native
  
  @JSImport("date-fns/esm", "monthsInYear")
  @js.native
  val monthsInYear: Double = js.native
  
  inline def monthsToQuarters(months: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsToQuarters")(months.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def monthsToYears(months: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsToYears")(months.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextDay(date: js.Date, day: Day): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("nextDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def nextDay(date: Double, day: Day): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("nextDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def nextFriday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextFriday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextFriday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextFriday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextMonday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextMonday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextMonday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextMonday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextSaturday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextSaturday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextSunday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSunday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextSunday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSunday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextThursday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextThursday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextThursday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextThursday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextTuesday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextTuesday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextWednesday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nextWednesday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def parse(dateString: String, formatString: String, referenceDate: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(
    dateString: String,
    formatString: String,
    referenceDate: js.Date,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(dateString: String, formatString: String, referenceDate: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def parse(
    dateString: String,
    formatString: String,
    referenceDate: Double,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def parseISO(argument: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseISO")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def parseISO(argument: String, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseISO")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def parseJSON(argument: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def parseJSON(argument: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def parseJSON(argument: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousDay(date: js.Date, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("previousDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def previousDay(date: Double, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("previousDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def previousFriday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousFriday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousFriday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousFriday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousMonday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousMonday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousMonday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousMonday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousSaturday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousSaturday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSaturday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousSunday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSunday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousSunday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousSunday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousThursday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousThursday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousThursday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousThursday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousTuesday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousTuesday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousTuesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousWednesday(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def previousWednesday(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousWednesday")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  @JSImport("date-fns/esm", "quartersInYear")
  @js.native
  val quartersInYear: Double = js.native
  
  inline def quartersToMonths(quarters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartersToMonths")(quarters.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def quartersToYears(quarters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartersToYears")(quarters.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def roundToNearestMinutes(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def roundToNearestMinutes(date: js.Date, options: NearestToRoundingMethod): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def roundToNearestMinutes(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def roundToNearestMinutes(date: Double, options: NearestToRoundingMethod): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToNearestMinutes")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("date-fns/esm", "secondsInDay")
  @js.native
  val secondsInDay: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInHour")
  @js.native
  val secondsInHour: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInMinute")
  @js.native
  val secondsInMinute: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInMonth")
  @js.native
  val secondsInMonth: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInQuarter")
  @js.native
  val secondsInQuarter: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInWeek")
  @js.native
  val secondsInWeek: Double = js.native
  
  @JSImport("date-fns/esm", "secondsInYear")
  @js.native
  val secondsInYear: Double = js.native
  
  inline def secondsToHours(seconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("secondsToHours")(seconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def secondsToMilliseconds(seconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("secondsToMilliseconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def secondsToMinutes(seconds: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("secondsToMinutes")(seconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set(date: js.Date, values: Hours): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def set(date: Double, values: Hours): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setDate(date: js.Date, dayOfMonth: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setDate(date: Double, dayOfMonth: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDate")(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setDay(date: js.Date, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setDay(date: js.Date, day: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setDay(date: Double, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setDay(date: Double, day: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setDayOfYear(date: js.Date, dayOfYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfYear")(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setDayOfYear(date: Double, dayOfYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfYear")(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setDefaultOptions(newOptions: typings.dateFns.anon.`1`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(newOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setHours(date: js.Date, hours: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setHours(date: Double, hours: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setISODay(date: js.Date, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISODay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setISODay(date: Double, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISODay")(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setISOWeek(date: js.Date, isoWeek: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeek")(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setISOWeek(date: Double, isoWeek: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeek")(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setISOWeekYear(date: js.Date, isoWeekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeekYear")(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setISOWeekYear(date: Double, isoWeekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setISOWeekYear")(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setMilliseconds(date: js.Date, milliseconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMilliseconds")(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setMilliseconds(date: Double, milliseconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMilliseconds")(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setMinutes(date: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setMinutes(date: Double, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setMonth(date: js.Date, month: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setMonth(date: Double, month: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setQuarter(date: js.Date, quarter: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuarter")(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setQuarter(date: Double, quarter: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuarter")(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setSeconds(date: js.Date, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setSeconds")(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setSeconds(date: Double, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setSeconds")(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setWeek(date: js.Date, week: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeek(date: js.Date, week: Double, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeek(date: Double, week: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeek(date: Double, week: Double, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeek")(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setWeekYear(date: js.Date, weekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeekYear(date: js.Date, weekYear: Double, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeekYear(date: Double, weekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setWeekYear(date: Double, weekYear: Double, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setWeekYear")(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setYear(date: js.Date, year: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setYear")(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def setYear(date: Double, year: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setYear")(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def startOfDay(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfDay(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDay")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfDecade(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfDecade(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDecade")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfHour(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfHour(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfHour")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfISOWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfISOWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfISOWeekYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfISOWeekYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfISOWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfMinute(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfMinute(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMinute")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfMonth(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfMonth(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfQuarter(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfQuarter(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfQuarter")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfSecond(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfSecond(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfSecond")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfToday(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfToday")().asInstanceOf[js.Date]
  
  inline def startOfTomorrow(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfTomorrow")().asInstanceOf[js.Date]
  
  inline def startOfWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfWeek(date: js.Date, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def startOfWeek(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfWeek(date: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeek")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def startOfWeekYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfWeekYear(date: js.Date, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def startOfWeekYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfWeekYear(date: Double, options: typings.dateFns.anon.`1`): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOfWeekYear")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def startOfYear(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def startOfYear(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def startOfYesterday(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfYesterday")().asInstanceOf[js.Date]
  
  inline def sub(date: js.Date, duration: Duration): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def sub(date: Double, duration: Duration): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subBusinessDays(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subBusinessDays(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subBusinessDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subDays(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subDays(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subDays")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subHours(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subHours(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subHours")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subISOWeekYears(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subISOWeekYears(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subISOWeekYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subMilliseconds(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subMilliseconds(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMilliseconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subMinutes(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subMinutes(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMinutes")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subMonths(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subMonths(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMonths")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subQuarters(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subQuarters(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subQuarters")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subSeconds(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subSeconds(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subSeconds")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subWeeks(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subWeeks(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subWeeks")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subYears(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def subYears(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subYears")(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def toDate(argument: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(argument: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def weeksToDays(weeks: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("weeksToDays")(weeks.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def yearsToMonths(years: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearsToMonths")(years.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def yearsToQuarters(years: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearsToQuarters")(years.asInstanceOf[js.Any]).asInstanceOf[Double]
}
