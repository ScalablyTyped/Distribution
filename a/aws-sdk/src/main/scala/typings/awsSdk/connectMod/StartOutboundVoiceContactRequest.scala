package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOutboundVoiceContactRequest extends js.Object {
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsSdk.connectMod.Attributes] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectMod.ClientToken] = js.native
  /**
    * The identifier of the contact flow for the outbound call.
    */
  var ContactFlowId: typings.awsSdk.connectMod.ContactFlowId = js.native
  /**
    * The phone number of the customer, in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify a queue, you must specify a source phone number.
    */
  var QueueId: js.UndefOr[typings.awsSdk.connectMod.QueueId] = js.native
  /**
    * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source phone number, you must specify a queue.
    */
  var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.native
}

object StartOutboundVoiceContactRequest {
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, DestinationPhoneNumber: PhoneNumber, InstanceId: InstanceId): StartOutboundVoiceContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOutboundVoiceContactRequest]
  }
  @scala.inline
  implicit class StartOutboundVoiceContactRequestOps[Self <: StartOutboundVoiceContactRequest] (val x: Self) extends AnyVal {
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
    def setContactFlowId(value: ContactFlowId): Self = this.set("ContactFlowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationPhoneNumber(value: PhoneNumber): Self = this.set("DestinationPhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setQueueId(value: QueueId): Self = this.set("QueueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueId: Self = this.set("QueueId", js.undefined)
    @scala.inline
    def setSourcePhoneNumber(value: PhoneNumber): Self = this.set("SourcePhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePhoneNumber: Self = this.set("SourcePhoneNumber", js.undefined)
  }
  
}

