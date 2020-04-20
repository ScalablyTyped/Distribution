package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProfilingGroupRequest extends js.Object {
  /**
    * The profiling group name to delete.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object DeleteProfilingGroupRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): DeleteProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfilingGroupRequest]
  }
}

