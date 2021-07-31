package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBaiduChannelResponse extends StObject {
  
  var BaiduChannelResponse: typings.awsSdk.pinpointMod.BaiduChannelResponse
}
object GetBaiduChannelResponse {
  
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): GetBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBaiduChannelResponse]
  }
  
  @scala.inline
  implicit class GetBaiduChannelResponseMutableBuilder[Self <: GetBaiduChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaiduChannelResponse(value: BaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
