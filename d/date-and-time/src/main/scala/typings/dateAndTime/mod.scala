package typings.dateAndTime

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-and-time", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Subtract_ extends js.Object {
    @JSName("toDays")
    var toDays_Original: getDelta = js.native
    @JSName("toHours")
    var toHours_Original: getDelta = js.native
    @JSName("toMilliseconds")
    var toMilliseconds_Original: getDelta = js.native
    @JSName("toMinutes")
    var toMinutes_Original: getDelta = js.native
    @JSName("toSeconds")
    var toSeconds_Original: getDelta = js.native
    def toDays(): Double = js.native
    def toHours(): Double = js.native
    def toMilliseconds(): Double = js.native
    def toMinutes(): Double = js.native
    def toSeconds(): Double = js.native
  }
  
  def addDays(dateObj: Date, days: Double): Date = js.native
  def addHours(dateObj: Date, hours: Double): Date = js.native
  def addMilliseconds(dateObj: Date, milliseconds: Double): Date = js.native
  def addMinutes(dateObj: Date, minutes: Double): Date = js.native
  def addMonths(dateObj: Date, months: Double): Date = js.native
  def addSeconds(dateObj: Date, seconds: Double): Date = js.native
  def addYears(dateObj: Date, years: Double): Date = js.native
  def format(dateObj: Date, formatString: String): String = js.native
  def format(dateObj: Date, formatString: String, utc: Boolean): String = js.native
  def getLocales(): js.Any = js.native
  def getLocales(code: String): js.Any = js.native
  def isLeapYear(dateObj: Date): Boolean = js.native
  def isSameDay(date1: Date, date2: Date): Boolean = js.native
  def isValid(dateString: String, formatString: String): Boolean = js.native
  def locale(): String = js.native
  def locale(code: String): String = js.native
  def parse(dateString: String, formatString: String): Date | Double = js.native
  def parse(dateString: String, formatString: String, utc: Boolean): Date | Double = js.native
  def setLocales(code: String, options: js.Any): Unit = js.native
  def subtract(date1: Date, date2: Date): Subtract_ = js.native
  type getDelta = js.Function0[Double]
}

