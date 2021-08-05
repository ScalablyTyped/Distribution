package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse
}
object UpdateApnsChannelResponse {
  
  inline def apply(APNSChannelResponse: APNSChannelResponse): UpdateApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelResponse]
  }
  
  extension [Self <: UpdateApnsChannelResponse](x: Self) {
    
    inline def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
