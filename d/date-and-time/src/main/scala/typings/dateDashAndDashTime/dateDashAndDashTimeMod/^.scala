package typings.dateDashAndDashTime.dateDashAndDashTimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-and-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def subtract(date1: Date, date2: Date): Subtract = js.native
}

