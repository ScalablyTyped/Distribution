package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesSmschannelrequestMod.SMSChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSmsChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
object UpdateSmsChannelInput {
  
  @scala.inline
  def apply(ApplicationId: String, SMSChannelRequest: SMSChannelRequest): UpdateSmsChannelInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSmsChannelInput]
  }
}
