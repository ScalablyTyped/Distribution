package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSummary extends js.Object {
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ChannelArn] = js.native
  /**
    * Channel latency mode. Default: LOW.
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.native
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.native
  /**
    * Array of 1-50 maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.native
}

object ChannelSummary {
  @scala.inline
  def apply(): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSummary]
  }
  @scala.inline
  implicit class ChannelSummaryOps[Self <: ChannelSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ChannelArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setLatencyMode(value: ChannelLatencyMode): Self = this.set("latencyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatencyMode: Self = this.set("latencyMode", js.undefined)
    @scala.inline
    def setName(value: ChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

