package typings.dateArithmetic

import typings.dateArithmetic.dateArithmeticStrings.week
import typings.std.Date
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-arithmetic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(date: Date, num: Double, unit: Unit): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def century(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def century(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def date(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def date(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def day(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def day(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def decade(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decade(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def endOf(date: Date, unit: Unit): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def eq_(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gte(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hours(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def hours(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def lt(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lte(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def milliseconds(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def milliseconds(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def minutes(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minutes(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def month(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def month(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def neq(date: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def seconds(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def seconds(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def startOf_week(date: Date, unit: week, firtOfWeek: StartOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firtOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def startOf_week(date: Date, unit: Exclude[Unit, week]): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def subtract(date: Date, num: Double, unit: Unit): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def weekday(date: Date, value: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def weekday(date: Date, value: Date, firstOfWeek: StartOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def year(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def year(date: Date, value: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dateArithmetic.dateArithmeticNumbers.`0`
    - typings.dateArithmetic.dateArithmeticNumbers.`1`
    - typings.dateArithmetic.dateArithmeticNumbers.`2`
    - typings.dateArithmetic.dateArithmeticNumbers.`3`
    - typings.dateArithmetic.dateArithmeticNumbers.`4`
    - typings.dateArithmetic.dateArithmeticNumbers.`5`
    - typings.dateArithmetic.dateArithmeticNumbers.`6`
  */
  trait StartOfWeek extends StObject
  object StartOfWeek {
    
    inline def `0`: typings.dateArithmetic.dateArithmeticNumbers.`0` = 0.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`0`]
    
    inline def `1`: typings.dateArithmetic.dateArithmeticNumbers.`1` = 1.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`1`]
    
    inline def `2`: typings.dateArithmetic.dateArithmeticNumbers.`2` = 2.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`2`]
    
    inline def `3`: typings.dateArithmetic.dateArithmeticNumbers.`3` = 3.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`3`]
    
    inline def `4`: typings.dateArithmetic.dateArithmeticNumbers.`4` = 4.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`4`]
    
    inline def `5`: typings.dateArithmetic.dateArithmeticNumbers.`5` = 5.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`5`]
    
    inline def `6`: typings.dateArithmetic.dateArithmeticNumbers.`6` = 6.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`6`]
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
