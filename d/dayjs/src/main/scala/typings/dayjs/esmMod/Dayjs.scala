package typings.dayjs.esmMod

import typings.dayjs.ILocale
import typings.dayjs.anon.PartialILocale
import typings.dayjs.durationMod.Duration
import typings.dayjs.isoWeekMod.ISOUnitType
import typings.dayjs.toObjectMod.DayjsObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dayjs/esm", "Dayjs")
@js.native
class Dayjs () extends js.Object {
  def this(config: ConfigType) = this()
  
  def add(argument: js.Object): typings.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
  /**
    * Returns a cloned Day.js object with a specified amount of time added.
    * ```
    * dayjs().add(7, 'day')// => Dayjs
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/manipulate/add
    */
  def add(value: Double): Dayjs = js.native
  def add(value: Double, unit: OpUnitType): Dayjs = js.native
  def add(value: Double, unit: QUnitType): typings.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def add(value: Duration): typings.dayjs.durationMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def calendar(): String = js.native
  def calendar(referenceTime: js.UndefOr[ConfigType], formats: js.Object): String = js.native
  def calendar(referenceTime: ConfigType): String = js.native
  
  /**
    * Get the date of the month.
    * ```
    * dayjs().date()// => 1-31
    * ```
    * Docs: https://day.js.org/docs/en/get-set/date
    */
  def date(): Double = js.native
  /**
    * Set the date of the month.
    *
    * Accepts numbers from 1 to 31. If the range is exceeded, it will bubble up to the months.
    * ```
    * dayjs().date(1)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/date
    */
  def date(value: Double): Dayjs = js.native
  
