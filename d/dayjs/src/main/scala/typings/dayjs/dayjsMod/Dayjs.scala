package typings.dayjs.dayjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.dayjs.Anon_Key
import typings.dayjs.pluginToObjectMod.DayjsObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", "Dayjs")
@js.native
class Dayjs () extends js.Object {
  def this(config: ConfigType) = this()
  def add(value: Double, unit: OpUnitType): Dayjs = js.native
  def add(value: Double, unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsMod.Dayjs = js.native
  def calendar(): String = js.native
  def calendar(referenceTime: ConfigType): String = js.native
  def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
  def date(): Double = js.native
  def date(value: Double): Dayjs = js.native
  def day(): Double = js.native
  def day(value: Double): Dayjs = js.native
  def dayOfYear(): Double = js.native
  def daysInMonth(): Double = js.native
  def diff(date: ConfigType): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
  def diff(date: ConfigType, unit: QUnitType): Double = js.native
  def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
  def endOf(unit: OpUnitType): Dayjs = js.native
  def endOf(unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsMod.Dayjs = js.native
  def format(): String = js.native
  def format(template: String): String = js.native
  def from(compared: ConfigType): String = js.native
  def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def get(unit: UnitType): Double = js.native
  def hour(): Double = js.native
  def hour(value: Double): Dayjs = js.native
  def isAfter(date: ConfigType): Boolean = js.native
  def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isBefore(date: ConfigType): Boolean = js.native
  def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
  def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
  def isLeapYear(): Boolean = js.native
  def isSame(date: ConfigType): Boolean = js.native
  def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
  def isSameOrAfter(date: ConfigType): Boolean = js.native
  def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isSameOrBefore(date: ConfigType): Boolean = js.native
  def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isUTC(): Boolean = js.native
  def isValid(): Boolean = js.native
  def isoWeeksInYear(): Double = js.native
  def local(): typings.dayjs.pluginUtcMod.dayjsMod.Dayjs = js.native
  def locale(): String = js.native
  def locale(preset: String): Dayjs = js.native
  def locale(preset: String, `object`: StringDictionary[js.Any]): Dayjs = js.native
  def locale(preset: Anon_Key): Dayjs = js.native
  def locale(preset: Anon_Key, `object`: StringDictionary[js.Any]): Dayjs = js.native
  def localeData(): js.Any = js.native
  def millisecond(): Double = js.native
  def millisecond(value: Double): Dayjs = js.native
  def minute(): Double = js.native
  def minute(value: Double): Dayjs = js.native
  def month(): Double = js.native
  def month(value: Double): Dayjs = js.native
  def quarter(): Double = js.native
  def quarter(quarter: Double): typings.dayjs.pluginQuarterOfYearMod.dayjsMod.Dayjs = js.native
  def second(): Double = js.native
  def second(value: Double): Dayjs = js.native
  def set(unit: UnitType, value: Double): Dayjs = js.native
  def startOf(unit: OpUnitType): Dayjs = js.native
  def startOf(unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsMod.Dayjs = js.native
  def subtract(value: Double, unit: OpUnitType): Dayjs = js.native
  def subtract(value: Double, unit: QUnitType): typings.dayjs.pluginQuarterOfYearMod.dayjsMod.Dayjs = js.native
  def to(compared: ConfigType): String = js.native
  def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
  def toArray(): js.Array[Double] = js.native
  def toDate(): Date = js.native
  def toISOString(): String = js.native
  def toJSON(): String = js.native
  def toNow(): String = js.native
  def toNow(withoutSuffix: Boolean): String = js.native
  def toObject(): DayjsObject = js.native
  def unix(): Double = js.native
  def utc(): typings.dayjs.pluginUtcMod.dayjsMod.Dayjs = js.native
  def utcOffset(): Double = js.native
  def utcOffset(offset: Double): typings.dayjs.pluginUtcMod.dayjsMod.Dayjs = js.native
  def week(): Double = js.native
  def week(value: Double): typings.dayjs.pluginWeekOfYearMod.dayjsMod.Dayjs = js.native
  def weekYear(): Double = js.native
  def weekday(): Double = js.native
  def weekday(value: Double): typings.dayjs.pluginWeekdayMod.dayjsMod.Dayjs = js.native
  def year(): Double = js.native
  def year(value: Double): Dayjs = js.native
}

