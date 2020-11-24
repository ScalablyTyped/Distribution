package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationExecutionMetadata extends js.Object {
  
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.native
  
  /**
    * The status of the execution.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionStatus] = js.native
  
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see Running Automation workflows in multiple AWS Regions and accounts in the AWS Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[typings.awsSdk.ssmMod.AutomationType] = js.native
  
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.native
  
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.native
  
  /**
    * The name of the Automation document used during execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.native
  
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The IAM role ARN of the user who ran the Automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.native
  
  /**
    * The time the execution finished. This is not populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  
  /**
    * An S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.native
  
  /**
    * The MaxConcurrency value specified by the user when starting the Automation.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The MaxErrors value specified by the user when starting the Automation.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * The ExecutionId of the parent Automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.native
  
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsSdk.ssmMod.ResolvedTargets] = js.native
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Target: js.UndefOr[String] = js.native
  
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.ssmMod.TargetMaps] = js.native
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  
  /**
    * The targets defined by the user when starting the Automation.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}
object AutomationExecutionMetadata {
  
  @scala.inline
  def apply(): AutomationExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
  
  @scala.inline
  implicit class AutomationExecutionMetadataOps[Self <: AutomationExecutionMetadata] (val x: Self) extends AnyVal {
    
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
    def setAutomationType(value: AutomationType): Self = this.set("AutomationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationType: Self = this.set("AutomationType", js.undefined)
    
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
    def setLogFile(value: String): Self = this.set("LogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFile: Self = this.set("LogFile", js.undefined)
    
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
    def setParentAutomationExecutionId(value: AutomationExecutionId): Self = this.set("ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentAutomationExecutionId: Self = this.set("ParentAutomationExecutionId", js.undefined)
    
    @scala.inline
    def setResolvedTargets(value: ResolvedTargets): Self = this.set("ResolvedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedTargets: Self = this.set("ResolvedTargets", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    
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
