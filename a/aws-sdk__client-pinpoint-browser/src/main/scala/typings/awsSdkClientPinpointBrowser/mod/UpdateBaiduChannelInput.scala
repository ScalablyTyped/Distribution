package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod.BaiduChannelRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBaiduChannelInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
object UpdateBaiduChannelInput {
  
  @scala.inline
  def apply(ApplicationId: String, BaiduChannelRequest: BaiduChannelRequest): UpdateBaiduChannelInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelInput]
  }
}
