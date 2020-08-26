package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamKeySummary extends js.Object {
  /**
    * Stream-key ARN.
    */
  var arn: js.UndefOr[StreamKeyArn] = js.native
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  /**
    * Array of 1-50 maps, each of the form string:string (key:value) 
    */
  var tags: js.UndefOr[Tags] = js.native
}

object StreamKeySummary {
  @scala.inline
  def apply(): StreamKeySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamKeySummary]
  }
  @scala.inline
  implicit class StreamKeySummaryOps[Self <: StreamKeySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: StreamKeyArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelArn: Self = this.set("channelArn", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

