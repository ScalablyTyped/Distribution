package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGcmChannelResponse extends StObject {
  
  var GCMChannelResponse: typings.awsSdk.pinpointMod.GCMChannelResponse = js.native
}
object GetGcmChannelResponse {
  
  @scala.inline
  def apply(GCMChannelResponse: GCMChannelResponse): GetGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGcmChannelResponse]
  }
  
  @scala.inline
  implicit class GetGcmChannelResponseMutableBuilder[Self <: GetGcmChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGCMChannelResponse(value: GCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
