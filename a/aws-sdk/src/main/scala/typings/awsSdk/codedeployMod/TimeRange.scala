package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The end time of the time range.  Specify null to leave the end time open-ended. 
    */
  var end: js.UndefOr[Timestamp] = js.native
  /**
    * The start time of the time range.  Specify null to leave the start time open-ended. 
    */
  var start: js.UndefOr[Timestamp] = js.native
}

object TimeRange {
  @scala.inline
  def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  @scala.inline
  implicit class TimeRangeOps[Self <: TimeRange] (val x: Self) extends AnyVal {
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
    def setEnd(value: Timestamp): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Timestamp): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

