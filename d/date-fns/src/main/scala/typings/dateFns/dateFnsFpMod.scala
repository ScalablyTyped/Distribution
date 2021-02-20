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

// FP Functions
object dateFnsFpMod {
  
  @JSImport("date-fns/fp", "add")
  @js.native
  val add: CurriedFn2[Duration, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addBusinessDays")
  @js.native
  val addBusinessDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addDays")
  @js.native
  val addDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addHours")
  @js.native
  val addHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addISOWeekYears")
  @js.native
  val addISOWeekYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addMilliseconds")
  @js.native
  val addMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addMinutes")
  @js.native
  val addMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addMonths")
  @js.native
  val addMonths: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addQuarters")
  @js.native
  val addQuarters: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addSeconds")
  @js.native
  val addSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addWeeks")
  @js.native
  val addWeeks: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "addYears")
  @js.native
  val addYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "areIntervalsOverlapping")
  @js.native
  val areIntervalsOverlapping: CurriedFn2[Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/fp", "areIntervalsOverlappingWithOptions")
  @js.native
  val areIntervalsOverlappingWithOptions: CurriedFn3[Inclusive, Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/fp", "closestIndexTo")
  @js.native
  val closestIndexTo: CurriedFn2[js.Array[Date | Double], Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "closestTo")
  @js.native
  val closestTo: CurriedFn2[js.Array[Date | Double], Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "compareAsc")
  @js.native
  val compareAsc: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "compareDesc")
  @js.native
  val compareDesc: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInBusinessDays")
  @js.native
  val differenceInBusinessDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarDays")
  @js.native
  val differenceInCalendarDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarISOWeekYears")
  @js.native
  val differenceInCalendarISOWeekYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarISOWeeks")
  @js.native
  val differenceInCalendarISOWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarMonths")
  @js.native
  val differenceInCalendarMonths: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarQuarters")
  @js.native
  val differenceInCalendarQuarters: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarWeeks")
  @js.native
  val differenceInCalendarWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarWeeksWithOptions")
  @js.native
  val differenceInCalendarWeeksWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarYears")
  @js.native
  val differenceInCalendarYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInDays")
  @js.native
  val differenceInDays: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInHours")
  @js.native
  val differenceInHours: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInISOWeekYears")
  @js.native
  val differenceInISOWeekYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMilliseconds")
  @js.native
  val differenceInMilliseconds: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMinutes")
  @js.native
  val differenceInMinutes: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMonths")
  @js.native
  val differenceInMonths: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInQuarters")
  @js.native
  val differenceInQuarters: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInSeconds")
  @js.native
  val differenceInSeconds: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInWeeks")
  @js.native
  val differenceInWeeks: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInYears")
  @js.native
  val differenceInYears: CurriedFn2[Date | Double, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "eachDayOfInterval")
  @js.native
  val eachDayOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachDayOfIntervalWithOptions")
  @js.native
  val eachDayOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachHourOfInterval")
  @js.native
  val eachHourOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachHourOfIntervalWithOptions")
  @js.native
  val eachHourOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachMonthOfInterval")
  @js.native
  val eachMonthOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachQuarterOfInterval")
  @js.native
  val eachQuarterOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekOfInterval")
  @js.native
  val eachWeekOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekOfIntervalWithOptions")
  @js.native
  val eachWeekOfIntervalWithOptions: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfInterval")
  @js.native
  val eachWeekendOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfMonth")
  @js.native
  val eachWeekendOfMonth: CurriedFn1[Date | Double, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfYear")
  @js.native
  val eachWeekendOfYear: CurriedFn1[Date | Double, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "eachYearOfInterval")
  @js.native
  val eachYearOfInterval: CurriedFn1[Interval, js.Array[Date]] = js.native
  
  @JSImport("date-fns/fp", "endOfDay")
  @js.native
  val endOfDay: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfDecade")
  @js.native
  val endOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfDecadeWithOptions")
  @js.native
  val endOfDecadeWithOptions: CurriedFn2[AdditionalDigits, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfHour")
  @js.native
  val endOfHour: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfISOWeek")
  @js.native
  val endOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfISOWeekYear")
  @js.native
  val endOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfMinute")
  @js.native
  val endOfMinute: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfMonth")
  @js.native
  val endOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfQuarter")
  @js.native
  val endOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfSecond")
  @js.native
  val endOfSecond: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfWeek")
  @js.native
  val endOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfWeekWithOptions")
  @js.native
  val endOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "endOfYear")
  @js.native
  val endOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "format")
  @js.native
  val format: CurriedFn2[String, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistance")
  @js.native
  val formatDistance: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceStrict")
  @js.native
  val formatDistanceStrict: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceStrictWithOptions")
  @js.native
  val formatDistanceStrictWithOptions: CurriedFn3[AddSuffixLocale, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceWithOptions")
  @js.native
  val formatDistanceWithOptions: CurriedFn3[AddSuffixIncludeSeconds, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDuration")
  @js.native
  val formatDuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatDurationWithOptions")
  @js.native
  val formatDurationWithOptions: CurriedFn2[Zero, Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO")
  @js.native
  val formatISO: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO9075")
  @js.native
  val formatISO9075: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO9075WithOptions")
  @js.native
  val formatISO9075WithOptions: CurriedFn2[FormatRepresentation, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISODuration")
  @js.native
  val formatISODuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatISOWithOptions")
  @js.native
  val formatISOWithOptions: CurriedFn2[FormatRepresentation, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC3339")
  @js.native
  val formatRFC3339: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC3339WithOptions")
  @js.native
  val formatRFC3339WithOptions: CurriedFn2[FractionDigits, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC7231")
  @js.native
  val formatRFC7231: CurriedFn1[Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRelative")
  @js.native
  val formatRelative: CurriedFn2[Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRelativeWithOptions")
  @js.native
  val formatRelativeWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatWithOptions")
  @js.native
  val formatWithOptions: CurriedFn3[UseAdditionalWeekYearTokens, String, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "fromUnixTime")
  @js.native
  val fromUnixTime: CurriedFn1[Double, Date] = js.native
  
  @JSImport("date-fns/fp", "getDate")
  @js.native
  val getDate: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDay")
  @js.native
  val getDay: CurriedFn1[Date | Double, `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  @JSImport("date-fns/fp", "getDayOfYear")
  @js.native
  val getDayOfYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDaysInMonth")
  @js.native
  val getDaysInMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDaysInYear")
  @js.native
  val getDaysInYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDecade")
  @js.native
  val getDecade: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getHours")
  @js.native
  val getHours: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISODay")
  @js.native
  val getISODay: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeek")
  @js.native
  val getISOWeek: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeekYear")
  @js.native
  val getISOWeekYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeeksInYear")
  @js.native
  val getISOWeeksInYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMilliseconds")
  @js.native
  val getMilliseconds: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMinutes")
  @js.native
  val getMinutes: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMonth")
  @js.native
  val getMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getOverlappingDaysInIntervals")
  @js.native
  val getOverlappingDaysInIntervals: CurriedFn2[Interval, Interval, Double] = js.native
  
  @JSImport("date-fns/fp", "getQuarter")
  @js.native
  val getQuarter: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getSeconds")
  @js.native
  val getSeconds: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getTime")
  @js.native
  val getTime: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getUnixTime")
  @js.native
  val getUnixTime: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeek")
  @js.native
  val getWeek: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekOfMonth")
  @js.native
  val getWeekOfMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekOfMonthWithOptions")
  @js.native
  val getWeekOfMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekWithOptions")
  @js.native
  val getWeekWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekYear")
  @js.native
  val getWeekYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekYearWithOptions")
  @js.native
  val getWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeeksInMonth")
  @js.native
  val getWeeksInMonth: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeeksInMonthWithOptions")
  @js.native
  val getWeeksInMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getYear")
  @js.native
  val getYear: CurriedFn1[Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "intervalToDuration")
  @js.native
  val intervalToDuration: CurriedFn1[Interval, Duration] = js.native
  
  @JSImport("date-fns/fp", "isAfter")
  @js.native
  val isAfter: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isBefore")
  @js.native
  val isBefore: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isDate")
  @js.native
  val isDate: CurriedFn1[js.Any, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isEqual")
  @js.native
  val isEqual: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isExists")
  @js.native
  val isExists: CurriedFn3[Double, Double, Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isFirstDayOfMonth")
  @js.native
  val isFirstDayOfMonth: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isFriday")
  @js.native
  val isFriday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isLastDayOfMonth")
  @js.native
  val isLastDayOfMonth: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isLeapYear")
  @js.native
  val isLeapYear: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMatch")
  @js.native
  val isMatch: CurriedFn2[String, String, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMatchWithOptions")
  @js.native
  val isMatchWithOptions: CurriedFn3[LocaleUseAdditionalDayOfYearTokens, String, String, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMonday")
  @js.native
  val isMonday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameDay")
  @js.native
  val isSameDay: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameHour")
  @js.native
  val isSameHour: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameISOWeek")
  @js.native
  val isSameISOWeek: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameISOWeekYear")
  @js.native
  val isSameISOWeekYear: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameMinute")
  @js.native
  val isSameMinute: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameMonth")
  @js.native
  val isSameMonth: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameQuarter")
  @js.native
  val isSameQuarter: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameSecond")
  @js.native
  val isSameSecond: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameWeek")
  @js.native
  val isSameWeek: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameWeekWithOptions")
  @js.native
  val isSameWeekWithOptions: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameYear")
  @js.native
  val isSameYear: CurriedFn2[Date | Double, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSaturday")
  @js.native
  val isSaturday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSunday")
  @js.native
  val isSunday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isThursday")
  @js.native
  val isThursday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isTuesday")
  @js.native
  val isTuesday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isValid")
  @js.native
  val isValid: CurriedFn1[js.Any, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWednesday")
  @js.native
  val isWednesday: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWeekend")
  @js.native
  val isWeekend: CurriedFn1[Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWithinInterval")
  @js.native
  val isWithinInterval: CurriedFn2[Interval, Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfDecade")
  @js.native
  val lastDayOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfISOWeek")
  @js.native
  val lastDayOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfISOWeekYear")
  @js.native
  val lastDayOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfMonth")
  @js.native
  val lastDayOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfQuarter")
  @js.native
  val lastDayOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfQuarterWithOptions")
  @js.native
  val lastDayOfQuarterWithOptions: CurriedFn2[AdditionalDigits, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfWeek")
  @js.native
  val lastDayOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfWeekWithOptions")
  @js.native
  val lastDayOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfYear")
  @js.native
  val lastDayOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "lightFormat")
  @js.native
  val lightFormat: CurriedFn2[String, Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "max")
  @js.native
  val max: CurriedFn1[js.Array[Date | Double], Date] = js.native
  
  @JSImport("date-fns/fp", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  @JSImport("date-fns/fp", "min")
  @js.native
  val min: CurriedFn1[js.Array[Date | Double], Date] = js.native
  
  @JSImport("date-fns/fp", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @JSImport("date-fns/fp", "parse")
  @js.native
  val parse: CurriedFn3[Date | Double, String, String, Date] = js.native
  
  @JSImport("date-fns/fp", "parseISO")
  @js.native
  val parseISO: CurriedFn1[String, Date] = js.native
  
  @JSImport("date-fns/fp", "parseISOWithOptions")
  @js.native
  val parseISOWithOptions: CurriedFn2[AdditionalDigits, String, Date] = js.native
  
  @JSImport("date-fns/fp", "parseJSON")
  @js.native
  val parseJSON: CurriedFn1[String | Double | Date, Date] = js.native
  
  @JSImport("date-fns/fp", "parseWithOptions")
  @js.native
  val parseWithOptions: CurriedFn4[LocaleUseAdditionalDayOfYearTokens, Date | Double, String, String, Date] = js.native
  
  @JSImport("date-fns/fp", "roundToNearestMinutes")
  @js.native
  val roundToNearestMinutes: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "roundToNearestMinutesWithOptions")
  @js.native
  val roundToNearestMinutesWithOptions: CurriedFn2[NearestTo, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "set")
  @js.native
  val set: CurriedFn2[typings.dateFns.anon.Date, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setDate")
  @js.native
  val setDate: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setDay")
  @js.native
  val setDay: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setDayOfYear")
  @js.native
  val setDayOfYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setDayWithOptions")
  @js.native
  val setDayWithOptions: CurriedFn3[LocaleWeekStartsOn, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setHours")
  @js.native
  val setHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setISODay")
  @js.native
  val setISODay: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setISOWeek")
  @js.native
  val setISOWeek: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setISOWeekYear")
  @js.native
  val setISOWeekYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setMilliseconds")
  @js.native
  val setMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setMinutes")
  @js.native
  val setMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setMonth")
  @js.native
  val setMonth: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setQuarter")
  @js.native
  val setQuarter: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setSeconds")
  @js.native
  val setSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setWeek")
  @js.native
  val setWeek: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekWithOptions")
  @js.native
  val setWeekWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekYear")
  @js.native
  val setWeekYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekYearWithOptions")
  @js.native
  val setWeekYearWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "setYear")
  @js.native
  val setYear: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfDay")
  @js.native
  val startOfDay: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfDecade")
  @js.native
  val startOfDecade: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfHour")
  @js.native
  val startOfHour: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfISOWeek")
  @js.native
  val startOfISOWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfISOWeekYear")
  @js.native
  val startOfISOWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfMinute")
  @js.native
  val startOfMinute: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfMonth")
  @js.native
  val startOfMonth: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfQuarter")
  @js.native
  val startOfQuarter: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfSecond")
  @js.native
  val startOfSecond: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeek")
  @js.native
  val startOfWeek: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekWithOptions")
  @js.native
  val startOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekYear")
  @js.native
  val startOfWeekYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekYearWithOptions")
  @js.native
  val startOfWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "startOfYear")
  @js.native
  val startOfYear: CurriedFn1[Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "sub")
  @js.native
  val sub: CurriedFn2[Duration, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subBusinessDays")
  @js.native
  val subBusinessDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subDays")
  @js.native
  val subDays: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subHours")
  @js.native
  val subHours: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subISOWeekYears")
  @js.native
  val subISOWeekYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subMilliseconds")
  @js.native
  val subMilliseconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subMinutes")
  @js.native
  val subMinutes: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subMonths")
  @js.native
  val subMonths: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subQuarters")
  @js.native
  val subQuarters: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subSeconds")
  @js.native
  val subSeconds: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subWeeks")
  @js.native
  val subWeeks: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "subYears")
  @js.native
  val subYears: CurriedFn2[Double, Date | Double, Date] = js.native
  
  @JSImport("date-fns/fp", "toDate")
  @js.native
  val toDate: CurriedFn1[Date | Double, Date] = js.native
}
