package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelResponse extends js.Object {
  /**
    * The ARN of the channel.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateChannelResponse {
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  @scala.inline
  implicit class CreateChannelResponseOps[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
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
    def setChannelArn(value: ChannelArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelArn: Self = this.set("channelArn", js.undefined)
    @scala.inline
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
  }
  
}

