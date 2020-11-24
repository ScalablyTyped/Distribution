package typings.dateFp

import typings.dateFp.dateFpStrings.date
import typings.dateFp.dateFpStrings.day
import typings.dateFp.dateFpStrings.days
import typings.dateFp.dateFpStrings.hours
import typings.dateFp.dateFpStrings.milliseconds
import typings.dateFp.dateFpStrings.minutes
import typings.dateFp.dateFpStrings.month
import typings.dateFp.dateFpStrings.months
import typings.dateFp.dateFpStrings.seconds
import typings.dateFp.dateFpStrings.week
import typings.dateFp.dateFpStrings.year
import typings.dateFp.dateFpStrings.years
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("add")
  def add_days(unit: days, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_hours(unit: hours, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_milliseconds(unit: milliseconds, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_minutes(unit: minutes, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_months(unit: months, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_seconds(unit: seconds, value: Double, date: Date): Date = js.native
  @JSName("add")
  def add_years(unit: years, value: Double, date: Date): Date = js.native
  
  def clone(date: Date): Date = js.native
  
  @JSName("convertTo")
  def convertTo_days(unit: days, date: Date): Double = js.native
  @JSName("convertTo")
  def convertTo_hours(unit: hours, date: Date): Double = js.native
  @JSName("convertTo")
  def convertTo_milliseconds(unit: milliseconds, date: Date): Double = js.native
  @JSName("convertTo")
  def convertTo_minutes(unit: minutes, date: Date): Double = js.native
  @JSName("convertTo")
  def convertTo_seconds(unit: seconds, date: Date): Double = js.native
  
  @JSName("diff")
  def diff_days(unit: days, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_hours(unit: hours, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_milliseconds(unit: milliseconds, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_minutes(unit: minutes, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_months(unit: months, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_seconds(unit: seconds, a: Date, b: Date): Double = js.native
  @JSName("diff")
  def diff_years(unit: years, a: Date, b: Date): Double = js.native
  
  def equals(a: Date, b: Date): Boolean = js.native
  
  def format(format: String, date: Date): String = js.native
  
  def fromTime(time: Double): Date = js.native
  
  @JSName("get")
  def get_date(property: date, date: Date): Double = js.native
  @JSName("get")
  def get_day(property: day, date: Date): Double = js.native
  @JSName("get")
  def get_hours(property: hours, date: Date): Double = js.native
  @JSName("get")
  def get_milliseconds(property: milliseconds, date: Date): Double = js.native
  @JSName("get")
  def get_minutes(property: minutes, date: Date): Double = js.native
  @JSName("get")
  def get_month(property: month, date: Date): Double = js.native
  @JSName("get")
  def get_seconds(property: seconds, date: Date): Double = js.native
  @JSName("get")
  def get_week(property: week, date: Date): Double = js.native
  @JSName("get")
  def get_year(property: year, date: Date): Double = js.native
  
  def isLeapYear(date: Date): Boolean = js.native
  
  def isValid(date: Date): Boolean = js.native
  
  def max(dates: js.Array[Date]): Date = js.native
  
  def min(dates: js.Array[Date]): Date = js.native
  
  def of(dateParts: js.Array[Double]): Date = js.native
  
  def parse(format: String, date: String): Date = js.native
  
  @JSName("set")
  def set_date(property: date, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_hours(property: hours, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_milliseconds(property: milliseconds, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_minutes(property: minutes, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_month(property: month, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_seconds(property: seconds, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_week(property: week, value: Double, date: Date): Date = js.native
  @JSName("set")
  def set_year(property: year, value: Double, date: Date): Date = js.native
  
  @JSName("sub")
  def sub_days(unit: days, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_hours(unit: hours, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_milliseconds(unit: milliseconds, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_minutes(unit: minutes, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_months(unit: months, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_seconds(unit: seconds, value: Double, date: Date): Date = js.native
  @JSName("sub")
  def sub_years(unit: years, value: Double, date: Date): Date = js.native
  
  def unixTime(date: Date): Double = js.native
}
