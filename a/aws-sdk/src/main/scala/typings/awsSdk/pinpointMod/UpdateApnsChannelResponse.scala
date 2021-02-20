package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse = js.native
}
object UpdateApnsChannelResponse {
  
  @scala.inline
  def apply(APNSChannelResponse: APNSChannelResponse): UpdateApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsChannelResponseMutableBuilder[Self <: UpdateApnsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
