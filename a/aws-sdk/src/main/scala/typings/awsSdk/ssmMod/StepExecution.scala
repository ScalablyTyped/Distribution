package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepExecution extends StObject {
  
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
  implicit class StepExecutionMutableBuilder[Self <: StepExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: AutomationActionName): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setExecutionEndTime(value: DateTime): Self = StObject.set(x, "ExecutionEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEndTimeUndefined: Self = StObject.set(x, "ExecutionEndTime", js.undefined)
    
    @scala.inline
    def setExecutionStartTime(value: DateTime): Self = StObject.set(x, "ExecutionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartTimeUndefined: Self = StObject.set(x, "ExecutionStartTime", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    @scala.inline
    def setInputs(value: NormalStringMap): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    @scala.inline
    def setIsCritical(value: Boolean): Self = StObject.set(x, "IsCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCriticalUndefined: Self = StObject.set(x, "IsCritical", js.undefined)
    
    @scala.inline
    def setIsEnd(value: Boolean): Self = StObject.set(x, "IsEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEndUndefined: Self = StObject.set(x, "IsEnd", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Integer): Self = StObject.set(x, "MaxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttemptsUndefined: Self = StObject.set(x, "MaxAttempts", js.undefined)
    
    @scala.inline
    def setNextStep(value: String): Self = StObject.set(x, "NextStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStepUndefined: Self = StObject.set(x, "NextStep", js.undefined)
    
    @scala.inline
    def setOnFailure(value: String): Self = StObject.set(x, "OnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "OnFailure", js.undefined)
    
    @scala.inline
    def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOverriddenParameters(value: AutomationParameterMap): Self = StObject.set(x, "OverriddenParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriddenParametersUndefined: Self = StObject.set(x, "OverriddenParameters", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: String): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    @scala.inline
    def setStepExecutionId(value: String): Self = StObject.set(x, "StepExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepExecutionIdUndefined: Self = StObject.set(x, "StepExecutionId", js.undefined)
    
    @scala.inline
    def setStepName(value: String): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
    
    @scala.inline
    def setStepStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
    
    @scala.inline
    def setTargetLocation(value: TargetLocation): Self = StObject.set(x, "TargetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocationUndefined: Self = StObject.set(x, "TargetLocation", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutSeconds(value: Long): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
    
    @scala.inline
    def setValidNextSteps(value: ValidNextStepList): Self = StObject.set(x, "ValidNextSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidNextStepsUndefined: Self = StObject.set(x, "ValidNextSteps", js.undefined)
    
    @scala.inline
    def setValidNextStepsVarargs(value: ValidNextStep*): Self = StObject.set(x, "ValidNextSteps", js.Array(value :_*))
  }
}
