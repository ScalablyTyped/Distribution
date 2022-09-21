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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-fp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(
    unit: milliseconds | seconds | minutes | hours | days | months | years,
    value: Double,
    date: js.Date
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def clone_(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def convertTo(unit: milliseconds | seconds | minutes | hours | days, date: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTo")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def diff(unit: milliseconds | seconds | minutes | hours | days | months | years, a: js.Date, b: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(unit.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(a: js.Date, b: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def format(format: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromTime(time: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTime")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def get(
    property: milliseconds | seconds | minutes | hours | date | day | week | month | year,
    date: js.Date
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isLeapYear(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def max(dates: js.Array[js.Date]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def min(dates: js.Array[js.Date]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def of(dateParts: js.Array[Double]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(dateParts.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def parse(format: String, date: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def set(
    property: milliseconds | seconds | minutes | hours | date | week | month | year,
    value: Double,
    date: js.Date
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def sub(
    unit: milliseconds | seconds | minutes | hours | days | months | years,
    value: Double,
    date: js.Date
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def unixTime(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unixTime")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
}
