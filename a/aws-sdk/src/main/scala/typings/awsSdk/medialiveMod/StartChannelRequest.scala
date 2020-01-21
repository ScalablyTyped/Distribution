package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChannelRequest extends js.Object {
  /**
    * A request to start a channel
    */
  var ChannelId: string = js.native
}

object StartChannelRequest {
  @scala.inline
  def apply(ChannelId: string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartChannelRequest]
  }
}

