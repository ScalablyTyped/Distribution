package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationBatchRequestEntry extends js.Object {
  /**
    * Specify a descriptive name for the association.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.ssmMod.AutomationTargetParameterName] = js.native
  /**
    * The severity level to assign to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The ID of the instance. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The name of the SSM document that contains the configuration information for the instance. You can specify Command or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:aws:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
    */
  var Name: DocumentARN = js.native
  /**
    * An S3 bucket where you want to store the results of this request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.native
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT.  In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API action. In this case, compliance data is not managed by State Manager. It is managed by your direct call to the PutComplianceItems API action. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.native
  /**
    * The instances targeted by the request.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}

object CreateAssociationBatchRequestEntry {
  @scala.inline
  def apply(
    Name: DocumentARN,
    AssociationName: AssociationName = null,
    AutomationTargetParameterName: AutomationTargetParameterName = null,
    ComplianceSeverity: AssociationComplianceSeverity = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    OutputLocation: InstanceAssociationOutputLocation = null,
    Parameters: Parameters = null,
    ScheduleExpression: ScheduleExpression = null,
    SyncCompliance: AssociationSyncCompliance = null,
    Targets: Targets = null
  ): CreateAssociationBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName.asInstanceOf[js.Any])
    if (AutomationTargetParameterName != null) __obj.updateDynamic("AutomationTargetParameterName")(AutomationTargetParameterName.asInstanceOf[js.Any])
    if (ComplianceSeverity != null) __obj.updateDynamic("ComplianceSeverity")(ComplianceSeverity.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (SyncCompliance != null) __obj.updateDynamic("SyncCompliance")(SyncCompliance.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchRequestEntry]
  }
}

