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
}

