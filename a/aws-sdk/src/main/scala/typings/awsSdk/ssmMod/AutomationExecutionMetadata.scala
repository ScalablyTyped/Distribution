package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecutionMetadata extends StObject {
  
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.undefined
  
  /**
    * The status of the execution.
    */
  var AutomationExecutionStatus: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionStatus] = js.undefined
  
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see Running Automation workflows in multiple AWS Regions and accounts in the AWS Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[typings.awsSdk.ssmMod.AutomationType] = js.undefined
  
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Automation document used during execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.undefined
  
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The IAM role ARN of the user who ran the Automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The time the execution finished. This is not populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * An S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.undefined
  
  /**
    * The MaxConcurrency value specified by the user when starting the Automation.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The MaxErrors value specified by the user when starting the Automation.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * The ExecutionId of the parent Automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
  
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[typings.awsSdk.ssmMod.ResolvedTargets] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Target: js.UndefOr[String] = js.undefined
  
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.ssmMod.TargetMaps] = js.undefined
  
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  
  /**
    * The targets defined by the user when starting the Automation.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
}
object AutomationExecutionMetadata {
  
  inline def apply(): AutomationExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
  
  extension [Self <: AutomationExecutionMetadata](x: Self) {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
    
    inline def setAutomationExecutionStatus(value: AutomationExecutionStatus): Self = StObject.set(x, "AutomationExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionStatusUndefined: Self = StObject.set(x, "AutomationExecutionStatus", js.undefined)
    
    inline def setAutomationType(value: AutomationType): Self = StObject.set(x, "AutomationType", value.asInstanceOf[js.Any])
    
    inline def setAutomationTypeUndefined: Self = StObject.set(x, "AutomationType", js.undefined)
    
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
    
    inline def setLogFile(value: String): Self = StObject.set(x, "LogFile", value.asInstanceOf[js.Any])
    
    inline def setLogFileUndefined: Self = StObject.set(x, "LogFile", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setMode(value: ExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setOutputs(value: AutomationParameterMap): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setParentAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "ParentAutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setParentAutomationExecutionIdUndefined: Self = StObject.set(x, "ParentAutomationExecutionId", js.undefined)
    
    inline def setResolvedTargets(value: ResolvedTargets): Self = StObject.set(x, "ResolvedTargets", value.asInstanceOf[js.Any])
    
    inline def setResolvedTargetsUndefined: Self = StObject.set(x, "ResolvedTargets", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
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
