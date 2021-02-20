package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSSandboxChannelResponse = js.native
}
object DeleteApnsSandboxChannelResponse {
  
  @scala.inline
  def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): DeleteApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsSandboxChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteApnsSandboxChannelResponseMutableBuilder[Self <: DeleteApnsSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
