package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSSandboxChannelResponse
}
object DeleteApnsSandboxChannelResponse {
  
  inline def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): DeleteApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsSandboxChannelResponse]
  }
  
  extension [Self <: DeleteApnsSandboxChannelResponse](x: Self) {
    
    inline def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
