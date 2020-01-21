package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationDescription extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.ssmMod.AutomationTargetParameterName] = js.native
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.native
  /**
    * The date when the association was made.
    */
  var Date: js.UndefOr[DateTime] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * The last date on which the association was successfully run.
    */
  var LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * The date when the association was last updated.
    */
  var LastUpdateAssociationDate: js.UndefOr[DateTime] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * An Amazon S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.native
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.native
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The association status.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
  /**
    * The instances targeted by the request. 
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}

object AssociationDescription {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationName: AssociationName = null,
    AssociationVersion: AssociationVersion = null,
    AutomationTargetParameterName: AutomationTargetParameterName = null,
    ComplianceSeverity: AssociationComplianceSeverity = null,
    Date: DateTime = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    LastExecutionDate: DateTime = null,
    LastSuccessfulExecutionDate: DateTime = null,
    LastUpdateAssociationDate: DateTime = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: DocumentARN = null,
    OutputLocation: InstanceAssociationOutputLocation = null,
    Overview: AssociationOverview = null,
    Parameters: Parameters = null,
    ScheduleExpression: ScheduleExpression = null,
    Status: AssociationStatus = null,
    Targets: Targets = null
  ): AssociationDescription = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName.asInstanceOf[js.Any])
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion.asInstanceOf[js.Any])
    if (AutomationTargetParameterName != null) __obj.updateDynamic("AutomationTargetParameterName")(AutomationTargetParameterName.asInstanceOf[js.Any])
    if (ComplianceSeverity != null) __obj.updateDynamic("ComplianceSeverity")(ComplianceSeverity.asInstanceOf[js.Any])
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate.asInstanceOf[js.Any])
    if (LastSuccessfulExecutionDate != null) __obj.updateDynamic("LastSuccessfulExecutionDate")(LastSuccessfulExecutionDate.asInstanceOf[js.Any])
    if (LastUpdateAssociationDate != null) __obj.updateDynamic("LastUpdateAssociationDate")(LastUpdateAssociationDate.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (Overview != null) __obj.updateDynamic("Overview")(Overview.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationDescription]
  }
}

