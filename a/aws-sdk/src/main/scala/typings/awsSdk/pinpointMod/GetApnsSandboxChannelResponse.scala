package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSSandboxChannelResponse
}
object GetApnsSandboxChannelResponse {
  
  @scala.inline
  def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): GetApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsSandboxChannelResponse]
  }
  
  @scala.inline
  implicit class GetApnsSandboxChannelResponseMutableBuilder[Self <: GetApnsSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
