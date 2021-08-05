package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecution extends StObject {
  
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.undefined
  
  /**
    * The execution status of the Automation.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionStatus] = js.undefined
  
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Automation document used during the execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.undefined
  
  /**
    * The version of the document to use during execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who ran the automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The time the execution finished.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A message describing why an execution has failed, if the status is set to Failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The MaxConcurrency value specified by the user when the execution started.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The MaxErrors value specified by the user when the execution started.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * The automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  
  /**
    * The list of execution outputs as defined in the automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * The AutomationExecutionId of the parent automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  
  /**
    * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
    */
  var ProgressCounters: js.UndefOr[typings.awsSdk.ssmMod.ProgressCounters] = js.undefined
  
  /**
    * A list of resolved targets in the rate control execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsSdk.ssmMod.ResolvedTargets] = js.undefined
  
  /**
    * A list of details about the current state of all steps that comprise an execution. An Automation document contains a list of steps that are run in order.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
  
  /**
    * A boolean value that indicates if the response contains the full list of the Automation step executions. If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
    */
  var StepExecutionsTruncated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target of the execution.
    */
  var Target: js.UndefOr[String] = js.undefined
  
  /**
    * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.ssmMod.TargetLocations] = js.undefined
  
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.ssmMod.TargetMaps] = js.undefined
  
  /**
    * The parameter name.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  
  /**
    * The specified targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
}
object AutomationExecution {
  
  inline def apply(): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecution]
  }
  
  extension [Self <: AutomationExecution](x: Self) {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
    
    inline def setAutomationExecutionStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "AutomationExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionStatusUndefined: Self = StObject.set(x, "AutomationExecutionStatus", js.undefined)
    
    inline def setCurrentAction(value: String): Self = StObject.set(x, "CurrentAction", value.asInstanceOf[js.Any])
    
    inline def setCurrentActionUndefined: Self = StObject.set(x, "CurrentAction", js.undefined)
    
    inline def setCurrentStepName(value: String): Self = StObject.set(x, "CurrentStepName", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepNameUndefined: Self = StObject.set(x, "CurrentStepName", js.undefined)
    
    inline def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setExecutedBy(value: String): Self = StObject.set(x, "ExecutedBy", value.asInstanceOf[js.Any])
    
    inline def setExecutedByUndefined: Self = StObject.set(x, "ExecutedBy", js.undefined)
    
    inline def setExecutionEndTime(value: DateTime): Self = StObject.set(x, "ExecutionEndTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionEndTimeUndefined: Self = StObject.set(x, "ExecutionEndTime", js.undefined)
    
    inline def setExecutionStartTime(value: DateTime): Self = StObject.set(x, "ExecutionStartTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartTimeUndefined: Self = StObject.set(x, "ExecutionStartTime", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setMode(value: ExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setParameters(value: AutomationParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParentAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setParentAutomationExecutionIdUndefined: Self = StObject.set(x, "ParentAutomationExecutionId", js.undefined)
    
    inline def setProgressCounters(value: ProgressCounters): Self = StObject.set(x, "ProgressCounters", value.asInstanceOf[js.Any])
    
    inline def setProgressCountersUndefined: Self = StObject.set(x, "ProgressCounters", js.undefined)
    
    inline def setResolvedTargets(value: ResolvedTargets): Self = StObject.set(x, "ResolvedTargets", value.asInstanceOf[js.Any])
    
    inline def setResolvedTargetsUndefined: Self = StObject.set(x, "ResolvedTargets", js.undefined)
    
    inline def setStepExecutions(value: StepExecutionList): Self = StObject.set(x, "StepExecutions", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionsTruncated(value: Boolean): Self = StObject.set(x, "StepExecutionsTruncated", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionsTruncatedUndefined: Self = StObject.set(x, "StepExecutionsTruncated", js.undefined)
    
    inline def setStepExecutionsUndefined: Self = StObject.set(x, "StepExecutions", js.undefined)
    
    inline def setStepExecutionsVarargs(value: StepExecution*): Self = StObject.set(x, "StepExecutions", js.Array(value :_*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetLocations(value: TargetLocations): Self = StObject.set(x, "TargetLocations", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationsUndefined: Self = StObject.set(x, "TargetLocations", js.undefined)
    
    inline def setTargetLocationsVarargs(value: TargetLocation*): Self = StObject.set(x, "TargetLocations", js.Array(value :_*))
    
    inline def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    inline def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value :_*))
    
    inline def setTargetParameterName(value: AutomationParameterKey): Self = StObject.set(x, "TargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setTargetParameterNameUndefined: Self = StObject.set(x, "TargetParameterName", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
