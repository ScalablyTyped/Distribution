package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOperationStepInfo extends js.Object {
  /**
    * 
    The steps current status.
    
    */
  var StepStatus: js.UndefOr[string] = js.native
}

object ClusterOperationStepInfo {
  @scala.inline
  def apply(StepStatus: string = null): ClusterOperationStepInfo = {
    val __obj = js.Dynamic.literal()
    if (StepStatus != null) __obj.updateDynamic("StepStatus")(StepStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOperationStepInfo]
  }
}

