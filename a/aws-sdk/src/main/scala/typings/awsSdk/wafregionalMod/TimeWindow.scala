package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeWindow extends js.Object {
  /**
    * The end of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. You must specify the date and time in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var EndTime: Timestamp = js.native
  /**
    * The beginning of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. You must specify the date and time in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var StartTime: Timestamp = js.native
}

object TimeWindow {
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): TimeWindow = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeWindow]
  }
  @scala.inline
  implicit class TimeWindowOps[Self <: TimeWindow] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
  }
  
}

