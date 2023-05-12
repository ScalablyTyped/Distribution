package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepExecution extends StObject {
  
  /**
    * The action this step performs. The action determines the behavior of the step.
    */
  var Action: js.UndefOr[AutomationActionName] = js.undefined
  
  /**
    * If a step has finished execution, this contains the time the execution ended. If the step hasn't yet concluded, this field isn't populated.
    */
  var ExecutionEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this field isn't populated.
    */
  var ExecutionStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the Automation failure.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.FailureDetails] = js.undefined
  
  /**
    * If a step failed, this message explains why the execution failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Fully-resolved values passed into the step before execution.
    */
  var Inputs: js.UndefOr[NormalStringMap] = js.undefined
  
  /**
    * The flag which can be used to help decide whether the failure of current step leads to the Automation failure.
    */
  var IsCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The flag which can be used to end automation no matter whether the step succeeds or fails.
    */
  var IsEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of tries to run the action of the step. The default value is 1.
    */
  var MaxAttempts: js.UndefOr[Integer] = js.undefined
  
  /**
    * The next step after the step succeeds.
    */
  var NextStep: js.UndefOr[String] = js.undefined
  
  /**
    * The action to take if the step fails. The default value is Abort.
    */
  var OnFailure: js.UndefOr[String] = js.undefined
  
  /**
    * Returned values from the execution of the step.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * A user-specified list of parameters to override when running a step.
    */
  var OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * A message associated with the response code for an execution.
    */
  var Response: js.UndefOr[String] = js.undefined
  
  /**
    * The response code returned by the execution of the step.
    */
  var ResponseCode: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of a step execution.
    */
  var StepExecutionId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this execution step.
    */
  var StepName: js.UndefOr[String] = js.undefined
  
  /**
    * The execution status for this step.
    */
  var StepStatus: js.UndefOr[AutomationExecutionStatus] = js.undefined
  
  /**
    * The combination of Amazon Web Services Regions and Amazon Web Services accounts targeted by the current Automation execution.
    */
  var TargetLocation: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.TargetLocation] = js.undefined
  
  /**
    * The targets for the step execution.
    */
  var Targets: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The timeout seconds of the step.
    */
  var TimeoutSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The CloudWatch alarms that were invoked by the automation.
    */
  var TriggeredAlarms: js.UndefOr[AlarmStateInformationList] = js.undefined
  
  /**
    * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to run the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
    */
  var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.undefined
}
object StepExecution {
  
  inline def apply(): StepExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepExecution] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AutomationActionName): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setExecutionEndTime(value: js.Date): Self = StObject.set(x, "ExecutionEndTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionEndTimeUndefined: Self = StObject.set(x, "ExecutionEndTime", js.undefined)
    
    inline def setExecutionStartTime(value: js.Date): Self = StObject.set(x, "ExecutionStartTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartTimeUndefined: Self = StObject.set(x, "ExecutionStartTime", js.undefined)
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setInputs(value: NormalStringMap): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setIsCritical(value: Boolean): Self = StObject.set(x, "IsCritical", value.asInstanceOf[js.Any])
    
    inline def setIsCriticalUndefined: Self = StObject.set(x, "IsCritical", js.undefined)
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "IsEnd", value.asInstanceOf[js.Any])
    
    inline def setIsEndUndefined: Self = StObject.set(x, "IsEnd", js.undefined)
    
    inline def setMaxAttempts(value: Integer): Self = StObject.set(x, "MaxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsUndefined: Self = StObject.set(x, "MaxAttempts", js.undefined)
    
    inline def setNextStep(value: String): Self = StObject.set(x, "NextStep", value.asInstanceOf[js.Any])
    
    inline def setNextStepUndefined: Self = StObject.set(x, "NextStep", js.undefined)
    
    inline def setOnFailure(value: String): Self = StObject.set(x, "OnFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "OnFailure", js.undefined)
    
    inline def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOverriddenParameters(value: AutomationParameterMap): Self = StObject.set(x, "OverriddenParameters", value.asInstanceOf[js.Any])
    
    inline def setOverriddenParametersUndefined: Self = StObject.set(x, "OverriddenParameters", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: String): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    inline def setStepExecutionId(value: String): Self = StObject.set(x, "StepExecutionId", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionIdUndefined: Self = StObject.set(x, "StepExecutionId", js.undefined)
    
    inline def setStepName(value: String): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
    
    inline def setStepStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    inline def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
    
    inline def setTargetLocation(value: TargetLocation): Self = StObject.set(x, "TargetLocation", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationUndefined: Self = StObject.set(x, "TargetLocation", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTimeoutSeconds(value: Long): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
    
    inline def setTriggeredAlarms(value: AlarmStateInformationList): Self = StObject.set(x, "TriggeredAlarms", value.asInstanceOf[js.Any])
    
    inline def setTriggeredAlarmsUndefined: Self = StObject.set(x, "TriggeredAlarms", js.undefined)
    
    inline def setTriggeredAlarmsVarargs(value: AlarmStateInformation*): Self = StObject.set(x, "TriggeredAlarms", js.Array(value*))
    
    inline def setValidNextSteps(value: ValidNextStepList): Self = StObject.set(x, "ValidNextSteps", value.asInstanceOf[js.Any])
    
    inline def setValidNextStepsUndefined: Self = StObject.set(x, "ValidNextSteps", js.undefined)
    
    inline def setValidNextStepsVarargs(value: ValidNextStep*): Self = StObject.set(x, "ValidNextSteps", js.Array(value*))
  }
}
