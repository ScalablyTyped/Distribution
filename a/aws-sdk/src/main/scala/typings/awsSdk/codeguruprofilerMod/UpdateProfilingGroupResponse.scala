package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupResponse extends js.Object {
  /**
    *  A  ProfilingGroupDescription  that contains information about the returned updated profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}

object UpdateProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): UpdateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupResponse]
  }
}

