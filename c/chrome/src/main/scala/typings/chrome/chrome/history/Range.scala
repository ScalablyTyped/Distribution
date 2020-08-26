package typings.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  /** Items added to history before this date, represented in milliseconds since the epoch. */
  var endTime: Double = js.native
  /** Items added to history after this date, represented in milliseconds since the epoch. */
  var startTime: Double = js.native
}

object Range {
  @scala.inline
  def apply(endTime: Double, startTime: Double): Range = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

