package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChannelRequest extends js.Object {
  /**
    * Unique ID of the channel.
    */
  var ChannelId: string = js.native
}

object DeleteChannelRequest {
  @scala.inline
  def apply(ChannelId: string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

