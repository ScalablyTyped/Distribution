package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AutomationExecutionId: AutomationExecutionId = null,
    AutomationExecutionStatus: AutomationExecutionStatus = null,
    CurrentAction: String = null,
    CurrentStepName: String = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ExecutedBy: String = null,
    ExecutionEndTime: DateTime = null,
    ExecutionStartTime: DateTime = null,
    FailureMessage: String = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Mode: ExecutionMode = null,
    Outputs: AutomationParameterMap = null,
    Parameters: AutomationParameterMap = null,
    ParentAutomationExecutionId: AutomationExecutionId = null,
    ProgressCounters: ProgressCounters = null,
    ResolvedTargets: ResolvedTargets = null,
    StepExecutions: StepExecutionList = null,
    StepExecutionsTruncated: js.UndefOr[scala.Boolean] = js.undefined,
    Target: String = null,
    TargetLocations: TargetLocations = null,
    TargetMaps: TargetMaps = null,
    TargetParameterName: AutomationParameterKey = null,
    Targets: Targets = null
  ): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId.asInstanceOf[js.Any])
    if (AutomationExecutionStatus != null) __obj.updateDynamic("AutomationExecutionStatus")(AutomationExecutionStatus.asInstanceOf[js.Any])
    if (CurrentAction != null) __obj.updateDynamic("CurrentAction")(CurrentAction.asInstanceOf[js.Any])
    if (CurrentStepName != null) __obj.updateDynamic("CurrentStepName")(CurrentStepName.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (ExecutedBy != null) __obj.updateDynamic("ExecutedBy")(ExecutedBy.asInstanceOf[js.Any])
    if (ExecutionEndTime != null) __obj.updateDynamic("ExecutionEndTime")(ExecutionEndTime.asInstanceOf[js.Any])
    if (ExecutionStartTime != null) __obj.updateDynamic("ExecutionStartTime")(ExecutionStartTime.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ParentAutomationExecutionId != null) __obj.updateDynamic("ParentAutomationExecutionId")(ParentAutomationExecutionId.asInstanceOf[js.Any])
    if (ProgressCounters != null) __obj.updateDynamic("ProgressCounters")(ProgressCounters.asInstanceOf[js.Any])
    if (ResolvedTargets != null) __obj.updateDynamic("ResolvedTargets")(ResolvedTargets.asInstanceOf[js.Any])
    if (StepExecutions != null) __obj.updateDynamic("StepExecutions")(StepExecutions.asInstanceOf[js.Any])
    if (!js.isUndefined(StepExecutionsTruncated)) __obj.updateDynamic("StepExecutionsTruncated")(StepExecutionsTruncated.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    if (TargetLocations != null) __obj.updateDynamic("TargetLocations")(TargetLocations.asInstanceOf[js.Any])
    if (TargetMaps != null) __obj.updateDynamic("TargetMaps")(TargetMaps.asInstanceOf[js.Any])
    if (TargetParameterName != null) __obj.updateDynamic("TargetParameterName")(TargetParameterName.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationExecution]
  }
}

