package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesApnschannelrequestMod.APNSChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
object UpdateApnsChannelInput {
  
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: String): UpdateApnsChannelInput = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelInput]
  }
}
