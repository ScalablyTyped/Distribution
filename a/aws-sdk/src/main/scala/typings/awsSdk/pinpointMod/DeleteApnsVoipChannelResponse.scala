package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApnsVoipChannelResponse extends StObject {
  
  var APNSVoipChannelResponse: typings.awsSdk.pinpointMod.APNSVoipChannelResponse = js.native
}
object DeleteApnsVoipChannelResponse {
  
  @scala.inline
  def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): DeleteApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsVoipChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteApnsVoipChannelResponseMutableBuilder[Self <: DeleteApnsVoipChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = StObject.set(x, "APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
