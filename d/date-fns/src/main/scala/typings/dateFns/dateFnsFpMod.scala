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

// FP Functions
object dateFnsFpMod {
  
  @JSImport("date-fns/fp", "add")
  @js.native
  val add: CurriedFn2[Duration, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addBusinessDays")
  @js.native
  val addBusinessDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addDays")
  @js.native
  val addDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addHours")
  @js.native
  val addHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addISOWeekYears")
  @js.native
  val addISOWeekYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addMilliseconds")
  @js.native
  val addMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addMinutes")
  @js.native
  val addMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addMonths")
  @js.native
  val addMonths: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addQuarters")
  @js.native
  val addQuarters: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addSeconds")
  @js.native
  val addSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addWeeks")
  @js.native
  val addWeeks: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "addYears")
  @js.native
  val addYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "areIntervalsOverlapping")
  @js.native
  val areIntervalsOverlapping: CurriedFn2[Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/fp", "areIntervalsOverlappingWithOptions")
  @js.native
  val areIntervalsOverlappingWithOptions: CurriedFn3[Inclusive, Interval, Interval, Boolean] = js.native
  
  @JSImport("date-fns/fp", "clamp")
  @js.native
  val clamp: CurriedFn2[Interval, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "closestIndexTo")
  @js.native
  val closestIndexTo: CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[Double]] = js.native
  
  @JSImport("date-fns/fp", "closestTo")
  @js.native
  val closestTo: CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "compareAsc")
  @js.native
  val compareAsc: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "compareDesc")
  @js.native
  val compareDesc: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "daysInWeek")
  @js.native
  val daysInWeek: Double = js.native
  
  @JSImport("date-fns/fp", "daysInYear")
  @js.native
  val daysInYear: Double = js.native
  
  @JSImport("date-fns/fp", "daysToWeeks")
  @js.native
  val daysToWeeks: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInBusinessDays")
  @js.native
  val differenceInBusinessDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarDays")
  @js.native
  val differenceInCalendarDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarISOWeekYears")
  @js.native
  val differenceInCalendarISOWeekYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarISOWeeks")
  @js.native
  val differenceInCalendarISOWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarMonths")
  @js.native
  val differenceInCalendarMonths: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarQuarters")
  @js.native
  val differenceInCalendarQuarters: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarWeeks")
  @js.native
  val differenceInCalendarWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarWeeksWithOptions")
  @js.native
  val differenceInCalendarWeeksWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInCalendarYears")
  @js.native
  val differenceInCalendarYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInDays")
  @js.native
  val differenceInDays: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInHours")
  @js.native
  val differenceInHours: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInHoursWithOptions")
  @js.native
  val differenceInHoursWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInISOWeekYears")
  @js.native
  val differenceInISOWeekYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMilliseconds")
  @js.native
  val differenceInMilliseconds: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMinutes")
  @js.native
  val differenceInMinutes: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMinutesWithOptions")
  @js.native
  val differenceInMinutesWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInMonths")
  @js.native
  val differenceInMonths: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInQuarters")
  @js.native
  val differenceInQuarters: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInQuartersWithOptions")
  @js.native
  val differenceInQuartersWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInSeconds")
  @js.native
  val differenceInSeconds: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInSecondsWithOptions")
  @js.native
  val differenceInSecondsWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInWeeks")
  @js.native
  val differenceInWeeks: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInWeeksWithOptions")
  @js.native
  val differenceInWeeksWithOptions: CurriedFn3[RoundingMethod, js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "differenceInYears")
  @js.native
  val differenceInYears: CurriedFn2[js.Date | Double, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "eachDayOfInterval")
  @js.native
  val eachDayOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachDayOfIntervalWithOptions")
  @js.native
  val eachDayOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachHourOfInterval")
  @js.native
  val eachHourOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachHourOfIntervalWithOptions")
  @js.native
  val eachHourOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachMinuteOfInterval")
  @js.native
  val eachMinuteOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachMinuteOfIntervalWithOptions")
  @js.native
  val eachMinuteOfIntervalWithOptions: CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachMonthOfInterval")
  @js.native
  val eachMonthOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachQuarterOfInterval")
  @js.native
  val eachQuarterOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekOfInterval")
  @js.native
  val eachWeekOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekOfIntervalWithOptions")
  @js.native
  val eachWeekOfIntervalWithOptions: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfInterval")
  @js.native
  val eachWeekendOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfMonth")
  @js.native
  val eachWeekendOfMonth: CurriedFn1[js.Date | Double, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachWeekendOfYear")
  @js.native
  val eachWeekendOfYear: CurriedFn1[js.Date | Double, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "eachYearOfInterval")
  @js.native
  val eachYearOfInterval: CurriedFn1[Interval, js.Array[js.Date]] = js.native
  
  @JSImport("date-fns/fp", "endOfDay")
  @js.native
  val endOfDay: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfDecade")
  @js.native
  val endOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfDecadeWithOptions")
  @js.native
  val endOfDecadeWithOptions: CurriedFn2[AdditionalDigits, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfHour")
  @js.native
  val endOfHour: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfISOWeek")
  @js.native
  val endOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfISOWeekYear")
  @js.native
  val endOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfMinute")
  @js.native
  val endOfMinute: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfMonth")
  @js.native
  val endOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfQuarter")
  @js.native
  val endOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfSecond")
  @js.native
  val endOfSecond: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfWeek")
  @js.native
  val endOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfWeekWithOptions")
  @js.native
  val endOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "endOfYear")
  @js.native
  val endOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "format")
  @js.native
  val format: CurriedFn2[String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistance")
  @js.native
  val formatDistance: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceStrict")
  @js.native
  val formatDistanceStrict: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceStrictWithOptions")
  @js.native
  val formatDistanceStrictWithOptions: CurriedFn3[LocaleRoundingMethod, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDistanceWithOptions")
  @js.native
  val formatDistanceWithOptions: CurriedFn3[AddSuffixIncludeSeconds, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatDuration")
  @js.native
  val formatDuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatDurationWithOptions")
  @js.native
  val formatDurationWithOptions: CurriedFn2[Zero, Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO")
  @js.native
  val formatISO: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO9075")
  @js.native
  val formatISO9075: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISO9075WithOptions")
  @js.native
  val formatISO9075WithOptions: CurriedFn2[FormatRepresentation, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatISODuration")
  @js.native
  val formatISODuration: CurriedFn1[Duration, String] = js.native
  
  @JSImport("date-fns/fp", "formatISOWithOptions")
  @js.native
  val formatISOWithOptions: CurriedFn2[FormatRepresentation, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC3339")
  @js.native
  val formatRFC3339: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC3339WithOptions")
  @js.native
  val formatRFC3339WithOptions: CurriedFn2[FractionDigits, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRFC7231")
  @js.native
  val formatRFC7231: CurriedFn1[js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRelative")
  @js.native
  val formatRelative: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatRelativeWithOptions")
  @js.native
  val formatRelativeWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "formatWithOptions")
  @js.native
  val formatWithOptions: CurriedFn3[UseAdditionalWeekYearTokens, String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "fromUnixTime")
  @js.native
  val fromUnixTime: CurriedFn1[Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "getDate")
  @js.native
  val getDate: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDay")
  @js.native
  val getDay: CurriedFn1[js.Date | Double, `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  @JSImport("date-fns/fp", "getDayOfYear")
  @js.native
  val getDayOfYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDaysInMonth")
  @js.native
  val getDaysInMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDaysInYear")
  @js.native
  val getDaysInYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getDecade")
  @js.native
  val getDecade: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getHours")
  @js.native
  val getHours: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISODay")
  @js.native
  val getISODay: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeek")
  @js.native
  val getISOWeek: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeekYear")
  @js.native
  val getISOWeekYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getISOWeeksInYear")
  @js.native
  val getISOWeeksInYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMilliseconds")
  @js.native
  val getMilliseconds: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMinutes")
  @js.native
  val getMinutes: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getMonth")
  @js.native
  val getMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getOverlappingDaysInIntervals")
  @js.native
  val getOverlappingDaysInIntervals: CurriedFn2[Interval, Interval, Double] = js.native
  
  @JSImport("date-fns/fp", "getQuarter")
  @js.native
  val getQuarter: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getSeconds")
  @js.native
  val getSeconds: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getTime")
  @js.native
  val getTime: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getUnixTime")
  @js.native
  val getUnixTime: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeek")
  @js.native
  val getWeek: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekOfMonth")
  @js.native
  val getWeekOfMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekOfMonthWithOptions")
  @js.native
  val getWeekOfMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekWithOptions")
  @js.native
  val getWeekWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekYear")
  @js.native
  val getWeekYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeekYearWithOptions")
  @js.native
  val getWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeeksInMonth")
  @js.native
  val getWeeksInMonth: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getWeeksInMonthWithOptions")
  @js.native
  val getWeeksInMonthWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "getYear")
  @js.native
  val getYear: CurriedFn1[js.Date | Double, Double] = js.native
  
  @JSImport("date-fns/fp", "hoursToMilliseconds")
  @js.native
  val hoursToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "hoursToMinutes")
  @js.native
  val hoursToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "hoursToSeconds")
  @js.native
  val hoursToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "intervalToDuration")
  @js.native
  val intervalToDuration: CurriedFn1[Interval, Duration] = js.native
  
  @JSImport("date-fns/fp", "intlFormat")
  @js.native
  val intlFormat: CurriedFn3[typings.dateFns.anon.`0`, typings.dateFns.anon.Day, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "intlFormatDistance")
  @js.native
  val intlFormatDistance: CurriedFn2[js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "intlFormatDistanceWithOptions")
  @js.native
  val intlFormatDistanceWithOptions: CurriedFn3[LocaleMatcher, js.Date | Double, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "isAfter")
  @js.native
  val isAfter: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isBefore")
  @js.native
  val isBefore: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isDate")
  @js.native
  val isDate: CurriedFn1[Any, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isEqual")
  @js.native
  val isEqual: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isExists")
  @js.native
  val isExists: CurriedFn3[Double, Double, Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isFirstDayOfMonth")
  @js.native
  val isFirstDayOfMonth: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isFriday")
  @js.native
  val isFriday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isLastDayOfMonth")
  @js.native
  val isLastDayOfMonth: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isLeapYear")
  @js.native
  val isLeapYear: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMatch")
  @js.native
  val isMatch: CurriedFn2[String, String, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMatchWithOptions")
  @js.native
  val isMatchWithOptions: CurriedFn3[LocaleUseAdditionalDayOfYearTokens, String, String, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isMonday")
  @js.native
  val isMonday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameDay")
  @js.native
  val isSameDay: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameHour")
  @js.native
  val isSameHour: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameISOWeek")
  @js.native
  val isSameISOWeek: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameISOWeekYear")
  @js.native
  val isSameISOWeekYear: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameMinute")
  @js.native
  val isSameMinute: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameMonth")
  @js.native
  val isSameMonth: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameQuarter")
  @js.native
  val isSameQuarter: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameSecond")
  @js.native
  val isSameSecond: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameWeek")
  @js.native
  val isSameWeek: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameWeekWithOptions")
  @js.native
  val isSameWeekWithOptions: CurriedFn3[LocaleWeekStartsOn, js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSameYear")
  @js.native
  val isSameYear: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSaturday")
  @js.native
  val isSaturday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isSunday")
  @js.native
  val isSunday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isThursday")
  @js.native
  val isThursday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isTuesday")
  @js.native
  val isTuesday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isValid")
  @js.native
  val isValid: CurriedFn1[Any, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWednesday")
  @js.native
  val isWednesday: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWeekend")
  @js.native
  val isWeekend: CurriedFn1[js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "isWithinInterval")
  @js.native
  val isWithinInterval: CurriedFn2[Interval, js.Date | Double, Boolean] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfDecade")
  @js.native
  val lastDayOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfISOWeek")
  @js.native
  val lastDayOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfISOWeekYear")
  @js.native
  val lastDayOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfMonth")
  @js.native
  val lastDayOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfQuarter")
  @js.native
  val lastDayOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfQuarterWithOptions")
  @js.native
  val lastDayOfQuarterWithOptions: CurriedFn2[AdditionalDigits, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfWeek")
  @js.native
  val lastDayOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfWeekWithOptions")
  @js.native
  val lastDayOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lastDayOfYear")
  @js.native
  val lastDayOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "lightFormat")
  @js.native
  val lightFormat: CurriedFn2[String, js.Date | Double, String] = js.native
  
  @JSImport("date-fns/fp", "max")
  @js.native
  val max: CurriedFn1[js.Array[js.Date | Double], js.Date] = js.native
  
  @JSImport("date-fns/fp", "maxTime")
  @js.native
  val maxTime: Double = js.native
  
  @JSImport("date-fns/fp", "milliseconds")
  @js.native
  val milliseconds: CurriedFn1[Duration, Double] = js.native
  
  @JSImport("date-fns/fp", "millisecondsInHour")
  @js.native
  val millisecondsInHour: Double = js.native
  
  @JSImport("date-fns/fp", "millisecondsInMinute")
  @js.native
  val millisecondsInMinute: Double = js.native
  
  @JSImport("date-fns/fp", "millisecondsInSecond")
  @js.native
  val millisecondsInSecond: Double = js.native
  
  @JSImport("date-fns/fp", "millisecondsToHours")
  @js.native
  val millisecondsToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "millisecondsToMinutes")
  @js.native
  val millisecondsToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "millisecondsToSeconds")
  @js.native
  val millisecondsToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "min")
  @js.native
  val min: CurriedFn1[js.Array[js.Date | Double], js.Date] = js.native
  
  @JSImport("date-fns/fp", "minTime")
  @js.native
  val minTime: Double = js.native
  
  @JSImport("date-fns/fp", "minutesInHour")
  @js.native
  val minutesInHour: Double = js.native
  
  @JSImport("date-fns/fp", "minutesToHours")
  @js.native
  val minutesToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "minutesToMilliseconds")
  @js.native
  val minutesToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "minutesToSeconds")
  @js.native
  val minutesToSeconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "monthsInQuarter")
  @js.native
  val monthsInQuarter: Double = js.native
  
  @JSImport("date-fns/fp", "monthsInYear")
  @js.native
  val monthsInYear: Double = js.native
  
  @JSImport("date-fns/fp", "monthsToQuarters")
  @js.native
  val monthsToQuarters: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "monthsToYears")
  @js.native
  val monthsToYears: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "nextDay")
  @js.native
  val nextDay: CurriedFn2[Day, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextFriday")
  @js.native
  val nextFriday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextMonday")
  @js.native
  val nextMonday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextSaturday")
  @js.native
  val nextSaturday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextSunday")
  @js.native
  val nextSunday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextThursday")
  @js.native
  val nextThursday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextTuesday")
  @js.native
  val nextTuesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "nextWednesday")
  @js.native
  val nextWednesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "parse")
  @js.native
  val parse: CurriedFn3[js.Date | Double, String, String, js.Date] = js.native
  
  @JSImport("date-fns/fp", "parseISO")
  @js.native
  val parseISO: CurriedFn1[String, js.Date] = js.native
  
  @JSImport("date-fns/fp", "parseISOWithOptions")
  @js.native
  val parseISOWithOptions: CurriedFn2[AdditionalDigits, String, js.Date] = js.native
  
  @JSImport("date-fns/fp", "parseJSON")
  @js.native
  val parseJSON: CurriedFn1[String | Double | js.Date, js.Date] = js.native
  
  @JSImport("date-fns/fp", "parseWithOptions")
  @js.native
  val parseWithOptions: CurriedFn4[LocaleUseAdditionalDayOfYearTokens, js.Date | Double, String, String, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousDay")
  @js.native
  val previousDay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousFriday")
  @js.native
  val previousFriday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousMonday")
  @js.native
  val previousMonday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousSaturday")
  @js.native
  val previousSaturday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousSunday")
  @js.native
  val previousSunday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousThursday")
  @js.native
  val previousThursday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousTuesday")
  @js.native
  val previousTuesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "previousWednesday")
  @js.native
  val previousWednesday: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "quartersInYear")
  @js.native
  val quartersInYear: Double = js.native
  
  @JSImport("date-fns/fp", "quartersToMonths")
  @js.native
  val quartersToMonths: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "quartersToYears")
  @js.native
  val quartersToYears: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "roundToNearestMinutes")
  @js.native
  val roundToNearestMinutes: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "roundToNearestMinutesWithOptions")
  @js.native
  val roundToNearestMinutesWithOptions: CurriedFn2[NearestTo, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "secondsInDay")
  @js.native
  val secondsInDay: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInHour")
  @js.native
  val secondsInHour: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInMinute")
  @js.native
  val secondsInMinute: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInMonth")
  @js.native
  val secondsInMonth: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInQuarter")
  @js.native
  val secondsInQuarter: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInWeek")
  @js.native
  val secondsInWeek: Double = js.native
  
  @JSImport("date-fns/fp", "secondsInYear")
  @js.native
  val secondsInYear: Double = js.native
  
  @JSImport("date-fns/fp", "secondsToHours")
  @js.native
  val secondsToHours: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "secondsToMilliseconds")
  @js.native
  val secondsToMilliseconds: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "secondsToMinutes")
  @js.native
  val secondsToMinutes: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "set")
  @js.native
  val set: CurriedFn2[Date, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setDate")
  @js.native
  val setDate: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setDay")
  @js.native
  val setDay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setDayOfYear")
  @js.native
  val setDayOfYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setDayWithOptions")
  @js.native
  val setDayWithOptions: CurriedFn3[LocaleWeekStartsOn, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setHours")
  @js.native
  val setHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setISODay")
  @js.native
  val setISODay: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setISOWeek")
  @js.native
  val setISOWeek: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setISOWeekYear")
  @js.native
  val setISOWeekYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setMilliseconds")
  @js.native
  val setMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setMinutes")
  @js.native
  val setMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setMonth")
  @js.native
  val setMonth: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setQuarter")
  @js.native
  val setQuarter: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setSeconds")
  @js.native
  val setSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setWeek")
  @js.native
  val setWeek: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekWithOptions")
  @js.native
  val setWeekWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekYear")
  @js.native
  val setWeekYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setWeekYearWithOptions")
  @js.native
  val setWeekYearWithOptions: CurriedFn3[FirstWeekContainsDateLocale, Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "setYear")
  @js.native
  val setYear: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfDay")
  @js.native
  val startOfDay: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfDecade")
  @js.native
  val startOfDecade: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfHour")
  @js.native
  val startOfHour: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfISOWeek")
  @js.native
  val startOfISOWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfISOWeekYear")
  @js.native
  val startOfISOWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfMinute")
  @js.native
  val startOfMinute: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfMonth")
  @js.native
  val startOfMonth: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfQuarter")
  @js.native
  val startOfQuarter: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfSecond")
  @js.native
  val startOfSecond: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeek")
  @js.native
  val startOfWeek: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekWithOptions")
  @js.native
  val startOfWeekWithOptions: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekYear")
  @js.native
  val startOfWeekYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfWeekYearWithOptions")
  @js.native
  val startOfWeekYearWithOptions: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "startOfYear")
  @js.native
  val startOfYear: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "sub")
  @js.native
  val sub: CurriedFn2[Duration, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subBusinessDays")
  @js.native
  val subBusinessDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subDays")
  @js.native
  val subDays: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subHours")
  @js.native
  val subHours: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subISOWeekYears")
  @js.native
  val subISOWeekYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subMilliseconds")
  @js.native
  val subMilliseconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subMinutes")
  @js.native
  val subMinutes: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subMonths")
  @js.native
  val subMonths: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subQuarters")
  @js.native
  val subQuarters: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subSeconds")
  @js.native
  val subSeconds: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subWeeks")
  @js.native
  val subWeeks: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "subYears")
  @js.native
  val subYears: CurriedFn2[Double, js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "toDate")
  @js.native
  val toDate: CurriedFn1[js.Date | Double, js.Date] = js.native
  
  @JSImport("date-fns/fp", "weeksToDays")
  @js.native
  val weeksToDays: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "yearsToMonths")
  @js.native
  val yearsToMonths: CurriedFn1[Double, Double] = js.native
  
  @JSImport("date-fns/fp", "yearsToQuarters")
  @js.native
  val yearsToQuarters: CurriedFn1[Double, Double] = js.native
}
