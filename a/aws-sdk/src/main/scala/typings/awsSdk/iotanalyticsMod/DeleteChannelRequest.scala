package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChannelRequest extends js.Object {
  /**
    * The name of the channel to delete.
    */
  var channelName: ChannelName = js.native
}

object DeleteChannelRequest {
  @scala.inline
  def apply(channelName: ChannelName): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

