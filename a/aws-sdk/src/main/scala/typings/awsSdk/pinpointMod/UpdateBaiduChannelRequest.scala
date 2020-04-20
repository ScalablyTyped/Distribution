package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBaiduChannelRequest extends js.Object {
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
}

