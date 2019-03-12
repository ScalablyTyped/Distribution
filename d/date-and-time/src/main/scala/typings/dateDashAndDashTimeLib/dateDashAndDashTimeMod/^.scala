package typings
package dateDashAndDashTimeLib.dateDashAndDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-and-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDays(dateObj: stdLib.Date, days: scala.Double): stdLib.Date = js.native
  def addHours(dateObj: stdLib.Date, hours: scala.Double): stdLib.Date = js.native
  def addMilliseconds(dateObj: stdLib.Date, milliseconds: scala.Double): stdLib.Date = js.native
  def addMinutes(dateObj: stdLib.Date, minutes: scala.Double): stdLib.Date = js.native
  def addMonths(dateObj: stdLib.Date, months: scala.Double): stdLib.Date = js.native
  def addSeconds(dateObj: stdLib.Date, seconds: scala.Double): stdLib.Date = js.native
  def addYears(dateObj: stdLib.Date, years: scala.Double): stdLib.Date = js.native
  def format(dateObj: stdLib.Date, formatString: java.lang.String): java.lang.String = js.native
  def format(dateObj: stdLib.Date, formatString: java.lang.String, utc: scala.Boolean): java.lang.String = js.native
  def getLocales(): js.Any = js.native
  def getLocales(code: java.lang.String): js.Any = js.native
  def isLeapYear(dateObj: stdLib.Date): scala.Boolean = js.native
  def isSameDay(date1: stdLib.Date, date2: stdLib.Date): scala.Boolean = js.native
  def isValid(dateString: java.lang.String, formatString: java.lang.String): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(code: java.lang.String): java.lang.String = js.native
  def parse(dateString: java.lang.String, formatString: java.lang.String): stdLib.Date | scala.Double = js.native
  def parse(dateString: java.lang.String, formatString: java.lang.String, utc: scala.Boolean): stdLib.Date | scala.Double = js.native
  def setLocales(code: java.lang.String, options: js.Any): scala.Unit = js.native
  def subtract(date1: stdLib.Date, date2: stdLib.Date): Subtract = js.native
}

