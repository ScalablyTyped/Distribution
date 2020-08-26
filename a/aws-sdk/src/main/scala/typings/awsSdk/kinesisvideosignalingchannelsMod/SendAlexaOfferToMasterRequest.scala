package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAlexaOfferToMasterRequest extends js.Object {
  /**
    * The ARN of the signaling channel by which Alexa and the master peer communicate.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * The base64-encoded SDP offer content.
    */
  var MessagePayload: typings.awsSdk.kinesisvideosignalingchannelsMod.MessagePayload = js.native
  /**
    * The unique identifier for the sender client.
    */
  var SenderClientId: ClientId = js.native
}

object SendAlexaOfferToMasterRequest {
  @scala.inline
  def apply(ChannelARN: ResourceARN, MessagePayload: MessagePayload, SenderClientId: ClientId): SendAlexaOfferToMasterRequest = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], MessagePayload = MessagePayload.asInstanceOf[js.Any], SenderClientId = SenderClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAlexaOfferToMasterRequest]
  }
  @scala.inline
  implicit class SendAlexaOfferToMasterRequestOps[Self <: SendAlexaOfferToMasterRequest] (val x: Self) extends AnyVal {
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
    def setChannelARN(value: ResourceARN): Self = this.set("ChannelARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagePayload(value: MessagePayload): Self = this.set("MessagePayload", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderClientId(value: ClientId): Self = this.set("SenderClientId", value.asInstanceOf[js.Any])
  }
  
}

