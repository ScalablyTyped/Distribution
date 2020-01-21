package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChatContactRequest extends js.Object {
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes.  There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsSdk.connectMod.Attributes] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectMod.ClientToken] = js.native
  /**
    * The identifier of the contact flow for the chat.
    */
  var ContactFlowId: typings.awsSdk.connectMod.ContactFlowId = js.native
  /**
    * The initial message to be sent to the newly created chat.
    */
  var InitialMessage: js.UndefOr[ChatMessage] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * Information identifying the participant.
    */
  var ParticipantDetails: typings.awsSdk.connectMod.ParticipantDetails = js.native
}

object StartChatContactRequest {
  @scala.inline
  def apply(
    ContactFlowId: ContactFlowId,
    InstanceId: InstanceId,
    ParticipantDetails: ParticipantDetails,
    Attributes: Attributes = null,
    ClientToken: ClientToken = null,
    InitialMessage: ChatMessage = null
  ): StartChatContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ParticipantDetails = ParticipantDetails.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (InitialMessage != null) __obj.updateDynamic("InitialMessage")(InitialMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChatContactRequest]
  }
}

