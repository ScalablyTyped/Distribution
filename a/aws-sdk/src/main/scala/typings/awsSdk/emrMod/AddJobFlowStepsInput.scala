package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddJobFlowStepsInput extends js.Object {
  /**
    * A string that uniquely identifies the job flow. This identifier is returned by RunJobFlow and can also be obtained from ListClusters. 
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
  /**
    *  A list of StepConfig to be executed by the job flow. 
    */
  var Steps: StepConfigList = js.native
}

object AddJobFlowStepsInput {
  @scala.inline
  def apply(JobFlowId: XmlStringMaxLen256, Steps: StepConfigList): AddJobFlowStepsInput = {
    val __obj = js.Dynamic.literal(JobFlowId = JobFlowId.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddJobFlowStepsInput]
  }
}

