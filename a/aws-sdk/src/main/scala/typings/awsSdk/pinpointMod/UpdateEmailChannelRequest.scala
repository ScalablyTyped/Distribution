package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmailChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var EmailChannelRequest: typings.awsSdk.pinpointMod.EmailChannelRequest = js.native
}
object UpdateEmailChannelRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateEmailChannelRequestMutableBuilder[Self <: UpdateEmailChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailChannelRequest(value: EmailChannelRequest): Self = StObject.set(x, "EmailChannelRequest", value.asInstanceOf[js.Any])
  }
}
