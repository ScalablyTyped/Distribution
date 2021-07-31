package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGcmChannelResponse extends StObject {
  
  var GCMChannelResponse: typings.awsSdk.pinpointMod.GCMChannelResponse
}
object DeleteGcmChannelResponse {
  
  @scala.inline
  def apply(GCMChannelResponse: GCMChannelResponse): DeleteGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGcmChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteGcmChannelResponseMutableBuilder[Self <: DeleteGcmChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGCMChannelResponse(value: GCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
