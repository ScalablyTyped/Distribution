package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsVoipChannelResponse extends js.Object {
  
  var APNSVoipChannelResponse: typings.awsSdk.pinpointMod.APNSVoipChannelResponse = js.native
}
object UpdateApnsVoipChannelResponse {
  
  @scala.inline
  def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): UpdateApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipChannelResponseOps[Self <: UpdateApnsVoipChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = this.set("APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
