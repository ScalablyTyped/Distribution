package typings.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Date returned by stringToDate */
@js.native
trait GlobalizationDate extends js.Object {
  /* The day from (1-31). */
  var day: Double = js.native
  /* The hour from (0-23). */
  var hour: Double = js.native
  /* The milliseconds (from 0-999), not available on all platforms. */
  var millisecond: Double = js.native
  /* The minute from (0-59). */
  var minute: Double = js.native
  /* The month from (0-11). */
  var month: Double = js.native
  /* The second from (0-59). */
  var second: Double = js.native
  /* The four digit year. */
  var year: Double = js.native
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
  @scala.inline
  implicit class GlobalizationDateOps[Self <: GlobalizationDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

