package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNotificationConfigurationRequest extends js.Object {
  /**
    * The name of the profiling group we want to get the notification configuration for.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object GetNotificationConfigurationRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): GetNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationConfigurationRequest]
  }
  @scala.inline
  implicit class GetNotificationConfigurationRequestOps[Self <: GetNotificationConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
  }
  
}

