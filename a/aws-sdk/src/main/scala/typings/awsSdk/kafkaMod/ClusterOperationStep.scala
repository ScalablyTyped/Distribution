package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOperationStep extends js.Object {
  /**
    * 
    Information about the step and its status.
    
    */
  var StepInfo: js.UndefOr[ClusterOperationStepInfo] = js.native
  /**
    * 
    The name of the step.
    
    */
  var StepName: js.UndefOr[string] = js.native
}

object ClusterOperationStep {
  @scala.inline
  def apply(StepInfo: ClusterOperationStepInfo = null, StepName: string = null): ClusterOperationStep = {
    val __obj = js.Dynamic.literal()
    if (StepInfo != null) __obj.updateDynamic("StepInfo")(StepInfo.asInstanceOf[js.Any])
    if (StepName != null) __obj.updateDynamic("StepName")(StepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOperationStep]
  }
}

