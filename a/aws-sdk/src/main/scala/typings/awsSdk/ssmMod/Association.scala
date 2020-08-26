package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Association extends js.Object {
  /**
    * The ID created by the system when you create an association. An association is a binding between a document and a set of targets with a schedule.
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
    * The version of the document used in the association.
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
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.native
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The instances targeted by the request to create an association. 
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}

object Association {
  @scala.inline
  def apply(): Association = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Association]
  }
  @scala.inline
  implicit class AssociationOps[Self <: Association] (val x: Self) extends AnyVal {
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
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setLastExecutionDate(value: DateTime): Self = this.set("LastExecutionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastExecutionDate: Self = this.set("LastExecutionDate", js.undefined)
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOverview(value: AssociationOverview): Self = this.set("Overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("Overview", js.undefined)
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = this.set("ScheduleExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleExpression: Self = this.set("ScheduleExpression", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

