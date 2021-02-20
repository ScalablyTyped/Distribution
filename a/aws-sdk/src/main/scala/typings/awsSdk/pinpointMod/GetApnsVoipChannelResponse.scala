package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApnsVoipChannelResponse extends StObject {
  
  var APNSVoipChannelResponse: typings.awsSdk.pinpointMod.APNSVoipChannelResponse = js.native
}
object GetApnsVoipChannelResponse {
  
  @scala.inline
  def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): GetApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsVoipChannelResponse]
  }
  
  @scala.inline
  implicit class GetApnsVoipChannelResponseMutableBuilder[Self <: GetApnsVoipChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = StObject.set(x, "APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
