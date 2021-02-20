package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typings.awsSdk.pinpointMod.SMSChannelResponse = js.native
}
object DeleteSmsChannelResponse {
  
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): DeleteSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteSmsChannelResponseMutableBuilder[Self <: DeleteSmsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}
