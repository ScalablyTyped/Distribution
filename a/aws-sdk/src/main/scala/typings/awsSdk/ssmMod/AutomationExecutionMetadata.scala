package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationExecutionMetadata extends StObject {
  
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
  implicit class AutomationExecutionMetadataMutableBuilder[Self <: AutomationExecutionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
    
    @scala.inline
    def setAutomationExecutionStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "AutomationExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationExecutionStatusUndefined: Self = StObject.set(x, "AutomationExecutionStatus", js.undefined)
    
    @scala.inline
    def setAutomationType(value: AutomationType): Self = StObject.set(x, "AutomationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationTypeUndefined: Self = StObject.set(x, "AutomationType", js.undefined)
    
    @scala.inline
    def setCurrentAction(value: String): Self = StObject.set(x, "CurrentAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentActionUndefined: Self = StObject.set(x, "CurrentAction", js.undefined)
    
    @scala.inline
    def setCurrentStepName(value: String): Self = StObject.set(x, "CurrentStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStepNameUndefined: Self = StObject.set(x, "CurrentStepName", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setExecutedBy(value: String): Self = StObject.set(x, "ExecutedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutedByUndefined: Self = StObject.set(x, "ExecutedBy", js.undefined)
    
    @scala.inline
    def setExecutionEndTime(value: DateTime): Self = StObject.set(x, "ExecutionEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEndTimeUndefined: Self = StObject.set(x, "ExecutionEndTime", js.undefined)
    
    @scala.inline
    def setExecutionStartTime(value: DateTime): Self = StObject.set(x, "ExecutionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartTimeUndefined: Self = StObject.set(x, "ExecutionStartTime", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    @scala.inline
    def setLogFile(value: String): Self = StObject.set(x, "LogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileUndefined: Self = StObject.set(x, "LogFile", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setMode(value: ExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setParentAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentAutomationExecutionIdUndefined: Self = StObject.set(x, "ParentAutomationExecutionId", js.undefined)
    
    @scala.inline
    def setResolvedTargets(value: ResolvedTargets): Self = StObject.set(x, "ResolvedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedTargetsUndefined: Self = StObject.set(x, "ResolvedTargets", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    @scala.inline
    def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value :_*))
    
    @scala.inline
    def setTargetParameterName(value: AutomationParameterKey): Self = StObject.set(x, "TargetParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameterNameUndefined: Self = StObject.set(x, "TargetParameterName", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
