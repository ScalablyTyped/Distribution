package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being deleted.
    */
  var ChannelId: string = js.native
}

object DeleteScheduleRequest {
  @scala.inline
  def apply(ChannelId: string): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
}

