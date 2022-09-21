package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddJobFlowStepsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the following format: arn:partition:service:region:account:resource.  For example, arn:aws:iam::1234567890:role/ReadOnly is a correctly formatted runtime role ARN.
    */
  var ExecutionRoleArn: js.UndefOr[ArnType] = js.undefined
  
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
  
  inline def apply(JobFlowId: XmlStringMaxLen256, Steps: StepConfigList): AddJobFlowStepsInput = {
    val __obj = js.Dynamic.literal(JobFlowId = JobFlowId.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddJobFlowStepsInput]
  }
  
  extension [Self <: AddJobFlowStepsInput](x: Self) {
    
    inline def setExecutionRoleArn(value: ArnType): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: StepConfigList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: StepConfig*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
