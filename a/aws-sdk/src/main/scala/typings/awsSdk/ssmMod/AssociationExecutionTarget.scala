package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionTarget extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typings.awsSdk.ssmMod.OutputSource] = js.native
  /**
    * The resource ID, for example, the instance ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.native
  /**
    * The resource type, for example, instance.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.native
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecutionTarget {
  @scala.inline
  def apply(): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
  @scala.inline
  implicit class AssociationExecutionTargetOps[Self <: AssociationExecutionTarget] (val x: Self) extends AnyVal {
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
    def setAssociationVersion(value: AssociationVersion): Self = this.set("AssociationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationVersion: Self = this.set("AssociationVersion", js.undefined)
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = this.set("DetailedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedStatus: Self = this.set("DetailedStatus", js.undefined)
    @scala.inline
    def setExecutionId(value: AssociationExecutionId): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("ExecutionId", js.undefined)
    @scala.inline
    def setLastExecutionDate(value: DateTime): Self = this.set("LastExecutionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastExecutionDate: Self = this.set("LastExecutionDate", js.undefined)
    @scala.inline
    def setOutputSource(value: OutputSource): Self = this.set("OutputSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSource: Self = this.set("OutputSource", js.undefined)
    @scala.inline
    def setResourceId(value: AssociationResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: AssociationResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setStatus(value: StatusName): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

