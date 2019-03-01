package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Date returned by stringToDate */
trait GlobalizationDate extends js.Object {
  /* The day from (1-31). */
  var day: scala.Double
  /* The hour from (0-23). */
  var hour: scala.Double
  /* The milliseconds (from 0-999), not available on all platforms. */
  var millisecond: scala.Double
  /* The minute from (0-59). */
  var minute: scala.Double
  /* The month from (0-11). */
  var month: scala.Double
  /* The second from (0-59). */
  var second: scala.Double
  /* The four digit year. */
  var year: scala.Double
}

object GlobalizationDate {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    millisecond: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    year: scala.Double
  ): GlobalizationDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("hour")(hour)
    __obj.updateDynamic("millisecond")(millisecond)
    __obj.updateDynamic("minute")(minute)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[GlobalizationDate]
  }
}

