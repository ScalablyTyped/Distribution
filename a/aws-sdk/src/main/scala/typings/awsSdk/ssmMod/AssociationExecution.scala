package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecution extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID for the association.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[typings.awsSdk.ssmMod.ResourceCountByStatus] = js.native
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecution {
  @scala.inline
  def apply(): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecution]
  }
  @scala.inline
  implicit class AssociationExecutionOps[Self <: AssociationExecution] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
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
    def setResourceCountByStatus(value: ResourceCountByStatus): Self = this.set("ResourceCountByStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCountByStatus: Self = this.set("ResourceCountByStatus", js.undefined)
    @scala.inline
    def setStatus(value: StatusName): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

