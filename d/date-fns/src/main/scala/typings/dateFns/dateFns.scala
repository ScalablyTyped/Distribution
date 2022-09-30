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

// dateFns Global Interface
@js.native
trait dateFns extends StObject {
  
  def add(date: js.Date, duration: Duration): js.Date = js.native
  def add(date: Double, duration: Duration): js.Date = js.native
  
  def addBusinessDays(date: js.Date, amount: Double): js.Date = js.native
  def addBusinessDays(date: Double, amount: Double): js.Date = js.native
  
  def addDays(date: js.Date, amount: Double): js.Date = js.native
  def addDays(date: Double, amount: Double): js.Date = js.native
  
  def addHours(date: js.Date, amount: Double): js.Date = js.native
  def addHours(date: Double, amount: Double): js.Date = js.native
  
  def addISOWeekYears(date: js.Date, amount: Double): js.Date = js.native
  def addISOWeekYears(date: Double, amount: Double): js.Date = js.native
  
  def addMilliseconds(date: js.Date, amount: Double): js.Date = js.native
  def addMilliseconds(date: Double, amount: Double): js.Date = js.native
  
  def addMinutes(date: js.Date, amount: Double): js.Date = js.native
  def addMinutes(date: Double, amount: Double): js.Date = js.native
  
  def addMonths(date: js.Date, amount: Double): js.Date = js.native
  def addMonths(date: Double, amount: Double): js.Date = js.native
  
  def addQuarters(date: js.Date, amount: Double): js.Date = js.native
  def addQuarters(date: Double, amount: Double): js.Date = js.native
  
  def addSeconds(date: js.Date, amount: Double): js.Date = js.native
  def addSeconds(date: Double, amount: Double): js.Date = js.native
  
  def addWeeks(date: js.Date, amount: Double): js.Date = js.native
  def addWeeks(date: Double, amount: Double): js.Date = js.native
  
  def addYears(date: js.Date, amount: Double): js.Date = js.native
  def addYears(date: Double, amount: Double): js.Date = js.native
  
