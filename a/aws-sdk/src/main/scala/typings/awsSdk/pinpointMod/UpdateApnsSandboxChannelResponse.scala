package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSSandboxChannelResponse = js.native
}
object UpdateApnsSandboxChannelResponse {
  
  @scala.inline
  def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): UpdateApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsSandboxChannelResponseMutableBuilder[Self <: UpdateApnsSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