  def dates(): Double = js.native
  def dates(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the day of the week.
    *
    * Returns numbers from 0 (Sunday) to 6 (Saturday).
    * ```
    * dayjs().day()// 0-6
    * ```
    * Docs: https://day.js.org/docs/en/get-set/day
    */
  def day(): Double = js.native
  /**
    * Set the day of the week.
    *
    * Accepts numbers from 0 (Sunday) to 6 (Saturday). If the range is exceeded, it will bubble up to other weeks.
    * ```
    * dayjs().day(0)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/day
    */
  def day(value: Double): Dayjs = js.native
  
  def dayOfYear(): Double = js.native
  def dayOfYear(value: Double): typings.dayjs.dayOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def days(): Double = js.native
  def days(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the number of days in the current month.
    * ```
    * dayjs('2019-01-25').daysInMonth() // 31
    * ```
    * Docs: https://day.js.org/docs/en/display/days-in-month
    */
  def daysInMonth(): Double = js.native
  
  /**
    * This indicates the difference between two date-time in the specified unit.
    *
    * To get the difference in milliseconds, use `dayjs#diff`
    * ```
    * const date1 = dayjs('2019-01-25')
    * const date2 = dayjs('2018-06-05')
    * date1.diff(date2) // 20214000000 default milliseconds
    * ```
    * To get the difference in another unit of measurement, pass that measurement as the second argument.
    * ```
    * const date1 = dayjs('2019-01-25')
    * date1.diff('2018-06-05', 'month') // 7
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/display/difference
    */
  def diff(date: ConfigType): Double = js.native
  def diff(date: ConfigType, unit: js.UndefOr[scala.Nothing], float: Boolean): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
  def diff(date: ConfigType, unit: QUnitType): Double = js.native
  def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
  
  /**
    * Returns a cloned Day.js object and set it to the end of a unit of time.
    * ```
    * dayjs().endOf('month')// => Dayjs
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/manipulate/end-of
    */
  def endOf(unit: OpUnitType): Dayjs = js.native
  def endOf(unit: QUnitType): typings.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def endOf(unit: ISOUnitType): typings.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the formatted date according to the string of tokens passed in.
    *
    * To escape characters, wrap them in square brackets (e.g. [MM]).
    * ```
    * dayjs().format()// => current date in ISO8601, without fraction seconds e.g. '2020-04-02T08:02:17-05:00'
    * dayjs('2019-01-25').format('[YYYYescape] YYYY-MM-DDTHH:mm:ssZ[Z]')// 'YYYYescape 2019-01-25T00:00:00-02:00Z'
    * dayjs('2019-01-25').format('DD/MM/YYYY') // '25/01/2019'
    * ```
    * Docs: https://day.js.org/docs/en/display/format
    */
  def format(): String = js.native
  def format(template: String): String = js.native
  
  def from(compared: ConfigType): String = js.native
  def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
  
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  
  /**
    * String getter, returns the corresponding information getting from Day.js object.
    *
    * In general:
    * ```
    * dayjs().get(unit) === dayjs()[unit]()
    * ```
    * Units are case insensitive, and support plural and short forms.
    * ```
    * dayjs().get('year')
    * dayjs().get('month') // start 0
    * dayjs().get('date')
    * ```
    * Docs: https://day.js.org/docs/en/get-set/get
    */
  def get(unit: UnitType): Double = js.native
  
  /**
    * Get the hour.
    * ```
    * dayjs().hour()// => 0-23
    * ```
    * Docs: https://day.js.org/docs/en/get-set/hour
    */
  def hour(): Double = js.native
  /**
    * Set the hour.
    *
    * Accepts numbers from 0 to 23. If the range is exceeded, it will bubble up to the day.
    * ```
    * dayjs().hour(12)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/hour
    */
  def hour(value: Double): Dayjs = js.native
  
  def hours(): Double = js.native
  def hours(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * This indicates whether the Day.js object is after the other supplied date-time.
    * ```
    * dayjs().isAfter(dayjs('2011-01-01')) // default milliseconds
    * ```
    * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
    * ```
    * dayjs().isAfter('2011-01-01', 'year')// => boolean
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/query/is-after
    */
  def isAfter(date: ConfigType): Boolean = js.native
  def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
  
  /**
    * This indicates whether the Day.js object is before the other supplied date-time.
    * ```
    * dayjs().isBefore(dayjs('2011-01-01')) // default milliseconds
    * ```
    * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
    * ```
    * dayjs().isBefore('2011-01-01', 'year')// => boolean
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/query/is-before
    */
  def isBefore(date: ConfigType): Boolean = js.native
  def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
  
  def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: js.UndefOr[scala.Nothing], d: String): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  /**
    * This indicates whether the Day.js object is the same as the other supplied date-time.
    * ```
    * dayjs().isSame(dayjs('2011-01-01')) // default milliseconds
    * ```
    * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
    * ```
    * dayjs().isSame('2011-01-01', 'year')// => boolean
    * ```
    * Docs: https://day.js.org/docs/en/query/is-same
    */
  def isSame(date: ConfigType): Boolean = js.native
  def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
  
  def isSameOrAfter(date: ConfigType): Boolean = js.native
  def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  
  def isSameOrBefore(date: ConfigType): Boolean = js.native
  def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  
  def isToday(): Boolean = js.native
  
  def isTomorrow(): Boolean = js.native
  
  def isUTC(): Boolean = js.native
  
  /**
    * This returns a `boolean` indicating whether the Day.js object contains a valid date or not.
    * ```
    * dayjs().isValid()// => boolean
    * ```
    * Docs: https://day.js.org/docs/en/parse/is-valid
    */
  def isValid(): Boolean = js.native
  
  def isYesterday(): Boolean = js.native
  
  def isoWeek(): Double = js.native
  def isoWeek(value: Double): typings.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def isoWeekYear(): Double = js.native
  
  def isoWeekday(): Double = js.native
  def isoWeekday(value: Double): typings.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def isoWeeksInYear(): Double = js.native
  
  def local(): typings.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def locale(): String = js.native
  def locale(preset: String): Dayjs = js.native
  def locale(preset: String, `object`: PartialILocale): Dayjs = js.native
  def locale(preset: ILocale): Dayjs = js.native
  def locale(preset: ILocale, `object`: PartialILocale): Dayjs = js.native
  
  def localeData(): typings.dayjs.localeDataMod.dayjsEsmAugmentingMod.InstanceLocaleDataReturn = js.native
  
  /**
    * Get the milliseconds.
    * ```
    * dayjs().millisecond()// => 0-999
    * ```
    * Docs: https://day.js.org/docs/en/get-set/millisecond
    */
  def millisecond(): Double = js.native
  /**
    * Set the milliseconds.
    *
    * Accepts numbers from 0 to 999. If the range is exceeded, it will bubble up to the seconds.
    * ```
    * dayjs().millisecond(1)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/millisecond
    */
  def millisecond(value: Double): Dayjs = js.native
  
  def milliseconds(): Double = js.native
  def milliseconds(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the minutes.
    * ```
    * dayjs().minute()// => 0-59
    * ```
    * Docs: https://day.js.org/docs/en/get-set/minute
    */
  def minute(): Double = js.native
  /**
    * Set the minutes.
    *
    * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hour.
    * ```
    * dayjs().minute(59)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/minute
    */
  def minute(value: Double): Dayjs = js.native
  
  def minutes(): Double = js.native
  def minutes(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the month.
    *
    * Months are zero indexed, so January is month 0.
    * ```
    * dayjs().month()// => 0-11
    * ```
    * Docs: https://day.js.org/docs/en/get-set/month
    */
  def month(): Double = js.native
  /**
    * Set the month.
    *
    * Months are zero indexed, so January is month 0.
    *
    * Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.
    * ```
    * dayjs().month(0)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/month
    */
  def month(value: Double): Dayjs = js.native
  
  def months(): Double = js.native
  def months(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def quarter(): Double = js.native
  def quarter(quarter: Double): typings.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the seconds.
    * ```
    * dayjs().second()// => 0-59
    * ```
    * Docs: https://day.js.org/docs/en/get-set/second
    */
  def second(): Double = js.native
  /**
    * Set the seconds.
    *
    * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
    * ```
    * dayjs().second(1)// Dayjs
    * ```
    */
  def second(value: Double): Dayjs = js.native
  
  def seconds(): Double = js.native
  def seconds(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def set(argument: js.Object): typings.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
  /**
    * Generic setter, accepting unit as first argument, and value as second, returns a new instance with the applied changes.
    *
    * In general:
    * ```
    * dayjs().set(unit, value) === dayjs()[unit](value)
    * ```
    * Units are case insensitive, and support plural and short forms.
    * ```
    * dayjs().set('date', 1)
    * dayjs().set('month', 3) // April
    * dayjs().set('second', 30)
    * ```
    * Docs: https://day.js.org/docs/en/get-set/set
    */
  def set(unit: UnitType, value: Double): Dayjs = js.native
  
  /**
    * Returns a cloned Day.js object and set it to the start of a unit of time.
    * ```
    * dayjs().startOf('year')// => Dayjs
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/manipulate/start-of
    */
  def startOf(unit: OpUnitType): Dayjs = js.native
  def startOf(unit: QUnitType): typings.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def startOf(unit: ISOUnitType): typings.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def subtract(argument: js.Object): typings.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
  /**
    * Returns a cloned Day.js object with a specified amount of time subtracted.
    * ```
    * dayjs().subtract(7, 'year')// => Dayjs
    * ```
    * Units are case insensitive, and support plural and short forms.
    *
    * Docs: https://day.js.org/docs/en/manipulate/subtract
    */
  def subtract(value: Double): Dayjs = js.native
  def subtract(value: Double, unit: OpUnitType): Dayjs = js.native
  def subtract(value: Double, unit: QUnitType): typings.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def subtract(value: Duration): typings.dayjs.durationMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def to(compared: ConfigType): String = js.native
  def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
  
  def toArray(): js.Array[Double] = js.native
  
  /**
    * To get a copy of the native `Date` object parsed from the Day.js object use `dayjs#toDate`.
    * ```
    * dayjs('2019-01-25').toDate()// => Date
    * ```
    */
  def toDate(): Date = js.native
  
  /**
    * To format as an ISO 8601 string.
    * ```
    * dayjs('2019-01-25').toISOString() // '2019-01-25T02:00:00.000Z'
    * ```
    * Docs: https://day.js.org/docs/en/display/as-iso-string
    */
  def toISOString(): String = js.native
  
  /**
    * To serialize as an ISO 8601 string.
    * ```
    * dayjs('2019-01-25').toJSON() // '2019-01-25T02:00:00.000Z'
    * ```
    * Docs: https://day.js.org/docs/en/display/as-json
    */
  def toJSON(): String = js.native
  
  def toNow(): String = js.native
  def toNow(withoutSuffix: Boolean): String = js.native
  
  def toObject(): DayjsObject = js.native
  
  def tz(): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def tz(timezone: js.UndefOr[scala.Nothing], keepLocalTime: Boolean): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def tz(timezone: String): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def tz(timezone: String, keepLocalTime: Boolean): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * This returns the Unix timestamp (the number of **seconds** since the Unix Epoch) of the Day.js object.
    * ```
    * dayjs('2019-01-25').unix() // 1548381600
    * ```
    * This value is floored to the nearest second, and does not include a milliseconds component.
    *
    * Docs: https://day.js.org/docs/en/display/unix-timestamp
    */
  def unix(): Double = js.native
  
  def utc(): typings.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def utc(keepLocalTime: Boolean): typings.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the UTC offset in minutes.
    * ```
    * dayjs().utcOffset()
    * ```
    * Docs: https://day.js.org/docs/en/manipulate/utc-offset
    */
  def utcOffset(): Double = js.native
  def utcOffset(offset: Double): typings.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def utcOffset(offset: Double, keepLocalTime: Boolean): typings.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def week(): Double = js.native
  def week(value: Double): typings.dayjs.weekOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def weekYear(): Double = js.native
  
  def weekday(): Double = js.native
  def weekday(value: Double): typings.dayjs.weekdayMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def weeks(): Double = js.native
  def weeks(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  /**
    * Get the year.
    * ```
    * dayjs().year()// => 2020
    * ```
    * Docs: https://day.js.org/docs/en/get-set/year
    */
  def year(): Double = js.native
  /**
    * Set the year.
    * ```
    * dayjs().year(2000)// => Dayjs
    * ```
    * Docs: https://day.js.org/docs/en/get-set/year
    */
  def year(value: Double): Dayjs = js.native
  
  def years(): Double = js.native
  def years(value: Double): typings.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
}
