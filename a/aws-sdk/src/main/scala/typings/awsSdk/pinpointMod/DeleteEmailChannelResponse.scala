package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse
}
object DeleteEmailChannelResponse {
  
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): DeleteEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteEmailChannelResponseMutableBuilder[Self <: DeleteEmailChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}
