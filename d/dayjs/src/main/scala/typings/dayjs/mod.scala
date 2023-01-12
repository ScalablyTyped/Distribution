package typings.dayjs

import org.scalablytyped.runtime.Instantiable1
import typings.dayjs.anon.D
import typings.dayjs.anon.FnCallDateFormatLocaleStrict
import typings.dayjs.anon.PartialILocale
import typings.dayjs.dayjsStrings.`[]`
import typings.dayjs.dayjsStrings.d_
import typings.dayjs.dayjsStrings.long
import typings.dayjs.dayjsStrings.m_
import typings.dayjs.dayjsStrings.short
import typings.dayjs.pluginDurationMod.CreateDurationType
import typings.dayjs.pluginDurationMod.Duration
import typings.dayjs.pluginIsoWeekMod.ISOUnitType
import typings.dayjs.pluginToObjectMod.DayjsObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Dayjs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType): Dayjs = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  @JSImport("dayjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dayjs", "Dayjs")
  @js.native
  open class Dayjs ()
    extends StObject
       with _ConfigType {
    def this(config: ConfigType) = this()
    
    def add(argument: js.Object): typings.dayjs.pluginObjectSupportMod.dayjsAugmentingMod.Dayjs = js.native
    def add(duration: Duration): typings.dayjs.pluginDurationMod.dayjsAugmentingMod.Dayjs = js.native
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
    def add(value: Double, unit: ManipulateType): Dayjs = js.native
    def add(value: Double, unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    
    def calendar(): String = js.native
    def calendar(referenceTime: Unit, formats: js.Object): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
    
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
      * Accepts numbers from 1 to 31. If the range is exceeded, it will bubble up to the next months.
      * ```
      * dayjs().date(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(value: Double): Dayjs = js.native
    
    def dates(): Double = js.native
    def dates(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
      * Accepts numbers from 0 (Sunday) to 6 (Saturday). If the range is exceeded, it will bubble up to next weeks.
      * ```
      * dayjs().day(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(value: Double): Dayjs = js.native
    
    def dayOfYear(): Double = js.native
    def dayOfYear(value: Double): typings.dayjs.pluginDayOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    
    def days(): Double = js.native
    def days(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
      * date1.diff() // milliseconds to current time
      * ```
      *
      * To get the difference in another unit of measurement, pass that measurement as the second argument.
      * ```
      * const date1 = dayjs('2019-01-25')
      * date1.diff('2018-06-05', 'month') // 7
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/display/difference
      */
    def diff(): Double = js.native
    def diff(date: Unit, unit: Unit, float: Boolean): Double = js.native
    def diff(date: Unit, unit: OpUnitType): Double = js.native
    def diff(date: Unit, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: Unit, unit: QUnitType): Double = js.native
    def diff(date: Unit, unit: QUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType): Double = js.native
    def diff(date: ConfigType, unit: Unit, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: QUnitType): Double = js.native
    def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
    
    def endOf(unit: OpUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    def endOf(unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    def endOf(unit: ISOUnitType): typings.dayjs.pluginIsoWeekMod.dayjsAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the end of a unit of time.
      * ```
      * dayjs().endOf('month')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/end-of
      */
    @JSName("endOf")
    def endOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
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
      * Accepts numbers from 0 to 23. If the range is exceeded, it will bubble up to the next day.
      * ```
      * dayjs().hour(12)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(value: Double): Dayjs = js.native
    
    def hours(): Double = js.native
    def hours(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Unit, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: (/* () */ String) | `[]`): Boolean = js.native
    
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
    def isoWeek(value: Double): typings.dayjs.pluginIsoWeekMod.dayjsAugmentingMod.Dayjs = js.native
    
    def isoWeekYear(): Double = js.native
    
    def isoWeekday(): Double = js.native
    def isoWeekday(value: Double): typings.dayjs.pluginIsoWeekMod.dayjsAugmentingMod.Dayjs = js.native
    
    def isoWeeksInYear(): Double = js.native
    
    def local(): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    
    def locale(): String = js.native
    def locale(preset: String): Dayjs = js.native
    def locale(preset: String, `object`: PartialILocale): Dayjs = js.native
    def locale(preset: ILocale): Dayjs = js.native
    def locale(preset: ILocale, `object`: PartialILocale): Dayjs = js.native
    
    def localeData(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.InstanceLocaleDataReturn = js.native
    
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
      * Accepts numbers from 0 to 999. If the range is exceeded, it will bubble up to the next seconds.
      * ```
      * dayjs().millisecond(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(value: Double): Dayjs = js.native
    
    def milliseconds(): Double = js.native
    def milliseconds(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next hour.
      * ```
      * dayjs().minute(59)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(value: Double): Dayjs = js.native
    
    def minutes(): Double = js.native
    def minutes(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
      * Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the next year.
      * ```
      * dayjs().month(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(value: Double): Dayjs = js.native
    
    def months(): Double = js.native
    def months(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
    def offsetName(): js.UndefOr[String] = js.native
    def offsetName(`type`: short | long): js.UndefOr[String] = js.native
    
    def quarter(): Double = js.native
    def quarter(quarter: Double): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    
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
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next minutes.
      * ```
      * dayjs().second(1)// Dayjs
      * ```
      */
    def second(value: Double): Dayjs = js.native
    
    def seconds(): Double = js.native
    def seconds(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
    def set(argument: js.Object): typings.dayjs.pluginObjectSupportMod.dayjsAugmentingMod.Dayjs = js.native
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
    
    def startOf(unit: OpUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    def startOf(unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    def startOf(unit: ISOUnitType): typings.dayjs.pluginIsoWeekMod.dayjsAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the start of a unit of time.
      * ```
      * dayjs().startOf('year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/start-of
      */
    @JSName("startOf")
    def startOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
    def subtract(argument: js.Object): typings.dayjs.pluginObjectSupportMod.dayjsAugmentingMod.Dayjs = js.native
    def subtract(duration: Duration): typings.dayjs.pluginDurationMod.dayjsAugmentingMod.Dayjs = js.native
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
    def subtract(value: Double, unit: ManipulateType): Dayjs = js.native
    def subtract(value: Double, unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    
    def to(compared: ConfigType): String = js.native
    def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    /**
      * To get a copy of the native `Date` object parsed from the Day.js object use `dayjs#toDate`.
      * ```
      * dayjs('2019-01-25').toDate()// => Date
      * ```
      */
    def toDate(): js.Date = js.native
    
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
    
    def tz(): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    def tz(timezone: String): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    def tz(timezone: String, keepLocalTime: Boolean): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    def tz(timezone: Unit, keepLocalTime: Boolean): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    
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
    
    def utc(): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    def utc(keepLocalTime: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    
    /**
      * Get the UTC offset in minutes.
      * ```
      * dayjs().utcOffset()
      * ```
      * Docs: https://day.js.org/docs/en/manipulate/utc-offset
      */
    def utcOffset(): Double = js.native
    def utcOffset(offset: String): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    def utcOffset(offset: String, keepLocalTime: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double, keepLocalTime: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = js.native
    
    def week(): Double = js.native
    def week(value: Double): typings.dayjs.pluginWeekOfYearMod.dayjsAugmentingMod.Dayjs = js.native
    
    def weekYear(): Double = js.native
    
    def weekday(): Double = js.native
    def weekday(value: Double): typings.dayjs.pluginWeekdayMod.dayjsAugmentingMod.Dayjs = js.native
    
    def weeks(): Double = js.native
    def weeks(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
    
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
    def years(value: Double): typings.dayjs.pluginPluralGetSetMod.dayjsAugmentingMod.Dayjs = js.native
  }
  
  @JSImport("dayjs", "duration")
  @js.native
  val duration: CreateDurationType = js.native
  
  inline def extend[T](plugin: PluginFunc[T]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  inline def extend[T](plugin: PluginFunc[T], option: T): Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  inline def isDayjs(d: Any): /* is dayjs.dayjs.Dayjs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayjs")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs.Dayjs */ Boolean]
  
  inline def isDuration(d: Any): /* is dayjs.dayjs/plugin/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/plugin/duration.Duration */ Boolean]
  
  inline def isMoment(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(preset: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(preset: String, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: String, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: String, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localeData(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.GlobalLocaleDataReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.GlobalLocaleDataReturn]
  
  inline def max(dayjs: Dayjs*): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Dayjs]
  inline def max(dayjs: js.Array[Dayjs]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def min(dayjs: Dayjs*): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Dayjs]
  inline def min(dayjs: js.Array[Dayjs]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def months(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames]
  
  inline def monthsShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames]
  
  inline def unix(t: js.BigInt): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  inline def unix(t: Double): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def updateLocale(localeName: String, customConfig: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(localeName.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def utc(): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String, strict: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: Unit, strict: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any]).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String, strict: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: Unit, strict: Boolean): typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  
  inline def weekdays(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  inline def weekdays(localOrder: Boolean): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  
  inline def weekdaysMin(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  inline def weekdaysMin(localOrder: Boolean): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  
  inline def weekdaysShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  inline def weekdaysShort(localOrder: Boolean): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Date
    - typings.dayjs.mod.Dayjs
    - scala.Null
    - scala.Unit
    - js.Tuple7[
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double]]
    - js.BigInt
    - typings.dayjs.anon.D
  */
  type ConfigType = js.UndefOr[
    _ConfigType | (js.Tuple7[
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double]
    ]) | String | Double | js.Date | Null | js.BigInt
  ]
  
  trait ConfigTypeMap extends StObject {
    
    var default: js.UndefOr[String | Double | js.Date | Dayjs | Null] = js.undefined
    
    var arraySupport: js.Tuple7[
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double]
      ]
    
    var bigIntSupport: js.BigInt
    
    var objectSupport: D
  }
  object ConfigTypeMap {
    
    inline def apply(
      arraySupport: js.Tuple7[
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double]
        ],
      bigIntSupport: js.BigInt,
      objectSupport: D
    ): ConfigTypeMap = {
      val __obj = js.Dynamic.literal(arraySupport = arraySupport.asInstanceOf[js.Any], bigIntSupport = bigIntSupport.asInstanceOf[js.Any], objectSupport = objectSupport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTypeMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
      
      inline def setArraySupport(
        value: js.Tuple7[
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double]
            ]
      ): Self = StObject.set(x, "arraySupport", value.asInstanceOf[js.Any])
      
      inline def setBigIntSupport(value: js.BigInt): Self = StObject.set(x, "bigIntSupport", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: String | Double | js.Date | Dayjs): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setObjectSupport(value: D): Self = StObject.set(x, "objectSupport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DayjsTimezone extends StObject {
    
    def apply(date: ConfigType): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, format: String, timezone: String): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, timezone: String): typings.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
    
    def guess(): String = js.native
    
    def setDefault(): Unit = js.native
    def setDefault(timezone: String): Unit = js.native
  }
  
  trait FormatObject extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object FormatObject {
    
    inline def apply(): FormatObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatObject] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  @js.native
  trait GlobalLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
  }
  
  @js.native
  trait InstanceLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    def months(instance: typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.Dayjs): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    def monthsShort(instance: typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.Dayjs): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    def weekdays(instance: typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.Dayjs): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    def weekdaysMin(instance: typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.Dayjs): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
    def weekdaysShort(instance: typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.Dayjs): typings.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames = js.native
  }
  
  /* Inlined std.Exclude<dayjs.dayjs.OpUnitType, 'date' | 'dates'> */
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.hours
    - typings.dayjs.dayjsStrings.d_
    - typings.dayjs.dayjsStrings.w
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.years
    - typings.dayjs.dayjsStrings.seconds
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.days
    - typings.dayjs.dayjsStrings.week
    - typings.dayjs.dayjsStrings.minutes
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.months
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.weeks
    - typings.dayjs.dayjsStrings.D
    - typings.dayjs.dayjsStrings.ms
    - typings.dayjs.dayjsStrings.milliseconds
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.millisecond
  */
  trait ManipulateType extends StObject
  object ManipulateType {
    
    inline def D: typings.dayjs.dayjsStrings.D = "D".asInstanceOf[typings.dayjs.dayjsStrings.D]
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def days: typings.dayjs.dayjsStrings.days = "days".asInstanceOf[typings.dayjs.dayjsStrings.days]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def hours: typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typings.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typings.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def minutes: typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typings.dayjs.dayjsStrings.minutes]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def months: typings.dayjs.dayjsStrings.months = "months".asInstanceOf[typings.dayjs.dayjsStrings.months]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def seconds: typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typings.dayjs.dayjsStrings.seconds]
    
    inline def w: typings.dayjs.dayjsStrings.w = "w".asInstanceOf[typings.dayjs.dayjsStrings.w]
    
    inline def week: typings.dayjs.dayjsStrings.week = "week".asInstanceOf[typings.dayjs.dayjsStrings.week]
    
    inline def weeks: typings.dayjs.dayjsStrings.weeks = "weeks".asInstanceOf[typings.dayjs.dayjsStrings.weeks]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
    
    inline def years: typings.dayjs.dayjsStrings.years = "years".asInstanceOf[typings.dayjs.dayjsStrings.years]
  }
  
  type MonthNames = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.week
    - typings.dayjs.dayjsStrings.weeks
    - typings.dayjs.dayjsStrings.w
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
    - typings.dayjs.dayjsStrings.milliseconds
    - typings.dayjs.dayjsStrings.seconds
    - typings.dayjs.dayjsStrings.minutes
    - typings.dayjs.dayjsStrings.hours
    - typings.dayjs.dayjsStrings.days
    - typings.dayjs.dayjsStrings.months
    - typings.dayjs.dayjsStrings.years
    - typings.dayjs.dayjsStrings.dates
    - typings.dayjs.dayjsStrings.d_
    - typings.dayjs.dayjsStrings.D
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait OpUnitType extends StObject
  object OpUnitType {
    
    inline def D: typings.dayjs.dayjsStrings.D = "D".asInstanceOf[typings.dayjs.dayjsStrings.D]
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typings.dayjs.dayjsStrings.date = "date".asInstanceOf[typings.dayjs.dayjsStrings.date]
    
    inline def dates: typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typings.dayjs.dayjsStrings.dates]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def days: typings.dayjs.dayjsStrings.days = "days".asInstanceOf[typings.dayjs.dayjsStrings.days]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def hours: typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typings.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typings.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def minutes: typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typings.dayjs.dayjsStrings.minutes]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def months: typings.dayjs.dayjsStrings.months = "months".asInstanceOf[typings.dayjs.dayjsStrings.months]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def seconds: typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typings.dayjs.dayjsStrings.seconds]
    
    inline def w: typings.dayjs.dayjsStrings.w = "w".asInstanceOf[typings.dayjs.dayjsStrings.w]
    
    inline def week: typings.dayjs.dayjsStrings.week = "week".asInstanceOf[typings.dayjs.dayjsStrings.week]
    
    inline def weeks: typings.dayjs.dayjsStrings.weeks = "weeks".asInstanceOf[typings.dayjs.dayjsStrings.weeks]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
    
    inline def years: typings.dayjs.dayjsStrings.years = "years".asInstanceOf[typings.dayjs.dayjsStrings.years]
  }
  
  type OptionType = FormatObject | String | js.Array[String]
  
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ Instantiable1[/* config */ js.UndefOr[ConfigType], Dayjs], 
    /* d */ FnCallDateFormatLocaleStrict, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.quarter
    - typings.dayjs.dayjsStrings.quarters
    - typings.dayjs.dayjsStrings.Q
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
    - typings.dayjs.dayjsStrings.milliseconds
    - typings.dayjs.dayjsStrings.seconds
    - typings.dayjs.dayjsStrings.minutes
    - typings.dayjs.dayjsStrings.hours
    - typings.dayjs.dayjsStrings.days
    - typings.dayjs.dayjsStrings.months
    - typings.dayjs.dayjsStrings.years
    - typings.dayjs.dayjsStrings.dates
    - typings.dayjs.dayjsStrings.d_
    - typings.dayjs.dayjsStrings.D
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait QUnitType extends StObject
  object QUnitType {
    
    inline def D: typings.dayjs.dayjsStrings.D = "D".asInstanceOf[typings.dayjs.dayjsStrings.D]
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def Q: typings.dayjs.dayjsStrings.Q = "Q".asInstanceOf[typings.dayjs.dayjsStrings.Q]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typings.dayjs.dayjsStrings.date = "date".asInstanceOf[typings.dayjs.dayjsStrings.date]
    
    inline def dates: typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typings.dayjs.dayjsStrings.dates]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def days: typings.dayjs.dayjsStrings.days = "days".asInstanceOf[typings.dayjs.dayjsStrings.days]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def hours: typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typings.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typings.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def minutes: typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typings.dayjs.dayjsStrings.minutes]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def months: typings.dayjs.dayjsStrings.months = "months".asInstanceOf[typings.dayjs.dayjsStrings.months]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def quarter: typings.dayjs.dayjsStrings.quarter = "quarter".asInstanceOf[typings.dayjs.dayjsStrings.quarter]
    
    inline def quarters: typings.dayjs.dayjsStrings.quarters = "quarters".asInstanceOf[typings.dayjs.dayjsStrings.quarters]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def seconds: typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typings.dayjs.dayjsStrings.seconds]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
    
    inline def years: typings.dayjs.dayjsStrings.years = "years".asInstanceOf[typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
    - typings.dayjs.dayjsStrings.milliseconds
    - typings.dayjs.dayjsStrings.seconds
    - typings.dayjs.dayjsStrings.minutes
    - typings.dayjs.dayjsStrings.hours
    - typings.dayjs.dayjsStrings.days
    - typings.dayjs.dayjsStrings.months
    - typings.dayjs.dayjsStrings.years
    - typings.dayjs.dayjsStrings.dates
    - typings.dayjs.dayjsStrings.d_
    - typings.dayjs.dayjsStrings.D
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait UnitType extends StObject
  object UnitType {
    
    inline def D: typings.dayjs.dayjsStrings.D = "D".asInstanceOf[typings.dayjs.dayjsStrings.D]
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typings.dayjs.dayjsStrings.date = "date".asInstanceOf[typings.dayjs.dayjsStrings.date]
    
    inline def dates: typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typings.dayjs.dayjsStrings.dates]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def days: typings.dayjs.dayjsStrings.days = "days".asInstanceOf[typings.dayjs.dayjsStrings.days]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def hours: typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typings.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typings.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def minutes: typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typings.dayjs.dayjsStrings.minutes]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def months: typings.dayjs.dayjsStrings.months = "months".asInstanceOf[typings.dayjs.dayjsStrings.months]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def seconds: typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typings.dayjs.dayjsStrings.seconds]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
    
    inline def years: typings.dayjs.dayjsStrings.years = "years".asInstanceOf[typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
  */
  trait UnitTypeLong extends StObject
  object UnitTypeLong {
    
    inline def date: typings.dayjs.dayjsStrings.date = "date".asInstanceOf[typings.dayjs.dayjsStrings.date]
    
    inline def day: typings.dayjs.dayjsStrings.day = "day".asInstanceOf[typings.dayjs.dayjsStrings.day]
    
    inline def hour: typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typings.dayjs.dayjsStrings.hour]
    
    inline def millisecond: typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typings.dayjs.dayjsStrings.millisecond]
    
    inline def minute: typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typings.dayjs.dayjsStrings.minute]
    
    inline def month: typings.dayjs.dayjsStrings.month = "month".asInstanceOf[typings.dayjs.dayjsStrings.month]
    
    inline def second: typings.dayjs.dayjsStrings.second = "second".asInstanceOf[typings.dayjs.dayjsStrings.second]
    
    inline def year: typings.dayjs.dayjsStrings.year = "year".asInstanceOf[typings.dayjs.dayjsStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.milliseconds
    - typings.dayjs.dayjsStrings.seconds
    - typings.dayjs.dayjsStrings.minutes
    - typings.dayjs.dayjsStrings.hours
    - typings.dayjs.dayjsStrings.days
    - typings.dayjs.dayjsStrings.months
    - typings.dayjs.dayjsStrings.years
    - typings.dayjs.dayjsStrings.dates
  */
  trait UnitTypeLongPlural extends StObject
  object UnitTypeLongPlural {
    
    inline def dates: typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typings.dayjs.dayjsStrings.dates]
    
    inline def days: typings.dayjs.dayjsStrings.days = "days".asInstanceOf[typings.dayjs.dayjsStrings.days]
    
    inline def hours: typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typings.dayjs.dayjsStrings.hours]
    
    inline def milliseconds: typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typings.dayjs.dayjsStrings.milliseconds]
    
    inline def minutes: typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typings.dayjs.dayjsStrings.minutes]
    
    inline def months: typings.dayjs.dayjsStrings.months = "months".asInstanceOf[typings.dayjs.dayjsStrings.months]
    
    inline def seconds: typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typings.dayjs.dayjsStrings.seconds]
    
    inline def years: typings.dayjs.dayjsStrings.years = "years".asInstanceOf[typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.d_
    - typings.dayjs.dayjsStrings.D
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m_
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait UnitTypeShort extends StObject
  object UnitTypeShort {
    
    inline def D: typings.dayjs.dayjsStrings.D = "D".asInstanceOf[typings.dayjs.dayjsStrings.D]
    
    inline def M: typings.dayjs.dayjsStrings.M = "M".asInstanceOf[typings.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def h: typings.dayjs.dayjsStrings.h = "h".asInstanceOf[typings.dayjs.dayjsStrings.h]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def ms: typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typings.dayjs.dayjsStrings.ms]
    
    inline def s: typings.dayjs.dayjsStrings.s = "s".asInstanceOf[typings.dayjs.dayjsStrings.s]
    
    inline def y: typings.dayjs.dayjsStrings.y = "y".asInstanceOf[typings.dayjs.dayjsStrings.y]
  }
  
  type WeekdayNames = js.Tuple7[String, String, String, String, String, String, String]
  
  trait _ConfigType extends StObject
}
