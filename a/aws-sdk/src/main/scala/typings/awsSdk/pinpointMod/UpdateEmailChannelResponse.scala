package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse
}
object UpdateEmailChannelResponse {
  
  inline def apply(EmailChannelResponse: EmailChannelResponse): UpdateEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelResponse]
  }
  
  extension [Self <: UpdateEmailChannelResponse](x: Self) {
    
    inline def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}
