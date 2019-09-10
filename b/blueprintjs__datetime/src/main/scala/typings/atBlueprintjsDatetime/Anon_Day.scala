package typings.atBlueprintjsDatetime

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Day extends js.Object {
  def formatDay(day: Date): String = js.native
  def formatDay(day: Date, locale: String): String = js.native
  def formatMonthTitle(month: Date): String = js.native
  def formatMonthTitle(month: Date, locale: String): String = js.native
  def formatWeekdayLong(weekday: Double): String = js.native
  def formatWeekdayLong(weekday: Double, locale: String): String = js.native
  def formatWeekdayShort(weekday: Double): String = js.native
  def formatWeekdayShort(weekday: Double, locale: String): String = js.native
  def getFirstDayOfWeek(): Double = js.native
  def getFirstDayOfWeek(locale: String): Double = js.native
  def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
}

