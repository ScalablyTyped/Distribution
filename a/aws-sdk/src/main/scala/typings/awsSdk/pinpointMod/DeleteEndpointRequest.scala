package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string
}
object DeleteEndpointRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EndpointId: string): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointRequestMutableBuilder[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: string): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
