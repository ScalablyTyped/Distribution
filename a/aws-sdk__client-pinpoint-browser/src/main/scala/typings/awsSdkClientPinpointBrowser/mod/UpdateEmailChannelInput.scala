package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod.EmailChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
object UpdateEmailChannelInput {
  
  @scala.inline
  def apply(ApplicationId: String, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelInput]
  }
}
