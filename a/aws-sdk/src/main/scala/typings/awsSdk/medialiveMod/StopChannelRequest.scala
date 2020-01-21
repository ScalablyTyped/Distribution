package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopChannelRequest extends js.Object {
  /**
    * A request to stop a running channel
    */
  var ChannelId: string = js.native
}

object StopChannelRequest {
  @scala.inline
  def apply(ChannelId: string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopChannelRequest]
  }
}

