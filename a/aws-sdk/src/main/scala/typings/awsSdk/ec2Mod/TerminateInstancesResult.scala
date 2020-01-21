package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateInstancesResult extends js.Object {
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object TerminateInstancesResult {
  @scala.inline
  def apply(TerminatingInstances: InstanceStateChangeList = null): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (TerminatingInstances != null) __obj.updateDynamic("TerminatingInstances")(TerminatingInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateInstancesResult]
  }
}

