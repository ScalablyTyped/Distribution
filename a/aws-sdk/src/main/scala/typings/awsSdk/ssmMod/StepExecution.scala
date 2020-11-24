package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepExecution extends js.Object {
  
  /**
    * The action this step performs. The action determines the behavior of the step.
    */
  var Action: js.UndefOr[AutomationActionName] = js.native
  
  /**
    * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded, this field is not populated.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this field is not populated.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Information about the Automation failure.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.ssmMod.FailureDetails] = js.native
  
  /**
    * If a step failed, this message explains why the execution failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  
  /**
    * Fully-resolved values passed into the step before execution.
    */
  var Inputs: js.UndefOr[NormalStringMap] = js.native
  
  /**
    * The flag which can be used to help decide whether the failure of current step leads to the Automation failure.
    */
  var IsCritical: js.UndefOr[Boolean] = js.native
  
  /**
    * The flag which can be used to end automation no matter whether the step succeeds or fails.
    */
  var IsEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of tries to run the action of the step. The default value is 1.
    */
  var MaxAttempts: js.UndefOr[Integer] = js.native
  
  /**
    * The next step after the step succeeds.
    */
  var NextStep: js.UndefOr[String] = js.native
  
  /**
    * The action to take if the step fails. The default value is Abort.
    */
  var OnFailure: js.UndefOr[String] = js.native
  
  /**
    * Returned values from the execution of the step.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * A user-specified list of parameters to override when running a step.
    */
  var OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * A message associated with the response code for an execution.
    */
  var Response: js.UndefOr[String] = js.native
  
  /**
    * The response code returned by the execution of the step.
    */
  var ResponseCode: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of a step execution.
    */
  var StepExecutionId: js.UndefOr[String] = js.native
  
  /**
    * The name of this execution step.
    */
  var StepName: js.UndefOr[String] = js.native
  
  /**
    * The execution status for this step.
    */
  var StepStatus: js.UndefOr[AutomationExecutionStatus] = js.native
  
  /**
    * The combination of AWS Regions and accounts targeted by the current Automation execution.
    */
  var TargetLocation: js.UndefOr[typings.awsSdk.ssmMod.TargetLocation] = js.native
  
  /**
    * The targets for the step execution.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The timeout seconds of the step.
    */
  var TimeoutSeconds: js.UndefOr[Long] = js.native
  
  /**
    * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to run the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
    */
  var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.native
}
object StepExecution {
  
  @scala.inline
  def apply(): StepExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepExecution]
  }
  
  @scala.inline
  implicit class StepExecutionOps[Self <: StepExecution] (val x: Self) extends AnyVal {
    
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
    def setAction(value: AutomationActionName): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setExecutionEndTime(value: DateTime): Self = this.set("ExecutionEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionEndTime: Self = this.set("ExecutionEndTime", js.undefined)
    
    @scala.inline
    def setExecutionStartTime(value: DateTime): Self = this.set("ExecutionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStartTime: Self = this.set("ExecutionStartTime", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: FailureDetails): Self = this.set("FailureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDetails: Self = this.set("FailureDetails", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
    
    @scala.inline
    def setInputs(value: NormalStringMap): Self = this.set("Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("Inputs", js.undefined)
    
    @scala.inline
    def setIsCritical(value: Boolean): Self = this.set("IsCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCritical: Self = this.set("IsCritical", js.undefined)
    
    @scala.inline
    def setIsEnd(value: Boolean): Self = this.set("IsEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnd: Self = this.set("IsEnd", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Integer): Self = this.set("MaxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("MaxAttempts", js.undefined)
    
    @scala.inline
    def setNextStep(value: String): Self = this.set("NextStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextStep: Self = this.set("NextStep", js.undefined)
    
    @scala.inline
    def setOnFailure(value: String): Self = this.set("OnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("OnFailure", js.undefined)
    
    @scala.inline
    def setOutputs(value: AutomationParameterMap): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setOverriddenParameters(value: AutomationParameterMap): Self = this.set("OverriddenParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverriddenParameters: Self = this.set("OverriddenParameters", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = this.set("Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("Response", js.undefined)
    
    @scala.inline
    def setResponseCode(value: String): Self = this.set("ResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCode: Self = this.set("ResponseCode", js.undefined)
    
    @scala.inline
    def setStepExecutionId(value: String): Self = this.set("StepExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepExecutionId: Self = this.set("StepExecutionId", js.undefined)
    
    @scala.inline
    def setStepName(value: String): Self = this.set("StepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepName: Self = this.set("StepName", js.undefined)
    
    @scala.inline
    def setStepStatus(value: AutomationExecutionStatus): Self = this.set("StepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepStatus: Self = this.set("StepStatus", js.undefined)
    
    @scala.inline
    def setTargetLocation(value: TargetLocation): Self = this.set("TargetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLocation: Self = this.set("TargetLocation", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Long): Self = this.set("TimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("TimeoutSeconds", js.undefined)
    
    @scala.inline
    def setValidNextStepsVarargs(value: ValidNextStep*): Self = this.set("ValidNextSteps", js.Array(value :_*))
    
    @scala.inline
    def setValidNextSteps(value: ValidNextStepList): Self = this.set("ValidNextSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidNextSteps: Self = this.set("ValidNextSteps", js.undefined)
  }
}
