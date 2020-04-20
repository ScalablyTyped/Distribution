package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
}

