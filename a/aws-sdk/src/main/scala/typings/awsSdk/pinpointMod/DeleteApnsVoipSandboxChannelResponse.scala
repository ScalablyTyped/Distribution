package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApnsVoipSandboxChannelResponse extends StObject {
  
  var APNSVoipSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse
}
object DeleteApnsVoipSandboxChannelResponse {
  
  inline def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): DeleteApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsVoipSandboxChannelResponse]
  }
  
  extension [Self <: DeleteApnsVoipSandboxChannelResponse](x: Self) {
    
    inline def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
