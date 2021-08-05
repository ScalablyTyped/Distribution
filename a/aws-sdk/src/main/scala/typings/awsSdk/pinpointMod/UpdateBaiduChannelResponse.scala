package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBaiduChannelResponse extends StObject {
  
  var BaiduChannelResponse: typings.awsSdk.pinpointMod.BaiduChannelResponse
}
object UpdateBaiduChannelResponse {
  
  inline def apply(BaiduChannelResponse: BaiduChannelResponse): UpdateBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelResponse]
  }
  
  extension [Self <: UpdateBaiduChannelResponse](x: Self) {
    
    inline def setBaiduChannelResponse(value: BaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
