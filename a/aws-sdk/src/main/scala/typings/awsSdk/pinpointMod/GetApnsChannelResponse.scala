package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse
}
object GetApnsChannelResponse {
  
  @scala.inline
  def apply(APNSChannelResponse: APNSChannelResponse): GetApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsChannelResponse]
  }
  
  @scala.inline
  implicit class GetApnsChannelResponseMutableBuilder[Self <: GetApnsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
