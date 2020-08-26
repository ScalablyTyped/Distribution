package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchStatus extends js.Object {
  /**
    * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
    */
  var ApprovalDate: js.UndefOr[DateTime] = js.native
  /**
    * The compliance severity level for a patch.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
    */
  var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.native
}

object PatchStatus {
  @scala.inline
  def apply(): PatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStatus]
  }
  @scala.inline
  implicit class PatchStatusOps[Self <: PatchStatus] (val x: Self) extends AnyVal {
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
    def setApprovalDate(value: DateTime): Self = this.set("ApprovalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalDate: Self = this.set("ApprovalDate", js.undefined)
    @scala.inline
    def setComplianceLevel(value: PatchComplianceLevel): Self = this.set("ComplianceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceLevel: Self = this.set("ComplianceLevel", js.undefined)
    @scala.inline
    def setDeploymentStatus(value: PatchDeploymentStatus): Self = this.set("DeploymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStatus: Self = this.set("DeploymentStatus", js.undefined)
  }
  
}

