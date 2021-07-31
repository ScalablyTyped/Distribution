package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserEndpointsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the user.
    */
  var UserId: string
}
object GetUserEndpointsRequest {
  
  @scala.inline
  def apply(ApplicationId: string, UserId: string): GetUserEndpointsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsRequest]
  }
  
  @scala.inline
  implicit class GetUserEndpointsRequestMutableBuilder[Self <: GetUserEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: string): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
