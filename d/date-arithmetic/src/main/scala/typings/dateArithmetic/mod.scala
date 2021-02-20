package typings.dateArithmetic

import typings.dateArithmetic.dateArithmeticStrings.week
import typings.std.Date
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-arithmetic", "add")
  @js.native
  def add(date: Date, num: Double, unit: Unit): Date = js.native
  
  @JSImport("date-arithmetic", "century")
  @js.native
  def century(date: Date): Double = js.native
  @JSImport("date-arithmetic", "century")
  @js.native
  def century(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "date")
  @js.native
  def date(date: Date): Double = js.native
  @JSImport("date-arithmetic", "date")
  @js.native
  def date(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "day")
  @js.native
  def day(date: Date): Double = js.native
  @JSImport("date-arithmetic", "day")
  @js.native
  def day(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "decade")
  @js.native
  def decade(date: Date): Double = js.native
  @JSImport("date-arithmetic", "decade")
  @js.native
  def decade(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "endOf")
  @js.native
  def endOf(date: Date, unit: Unit): Date = js.native
  
  @JSImport("date-arithmetic", "eq")
  @js.native
  def eq_(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "gt")
  @js.native
  def gt(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "gte")
  @js.native
  def gte(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "hours")
  @js.native
  def hours(date: Date): Double = js.native
  @JSImport("date-arithmetic", "hours")
  @js.native
  def hours(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "lt")
  @js.native
  def lt(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "lte")
  @js.native
  def lte(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "milliseconds")
  @js.native
  def milliseconds(date: Date): Double = js.native
  @JSImport("date-arithmetic", "milliseconds")
  @js.native
  def milliseconds(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "minutes")
  @js.native
  def minutes(date: Date): Double = js.native
  @JSImport("date-arithmetic", "minutes")
  @js.native
  def minutes(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "month")
  @js.native
  def month(date: Date): Double = js.native
  @JSImport("date-arithmetic", "month")
  @js.native
  def month(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "neq")
  @js.native
  def neq(date: Date, date2: Date): Boolean = js.native
  
  @JSImport("date-arithmetic", "seconds")
  @js.native
  def seconds(date: Date): Double = js.native
  @JSImport("date-arithmetic", "seconds")
  @js.native
  def seconds(date: Date, value: Double): Date = js.native
  
  @JSImport("date-arithmetic", "startOf")
  @js.native
  def startOf_week(date: Date, unit: week, firtOfWeek: StartOfWeek): Date = js.native
  @JSImport("date-arithmetic", "startOf")
  @js.native
  def startOf_week(date: Date, unit: Exclude[Unit, week]): Date = js.native
  
  @JSImport("date-arithmetic", "subtract")
  @js.native
  def subtract(date: Date, num: Double, unit: Unit): Date = js.native
  
  @JSImport("date-arithmetic", "weekday")
  @js.native
  def weekday(date: Date, value: Date): Double = js.native
  @JSImport("date-arithmetic", "weekday")
  @js.native
  def weekday(date: Date, value: Date, firstOfWeek: StartOfWeek): Date = js.native
  
  @JSImport("date-arithmetic", "year")
  @js.native
  def year(date: Date): Double = js.native
  @JSImport("date-arithmetic", "year")
  @js.native
  def year(date: Date, value: Double): Date = js.native
  
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
    
    @scala.inline
    def `0`: typings.dateArithmetic.dateArithmeticNumbers.`0` = 0.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`0`]
    
    @scala.inline
    def `1`: typings.dateArithmetic.dateArithmeticNumbers.`1` = 1.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`1`]
    
    @scala.inline
    def `2`: typings.dateArithmetic.dateArithmeticNumbers.`2` = 2.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`2`]
    
    @scala.inline
    def `3`: typings.dateArithmetic.dateArithmeticNumbers.`3` = 3.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`3`]
    
    @scala.inline
    def `4`: typings.dateArithmetic.dateArithmeticNumbers.`4` = 4.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`4`]
    
    @scala.inline
    def `5`: typings.dateArithmetic.dateArithmeticNumbers.`5` = 5.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`5`]
    
    @scala.inline
    def `6`: typings.dateArithmetic.dateArithmeticNumbers.`6` = 6.asInstanceOf[typings.dateArithmetic.dateArithmeticNumbers.`6`]
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
    
    @scala.inline
    def century: typings.dateArithmetic.dateArithmeticStrings.century = "century".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.century]
    
    @scala.inline
    def day: typings.dateArithmetic.dateArithmeticStrings.day = "day".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.day]
    
    @scala.inline
    def decade: typings.dateArithmetic.dateArithmeticStrings.decade = "decade".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.decade]
    
    @scala.inline
    def hours: typings.dateArithmetic.dateArithmeticStrings.hours = "hours".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.hours]
    
    @scala.inline
    def milliseconds: typings.dateArithmetic.dateArithmeticStrings.milliseconds = "milliseconds".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.milliseconds]
    
    @scala.inline
    def minutes: typings.dateArithmetic.dateArithmeticStrings.minutes = "minutes".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.minutes]
    
    @scala.inline
    def month: typings.dateArithmetic.dateArithmeticStrings.month = "month".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.month]
    
    @scala.inline
    def seconds: typings.dateArithmetic.dateArithmeticStrings.seconds = "seconds".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.seconds]
    
    @scala.inline
    def week: typings.dateArithmetic.dateArithmeticStrings.week = "week".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.week]
    
    @scala.inline
    def year: typings.dateArithmetic.dateArithmeticStrings.year = "year".asInstanceOf[typings.dateArithmetic.dateArithmeticStrings.year]
  }
}
