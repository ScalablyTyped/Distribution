package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleChannelDataRequest extends js.Object {
  /**
    * The name of the channel whose message samples are retrieved.
    */
  var channelName: ChannelName = js.native
  /**
    * The end of the time window from which sample messages are retrieved.
    */
  var endTime: js.UndefOr[EndTime] = js.native
  /**
    * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
    */
  var maxMessages: js.UndefOr[MaxMessages] = js.native
  /**
    * The start of the time window from which sample messages are retrieved.
    */
  var startTime: js.UndefOr[StartTime] = js.native
}

object SampleChannelDataRequest {
  @scala.inline
  def apply(channelName: ChannelName): SampleChannelDataRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleChannelDataRequest]
  }
  @scala.inline
  implicit class SampleChannelDataRequestOps[Self <: SampleChannelDataRequest] (val x: Self) extends AnyVal {
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
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: EndTime): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setMaxMessages(value: MaxMessages): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

