package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationStatusInfo extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The name of the association applied to the instance.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * The version of the association applied to the instance.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * Detailed status information about the instance association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The association document versions.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.native
  /**
    * The date the instance association ran. 
    */
  var ExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.native
  /**
    * The instance ID where the association was created.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * A URL for an S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.native
  /**
    * Status information about the instance association.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object InstanceAssociationStatusInfo {
  @scala.inline
  def apply(): InstanceAssociationStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
  @scala.inline
  implicit class InstanceAssociationStatusInfoOps[Self <: InstanceAssociationStatusInfo] (val x: Self) extends AnyVal {
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
    def setDetailedStatus(value: StatusName): Self = this.set("DetailedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedStatus: Self = this.set("DetailedStatus", js.undefined)
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setErrorCode(value: AgentErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setExecutionDate(value: DateTime): Self = this.set("ExecutionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionDate: Self = this.set("ExecutionDate", js.undefined)
    @scala.inline
    def setExecutionSummary(value: InstanceAssociationExecutionSummary): Self = this.set("ExecutionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionSummary: Self = this.set("ExecutionSummary", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutputUrl(value: InstanceAssociationOutputUrl): Self = this.set("OutputUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUrl: Self = this.set("OutputUrl", js.undefined)
    @scala.inline
    def setStatus(value: StatusName): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

