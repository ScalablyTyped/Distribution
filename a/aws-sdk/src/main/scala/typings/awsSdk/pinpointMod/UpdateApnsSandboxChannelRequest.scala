package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsSandboxChannelRequest extends StObject {
  
  var APNSSandboxChannelRequest: typings.awsSdk.pinpointMod.APNSSandboxChannelRequest = js.native
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}
object UpdateApnsSandboxChannelRequest {
  
  @scala.inline
  def apply(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: string): UpdateApnsSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateApnsSandboxChannelRequestMutableBuilder[Self <: UpdateApnsSandboxChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSSandboxChannelRequest(value: APNSSandboxChannelRequest): Self = StObject.set(x, "APNSSandboxChannelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
