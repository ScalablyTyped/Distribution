package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddJobFlowStepsInput extends StObject {
  
  /**
    * A string that uniquely identifies the job flow. This identifier is returned by RunJobFlow and can also be obtained from ListClusters. 
    */
  var JobFlowId: XmlStringMaxLen256
  
  /**
    *  A list of StepConfig to be executed by the job flow. 
    */
  var Steps: StepConfigList
}
object AddJobFlowStepsInput {
  
  @scala.inline
  def apply(JobFlowId: XmlStringMaxLen256, Steps: StepConfigList): AddJobFlowStepsInput = {
    val __obj = js.Dynamic.literal(JobFlowId = JobFlowId.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddJobFlowStepsInput]
  }
  
  @scala.inline
  implicit class AddJobFlowStepsInputMutableBuilder[Self <: AddJobFlowStepsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: StepConfigList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: StepConfig*): Self = StObject.set(x, "Steps", js.Array(value :_*))
  }
}
