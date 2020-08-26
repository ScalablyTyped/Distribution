package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEventRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The content of the event to be sent (for example, message text). This is not yet supported.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  /**
    * The content type of the request. Supported types are:   application/vnd.amazonaws.connect.event.typing   application/vnd.amazonaws.connect.event.connection.acknowledged  
    */
  var ContentType: ChatContentType = js.native
}

object SendEventRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, ContentType: ChatContentType): SendEventRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  @scala.inline
  implicit class SendEventRequestOps[Self <: SendEventRequest] (val x: Self) extends AnyVal {
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
    def setConnectionToken(value: ParticipantToken): Self = this.set("ConnectionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: ChatContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setContent(value: ChatContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
  }
  
}

