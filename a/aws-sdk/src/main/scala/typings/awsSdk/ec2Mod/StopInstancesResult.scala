package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstancesResult extends js.Object {
  /**
    * Information about the stopped instances.
    */
  var StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object StopInstancesResult {
  @scala.inline
  def apply(StoppingInstances: InstanceStateChangeList = null): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (StoppingInstances != null) __obj.updateDynamic("StoppingInstances")(StoppingInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstancesResult]
  }
}

