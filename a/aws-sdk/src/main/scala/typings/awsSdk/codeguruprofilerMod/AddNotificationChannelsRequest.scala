package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNotificationChannelsRequest extends js.Object {
  /**
    * One or 2 channels to report to when anomalies are detected.
    */
  var channels: Channels = js.native
  /**
    * The name of the profiling group that we are setting up notifications for.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object AddNotificationChannelsRequest {
  @scala.inline
  def apply(channels: Channels, profilingGroupName: ProfilingGroupName): AddNotificationChannelsRequest = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNotificationChannelsRequest]
  }
}

