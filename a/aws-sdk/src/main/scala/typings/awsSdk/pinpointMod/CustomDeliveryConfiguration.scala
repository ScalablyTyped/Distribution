package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDeliveryConfiguration extends StObject {
  
  /**
    * The destination to send the campaign or treatment to. This value can be one of the following: The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or treatment. The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a full URL, including the HTTPS protocol. 
    */
  var DeliveryUri: string
  
  /**
    * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you can associate with an endpoint by using the ChannelType property of an endpoint.
    */
  var EndpointTypes: js.UndefOr[ListOfEndpointTypesElement] = js.undefined
}
object CustomDeliveryConfiguration {
  
  @scala.inline
  def apply(DeliveryUri: string): CustomDeliveryConfiguration = {
    val __obj = js.Dynamic.literal(DeliveryUri = DeliveryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDeliveryConfiguration]
  }
  
  @scala.inline
  implicit class CustomDeliveryConfigurationMutableBuilder[Self <: CustomDeliveryConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryUri(value: string): Self = StObject.set(x, "DeliveryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypes(value: ListOfEndpointTypesElement): Self = StObject.set(x, "EndpointTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypesUndefined: Self = StObject.set(x, "EndpointTypes", js.undefined)
    
    @scala.inline
    def setEndpointTypesVarargs(value: EndpointTypesElement*): Self = StObject.set(x, "EndpointTypes", js.Array(value :_*))
  }
}
