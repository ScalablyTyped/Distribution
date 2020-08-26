package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalStateChangedEventMetadata extends js.Object {
  /**
    * The approval status for the pull request.
    */
  var approvalStatus: js.UndefOr[ApprovalState] = js.native
  /**
    * The revision ID of the pull request when the approval state changed.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object ApprovalStateChangedEventMetadata {
  @scala.inline
  def apply(): ApprovalStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
  }
  @scala.inline
  implicit class ApprovalStateChangedEventMetadataOps[Self <: ApprovalStateChangedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApprovalStatus(value: ApprovalState): Self = this.set("approvalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalStatus: Self = this.set("approvalStatus", js.undefined)
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
  
}

