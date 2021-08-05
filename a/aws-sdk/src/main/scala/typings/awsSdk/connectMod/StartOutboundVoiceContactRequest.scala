package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOutboundVoiceContactRequest extends StObject {
  
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsSdk.connectMod.Attributes] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectMod.ClientToken] = js.undefined
  
  /**
    * The identifier of the contact flow for the outbound call. To see the ContactFlowId in the Amazon Connect console user interface, on the navigation menu go to Routing, Contact Flows. Choose the contact flow. On the contact flow page, under the name of the contact flow, choose Show additional flow information. The ContactFlowId is the last part of the ARN, shown here in bold:  arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/846ec553-a005-41c0-8341-xxxxxxxxxxxx 
    */
  var ContactFlowId: typings.awsSdk.connectMod.ContactFlowId
  
  /**
    * The phone number of the customer, in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify a queue, you must specify a source phone number.
    */
  var QueueId: js.UndefOr[typings.awsSdk.connectMod.QueueId] = js.undefined
  
  /**
    * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source phone number, you must specify a queue.
    */
  var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
}
object StartOutboundVoiceContactRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, DestinationPhoneNumber: PhoneNumber, InstanceId: InstanceId): StartOutboundVoiceContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOutboundVoiceContactRequest]
  }
  
  extension [Self <: StartOutboundVoiceContactRequest](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQueueIdUndefined: Self = StObject.set(x, "QueueId", js.undefined)
    
    inline def setSourcePhoneNumber(value: PhoneNumber): Self = StObject.set(x, "SourcePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSourcePhoneNumberUndefined: Self = StObject.set(x, "SourcePhoneNumber", js.undefined)
  }
}