  def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval): Boolean = js.native
  def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = js.native
  
  def clamp(date: js.Date, interval: Interval): js.Date = js.native
  def clamp(date: Double, interval: Interval): js.Date = js.native
  
  def closestIndexTo(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = js.native
  def closestIndexTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = js.native
  
  def closestTo(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = js.native
  def closestTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = js.native
  
  def compareAsc(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def compareAsc(dateLeft: js.Date, dateRight: Double): Double = js.native
  def compareAsc(dateLeft: Double, dateRight: js.Date): Double = js.native
  def compareAsc(dateLeft: Double, dateRight: Double): Double = js.native
  
  def compareDesc(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def compareDesc(dateLeft: js.Date, dateRight: Double): Double = js.native
  def compareDesc(dateLeft: Double, dateRight: js.Date): Double = js.native
  def compareDesc(dateLeft: Double, dateRight: Double): Double = js.native
  
  var daysInWeek: Double = js.native
  
  var daysInYear: Double = js.native
  
  def daysToWeeks(days: Double): Double = js.native
  
  def differenceInBusinessDays(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInBusinessDays(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInBusinessDays(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInBusinessDays(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarDays(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarDays(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarDays(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarDays(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarISOWeekYears(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarISOWeeks(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarMonths(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarMonths(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarMonths(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarMonths(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarQuarters(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarQuarters(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: js.Date, options: WeekStartsOn): Double = js.native
  def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarWeeks(dateLeft: js.Date, dateRight: Double, options: WeekStartsOn): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: js.Date, options: WeekStartsOn): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Double = js.native
  
  def differenceInCalendarYears(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInCalendarYears(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInCalendarYears(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInCalendarYears(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInDays(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInDays(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInDays(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInDays(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInHours(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInHours(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInHours(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInHours(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = js.native
  
  def differenceInISOWeekYears(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInISOWeekYears(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInISOWeekYears(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInISOWeekYears(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInMilliseconds(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInMilliseconds(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInMilliseconds(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInMilliseconds(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInMinutes(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInMinutes(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInMinutes(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInMinutes(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = js.native
  
  def differenceInMonths(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInMonths(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInMonths(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInMonths(dateLeft: Double, dateRight: Double): Double = js.native
  
  def differenceInQuarters(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInQuarters(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInQuarters(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInQuarters(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = js.native
  
  def differenceInSeconds(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInSeconds(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInSeconds(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInSeconds(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = js.native
  
  def differenceInWeeks(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInWeeks(dateLeft: js.Date, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInWeeks(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInWeeks(dateLeft: js.Date, dateRight: Double, options: RoundingMethod): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: js.Date, options: RoundingMethod): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: Double, options: RoundingMethod): Double = js.native
  
  def differenceInYears(dateLeft: js.Date, dateRight: js.Date): Double = js.native
  def differenceInYears(dateLeft: js.Date, dateRight: Double): Double = js.native
  def differenceInYears(dateLeft: Double, dateRight: js.Date): Double = js.native
  def differenceInYears(dateLeft: Double, dateRight: Double): Double = js.native
  
  def eachDayOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachDayOfInterval(interval: Interval, options: Step): js.Array[js.Date] = js.native
  
  def eachHourOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachHourOfInterval(interval: Interval, options: Step): js.Array[js.Date] = js.native
  
  def eachMinuteOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachMinuteOfInterval(interval: Interval, options: Step): js.Array[js.Date] = js.native
  
  def eachMonthOfInterval(interval: Interval): js.Array[js.Date] = js.native
  
  def eachQuarterOfInterval(interval: Interval): js.Array[js.Date] = js.native
  
  def eachWeekOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachWeekOfInterval(interval: Interval, options: WeekStartsOn): js.Array[js.Date] = js.native
  
  def eachWeekendOfInterval(interval: Interval): js.Array[js.Date] = js.native
  
  def eachWeekendOfMonth(date: js.Date): js.Array[js.Date] = js.native
  def eachWeekendOfMonth(date: Double): js.Array[js.Date] = js.native
  
  def eachWeekendOfYear(date: js.Date): js.Array[js.Date] = js.native
  def eachWeekendOfYear(date: Double): js.Array[js.Date] = js.native
  
  def eachYearOfInterval(interval: Interval): js.Array[js.Date] = js.native
  
  def endOfDay(date: js.Date): js.Date = js.native
  def endOfDay(date: Double): js.Date = js.native
  
  def endOfDecade(date: js.Date): js.Date = js.native
  def endOfDecade(date: js.Date, options: AdditionalDigits): js.Date = js.native
  def endOfDecade(date: Double): js.Date = js.native
  def endOfDecade(date: Double, options: AdditionalDigits): js.Date = js.native
  
  def endOfHour(date: js.Date): js.Date = js.native
  def endOfHour(date: Double): js.Date = js.native
  
  def endOfISOWeek(date: js.Date): js.Date = js.native
  def endOfISOWeek(date: Double): js.Date = js.native
  
  def endOfISOWeekYear(date: js.Date): js.Date = js.native
  def endOfISOWeekYear(date: Double): js.Date = js.native
  
  def endOfMinute(date: js.Date): js.Date = js.native
  def endOfMinute(date: Double): js.Date = js.native
  
  def endOfMonth(date: js.Date): js.Date = js.native
  def endOfMonth(date: Double): js.Date = js.native
  
  def endOfQuarter(date: js.Date): js.Date = js.native
  def endOfQuarter(date: Double): js.Date = js.native
  
  def endOfSecond(date: js.Date): js.Date = js.native
  def endOfSecond(date: Double): js.Date = js.native
  
  def endOfToday(): js.Date = js.native
  
  def endOfTomorrow(): js.Date = js.native
  
  def endOfWeek(date: js.Date): js.Date = js.native
  def endOfWeek(date: js.Date, options: WeekStartsOn): js.Date = js.native
  def endOfWeek(date: Double): js.Date = js.native
  def endOfWeek(date: Double, options: WeekStartsOn): js.Date = js.native
  
  def endOfYear(date: js.Date): js.Date = js.native
  def endOfYear(date: Double): js.Date = js.native
  
  def endOfYesterday(): js.Date = js.native
  
  def format(date: js.Date, format: String): String = js.native
  def format(date: js.Date, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
  def format(date: Double, format: String): String = js.native
  def format(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
  
  def formatDistance(date: js.Date, baseDate: js.Date): String = js.native
  def formatDistance(date: js.Date, baseDate: js.Date, options: IncludeSeconds): String = js.native
  def formatDistance(date: js.Date, baseDate: Double): String = js.native
  def formatDistance(date: js.Date, baseDate: Double, options: IncludeSeconds): String = js.native
  def formatDistance(date: Double, baseDate: js.Date): String = js.native
  def formatDistance(date: Double, baseDate: js.Date, options: IncludeSeconds): String = js.native
  def formatDistance(date: Double, baseDate: Double): String = js.native
  def formatDistance(date: Double, baseDate: Double, options: IncludeSeconds): String = js.native
  
  def formatDistanceStrict(date: js.Date, baseDate: js.Date): String = js.native
  def formatDistanceStrict(date: js.Date, baseDate: js.Date, options: AddSuffixLocale): String = js.native
  def formatDistanceStrict(date: js.Date, baseDate: Double): String = js.native
  def formatDistanceStrict(date: js.Date, baseDate: Double, options: AddSuffixLocale): String = js.native
  def formatDistanceStrict(date: Double, baseDate: js.Date): String = js.native
  def formatDistanceStrict(date: Double, baseDate: js.Date, options: AddSuffixLocale): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Double): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Double, options: AddSuffixLocale): String = js.native
  
  def formatDistanceToNow(date: js.Date): String = js.native
  def formatDistanceToNow(date: js.Date, options: IncludeSeconds): String = js.native
  def formatDistanceToNow(date: Double): String = js.native
  def formatDistanceToNow(date: Double, options: IncludeSeconds): String = js.native
  
  def formatDistanceToNowStrict(date: js.Date): String = js.native
  def formatDistanceToNowStrict(date: js.Date, options: AddSuffixLocale): String = js.native
  def formatDistanceToNowStrict(date: Double): String = js.native
  def formatDistanceToNowStrict(date: Double, options: AddSuffixLocale): String = js.native
  
  def formatDuration(duration: Duration): String = js.native
  def formatDuration(duration: Duration, options: Format): String = js.native
  
  def formatISO(date: js.Date): String = js.native
  def formatISO(date: js.Date, options: Representation): String = js.native
  def formatISO(date: Double): String = js.native
  def formatISO(date: Double, options: Representation): String = js.native
  
  def formatISO9075(date: js.Date): String = js.native
  def formatISO9075(date: js.Date, options: Representation): String = js.native
  def formatISO9075(date: Double): String = js.native
  def formatISO9075(date: Double, options: Representation): String = js.native
  
  def formatISODuration(duration: Duration): String = js.native
  
  def formatRFC3339(date: js.Date): String = js.native
  def formatRFC3339(date: js.Date, options: FractionDigits): String = js.native
  def formatRFC3339(date: Double): String = js.native
  def formatRFC3339(date: Double, options: FractionDigits): String = js.native
  
  def formatRFC7231(date: js.Date): String = js.native
  def formatRFC7231(date: Double): String = js.native
  
  def formatRelative(date: js.Date, baseDate: js.Date): String = js.native
  def formatRelative(date: js.Date, baseDate: js.Date, options: WeekStartsOn): String = js.native
  def formatRelative(date: js.Date, baseDate: Double): String = js.native
  def formatRelative(date: js.Date, baseDate: Double, options: WeekStartsOn): String = js.native
  def formatRelative(date: Double, baseDate: js.Date): String = js.native
  def formatRelative(date: Double, baseDate: js.Date, options: WeekStartsOn): String = js.native
  def formatRelative(date: Double, baseDate: Double): String = js.native
  def formatRelative(date: Double, baseDate: Double, options: WeekStartsOn): String = js.native
  
  def fromUnixTime(unixTime: Double): js.Date = js.native
  
  def getDate(date: js.Date): Double = js.native
  def getDate(date: Double): Double = js.native
  
  def getDay(date: js.Date): `0` | `1` | `2` | `3` | `4` | `5` | `6` = js.native
  def getDay(date: Double): `0` | `1` | `2` | `3` | `4` | `5` | `6` = js.native
  
  def getDayOfYear(date: js.Date): Double = js.native
  def getDayOfYear(date: Double): Double = js.native
  
  def getDaysInMonth(date: js.Date): Double = js.native
  def getDaysInMonth(date: Double): Double = js.native
  
  def getDaysInYear(date: js.Date): Double = js.native
  def getDaysInYear(date: Double): Double = js.native
  
  def getDecade(date: js.Date): Double = js.native
  def getDecade(date: Double): Double = js.native
  
  def getDefaultOptions(): js.Object = js.native
  
  def getHours(date: js.Date): Double = js.native
  def getHours(date: Double): Double = js.native
  
  def getISODay(date: js.Date): Double = js.native
  def getISODay(date: Double): Double = js.native
  
  def getISOWeek(date: js.Date): Double = js.native
  def getISOWeek(date: Double): Double = js.native
  
  def getISOWeekYear(date: js.Date): Double = js.native
  def getISOWeekYear(date: Double): Double = js.native
  
  def getISOWeeksInYear(date: js.Date): Double = js.native
  def getISOWeeksInYear(date: Double): Double = js.native
  
  def getMilliseconds(date: js.Date): Double = js.native
  def getMilliseconds(date: Double): Double = js.native
  
  def getMinutes(date: js.Date): Double = js.native
  def getMinutes(date: Double): Double = js.native
  
  def getMonth(date: js.Date): Double = js.native
  def getMonth(date: Double): Double = js.native
  
  def getOverlappingDaysInIntervals(intervalLeft: Interval, intervalRight: Interval): Double = js.native
  
  def getQuarter(date: js.Date): Double = js.native
  def getQuarter(date: Double): Double = js.native
  
  def getSeconds(date: js.Date): Double = js.native
  def getSeconds(date: Double): Double = js.native
  
  def getTime(date: js.Date): Double = js.native
  def getTime(date: Double): Double = js.native
  
  def getUnixTime(date: js.Date): Double = js.native
  def getUnixTime(date: Double): Double = js.native
  
  def getWeek(date: js.Date): Double = js.native
  def getWeek(date: js.Date, options: typings.dateFns.anon.`1`): Double = js.native
  def getWeek(date: Double): Double = js.native
  def getWeek(date: Double, options: typings.dateFns.anon.`1`): Double = js.native
  
  def getWeekOfMonth(date: js.Date): Double = js.native
  def getWeekOfMonth(date: js.Date, options: WeekStartsOn): Double = js.native
  def getWeekOfMonth(date: Double): Double = js.native
  def getWeekOfMonth(date: Double, options: WeekStartsOn): Double = js.native
  
  def getWeekYear(date: js.Date): Double = js.native
  def getWeekYear(date: js.Date, options: typings.dateFns.anon.`1`): Double = js.native
  def getWeekYear(date: Double): Double = js.native
  def getWeekYear(date: Double, options: typings.dateFns.anon.`1`): Double = js.native
  
  def getWeeksInMonth(date: js.Date): Double = js.native
  def getWeeksInMonth(date: js.Date, options: WeekStartsOn): Double = js.native
  def getWeeksInMonth(date: Double): Double = js.native
  def getWeeksInMonth(date: Double, options: WeekStartsOn): Double = js.native
  
  def getYear(date: js.Date): Double = js.native
  def getYear(date: Double): Double = js.native
  
  def hoursToMilliseconds(hours: Double): Double = js.native
  
  def hoursToMinutes(hours: Double): Double = js.native
  
  def hoursToSeconds(hours: Double): Double = js.native
  
  def intervalToDuration(interval: Interval): Duration = js.native
  
  def intlFormat(argument: js.Date): String = js.native
  def intlFormat(argument: js.Date, formatOptions: Unit, localeOptions: typings.dateFns.anon.`0`): String = js.native
  def intlFormat(argument: js.Date, formatOptions: Era): String = js.native
  def intlFormat(argument: js.Date, formatOptions: Era, localeOptions: typings.dateFns.anon.`0`): String = js.native
  def intlFormat(argument: Double): String = js.native
  def intlFormat(argument: Double, formatOptions: Unit, localeOptions: typings.dateFns.anon.`0`): String = js.native
  def intlFormat(argument: Double, formatOptions: Era): String = js.native
  def intlFormat(argument: Double, formatOptions: Era, localeOptions: typings.dateFns.anon.`0`): String = js.native
  
  def intlFormatDistance(date: js.Date, baseDate: js.Date): String = js.native
  def intlFormatDistance(date: js.Date, baseDate: js.Date, options: Numeric): String = js.native
  def intlFormatDistance(date: js.Date, baseDate: Double): String = js.native
  def intlFormatDistance(date: js.Date, baseDate: Double, options: Numeric): String = js.native
  def intlFormatDistance(date: Double, baseDate: js.Date): String = js.native
  def intlFormatDistance(date: Double, baseDate: js.Date, options: Numeric): String = js.native
  def intlFormatDistance(date: Double, baseDate: Double): String = js.native
  def intlFormatDistance(date: Double, baseDate: Double, options: Numeric): String = js.native
  
  def isAfter(date: js.Date, dateToCompare: js.Date): Boolean = js.native
  def isAfter(date: js.Date, dateToCompare: Double): Boolean = js.native
  def isAfter(date: Double, dateToCompare: js.Date): Boolean = js.native
  def isAfter(date: Double, dateToCompare: Double): Boolean = js.native
  
  def isBefore(date: js.Date, dateToCompare: js.Date): Boolean = js.native
  def isBefore(date: js.Date, dateToCompare: Double): Boolean = js.native
  def isBefore(date: Double, dateToCompare: js.Date): Boolean = js.native
  def isBefore(date: Double, dateToCompare: Double): Boolean = js.native
  
  def isDate(value: Any): Boolean = js.native
  
  def isEqual(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isEqual(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isEqual(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isEqual(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isExists(year: Double, month: Double, day: Double): Boolean = js.native
  
  def isFirstDayOfMonth(date: js.Date): Boolean = js.native
  def isFirstDayOfMonth(date: Double): Boolean = js.native
  
  def isFriday(date: js.Date): Boolean = js.native
  def isFriday(date: Double): Boolean = js.native
  
  def isFuture(date: js.Date): Boolean = js.native
  def isFuture(date: Double): Boolean = js.native
  
  def isLastDayOfMonth(date: js.Date): Boolean = js.native
  def isLastDayOfMonth(date: Double): Boolean = js.native
  
  def isLeapYear(date: js.Date): Boolean = js.native
  def isLeapYear(date: Double): Boolean = js.native
  
  def isMatch(dateString: String, formatString: String): Boolean = js.native
  def isMatch(dateString: String, formatString: String, options: UseAdditionalWeekYearTokensWeekStartsOn): Boolean = js.native
  
  def isMonday(date: js.Date): Boolean = js.native
  def isMonday(date: Double): Boolean = js.native
  
  def isPast(date: js.Date): Boolean = js.native
  def isPast(date: Double): Boolean = js.native
  
  def isSameDay(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameDay(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameDay(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameDay(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameHour(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameHour(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameHour(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameHour(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameISOWeek(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameISOWeek(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameISOWeek(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameISOWeek(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameISOWeekYear(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameISOWeekYear(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameMinute(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameMinute(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameMinute(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameMinute(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameMonth(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameMonth(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameMonth(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameMonth(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameQuarter(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameQuarter(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameQuarter(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameQuarter(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameSecond(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameSecond(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameSecond(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameSecond(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSameWeek(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameWeek(dateLeft: js.Date, dateRight: js.Date, options: WeekStartsOn): Boolean = js.native
  def isSameWeek(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameWeek(dateLeft: js.Date, dateRight: Double, options: WeekStartsOn): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: js.Date, options: WeekStartsOn): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Boolean = js.native
  
  def isSameYear(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def isSameYear(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def isSameYear(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def isSameYear(dateLeft: Double, dateRight: Double): Boolean = js.native
  
  def isSaturday(date: js.Date): Boolean = js.native
  def isSaturday(date: Double): Boolean = js.native
  
  def isSunday(date: js.Date): Boolean = js.native
  def isSunday(date: Double): Boolean = js.native
  
  def isThisHour(date: js.Date): Boolean = js.native
  def isThisHour(date: Double): Boolean = js.native
  
  def isThisISOWeek(date: js.Date): Boolean = js.native
  def isThisISOWeek(date: Double): Boolean = js.native
  
  def isThisMinute(date: js.Date): Boolean = js.native
  def isThisMinute(date: Double): Boolean = js.native
  
  def isThisMonth(date: js.Date): Boolean = js.native
  def isThisMonth(date: Double): Boolean = js.native
  
  def isThisQuarter(date: js.Date): Boolean = js.native
  def isThisQuarter(date: Double): Boolean = js.native
  
  def isThisSecond(date: js.Date): Boolean = js.native
  def isThisSecond(date: Double): Boolean = js.native
  
  def isThisWeek(date: js.Date): Boolean = js.native
  def isThisWeek(date: js.Date, options: WeekStartsOn): Boolean = js.native
  def isThisWeek(date: Double): Boolean = js.native
  def isThisWeek(date: Double, options: WeekStartsOn): Boolean = js.native
  
  def isThisYear(date: js.Date): Boolean = js.native
  def isThisYear(date: Double): Boolean = js.native
  
  def isThursday(date: js.Date): Boolean = js.native
  def isThursday(date: Double): Boolean = js.native
  
  def isToday(date: js.Date): Boolean = js.native
  def isToday(date: Double): Boolean = js.native
  
  def isTomorrow(date: js.Date): Boolean = js.native
  def isTomorrow(date: Double): Boolean = js.native
  
  def isTuesday(date: js.Date): Boolean = js.native
  def isTuesday(date: Double): Boolean = js.native
  
  def isValid(date: Any): Boolean = js.native
  
  def isWednesday(date: js.Date): Boolean = js.native
  def isWednesday(date: Double): Boolean = js.native
  
  def isWeekend(date: js.Date): Boolean = js.native
  def isWeekend(date: Double): Boolean = js.native
  
  def isWithinInterval(date: js.Date, interval: Interval): Boolean = js.native
  def isWithinInterval(date: Double, interval: Interval): Boolean = js.native
  
  def isYesterday(date: js.Date): Boolean = js.native
  def isYesterday(date: Double): Boolean = js.native
  
  def lastDayOfDecade(date: js.Date): js.Date = js.native
  def lastDayOfDecade(date: Double): js.Date = js.native
  
  def lastDayOfISOWeek(date: js.Date): js.Date = js.native
  def lastDayOfISOWeek(date: Double): js.Date = js.native
  
  def lastDayOfISOWeekYear(date: js.Date): js.Date = js.native
  def lastDayOfISOWeekYear(date: Double): js.Date = js.native
  
  def lastDayOfMonth(date: js.Date): js.Date = js.native
  def lastDayOfMonth(date: Double): js.Date = js.native
  
  def lastDayOfQuarter(date: js.Date): js.Date = js.native
  def lastDayOfQuarter(date: js.Date, options: AdditionalDigits): js.Date = js.native
  def lastDayOfQuarter(date: Double): js.Date = js.native
  def lastDayOfQuarter(date: Double, options: AdditionalDigits): js.Date = js.native
  
  def lastDayOfWeek(date: js.Date): js.Date = js.native
  def lastDayOfWeek(date: js.Date, options: WeekStartsOn): js.Date = js.native
  def lastDayOfWeek(date: Double): js.Date = js.native
  def lastDayOfWeek(date: Double, options: WeekStartsOn): js.Date = js.native
  
  def lastDayOfYear(date: js.Date): js.Date = js.native
  def lastDayOfYear(date: Double): js.Date = js.native
  
  def lightFormat(date: js.Date, format: String): String = js.native
  def lightFormat(date: Double, format: String): String = js.native
  
  def max(datesArray: js.Array[js.Date | Double]): js.Date = js.native
  
  var maxTime: Double = js.native
  
  def milliseconds(duration: Duration): Double = js.native
  
  var millisecondsInHour: Double = js.native
  
  var millisecondsInMinute: Double = js.native
  
  var millisecondsInSecond: Double = js.native
  
  def millisecondsToHours(milliseconds: Double): Double = js.native
  
  def millisecondsToMinutes(milliseconds: Double): Double = js.native
  
  def millisecondsToSeconds(milliseconds: Double): Double = js.native
  
  def min(datesArray: js.Array[js.Date | Double]): js.Date = js.native
  
  var minTime: Double = js.native
  
  var minutesInHour: Double = js.native
  
  def minutesToHours(minutes: Double): Double = js.native
  
  def minutesToMilliseconds(minutes: Double): Double = js.native
  
  def minutesToSeconds(minutes: Double): Double = js.native
  
  var monthsInQuarter: Double = js.native
  
  var monthsInYear: Double = js.native
  
  def monthsToQuarters(months: Double): Double = js.native
  
  def monthsToYears(months: Double): Double = js.native
  
  def nextDay(date: js.Date, day: Day): js.Date = js.native
  def nextDay(date: Double, day: Day): js.Date = js.native
  
  def nextFriday(date: js.Date): js.Date = js.native
  def nextFriday(date: Double): js.Date = js.native
  
  def nextMonday(date: js.Date): js.Date = js.native
  def nextMonday(date: Double): js.Date = js.native
  
  def nextSaturday(date: js.Date): js.Date = js.native
  def nextSaturday(date: Double): js.Date = js.native
  
  def nextSunday(date: js.Date): js.Date = js.native
  def nextSunday(date: Double): js.Date = js.native
  
  def nextThursday(date: js.Date): js.Date = js.native
  def nextThursday(date: Double): js.Date = js.native
  
  def nextTuesday(date: js.Date): js.Date = js.native
  def nextTuesday(date: Double): js.Date = js.native
  
  def nextWednesday(date: js.Date): js.Date = js.native
  def nextWednesday(date: Double): js.Date = js.native
  
  def parse(dateString: String, formatString: String, referenceDate: js.Date): js.Date = js.native
  def parse(
    dateString: String,
    formatString: String,
    referenceDate: js.Date,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): js.Date = js.native
  def parse(dateString: String, formatString: String, referenceDate: Double): js.Date = js.native
  def parse(
    dateString: String,
    formatString: String,
    referenceDate: Double,
    options: UseAdditionalWeekYearTokensWeekStartsOn
  ): js.Date = js.native
  
  def parseISO(argument: String): js.Date = js.native
  def parseISO(argument: String, options: AdditionalDigits): js.Date = js.native
  
  def parseJSON(argument: String): js.Date = js.native
  def parseJSON(argument: js.Date): js.Date = js.native
  def parseJSON(argument: Double): js.Date = js.native
  
  def previousDay(date: js.Date, day: Double): js.Date = js.native
  def previousDay(date: Double, day: Double): js.Date = js.native
  
  def previousFriday(date: js.Date): js.Date = js.native
  def previousFriday(date: Double): js.Date = js.native
  
  def previousMonday(date: js.Date): js.Date = js.native
  def previousMonday(date: Double): js.Date = js.native
  
  def previousSaturday(date: js.Date): js.Date = js.native
  def previousSaturday(date: Double): js.Date = js.native
  
  def previousSunday(date: js.Date): js.Date = js.native
  def previousSunday(date: Double): js.Date = js.native
  
  def previousThursday(date: js.Date): js.Date = js.native
  def previousThursday(date: Double): js.Date = js.native
  
  def previousTuesday(date: js.Date): js.Date = js.native
  def previousTuesday(date: Double): js.Date = js.native
  
  def previousWednesday(date: js.Date): js.Date = js.native
  def previousWednesday(date: Double): js.Date = js.native
  
  var quartersInYear: Double = js.native
  
  def quartersToMonths(quarters: Double): Double = js.native
  
  def quartersToYears(quarters: Double): Double = js.native
  
  def roundToNearestMinutes(date: js.Date): js.Date = js.native
  def roundToNearestMinutes(date: js.Date, options: NearestToRoundingMethod): js.Date = js.native
  def roundToNearestMinutes(date: Double): js.Date = js.native
  def roundToNearestMinutes(date: Double, options: NearestToRoundingMethod): js.Date = js.native
  
  var secondsInDay: Double = js.native
  
  var secondsInHour: Double = js.native
  
  var secondsInMinute: Double = js.native
  
  var secondsInMonth: Double = js.native
  
  var secondsInQuarter: Double = js.native
  
  var secondsInWeek: Double = js.native
  
  var secondsInYear: Double = js.native
  
  def secondsToHours(seconds: Double): Double = js.native
  
  def secondsToMilliseconds(seconds: Double): Double = js.native
  
  def secondsToMinutes(seconds: Double): Double = js.native
  
  def set(date: js.Date, values: Hours): js.Date = js.native
  def set(date: Double, values: Hours): js.Date = js.native
  
  def setDate(date: js.Date, dayOfMonth: Double): js.Date = js.native
  def setDate(date: Double, dayOfMonth: Double): js.Date = js.native
  
  def setDay(date: js.Date, day: Double): js.Date = js.native
  def setDay(date: js.Date, day: Double, options: WeekStartsOn): js.Date = js.native
  def setDay(date: Double, day: Double): js.Date = js.native
  def setDay(date: Double, day: Double, options: WeekStartsOn): js.Date = js.native
  
  def setDayOfYear(date: js.Date, dayOfYear: Double): js.Date = js.native
  def setDayOfYear(date: Double, dayOfYear: Double): js.Date = js.native
  
  def setDefaultOptions(newOptions: typings.dateFns.anon.`1`): Unit = js.native
  
  def setHours(date: js.Date, hours: Double): js.Date = js.native
  def setHours(date: Double, hours: Double): js.Date = js.native
  
  def setISODay(date: js.Date, day: Double): js.Date = js.native
  def setISODay(date: Double, day: Double): js.Date = js.native
  
  def setISOWeek(date: js.Date, isoWeek: Double): js.Date = js.native
  def setISOWeek(date: Double, isoWeek: Double): js.Date = js.native
  
  def setISOWeekYear(date: js.Date, isoWeekYear: Double): js.Date = js.native
  def setISOWeekYear(date: Double, isoWeekYear: Double): js.Date = js.native
  
  def setMilliseconds(date: js.Date, milliseconds: Double): js.Date = js.native
  def setMilliseconds(date: Double, milliseconds: Double): js.Date = js.native
  
  def setMinutes(date: js.Date, minutes: Double): js.Date = js.native
  def setMinutes(date: Double, minutes: Double): js.Date = js.native
  
  def setMonth(date: js.Date, month: Double): js.Date = js.native
  def setMonth(date: Double, month: Double): js.Date = js.native
  
  def setQuarter(date: js.Date, quarter: Double): js.Date = js.native
  def setQuarter(date: Double, quarter: Double): js.Date = js.native
  
  def setSeconds(date: js.Date, seconds: Double): js.Date = js.native
  def setSeconds(date: Double, seconds: Double): js.Date = js.native
  
  def setWeek(date: js.Date, week: Double): js.Date = js.native
  def setWeek(date: js.Date, week: Double, options: typings.dateFns.anon.`1`): js.Date = js.native
  def setWeek(date: Double, week: Double): js.Date = js.native
  def setWeek(date: Double, week: Double, options: typings.dateFns.anon.`1`): js.Date = js.native
  
  def setWeekYear(date: js.Date, weekYear: Double): js.Date = js.native
  def setWeekYear(date: js.Date, weekYear: Double, options: typings.dateFns.anon.`1`): js.Date = js.native
  def setWeekYear(date: Double, weekYear: Double): js.Date = js.native
  def setWeekYear(date: Double, weekYear: Double, options: typings.dateFns.anon.`1`): js.Date = js.native
  
  def setYear(date: js.Date, year: Double): js.Date = js.native
  def setYear(date: Double, year: Double): js.Date = js.native
  
  def startOfDay(date: js.Date): js.Date = js.native
  def startOfDay(date: Double): js.Date = js.native
  
  def startOfDecade(date: js.Date): js.Date = js.native
  def startOfDecade(date: Double): js.Date = js.native
  
  def startOfHour(date: js.Date): js.Date = js.native
  def startOfHour(date: Double): js.Date = js.native
  
  def startOfISOWeek(date: js.Date): js.Date = js.native
  def startOfISOWeek(date: Double): js.Date = js.native
  
  def startOfISOWeekYear(date: js.Date): js.Date = js.native
  def startOfISOWeekYear(date: Double): js.Date = js.native
  
  def startOfMinute(date: js.Date): js.Date = js.native
  def startOfMinute(date: Double): js.Date = js.native
  
  def startOfMonth(date: js.Date): js.Date = js.native
  def startOfMonth(date: Double): js.Date = js.native
  
  def startOfQuarter(date: js.Date): js.Date = js.native
  def startOfQuarter(date: Double): js.Date = js.native
  
  def startOfSecond(date: js.Date): js.Date = js.native
  def startOfSecond(date: Double): js.Date = js.native
  
  def startOfToday(): js.Date = js.native
  
  def startOfTomorrow(): js.Date = js.native
  
  def startOfWeek(date: js.Date): js.Date = js.native
  def startOfWeek(date: js.Date, options: WeekStartsOn): js.Date = js.native
  def startOfWeek(date: Double): js.Date = js.native
  def startOfWeek(date: Double, options: WeekStartsOn): js.Date = js.native
  
  def startOfWeekYear(date: js.Date): js.Date = js.native
  def startOfWeekYear(date: js.Date, options: typings.dateFns.anon.`1`): js.Date = js.native
  def startOfWeekYear(date: Double): js.Date = js.native
  def startOfWeekYear(date: Double, options: typings.dateFns.anon.`1`): js.Date = js.native
  
  def startOfYear(date: js.Date): js.Date = js.native
  def startOfYear(date: Double): js.Date = js.native
  
  def startOfYesterday(): js.Date = js.native
  
  def sub(date: js.Date, duration: Duration): js.Date = js.native
  def sub(date: Double, duration: Duration): js.Date = js.native
  
  def subBusinessDays(date: js.Date, amount: Double): js.Date = js.native
  def subBusinessDays(date: Double, amount: Double): js.Date = js.native
  
  def subDays(date: js.Date, amount: Double): js.Date = js.native
  def subDays(date: Double, amount: Double): js.Date = js.native
  
  def subHours(date: js.Date, amount: Double): js.Date = js.native
  def subHours(date: Double, amount: Double): js.Date = js.native
  
  def subISOWeekYears(date: js.Date, amount: Double): js.Date = js.native
  def subISOWeekYears(date: Double, amount: Double): js.Date = js.native
  
  def subMilliseconds(date: js.Date, amount: Double): js.Date = js.native
  def subMilliseconds(date: Double, amount: Double): js.Date = js.native
  
  def subMinutes(date: js.Date, amount: Double): js.Date = js.native
  def subMinutes(date: Double, amount: Double): js.Date = js.native
  
  def subMonths(date: js.Date, amount: Double): js.Date = js.native
  def subMonths(date: Double, amount: Double): js.Date = js.native
  
  def subQuarters(date: js.Date, amount: Double): js.Date = js.native
  def subQuarters(date: Double, amount: Double): js.Date = js.native
  
  def subSeconds(date: js.Date, amount: Double): js.Date = js.native
  def subSeconds(date: Double, amount: Double): js.Date = js.native
  
  def subWeeks(date: js.Date, amount: Double): js.Date = js.native
  def subWeeks(date: Double, amount: Double): js.Date = js.native
  
  def subYears(date: js.Date, amount: Double): js.Date = js.native
  def subYears(date: Double, amount: Double): js.Date = js.native
  
  def toDate(argument: js.Date): js.Date = js.native
  def toDate(argument: Double): js.Date = js.native
  
  def weeksToDays(weeks: Double): Double = js.native
  
  def yearsToMonths(years: Double): Double = js.native
  
  def yearsToQuarters(years: Double): Double = js.native
}
