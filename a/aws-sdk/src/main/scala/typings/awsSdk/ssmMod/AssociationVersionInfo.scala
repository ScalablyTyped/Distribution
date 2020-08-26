package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationVersionInfo extends js.Object {
  /**
    * By default, when you create a new associations, the system runs it immediately after it is created and then according to the schedule you specified. Specify this option if you don't want an association to run immediately after you create it.
    */
  var ApplyOnlyAtCronInterval: js.UndefOr[typings.awsSdk.ssmMod.ApplyOnlyAtCronInterval] = js.native
  /**
    * The ID created by the system when the association was created.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The name specified for the association version when the association version was created.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.native
  /**
    * The date the association version was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.native
  /**
    * The version of a Systems Manager document used when the association version was created.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The name specified when the association was created.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * The location in Amazon S3 specified for the association when the association version was created.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.native
  /**
    * Parameters specified when the association version was created.
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The cron or rate schedule specified for the association when the association version was created.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT. In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API action. In this case, compliance data is not managed by State Manager. It is managed by your direct call to the PutComplianceItems API action. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.native
  /**
    * The targets specified for the association when the association version was created. 
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}

object AssociationVersionInfo {
  @scala.inline
  def apply(): AssociationVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationVersionInfo]
  }
  @scala.inline
  implicit class AssociationVersionInfoOps[Self <: AssociationVersionInfo] (val x: Self) extends AnyVal {
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
    def setApplyOnlyAtCronInterval(value: ApplyOnlyAtCronInterval): Self = this.set("ApplyOnlyAtCronInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyOnlyAtCronInterval: Self = this.set("ApplyOnlyAtCronInterval", js.undefined)
    @scala.inline
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setAssociationName(value: AssociationName): Self = this.set("AssociationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationName: Self = this.set("AssociationName", js.undefined)
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = this.set("AssociationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationVersion: Self = this.set("AssociationVersion", js.undefined)
    @scala.inline
    def setComplianceSeverity(value: AssociationComplianceSeverity): Self = this.set("ComplianceSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceSeverity: Self = this.set("ComplianceSeverity", js.undefined)
    @scala.inline
    def setCreatedDate(value: DateTime): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutputLocation(value: InstanceAssociationOutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = this.set("ScheduleExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleExpression: Self = this.set("ScheduleExpression", js.undefined)
    @scala.inline
    def setSyncCompliance(value: AssociationSyncCompliance): Self = this.set("SyncCompliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncCompliance: Self = this.set("SyncCompliance", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

