package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod.ADMChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAdmChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
object UpdateAdmChannelInput {
  
  @scala.inline
  def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: String): UpdateAdmChannelInput = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelInput]
  }
}
