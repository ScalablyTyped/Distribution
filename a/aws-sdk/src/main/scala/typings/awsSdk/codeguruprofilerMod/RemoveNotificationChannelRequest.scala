package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveNotificationChannelRequest extends js.Object {
  /**
    * The id of the channel that we want to stop receiving notifications.
    */
  var channelId: ChannelId = js.native
  /**
    * The name of the profiling group we want to change notification configuration for.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object RemoveNotificationChannelRequest {
  @scala.inline
  def apply(channelId: ChannelId, profilingGroupName: ProfilingGroupName): RemoveNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNotificationChannelRequest]
  }
}

