package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGcmChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var GCMChannelRequest: typings.awsSdk.pinpointMod.GCMChannelRequest
}
object UpdateGcmChannelRequest {
  
  @scala.inline
  def apply(ApplicationId: string, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateGcmChannelRequestMutableBuilder[Self <: UpdateGcmChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCMChannelRequest(value: GCMChannelRequest): Self = StObject.set(x, "GCMChannelRequest", value.asInstanceOf[js.Any])
  }
}
