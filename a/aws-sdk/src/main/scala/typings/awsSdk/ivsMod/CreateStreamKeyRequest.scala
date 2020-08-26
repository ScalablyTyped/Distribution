package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamKeyRequest extends js.Object {
  /**
    * ARN of the channel for which to create the stream key.
    */
  var channelArn: ChannelArn = js.native
  /**
    * See Channel$tags.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateStreamKeyRequest {
  @scala.inline
  def apply(channelArn: ChannelArn): CreateStreamKeyRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamKeyRequest]
  }
  @scala.inline
  implicit class CreateStreamKeyRequestOps[Self <: CreateStreamKeyRequest] (val x: Self) extends AnyVal {
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
    def setChannelArn(value: ChannelArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

