package typings.dateArithmetic

import typings.dateArithmetic.dateArithmeticStrings.week
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-arithmetic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def century(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def century(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def date(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def date(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def day(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def day(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def decade(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decade(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def diff(date1: js.Date, date2: js.Date, unit: Unit): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def diff(date1: js.Date, date2: js.Date, unit: Unit, asFloat: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], asFloat.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def endOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def endOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def eq_(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def hours(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def inRange(day: js.Date, min: js.Date, max: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def inRange(day: js.Date, min: js.Date, max: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def max(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
  
  inline def milliseconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def milliseconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def min(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
  
  inline def minutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minutes(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def month(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def month(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def neq(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def seconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def seconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def startOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def startOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subtract(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def weekday(date: js.Date, value: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def weekday(date: js.Date, value: js.Date, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def year(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def year(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dateArithmetic.dateArithmeticInts.`0`
    - typings.dateArithmetic.dateArithmeticInts.`1`
    - typings.dateArithmetic.dateArithmeticInts.`2`
    - typings.dateArithmetic.dateArithmeticInts.`3`
    - typings.dateArithmetic.dateArithmeticInts.`4`
    - typings.dateArithmetic.dateArithmeticInts.`5`
    - typings.dateArithmetic.dateArithmeticInts.`6`
  */
  trait StartOfWeek extends StObject
  object StartOfWeek {
    
    inline def `0`: typings.dateArithmetic.dateArithmeticInts.`0` = 0.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`0`]
    
    inline def `1`: typings.dateArithmetic.dateArithmeticInts.`1` = 1.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`1`]
    
    inline def `2`: typings.dateArithmetic.dateArithmeticInts.`2` = 2.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`2`]
    
    inline def `3`: typings.dateArithmetic.dateArithmeticInts.`3` = 3.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`3`]
    
    inline def `4`: typings.dateArithmetic.dateArithmeticInts.`4` = 4.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`4`]
    
    inline def `5`: typings.dateArithmetic.dateArithmeticInts.`5` = 5.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`5`]
    
    inline def `6`: typings.dateArithmetic.dateArithmeticInts.`6` = 6.asInstanceOf[typings.dateArithmetic.dateArithmeticInts.`6`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dateArithmetic.dateArithmeticStrings.milliseconds
    - typings.dateArithmetic.dateArithmeticStrings.seconds
    - typings.dateArithmetic.dateArithmeticStrings.minutes
    - typings.dateArithmetic.dateArithmeticStrings.hours
    - typings.dateArithmetic.dateArithmeticStrings.day
    - typings.dateArithmetic.dateArithmeticStrings.week
    - typings.dateArithmetic.dateArithmeticStrings.month
    - typings.dateArithmetic.dateArithmeticStrings.year
    - typings.dateArithmetic.dateArithmeticStrings.decade
    - typings.dateArithmetic.dateArithmeticStrings.century
  */
  trait Unit extends StObject
  object Unit {
    
    inline def century: typings.dateArithmetic.dateArithmeticStrings.century = "century".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.century]
    
    inline def day: typings.dateArithmetic.dateArithmeticStrings.day = "day".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.day]
    
    inline def decade: typings.dateArithmetic.dateArithmeticStrings.decade = "decade".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.decade]
    
    inline def hours: typings.dateArithmetic.dateArithmeticStrings.hours = "hours".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.hours]
    
    inline def milliseconds: typings.dateArithmetic.dateArithmeticStrings.milliseconds = "milliseconds".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.milliseconds]
    
    inline def minutes: typings.dateArithmetic.dateArithmeticStrings.minutes = "minutes".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.minutes]
    
    inline def month: typings.dateArithmetic.dateArithmeticStrings.month = "month".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.month]
    
    inline def seconds: typings.dateArithmetic.dateArithmeticStrings.seconds = "seconds".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.seconds]
    
    inline def week: typings.dateArithmetic.dateArithmeticStrings.week = "week".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.week]
    
    inline def year: typings.dateArithmetic.dateArithmeticStrings.year = "year".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.year]
  }
}
