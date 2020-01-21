package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeAuthorizationMessageRequest extends js.Object {
  /**
    * The encoded message that was returned with the response.
    */
  var EncodedMessage: encodedMessageType = js.native
}

object DecodeAuthorizationMessageRequest {
  @scala.inline
  def apply(EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal(EncodedMessage = EncodedMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
}

