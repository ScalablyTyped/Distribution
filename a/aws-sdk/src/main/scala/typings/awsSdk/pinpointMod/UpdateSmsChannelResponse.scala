package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typings.awsSdk.pinpointMod.SMSChannelResponse
}
object UpdateSmsChannelResponse {
  
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): UpdateSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSmsChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateSmsChannelResponseMutableBuilder[Self <: UpdateSmsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}
