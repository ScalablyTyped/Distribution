package typings.d3DashTimeDashFormat.d3DashTimeDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLocaleDefinition extends js.Object {
  /**
    * The date (%x) format specifier (e.g., "%m/%d/%Y").
    */
  var date: String
  /**
    * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
    */
  var dateTime: String
  /**
    * The full names of the weekdays, starting with Sunday.
    */
  var days: js.Tuple7[String, String, String, String, String, String, String]
  /**
    * The full names of the months (starting with January).
    */
  var months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  /**
    * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
    */
  var periods: js.Tuple2[String, String]
  /**
    * The abbreviated names of the weekdays, starting with Sunday.
    */
  var shortDays: js.Tuple7[String, String, String, String, String, String, String]
  /**
    * the abbreviated names of the months (starting with January).
    */
  var shortMonths: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  /**
    *  The time (%X) format specifier (e.g., "%H:%M:%S").
    */
  var time: String
}

object TimeLocaleDefinition {
  @scala.inline
  def apply(
    date: String,
    dateTime: String,
    days: js.Tuple7[String, String, String, String, String, String, String],
    months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    periods: js.Tuple2[String, String],
    shortDays: js.Tuple7[String, String, String, String, String, String, String],
    shortMonths: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    time: String
  ): TimeLocaleDefinition = {
    val __obj = js.Dynamic.literal(date = date, dateTime = dateTime, days = days, months = months, periods = periods, shortDays = shortDays, shortMonths = shortMonths, time = time)
  
    __obj.asInstanceOf[TimeLocaleDefinition]
  }
}

