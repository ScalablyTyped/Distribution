package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointMessageResult extends StObject {
  
  /**
    * The endpoint address that the message was delivered to.
    */
  var Address: js.UndefOr[string] = js.native
  
  /**
    * The delivery status of the message. Possible values are:  DUPLICATE - The endpoint address is a duplicate of another endpoint address. Amazon Pinpoint won't attempt to send the message again. OPT_OUT - The user who's associated with the endpoint has opted out of receiving messages from you. Amazon Pinpoint won't attempt to send the message again. PERMANENT_FAILURE - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.    SUCCESSFUL - The message was successfully delivered to the endpoint. TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint won't attempt to send the message again. THROTTLED - Amazon Pinpoint throttled the operation to send the message to the endpoint. TIMEOUT - The message couldn't be sent within the timeout period. UNKNOWN_FAILURE - An unknown error occurred.
    */
  var DeliveryStatus: typings.awsSdk.pinpointMod.DeliveryStatus = js.native
  
  /**
    * The unique identifier for the message that was sent.
    */
  var MessageId: js.UndefOr[string] = js.native
  
  /**
    * The downstream service status code for delivering the message.
    */
  var StatusCode: integer = js.native
  
  /**
    * The status message for delivering the message.
    */
  var StatusMessage: js.UndefOr[string] = js.native
  
  /**
    * For push notifications that are sent through the GCM channel, specifies whether the endpoint's device registration token was updated as part of delivering the message.
    */
  var UpdatedToken: js.UndefOr[string] = js.native
}
object EndpointMessageResult {
  
  @scala.inline
  def apply(DeliveryStatus: DeliveryStatus, StatusCode: integer): EndpointMessageResult = {
    val __obj = js.Dynamic.literal(DeliveryStatus = DeliveryStatus.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointMessageResult]
  }
  
  @scala.inline
  implicit class EndpointMessageResultMutableBuilder[Self <: EndpointMessageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: string): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setDeliveryStatus(value: DeliveryStatus): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: string): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    @scala.inline
    def setStatusCode(value: integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: string): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setUpdatedToken(value: string): Self = StObject.set(x, "UpdatedToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTokenUndefined: Self = StObject.set(x, "UpdatedToken", js.undefined)
  }
}
