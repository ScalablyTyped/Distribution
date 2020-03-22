package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupResponse extends js.Object {
  /**
    * Information about the new profiling group
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}

object CreateProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): CreateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProfilingGroupResponse]
  }
}

