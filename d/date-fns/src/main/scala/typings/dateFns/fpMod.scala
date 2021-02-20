package typings.dateFns

import typings.dateFns.anon.AddSuffixIncludeSeconds
import typings.dateFns.anon.AddSuffixLocale
import typings.dateFns.anon.AdditionalDigits
import typings.dateFns.anon.FirstWeekContainsDateLocale
import typings.dateFns.anon.FormatRepresentation
import typings.dateFns.anon.FractionDigits
import typings.dateFns.anon.Inclusive
import typings.dateFns.anon.LocaleUseAdditionalDayOfYearTokens
import typings.dateFns.anon.LocaleWeekStartsOn
import typings.dateFns.anon.NearestTo
import typings.dateFns.anon.Step
import typings.dateFns.anon.UseAdditionalWeekYearTokens
import typings.dateFns.anon.Zero
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ECMAScript Module FP Functions
object fpMod {
  
  @JSImport("date-fns/esm/fp", "add")
  @js.native
  val add: CurriedFn2[Duration, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addBusinessDays")
  @js.native
  val addBusinessDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addDays")
  @js.native
  val addDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addHours")
  @js.native
  val addHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addISOWeekYears")
  @js.native
  val addISOWeekYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMilliseconds")
  @js.native
  val addMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMinutes")
  @js.native
  val addMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMonths")
  @js.native
  val addMonths: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addQuarters")
  @js.native
  val addQuarters: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addSeconds")
  @js.native
  val addSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addWeeks")
  @js.native
  val addWeeks: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addYears")
  @js.native
  val addYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "areIntervalsOverlapping")
  @js.native
  val areIntervalsOverlapping: CurriedFn2[Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "areIntervalsOverlappingWithOptions")
  @js.native
  val areIntervalsOverlappingWithOptions: CurriedFn3[Inclusive, Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "closestIndexTo")
  @js.native
  val closestIndexTo: CurriedFn2[js.Array[Date | Double], Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "closestTo")
  @js.native
  val closestTo: CurriedFn2[js.Array[Date | Double], Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "compareAsc")
  @js.native
  val compareAsc: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "compareDesc")
  @js.native
  val compareDesc: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInBusinessDays")
  @js.native
  val differenceInBusinessDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarDays")
  @js.native
  val differenceInCalendarDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarISOWeekYears")
  @js.native
  val differenceInCalendarISOWeekYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarISOWeeks")
  @js.native
  val differenceInCalendarISOWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarMonths")
  @js.native
  val differenceInCalendarMonths: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarQuarters")
  @js.native
  val differenceInCalendarQuarters: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarWeeks")
  @js.native
  val differenceInCalendarWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarWeeksWithOptions")
  @js.native
  val differenceInCalendarWeeksWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarYears")
  @js.native
  val differenceInCalendarYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInDays")
  @js.native
  val differenceInDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInHours")
  @js.native
  val differenceInHours: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInISOWeekYears")
  @js.native
  val differenceInISOWeekYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMilliseconds")
  @js.native
  val differenceInMilliseconds: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMinutes")
  @js.native
  val differenceInMinutes: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMonths")
  @js.native
  val differenceInMonths: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInQuarters")
  @js.native
  val differenceInQuarters: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInSeconds")
  @js.native
  val differenceInSeconds: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInWeeks")
  @js.native
  val differenceInWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInYears")
  @js.native
  val differenceInYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "eachDayOfInterval")
  @js.native
  val eachDayOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachDayOfIntervalWithOptions")
  @js.native
  val eachDayOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachHourOfInterval")
  @js.native
  val eachHourOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachHourOfIntervalWithOptions")
  @js.native
  val eachHourOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachMonthOfInterval")
  @js.native
  val eachMonthOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachQuarterOfInterval")
  @js.native
  val eachQuarterOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekOfInterval")
  @js.native
  val eachWeekOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekOfIntervalWithOptions")
  @js.native
  val eachWeekOfIntervalWithOptions: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfInterval")
  @js.native
  val eachWeekendOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfMonth")
  @js.native
  val eachWeekendOfMonth: CurriedFn1[Date | Double, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfYear")
  @js.native
  val eachWeekendOfYear: CurriedFn1[Date | Double, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachYearOfInterval")
  @js.native
  val eachYearOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDay")
  @js.native
  val endOfDay: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDecade")
  @js.native
  val endOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDecadeWithOptions")
  @js.native
  val endOfDecadeWithOptions: CurriedFn2[AdditionalDigits, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfHour")
  @js.native
  val endOfHour: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfISOWeek")
  @js.native
  val endOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfISOWeekYear")
  @js.native
  val endOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfMinute")
  @js.native
  val endOfMinute: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfMonth")
  @js.native
  val endOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfQuarter")
  @js.native
  val endOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfSecond")
  @js.native
  val endOfSecond: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfWeek")
  @js.native
  val endOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfWeekWithOptions")
  @js.native
  val endOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfYear")
  @js.native
  val endOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "format")
  @js.native
  val format: CurriedFn2[String, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistance")
  @js.native
  val formatDistance: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceStrict")
  @js.native
  val formatDistanceStrict: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceStrictWithOptions")
  @js.native
  val formatDistanceStrictWithOptions: CurriedFn3[AddSuffixLocale, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceWithOptions")
  @js.native
  val formatDistanceWithOptions: CurriedFn3[AddSuffixIncludeSeconds, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDuration")
  @js.native
  val formatDuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDurationWithOptions")
  @js.native
  val formatDurationWithOptions: CurriedFn2[Zero, Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO")
  @js.native
  val formatISO: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO9075")
  @js.native
  val formatISO9075: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO9075WithOptions")
  @js.native
  val formatISO9075WithOptions: CurriedFn2[FormatRepresentation, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISODuration")
  @js.native
  val formatISODuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISOWithOptions")
  @js.native
  val formatISOWithOptions: CurriedFn2[FormatRepresentation, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC3339")
  @js.native
  val formatRFC3339: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC3339WithOptions")
  @js.native
  val formatRFC3339WithOptions: CurriedFn2[FractionDigits, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC7231")
  @js.native
  val formatRFC7231: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRelative")
  @js.native
  val formatRelative: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRelativeWithOptions")
  @js.native
  val formatRelativeWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatWithOptions")
  @js.native
  val formatWithOptions: CurriedFn3[UseAdditionalWeekYearTokens, String, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "fromUnixTime")
  @js.native
  val fromUnixTime: CurriedFn1[Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "getDate")
  @js.native
  val getDate: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDay")
  @js.native
  val getDay: CurriedFn1[Date | Double, `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  @JSImport("date-fns/esm/fp", "getDayOfYear")
  @js.native
  val getDayOfYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDaysInMonth")
  @js.native
  val getDaysInMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDaysInYear")
  @js.native
  val getDaysInYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDecade")
  @js.native
  val getDecade: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getHours")
  @js.native
  val getHours: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISODay")
  @js.native
  val getISODay: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeek")
  @js.native
  val getISOWeek: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeekYear")
  @js.native
  val getISOWeekYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeeksInYear")
  @js.native
  val getISOWeeksInYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMilliseconds")
  @js.native
  val getMilliseconds: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMinutes")
  @js.native
  val getMinutes: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMonth")
  @js.native
  val getMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getOverlappingDaysInIntervals")
  @js.native
  val getOverlappingDaysInIntervals: CurriedFn2[Interval, Interval, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getQuarter")
  @js.native
  val getQuarter: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getSeconds")
  @js.native
  val getSeconds: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getTime")
  @js.native
  val getTime: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getUnixTime")
  @js.native
  val getUnixTime: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeek")
  @js.native
  val getWeek: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekOfMonth")
  @js.native
  val getWeekOfMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekOfMonthWithOptions")
  @js.native
  val getWeekOfMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekWithOptions")
  @js.native
  val getWeekWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekYear")
  @js.native
  val getWeekYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekYearWithOptions")
  @js.native
  val getWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeeksInMonth")
  @js.native
  val getWeeksInMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeeksInMonthWithOptions")
  @js.native
  val getWeeksInMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getYear")
  @js.native
  val getYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "intervalToDuration")
  @js.native
  val intervalToDuration: CurriedFn1[Interval, Duration] = js.native
  
  @JSImport("date-fns/esm/fp", "isAfter")
  @js.native
  val isAfter: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isBefore")
  @js.native
  val isBefore: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isDate")
  @js.native
  val isDate: CurriedFn1[js.Any, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isEqual")
  @js.native
  val isEqual: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isExists")
  @js.native
  val isExists: CurriedFn3[Double, Double, Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isFirstDayOfMonth")
  @js.native
  val isFirstDayOfMonth: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isFriday")
  @js.native
  val isFriday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isLastDayOfMonth")
  @js.native
  val isLastDayOfMonth: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isLeapYear")
  @js.native
  val isLeapYear: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMatch")
  @js.native
  val isMatch: CurriedFn2[String, String, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMatchWithOptions")
  @js.native
  val isMatchWithOptions: CurriedFn3[LocaleUseAdditionalDayOfYearTokens, String, String, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMonday")
  @js.native
  val isMonday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameDay")
  @js.native
  val isSameDay: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameHour")
  @js.native
  val isSameHour: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameISOWeek")
  @js.native
  val isSameISOWeek: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameISOWeekYear")
  @js.native
  val isSameISOWeekYear: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameMinute")
  @js.native
  val isSameMinute: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameMonth")
  @js.native
  val isSameMonth: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameQuarter")
  @js.native
  val isSameQuarter: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameSecond")
  @js.native
  val isSameSecond: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameWeek")
  @js.native
  val isSameWeek: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameWeekWithOptions")
  @js.native
  val isSameWeekWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameYear")
  @js.native
  val isSameYear: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSaturday")
  @js.native
  val isSaturday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSunday")
  @js.native
  val isSunday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isThursday")
  @js.native
  val isThursday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isTuesday")
  @js.native
  val isTuesday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isValid")
  @js.native
  val isValid: CurriedFn1[js.Any, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWednesday")
  @js.native
  val isWednesday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWeekend")
  @js.native
  val isWeekend: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWithinInterval")
  @js.native
  val isWithinInterval: CurriedFn2[Interval, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfDecade")
  @js.native
  val lastDayOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfISOWeek")
  @js.native
  val lastDayOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfISOWeekYear")
  @js.native
  val lastDayOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfMonth")
  @js.native
  val lastDayOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfQuarter")
  @js.native
  val lastDayOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfQuarterWithOptions")
  @js.native
  val lastDayOfQuarterWithOptions: CurriedFn2[AdditionalDigits, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfWeek")
  @js.native
  val lastDayOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfWeekWithOptions")
  @js.native
  val lastDayOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfYear")
  @js.native
  val lastDayOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lightFormat")
  @js.native
  val lightFormat: CurriedFn2[String, Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "max")
  @js.native
  val max: CurriedFn1[js.Array[Date | Double], Date] = js.native
  
  @JSImport("date-fns/esm/fp", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  @JSImport("date-fns/esm/fp", "min")
  @js.native
  val min: CurriedFn1[js.Array[Date | Double], Date] = js.native
  
  @JSImport("date-fns/esm/fp", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @JSImport("date-fns/esm/fp", "parse")
  @js.native
  val parse: CurriedFn3[Date | Double, String, String, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseISO")
  @js.native
  val parseISO: CurriedFn1[String, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseISOWithOptions")
  @js.native
  val parseISOWithOptions: CurriedFn2[AdditionalDigits, String, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseJSON")
  @js.native
  val parseJSON: CurriedFn1[String | Double | Date, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseWithOptions")
  @js.native
  val parseWithOptions: CurriedFn4[LocaleUseAdditionalDayOfYearTokens, Date | Double, String, String, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "roundToNearestMinutes")
  @js.native
  val roundToNearestMinutes: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "roundToNearestMinutesWithOptions")
  @js.native
  val roundToNearestMinutesWithOptions: CurriedFn2[NearestTo, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "set")
  @js.native
  val set: CurriedFn2[typings.dateFns.anon.Date, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDate")
  @js.native
  val setDate: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDay")
  @js.native
  val setDay: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDayOfYear")
  @js.native
  val setDayOfYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDayWithOptions")
  @js.native
  val setDayWithOptions: CurriedFn3[LocaleWeekStartsOn, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setHours")
  @js.native
  val setHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISODay")
  @js.native
  val setISODay: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISOWeek")
  @js.native
  val setISOWeek: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISOWeekYear")
  @js.native
  val setISOWeekYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMilliseconds")
  @js.native
  val setMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMinutes")
  @js.native
  val setMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMonth")
  @js.native
  val setMonth: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setQuarter")
  @js.native
  val setQuarter: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setSeconds")
  @js.native
  val setSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeek")
  @js.native
  val setWeek: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekWithOptions")
  @js.native
  val setWeekWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekYear")
  @js.native
  val setWeekYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekYearWithOptions")
  @js.native
  val setWeekYearWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setYear")
  @js.native
  val setYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfDay")
  @js.native
  val startOfDay: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfDecade")
  @js.native
  val startOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfHour")
  @js.native
  val startOfHour: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfISOWeek")
  @js.native
  val startOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfISOWeekYear")
  @js.native
  val startOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfMinute")
  @js.native
  val startOfMinute: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfMonth")
  @js.native
  val startOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfQuarter")
  @js.native
  val startOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfSecond")
  @js.native
  val startOfSecond: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeek")
  @js.native
  val startOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekWithOptions")
  @js.native
  val startOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekYear")
  @js.native
  val startOfWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekYearWithOptions")
  @js.native
  val startOfWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfYear")
  @js.native
  val startOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "sub")
  @js.native
  val sub: CurriedFn2[Duration, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subBusinessDays")
  @js.native
  val subBusinessDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subDays")
  @js.native
  val subDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subHours")
  @js.native
  val subHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subISOWeekYears")
  @js.native
  val subISOWeekYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMilliseconds")
  @js.native
  val subMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMinutes")
  @js.native
  val subMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMonths")
  @js.native
  val subMonths: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subQuarters")
  @js.native
  val subQuarters: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subSeconds")
  @js.native
  val subSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subWeeks")
  @js.native
  val subWeeks: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subYears")
  @js.native
  val subYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/esm/fp", "toDate")
  @js.native
  val toDate: CurriedFn1[Date | Double, Date] = js.native
}
