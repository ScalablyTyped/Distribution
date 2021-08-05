package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesGcmchannelrequestMod.GCMChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGcmChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
object UpdateGcmChannelInput {
  
  inline def apply(ApplicationId: String, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelInput]
  }
}
