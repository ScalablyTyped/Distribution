package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupResponse extends js.Object {
  var profilingGroup: ProfilingGroupDescription = js.native
}

object UpdateProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): UpdateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateProfilingGroupResponse]
  }
}

