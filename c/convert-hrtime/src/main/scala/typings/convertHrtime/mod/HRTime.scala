package typings.convertHrtime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HRTime extends js.Object {
  var milliseconds: Double = js.native
  var nanoseconds: Double = js.native
  var seconds: Double = js.native
}

object HRTime {
  @scala.inline
  def apply(milliseconds: Double, nanoseconds: Double, seconds: Double): HRTime = {
    val __obj = js.Dynamic.literal(milliseconds = milliseconds.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HRTime]
  }
  @scala.inline
  implicit class HRTimeOps[Self <: HRTime] (val x: Self) extends AnyVal {
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
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNanoseconds(value: Double): Self = this.set("nanoseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
  
}

