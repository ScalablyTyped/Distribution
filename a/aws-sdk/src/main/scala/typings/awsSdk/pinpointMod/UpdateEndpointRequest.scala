package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string = js.native
  
  var EndpointRequest: typings.awsSdk.pinpointMod.EndpointRequest = js.native
}
object UpdateEndpointRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EndpointId: string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateEndpointRequestMutableBuilder[Self <: UpdateEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: string): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointRequest(value: EndpointRequest): Self = StObject.set(x, "EndpointRequest", value.asInstanceOf[js.Any])
  }
}
