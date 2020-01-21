package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChannelsResponse extends js.Object {
  var ChannelsResponse: typings.awsSdk.pinpointMod.ChannelsResponse = js.native
}

object GetChannelsResponse {
  @scala.inline
  def apply(ChannelsResponse: ChannelsResponse): GetChannelsResponse = {
    val __obj = js.Dynamic.literal(ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetChannelsResponse]
  }
}

