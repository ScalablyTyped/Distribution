package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointsBatchRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var EndpointBatchRequest: typings.awsSdk.pinpointMod.EndpointBatchRequest = js.native
}
object UpdateEndpointsBatchRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EndpointBatchRequest: EndpointBatchRequest): UpdateEndpointsBatchRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointsBatchRequest]
  }
  
  @scala.inline
  implicit class UpdateEndpointsBatchRequestMutableBuilder[Self <: UpdateEndpointsBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointBatchRequest(value: EndpointBatchRequest): Self = StObject.set(x, "EndpointBatchRequest", value.asInstanceOf[js.Any])
  }
}
