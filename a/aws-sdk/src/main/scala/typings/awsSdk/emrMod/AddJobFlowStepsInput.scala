package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class AddJobFlowStepsInputOps[Self <: AddJobFlowStepsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = this.set("JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: StepConfig*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: StepConfigList): Self = this.set("Steps", value.asInstanceOf[js.Any])
  }
}
