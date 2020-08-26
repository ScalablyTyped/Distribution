package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetadataRequest extends js.Object {
  /**
    * ARN of the channel into which metadata is inserted. This channel must have an active stream.
    */
  var channelArn: ChannelArn = js.native
  /**
    * Metadata to insert into the stream. Maximum: 1 KB per request.
    */
  var metadata: StreamMetadata = js.native
}

object PutMetadataRequest {
  @scala.inline
  def apply(channelArn: ChannelArn, metadata: StreamMetadata): PutMetadataRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetadataRequest]
  }
  @scala.inline
  implicit class PutMetadataRequestOps[Self <: PutMetadataRequest] (val x: Self) extends AnyVal {
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
    def setMetadata(value: StreamMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

