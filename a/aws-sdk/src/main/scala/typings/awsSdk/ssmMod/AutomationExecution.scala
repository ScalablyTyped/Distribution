package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationExecution extends js.Object {
  
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.native
  
  /**
    * The execution status of the Automation.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionStatus] = js.native
  
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.native
  
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.native
  
  /**
    * The name of the Automation document used during the execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.native
  
  /**
    * The version of the document to use during execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user who ran the automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.native
  
  /**
    * The time the execution finished.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * A message describing why an execution has failed, if the status is set to Failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  
  /**
    * The MaxConcurrency value specified by the user when the execution started.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The MaxErrors value specified by the user when the execution started.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * The automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  
  /**
    * The list of execution outputs as defined in the automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * The AutomationExecutionId of the parent automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.native
  
  /**
    * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
    */
  var ProgressCounters: js.UndefOr[typings.awsSdk.ssmMod.ProgressCounters] = js.native
  
  /**
    * A list of resolved targets in the rate control execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsSdk.ssmMod.ResolvedTargets] = js.native
  
  /**
    * A list of details about the current state of all steps that comprise an execution. An Automation document contains a list of steps that are run in order.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.native
  
  /**
    * A boolean value that indicates if the response contains the full list of the Automation step executions. If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
    */
  var StepExecutionsTruncated: js.UndefOr[Boolean] = js.native
  
  /**
    * The target of the execution.
    */
  var Target: js.UndefOr[String] = js.native
  
  /**
    * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.ssmMod.TargetLocations] = js.native
  
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.ssmMod.TargetMaps] = js.native
  
  /**
    * The parameter name.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  
  /**
    * The specified targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}
object AutomationExecution {
  
  @scala.inline
  def apply(): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecution]
  }
  
  @scala.inline
  implicit class AutomationExecutionOps[Self <: AutomationExecution] (val x: Self) extends AnyVal {
    
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
    def setAutomationExecutionId(value: AutomationExecutionId): Self = this.set("AutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationExecutionId: Self = this.set("AutomationExecutionId", js.undefined)
    
    @scala.inline
    def setAutomationExecutionStatus(value: AutomationExecutionStatus): Self = this.set("AutomationExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationExecutionStatus: Self = this.set("AutomationExecutionStatus", js.undefined)
    
    @scala.inline
    def setCurrentAction(value: String): Self = this.set("CurrentAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentAction: Self = this.set("CurrentAction", js.undefined)
    
    @scala.inline
    def setCurrentStepName(value: String): Self = this.set("CurrentStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentStepName: Self = this.set("CurrentStepName", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("DocumentName", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    
    @scala.inline
    def setExecutedBy(value: String): Self = this.set("ExecutedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutedBy: Self = this.set("ExecutedBy", js.undefined)
    
    @scala.inline
    def setExecutionEndTime(value: DateTime): Self = this.set("ExecutionEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionEndTime: Self = this.set("ExecutionEndTime", js.undefined)
    
    @scala.inline
    def setExecutionStartTime(value: DateTime): Self = this.set("ExecutionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStartTime: Self = this.set("ExecutionStartTime", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    
    @scala.inline
    def setMode(value: ExecutionMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setOutputs(value: AutomationParameterMap): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setParameters(value: AutomationParameterMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setParentAutomationExecutionId(value: AutomationExecutionId): Self = this.set("ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentAutomationExecutionId: Self = this.set("ParentAutomationExecutionId", js.undefined)
    
    @scala.inline
    def setProgressCounters(value: ProgressCounters): Self = this.set("ProgressCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressCounters: Self = this.set("ProgressCounters", js.undefined)
    
    @scala.inline
    def setResolvedTargets(value: ResolvedTargets): Self = this.set("ResolvedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedTargets: Self = this.set("ResolvedTargets", js.undefined)
    
    @scala.inline
    def setStepExecutionsVarargs(value: StepExecution*): Self = this.set("StepExecutions", js.Array(value :_*))
    
    @scala.inline
    def setStepExecutions(value: StepExecutionList): Self = this.set("StepExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepExecutions: Self = this.set("StepExecutions", js.undefined)
    
    @scala.inline
    def setStepExecutionsTruncated(value: Boolean): Self = this.set("StepExecutionsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepExecutionsTruncated: Self = this.set("StepExecutionsTruncated", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    
    @scala.inline
    def setTargetLocationsVarargs(value: TargetLocation*): Self = this.set("TargetLocations", js.Array(value :_*))
    
    @scala.inline
    def setTargetLocations(value: TargetLocations): Self = this.set("TargetLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLocations: Self = this.set("TargetLocations", js.undefined)
    
    @scala.inline
    def setTargetMapsVarargs(value: TargetMap*): Self = this.set("TargetMaps", js.Array(value :_*))
    
    @scala.inline
    def setTargetMaps(value: TargetMaps): Self = this.set("TargetMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetMaps: Self = this.set("TargetMaps", js.undefined)
    
    @scala.inline
    def setTargetParameterName(value: AutomationParameterKey): Self = this.set("TargetParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetParameterName: Self = this.set("TargetParameterName", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
}
