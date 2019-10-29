package typings.dayjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.dayjs.dayjsMod.ConfigType
import typings.dayjs.dayjsMod.Dayjs
import typings.dayjs.dayjsMod.OpUnitType
import typings.dayjs.dayjsMod.OptionType
import typings.dayjs.dayjsMod.PluginFunc
import typings.dayjs.dayjsMod.QUnitType
import typings.dayjs.dayjsMod.UnitType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsMod.UnitType
    - typings.dayjs.dayjsStrings.week
    - typings.dayjs.dayjsStrings.w
  */
  trait OpUnitType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsMod.UnitType
    - typings.dayjs.dayjsStrings.quarter
    - typings.dayjs.dayjsStrings.Q
  */
  trait QUnitType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.millisecond
    - typings.dayjs.dayjsStrings.second
    - typings.dayjs.dayjsStrings.minute
    - typings.dayjs.dayjsStrings.hour
    - typings.dayjs.dayjsStrings.day
    - typings.dayjs.dayjsStrings.month
    - typings.dayjs.dayjsStrings.year
    - typings.dayjs.dayjsStrings.date
    - typings.dayjs.dayjsMod.UnitTypeShort
  */
  trait UnitType
    extends OpUnitType
       with QUnitType
  
  /* Rewritten from type alias, can be one of: 
    - typings.dayjs.dayjsStrings.d
    - typings.dayjs.dayjsStrings.M
    - typings.dayjs.dayjsStrings.y
    - typings.dayjs.dayjsStrings.h
    - typings.dayjs.dayjsStrings.m
    - typings.dayjs.dayjsStrings.s
    - typings.dayjs.dayjsStrings.ms
  */
  trait UnitTypeShort extends UnitType
  
  def apply(): Dayjs = js.native
  def apply(date: ConfigType): Dayjs = js.native
  def apply(date: ConfigType, option: OptionType): Dayjs = js.native
  def apply(date: ConfigType, option: OptionType, locale: String): Dayjs = js.native
  def extend(plugin: PluginFunc): Dayjs = js.native
  def extend(plugin: PluginFunc, option: js.Any): Dayjs = js.native
  def isDayjs(d: js.Any): /* is dayjs.dayjs.Dayjs */ Boolean = js.native
  def locale(preset: String): String = js.native
  def locale(preset: String, `object`: StringDictionary[js.Any]): String = js.native
  def locale(preset: String, `object`: StringDictionary[js.Any], isLocal: Boolean): String = js.native
  def locale(preset: Anon_Key): String = js.native
  def locale(preset: Anon_Key, `object`: StringDictionary[js.Any]): String = js.native
  def locale(preset: Anon_Key, `object`: StringDictionary[js.Any], isLocal: Boolean): String = js.native
  def unix(t: Double): Dayjs = js.native
  @js.native
  object Ls
    extends /* key */ StringDictionary[StringDictionary[js.Any]]
  
  type ConfigType = String | Double | Date | Dayjs
  type OptionType = Anon_Format | String
  type PluginFunc = js.Function3[
    /* option */ js.Any, 
    /* c */ Instantiable1[js.UndefOr[/* config */ ConfigType], Dayjs], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    Unit
  ]
}

