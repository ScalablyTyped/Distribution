package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse = js.native
}
object UpdateEmailChannelResponse {
  
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): UpdateEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateEmailChannelResponseMutableBuilder[Self <: UpdateEmailChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}
