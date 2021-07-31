package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGcmChannelResponse extends StObject {
  
  var GCMChannelResponse: typings.awsSdk.pinpointMod.GCMChannelResponse
}
object UpdateGcmChannelResponse {
  
  @scala.inline
  def apply(GCMChannelResponse: GCMChannelResponse): UpdateGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateGcmChannelResponseMutableBuilder[Self <: UpdateGcmChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGCMChannelResponse(value: GCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
