package typings.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Date returned by stringToDate */
trait GlobalizationDate extends js.Object {
  /* The day from (1-31). */
  var day: Double
  /* The hour from (0-23). */
  var hour: Double
  /* The milliseconds (from 0-999), not available on all platforms. */
  var millisecond: Double
  /* The minute from (0-59). */
  var minute: Double
  /* The month from (0-11). */
  var month: Double
  /* The second from (0-59). */
  var second: Double
  /* The four digit year. */
  var year: Double
}

object GlobalizationDate {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    year: Double
  ): GlobalizationDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalizationDate]
  }
}

