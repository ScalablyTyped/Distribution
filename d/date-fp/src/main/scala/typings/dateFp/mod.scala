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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-fp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add_days(unit: days, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_hours(unit: hours, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_milliseconds(unit: milliseconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_minutes(unit: minutes, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_months(unit: months, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_seconds(unit: seconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def add_years(unit: years, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def clone_(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def convertTo_days(unit: days, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertTo_hours(unit: hours, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertTo_milliseconds(unit: milliseconds, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertTo_minutes(unit: minutes, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertTo_seconds(unit: seconds, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_days(unit: days, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_hours(unit: hours, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_milliseconds(unit: milliseconds, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_minutes(unit: minutes, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_months(unit: months, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_seconds(unit: seconds, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff_years(unit: years, a: Date, b: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(a: Date, b: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def format(format: String, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromTime(time: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTime")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def get_date(property: date, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_day(property: day, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_hours(property: hours, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_milliseconds(property: milliseconds, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_minutes(property: minutes, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_month(property: month, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_seconds(property: seconds, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_week(property: week, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get_year(property: year, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isLeapYear(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def max(dates: js.Array[Date]): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dates.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def min(dates: js.Array[Date]): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dates.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def of(dateParts: js.Array[Double]): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(dateParts.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def parse(format: String, date: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_date(property: date, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_hours(property: hours, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_milliseconds(property: milliseconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_minutes(property: minutes, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_month(property: month, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_seconds(property: seconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_week(property: week, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def set_year(property: year, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_days(unit: days, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_hours(unit: hours, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_milliseconds(unit: milliseconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_minutes(unit: minutes, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_months(unit: months, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_seconds(unit: seconds, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def sub_years(unit: years, value: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def unixTime(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
}
