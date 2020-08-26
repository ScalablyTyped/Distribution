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
  @scala.inline
  implicit class AddNotificationChannelsRequestOps[Self <: AddNotificationChannelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: Channels): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
  }
  
}

