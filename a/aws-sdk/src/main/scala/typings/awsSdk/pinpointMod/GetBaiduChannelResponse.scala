package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBaiduChannelResponse extends js.Object {
  var BaiduChannelResponse: typings.awsSdk.pinpointMod.BaiduChannelResponse = js.native
}

object GetBaiduChannelResponse {
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): GetBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBaiduChannelResponse]
  }
  @scala.inline
  implicit class GetBaiduChannelResponseOps[Self <: GetBaiduChannelResponse] (val x: Self) extends AnyVal {
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

