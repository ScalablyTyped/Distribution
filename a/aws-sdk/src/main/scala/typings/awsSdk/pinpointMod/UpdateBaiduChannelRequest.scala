package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBaiduChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var BaiduChannelRequest: typings.awsSdk.pinpointMod.BaiduChannelRequest = js.native
}
object UpdateBaiduChannelRequest {
  
  @scala.inline
  def apply(ApplicationId: string, BaiduChannelRequest: BaiduChannelRequest): UpdateBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateBaiduChannelRequestMutableBuilder[Self <: UpdateBaiduChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaiduChannelRequest(value: BaiduChannelRequest): Self = StObject.set(x, "BaiduChannelRequest", value.asInstanceOf[js.Any])
  }
}
