package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipChannelResponse extends StObject {
  
  var APNSVoipChannelResponse: typings.awsSdk.pinpointMod.APNSVoipChannelResponse
}
object UpdateApnsVoipChannelResponse {
  
  @scala.inline
  def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): UpdateApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipChannelResponseMutableBuilder[Self <: UpdateApnsVoipChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = StObject.set(x, "APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
