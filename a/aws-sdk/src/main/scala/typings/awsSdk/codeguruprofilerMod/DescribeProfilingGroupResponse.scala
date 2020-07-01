package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProfilingGroupResponse extends js.Object {
  /**
    *  The returned  ProfilingGroupDescription  object that contains information about the requested profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}

object DescribeProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): DescribeProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfilingGroupResponse]
  }
}

