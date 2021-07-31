package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPlatformApplicationAttributesInput extends StObject {
  
  /**
    * A map of the platform application attributes. Attributes in this map include the following:    PlatformCredential – The credential received from the notification service. For APNS and APNS_SANDBOX, PlatformCredential is private key. For GCM (Firebase Cloud Messaging), PlatformCredential is API key. For ADM, PlatformCredential is client secret.    PlatformPrincipal – The principal received from the notification service. For APNS and APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM (Firebase Cloud Messaging), there is no PlatformPrincipal. For ADM, PlatformPrincipal is client id.    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications are sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications are sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications are sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications are sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.    SuccessFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    FailureFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    SuccessFeedbackSampleRate – Sample rate percentage (0-100) of successfully delivered messages.  
    */
  var Attributes: MapStringToString
  
  /**
    * PlatformApplicationArn for SetPlatformApplicationAttributes action.
    */
  var PlatformApplicationArn: String
}
object SetPlatformApplicationAttributesInput {
  
  @scala.inline
  def apply(Attributes: MapStringToString, PlatformApplicationArn: String): SetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
  }
  
  @scala.inline
  implicit class SetPlatformApplicationAttributesInputMutableBuilder[Self <: SetPlatformApplicationAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
