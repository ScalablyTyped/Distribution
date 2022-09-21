package typings.dateFns

import typings.dateFns.anon.AddSuffixIncludeSeconds
import typings.dateFns.anon.AdditionalDigits
import typings.dateFns.anon.Date
import typings.dateFns.anon.FirstWeekContainsDateLocale
import typings.dateFns.anon.FormatRepresentation
import typings.dateFns.anon.FractionDigits
import typings.dateFns.anon.Inclusive
import typings.dateFns.anon.LocaleMatcher
import typings.dateFns.anon.LocaleRoundingMethod
import typings.dateFns.anon.LocaleUseAdditionalDayOfYearTokens
import typings.dateFns.anon.LocaleWeekStartsOn
import typings.dateFns.anon.NearestTo
import typings.dateFns.anon.RoundingMethod
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ECMAScript Module FP Functions
object fpMod {
  
  @JSImport("date-fns/esm/fp", "add")
  @js.native
  val add: CurriedFn2[Duration, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addBusinessDays")
  @js.native
  val addBusinessDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addDays")
  @js.native
  val addDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addHours")
  @js.native
  val addHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addISOWeekYears")
  @js.native
  val addISOWeekYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMilliseconds")
  @js.native
  val addMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMinutes")
  @js.native
  val addMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addMonths")
  @js.native
  val addMonths: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addQuarters")
  @js.native
  val addQuarters: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addSeconds")
  @js.native
  val addSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addWeeks")
  @js.native
  val addWeeks: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "addYears")
  @js.native
  val addYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "areIntervalsOverlapping")
  @js.native
  val areIntervalsOverlapping: CurriedFn2[Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "areIntervalsOverlappingWithOptions")
  @js.native
  val areIntervalsOverlappingWithOptions: CurriedFn3[Inclusive, Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "clamp")
  @js.native
  val clamp: CurriedFn2[Interval, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "closestIndexTo")
  @js.native
  val closestIndexTo: CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[Double]] = js.native
  
  @JSImport("date-fns/esm/fp", "closestTo")
  @js.native
  val closestTo: CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "compareAsc")
  @js.native
  val compareAsc: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "compareDesc")
  @js.native
  val compareDesc: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "daysInWeek")
  @js.native
  val daysInWeek: Double = js.native
  
  @JSImport("date-fns/esm/fp", "daysInYear")
  @js.native
  val daysInYear: Double = js.native
  
  @JSImport("date-fns/esm/fp", "daysToWeeks")
  @js.native
  val daysToWeeks: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInBusinessDays")
  @js.native
  val differenceInBusinessDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarDays")
  @js.native
  val differenceInCalendarDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarISOWeekYears")
  @js.native
  val differenceInCalendarISOWeekYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarISOWeeks")
  @js.native
  val differenceInCalendarISOWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarMonths")
  @js.native
  val differenceInCalendarMonths: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarQuarters")
  @js.native
  val differenceInCalendarQuarters: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarWeeks")
  @js.native
  val differenceInCalendarWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarWeeksWithOptions")
  @js.native
  val differenceInCalendarWeeksWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInCalendarYears")
  @js.native
  val differenceInCalendarYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInDays")
  @js.native
  val differenceInDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInHours")
  @js.native
  val differenceInHours: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInHoursWithOptions")
  @js.native
  val differenceInHoursWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInISOWeekYears")
  @js.native
  val differenceInISOWeekYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMilliseconds")
  @js.native
  val differenceInMilliseconds: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMinutes")
  @js.native
  val differenceInMinutes: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMinutesWithOptions")
  @js.native
  val differenceInMinutesWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInMonths")
  @js.native
  val differenceInMonths: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInQuarters")
  @js.native
  val differenceInQuarters: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInQuartersWithOptions")
  @js.native
  val differenceInQuartersWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInSeconds")
  @js.native
  val differenceInSeconds: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInSecondsWithOptions")
  @js.native
  val differenceInSecondsWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInWeeks")
  @js.native
  val differenceInWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInWeeksWithOptions")
  @js.native
  val differenceInWeeksWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "differenceInYears")
  @js.native
  val differenceInYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "eachDayOfInterval")
  @js.native
  val eachDayOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachDayOfIntervalWithOptions")
  @js.native
  val eachDayOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachHourOfInterval")
  @js.native
  val eachHourOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachHourOfIntervalWithOptions")
  @js.native
  val eachHourOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachMinuteOfInterval")
  @js.native
  val eachMinuteOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachMinuteOfIntervalWithOptions")
  @js.native
  val eachMinuteOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachMonthOfInterval")
  @js.native
  val eachMonthOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachQuarterOfInterval")
  @js.native
  val eachQuarterOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekOfInterval")
  @js.native
  val eachWeekOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekOfIntervalWithOptions")
  @js.native
  val eachWeekOfIntervalWithOptions: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfInterval")
  @js.native
  val eachWeekendOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfMonth")
  @js.native
  val eachWeekendOfMonth: CurriedFn1[js.Date | Double, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachWeekendOfYear")
  @js.native
  val eachWeekendOfYear: CurriedFn1[js.Date | Double, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "eachYearOfInterval")
  @js.native
  val eachYearOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDay")
  @js.native
  val endOfDay: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDecade")
  @js.native
  val endOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfDecadeWithOptions")
  @js.native
  val endOfDecadeWithOptions: CurriedFn2[AdditionalDigits, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfHour")
  @js.native
  val endOfHour: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfISOWeek")
  @js.native
  val endOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfISOWeekYear")
  @js.native
  val endOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfMinute")
  @js.native
  val endOfMinute: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfMonth")
  @js.native
  val endOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfQuarter")
  @js.native
  val endOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfSecond")
  @js.native
  val endOfSecond: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfWeek")
  @js.native
  val endOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfWeekWithOptions")
  @js.native
  val endOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "endOfYear")
  @js.native
  val endOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "format")
  @js.native
  val format: CurriedFn2[String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistance")
  @js.native
  val formatDistance: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceStrict")
  @js.native
  val formatDistanceStrict: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceStrictWithOptions")
  @js.native
  val formatDistanceStrictWithOptions: CurriedFn3[LocaleRoundingMethod, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDistanceWithOptions")
  @js.native
  val formatDistanceWithOptions: CurriedFn3[AddSuffixIncludeSeconds, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDuration")
  @js.native
  val formatDuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatDurationWithOptions")
  @js.native
  val formatDurationWithOptions: CurriedFn2[Zero, Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO")
  @js.native
  val formatISO: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO9075")
  @js.native
  val formatISO9075: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISO9075WithOptions")
  @js.native
  val formatISO9075WithOptions: CurriedFn2[FormatRepresentation, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISODuration")
  @js.native
  val formatISODuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatISOWithOptions")
  @js.native
  val formatISOWithOptions: CurriedFn2[FormatRepresentation, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC3339")
  @js.native
  val formatRFC3339: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC3339WithOptions")
  @js.native
  val formatRFC3339WithOptions: CurriedFn2[FractionDigits, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRFC7231")
  @js.native
  val formatRFC7231: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRelative")
  @js.native
  val formatRelative: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatRelativeWithOptions")
  @js.native
  val formatRelativeWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "formatWithOptions")
  @js.native
  val formatWithOptions: CurriedFn3[UseAdditionalWeekYearTokens, String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "fromUnixTime")
  @js.native
  val fromUnixTime: CurriedFn1[Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "getDate")
  @js.native
  val getDate: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDay")
  @js.native
  val getDay: CurriedFn1[js.Date | Double, `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  @JSImport("date-fns/esm/fp", "getDayOfYear")
  @js.native
  val getDayOfYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDaysInMonth")
  @js.native
  val getDaysInMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDaysInYear")
  @js.native
  val getDaysInYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getDecade")
  @js.native
  val getDecade: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getHours")
  @js.native
  val getHours: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISODay")
  @js.native
  val getISODay: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeek")
  @js.native
  val getISOWeek: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeekYear")
  @js.native
  val getISOWeekYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getISOWeeksInYear")
  @js.native
  val getISOWeeksInYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMilliseconds")
  @js.native
  val getMilliseconds: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMinutes")
  @js.native
  val getMinutes: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getMonth")
  @js.native
  val getMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getOverlappingDaysInIntervals")
  @js.native
  val getOverlappingDaysInIntervals: CurriedFn2[Interval, Interval, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getQuarter")
  @js.native
  val getQuarter: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getSeconds")
  @js.native
  val getSeconds: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getTime")
  @js.native
  val getTime: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getUnixTime")
  @js.native
  val getUnixTime: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeek")
  @js.native
  val getWeek: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekOfMonth")
  @js.native
  val getWeekOfMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekOfMonthWithOptions")
  @js.native
  val getWeekOfMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekWithOptions")
  @js.native
  val getWeekWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekYear")
  @js.native
  val getWeekYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeekYearWithOptions")
  @js.native
  val getWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeeksInMonth")
  @js.native
  val getWeeksInMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getWeeksInMonthWithOptions")
  @js.native
  val getWeeksInMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "getYear")
  @js.native
  val getYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "hoursToMilliseconds")
  @js.native
  val hoursToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "hoursToMinutes")
  @js.native
  val hoursToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "hoursToSeconds")
  @js.native
  val hoursToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "intervalToDuration")
  @js.native
  val intervalToDuration: CurriedFn1[Interval, Duration] = js.native
  
  @JSImport("date-fns/esm/fp", "intlFormat")
  @js.native
  val intlFormat: CurriedFn3[typings.dateFns.anon.`0`, typings.dateFns.anon.Day, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "intlFormatDistance")
  @js.native
  val intlFormatDistance: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "intlFormatDistanceWithOptions")
  @js.native
  val intlFormatDistanceWithOptions: CurriedFn3[LocaleMatcher, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "isAfter")
  @js.native
  val isAfter: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isBefore")
  @js.native
  val isBefore: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isDate")
  @js.native
  val isDate: CurriedFn1[Any, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isEqual")
  @js.native
  val isEqual: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isExists")
  @js.native
  val isExists: CurriedFn3[Double, Double, Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isFirstDayOfMonth")
  @js.native
  val isFirstDayOfMonth: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isFriday")
  @js.native
  val isFriday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isLastDayOfMonth")
  @js.native
  val isLastDayOfMonth: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isLeapYear")
  @js.native
  val isLeapYear: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMatch")
  @js.native
  val isMatch: CurriedFn2[String, String, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMatchWithOptions")
  @js.native
  val isMatchWithOptions: CurriedFn3[LocaleUseAdditionalDayOfYearTokens, String, String, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isMonday")
  @js.native
  val isMonday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameDay")
  @js.native
  val isSameDay: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameHour")
  @js.native
  val isSameHour: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameISOWeek")
  @js.native
  val isSameISOWeek: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameISOWeekYear")
  @js.native
  val isSameISOWeekYear: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameMinute")
  @js.native
  val isSameMinute: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameMonth")
  @js.native
  val isSameMonth: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameQuarter")
  @js.native
  val isSameQuarter: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameSecond")
  @js.native
  val isSameSecond: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameWeek")
  @js.native
  val isSameWeek: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameWeekWithOptions")
  @js.native
  val isSameWeekWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSameYear")
  @js.native
  val isSameYear: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSaturday")
  @js.native
  val isSaturday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isSunday")
  @js.native
  val isSunday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isThursday")
  @js.native
  val isThursday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isTuesday")
  @js.native
  val isTuesday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isValid")
  @js.native
  val isValid: CurriedFn1[Any, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWednesday")
  @js.native
  val isWednesday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWeekend")
  @js.native
  val isWeekend: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "isWithinInterval")
  @js.native
  val isWithinInterval: CurriedFn2[Interval, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfDecade")
  @js.native
  val lastDayOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfISOWeek")
  @js.native
  val lastDayOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfISOWeekYear")
  @js.native
  val lastDayOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfMonth")
  @js.native
  val lastDayOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfQuarter")
  @js.native
  val lastDayOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfQuarterWithOptions")
  @js.native
  val lastDayOfQuarterWithOptions: CurriedFn2[AdditionalDigits, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfWeek")
  @js.native
  val lastDayOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfWeekWithOptions")
  @js.native
  val lastDayOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lastDayOfYear")
  @js.native
  val lastDayOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "lightFormat")
  @js.native
  val lightFormat: CurriedFn2[String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/esm/fp", "max")
  @js.native
  val max: CurriedFn1[js.Array[js.Date | Double], js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  @JSImport("date-fns/esm/fp", "milliseconds")
  @js.native
  val milliseconds: CurriedFn1[Duration, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsInHour")
  @js.native
  val millisecondsInHour: Double = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsInMinute")
  @js.native
  val millisecondsInMinute: Double = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsInSecond")
  @js.native
  val millisecondsInSecond: Double = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsToHours")
  @js.native
  val millisecondsToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsToMinutes")
  @js.native
  val millisecondsToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "millisecondsToSeconds")
  @js.native
  val millisecondsToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "min")
  @js.native
  val min: CurriedFn1[js.Array[js.Date | Double], js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @JSImport("date-fns/esm/fp", "minutesInHour")
  @js.native
  val minutesInHour: Double = js.native
  
  @JSImport("date-fns/esm/fp", "minutesToHours")
  @js.native
  val minutesToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "minutesToMilliseconds")
  @js.native
  val minutesToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "minutesToSeconds")
  @js.native
  val minutesToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "monthsInQuarter")
  @js.native
  val monthsInQuarter: Double = js.native
  
  @JSImport("date-fns/esm/fp", "monthsInYear")
  @js.native
  val monthsInYear: Double = js.native
  
  @JSImport("date-fns/esm/fp", "monthsToQuarters")
  @js.native
  val monthsToQuarters: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "monthsToYears")
  @js.native
  val monthsToYears: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "nextDay")
  @js.native
  val nextDay: CurriedFn2[Day, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextFriday")
  @js.native
  val nextFriday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextMonday")
  @js.native
  val nextMonday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextSaturday")
  @js.native
  val nextSaturday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextSunday")
  @js.native
  val nextSunday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextThursday")
  @js.native
  val nextThursday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextTuesday")
  @js.native
  val nextTuesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "nextWednesday")
  @js.native
  val nextWednesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parse")
  @js.native
  val parse: CurriedFn3[js.Date | Double, String, String, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseISO")
  @js.native
  val parseISO: CurriedFn1[String, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseISOWithOptions")
  @js.native
  val parseISOWithOptions: CurriedFn2[AdditionalDigits, String, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseJSON")
  @js.native
  val parseJSON: CurriedFn1[String | Double | js.Date, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "parseWithOptions")
  @js.native
  val parseWithOptions: CurriedFn4[LocaleUseAdditionalDayOfYearTokens, js.Date | Double, String, String, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousDay")
  @js.native
  val previousDay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousFriday")
  @js.native
  val previousFriday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousMonday")
  @js.native
  val previousMonday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousSaturday")
  @js.native
  val previousSaturday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousSunday")
  @js.native
  val previousSunday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousThursday")
  @js.native
  val previousThursday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousTuesday")
  @js.native
  val previousTuesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "previousWednesday")
  @js.native
  val previousWednesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "quartersInYear")
  @js.native
  val quartersInYear: Double = js.native
  
  @JSImport("date-fns/esm/fp", "quartersToMonths")
  @js.native
  val quartersToMonths: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "quartersToYears")
  @js.native
  val quartersToYears: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "roundToNearestMinutes")
  @js.native
  val roundToNearestMinutes: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "roundToNearestMinutesWithOptions")
  @js.native
  val roundToNearestMinutesWithOptions: CurriedFn2[NearestTo, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInDay")
  @js.native
  val secondsInDay: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInHour")
  @js.native
  val secondsInHour: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInMinute")
  @js.native
  val secondsInMinute: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInMonth")
  @js.native
  val secondsInMonth: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInQuarter")
  @js.native
  val secondsInQuarter: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInWeek")
  @js.native
  val secondsInWeek: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsInYear")
  @js.native
  val secondsInYear: Double = js.native
  
  @JSImport("date-fns/esm/fp", "secondsToHours")
  @js.native
  val secondsToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "secondsToMilliseconds")
  @js.native
  val secondsToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "secondsToMinutes")
  @js.native
  val secondsToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "set")
  @js.native
  val set: CurriedFn2[Date, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDate")
  @js.native
  val setDate: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDay")
  @js.native
  val setDay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDayOfYear")
  @js.native
  val setDayOfYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setDayWithOptions")
  @js.native
  val setDayWithOptions: CurriedFn3[LocaleWeekStartsOn, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setHours")
  @js.native
  val setHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISODay")
  @js.native
  val setISODay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISOWeek")
  @js.native
  val setISOWeek: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setISOWeekYear")
  @js.native
  val setISOWeekYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMilliseconds")
  @js.native
  val setMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMinutes")
  @js.native
  val setMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setMonth")
  @js.native
  val setMonth: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setQuarter")
  @js.native
  val setQuarter: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setSeconds")
  @js.native
  val setSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeek")
  @js.native
  val setWeek: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekWithOptions")
  @js.native
  val setWeekWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekYear")
  @js.native
  val setWeekYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setWeekYearWithOptions")
  @js.native
  val setWeekYearWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "setYear")
  @js.native
  val setYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfDay")
  @js.native
  val startOfDay: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfDecade")
  @js.native
  val startOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfHour")
  @js.native
  val startOfHour: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfISOWeek")
  @js.native
  val startOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfISOWeekYear")
  @js.native
  val startOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfMinute")
  @js.native
  val startOfMinute: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfMonth")
  @js.native
  val startOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfQuarter")
  @js.native
  val startOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfSecond")
  @js.native
  val startOfSecond: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeek")
  @js.native
  val startOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekWithOptions")
  @js.native
  val startOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekYear")
  @js.native
  val startOfWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfWeekYearWithOptions")
  @js.native
  val startOfWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "startOfYear")
  @js.native
  val startOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "sub")
  @js.native
  val sub: CurriedFn2[Duration, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subBusinessDays")
  @js.native
  val subBusinessDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subDays")
  @js.native
  val subDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subHours")
  @js.native
  val subHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subISOWeekYears")
  @js.native
  val subISOWeekYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMilliseconds")
  @js.native
  val subMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMinutes")
  @js.native
  val subMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subMonths")
  @js.native
  val subMonths: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subQuarters")
  @js.native
  val subQuarters: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subSeconds")
  @js.native
  val subSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subWeeks")
  @js.native
  val subWeeks: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "subYears")
  @js.native
  val subYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "toDate")
  @js.native
  val toDate: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/esm/fp", "weeksToDays")
  @js.native
  val weeksToDays: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "yearsToMonths")
  @js.native
  val yearsToMonths: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/esm/fp", "yearsToQuarters")
  @js.native
  val yearsToQuarters: CurriedFn1[Double, Double] = js.native
}
