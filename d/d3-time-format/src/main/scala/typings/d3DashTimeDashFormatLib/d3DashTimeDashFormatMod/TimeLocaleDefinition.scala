package typings
package d3DashTimeDashFormatLib.d3DashTimeDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLocaleDefinition extends js.Object {
  /**
    * The date (%x) format specifier (e.g., "%m/%d/%Y").
    */
  var date: java.lang.String
  /**
    * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
    */
  var dateTime: java.lang.String
  /**
    * The full names of the weekdays, starting with Sunday.
    */
  var days: js.Tuple7[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    * The full names of the months (starting with January).
    */
  var months: js.Tuple12[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
    */
  var periods: js.Tuple2[java.lang.String, java.lang.String]
  /**
    * The abbreviated names of the weekdays, starting with Sunday.
    */
  var shortDays: js.Tuple7[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    * the abbreviated names of the months (starting with January).
    */
  var shortMonths: js.Tuple12[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    *  The time (%X) format specifier (e.g., "%H:%M:%S").
    */
  var time: java.lang.String
}

object TimeLocaleDefinition {
  @scala.inline
  def apply(
    date: java.lang.String,
    dateTime: java.lang.String,
    days: js.Tuple7[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ],
    months: js.Tuple12[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ],
    periods: js.Tuple2[java.lang.String, java.lang.String],
    shortDays: js.Tuple7[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ],
    shortMonths: js.Tuple12[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ],
    time: java.lang.String
  ): TimeLocaleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("dateTime")(dateTime)
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("periods")(periods)
    __obj.updateDynamic("shortDays")(shortDays)
    __obj.updateDynamic("shortMonths")(shortMonths)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[TimeLocaleDefinition]
  }
}

