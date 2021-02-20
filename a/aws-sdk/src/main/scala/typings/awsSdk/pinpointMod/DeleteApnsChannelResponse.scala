package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse = js.native
}
object DeleteApnsChannelResponse {
  
  @scala.inline
  def apply(APNSChannelResponse: APNSChannelResponse): DeleteApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteApnsChannelResponseMutableBuilder[Self <: DeleteApnsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
