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
}

