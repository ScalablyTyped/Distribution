package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChatContactResponse extends js.Object {
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectMod.ContactId] = js.native
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectMod.ParticipantId] = js.native
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typings.awsSdk.connectMod.ParticipantToken] = js.native
}

object StartChatContactResponse {
  @scala.inline
  def apply(
    ContactId: ContactId = null,
    ParticipantId: ParticipantId = null,
    ParticipantToken: ParticipantToken = null
  ): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactId != null) __obj.updateDynamic("ContactId")(ContactId.asInstanceOf[js.Any])
    if (ParticipantId != null) __obj.updateDynamic("ParticipantId")(ParticipantId.asInstanceOf[js.Any])
    if (ParticipantToken != null) __obj.updateDynamic("ParticipantToken")(ParticipantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChatContactResponse]
  }
}

