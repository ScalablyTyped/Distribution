package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An array of instance IDs.
    */
  var InstanceIds: Strings = js.native
}

object DescribeTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
  }
}

