package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndPointStateOutput extends js.Object {
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[typings.awsSdk.elbMod.InstanceStates] = js.native
}

object DescribeEndPointStateOutput {
  @scala.inline
  def apply(InstanceStates: InstanceStates = null): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceStates != null) __obj.updateDynamic("InstanceStates")(InstanceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
}

