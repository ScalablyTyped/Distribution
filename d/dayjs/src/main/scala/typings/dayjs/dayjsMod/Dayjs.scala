package typings.dayjs.dayjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.dayjs.Anon_Key
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", "Dayjs")
@js.native
class Dayjs () extends js.Object {
  def this(config: ConfigType) = this()
  def add(value: Double, unit: OpUnitType): Dayjs = js.native
  def date(): Double = js.native
  def date(value: Double): Dayjs = js.native
  def day(): Double = js.native
  def day(value: Double): Dayjs = js.native
  def daysInMonth(): Double = js.native
  def diff(date: ConfigType): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType): Double = js.native
  def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
  def diff(date: ConfigType, unit: QUnitType): Double = js.native
  def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
  def endOf(unit: OpUnitType): Dayjs = js.native
  def format(): String = js.native
  def format(template: String): String = js.native
  def get(unit: UnitType): Double = js.native
  def hour(): Double = js.native
  def hour(value: Double): Dayjs = js.native
  def isAfter(date: ConfigType): Boolean = js.native
  def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isBefore(date: ConfigType): Boolean = js.native
  def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isSame(date: ConfigType): Boolean = js.native
  def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
  def isValid(): Boolean = js.native
  def locale(): String = js.native
  def locale(preset: String): Dayjs = js.native
  def locale(preset: String, `object`: StringDictionary[js.Any]): Dayjs = js.native
  def locale(preset: Anon_Key): Dayjs = js.native
  def locale(preset: Anon_Key, `object`: StringDictionary[js.Any]): Dayjs = js.native
  def millisecond(): Double = js.native
  def millisecond(value: Double): Dayjs = js.native
  def minute(): Double = js.native
  def minute(value: Double): Dayjs = js.native
  def month(): Double = js.native
  def month(value: Double): Dayjs = js.native
  def second(): Double = js.native
  def second(value: Double): Dayjs = js.native
  def set(unit: UnitType, value: Double): Dayjs = js.native
  def startOf(unit: OpUnitType): Dayjs = js.native
  def subtract(value: Double, unit: OpUnitType): Dayjs = js.native
  def toDate(): Date = js.native
  def toISOString(): String = js.native
  def toJSON(): String = js.native
  def unix(): Double = js.native
  def utcOffset(): Double = js.native
  def year(): Double = js.native
  def year(value: Double): Dayjs = js.native
}

