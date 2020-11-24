package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBaiduChannelResponse extends js.Object {
  
  var BaiduChannelResponse: typings.awsSdk.pinpointMod.BaiduChannelResponse = js.native
}
object UpdateBaiduChannelResponse {
  
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): UpdateBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateBaiduChannelResponseOps[Self <: UpdateBaiduChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setBaiduChannelResponse(value: BaiduChannelResponse): Self = this.set("BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
