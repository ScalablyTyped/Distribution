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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-fp", "add")
  @js.native
  def add_days(unit: days, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_hours(unit: hours, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_milliseconds(unit: milliseconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_minutes(unit: minutes, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_months(unit: months, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_seconds(unit: seconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_years(unit: years, value: Double, date: Date): Date = js.native
  
  @JSImport("date-fp", "clone")
  @js.native
  def clone_(date: Date): Date = js.native
  
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_days(unit: days, date: Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_hours(unit: hours, date: Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_milliseconds(unit: milliseconds, date: Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_minutes(unit: minutes, date: Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_seconds(unit: seconds, date: Date): Double = js.native
  
  @JSImport("date-fp", "diff")
  @js.native
  def diff_days(unit: days, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_hours(unit: hours, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_milliseconds(unit: milliseconds, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_minutes(unit: minutes, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_months(unit: months, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_seconds(unit: seconds, a: Date, b: Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_years(unit: years, a: Date, b: Date): Double = js.native
  
  @JSImport("date-fp", "equals")
  @js.native
  def equals_(a: Date, b: Date): Boolean = js.native
  
  @JSImport("date-fp", "format")
  @js.native
  def format(format: String, date: Date): String = js.native
  
  @JSImport("date-fp", "fromTime")
  @js.native
  def fromTime(time: Double): Date = js.native
  
  @JSImport("date-fp", "get")
  @js.native
  def get_date(property: date, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_day(property: day, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_hours(property: hours, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_milliseconds(property: milliseconds, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_minutes(property: minutes, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_month(property: month, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_seconds(property: seconds, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_week(property: week, date: Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_year(property: year, date: Date): Double = js.native
  
  @JSImport("date-fp", "isLeapYear")
  @js.native
  def isLeapYear(date: Date): Boolean = js.native
  
  @JSImport("date-fp", "isValid")
  @js.native
  def isValid(date: Date): Boolean = js.native
  
  @JSImport("date-fp", "max")
  @js.native
  def max(dates: js.Array[Date]): Date = js.native
  
  @JSImport("date-fp", "min")
  @js.native
  def min(dates: js.Array[Date]): Date = js.native
  
  @JSImport("date-fp", "of")
  @js.native
  def of(dateParts: js.Array[Double]): Date = js.native
  
  @JSImport("date-fp", "parse")
  @js.native
  def parse(format: String, date: String): Date = js.native
  
  @JSImport("date-fp", "set")
  @js.native
  def set_date(property: date, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_hours(property: hours, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_milliseconds(property: milliseconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_minutes(property: minutes, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_month(property: month, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_seconds(property: seconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_week(property: week, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_year(property: year, value: Double, date: Date): Date = js.native
  
  @JSImport("date-fp", "sub")
  @js.native
  def sub_days(unit: days, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_hours(unit: hours, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_milliseconds(unit: milliseconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_minutes(unit: minutes, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_months(unit: months, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_seconds(unit: seconds, value: Double, date: Date): Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_years(unit: years, value: Double, date: Date): Date = js.native
  
  @JSImport("date-fp", "unixTime")
  @js.native
  def unixTime(date: Date): Double = js.native
}
