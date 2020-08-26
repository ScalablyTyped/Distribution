package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleEventMetadata extends js.Object {
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.native
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.native
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.native
}

object ApprovalRuleEventMetadata {
  @scala.inline
  def apply(): ApprovalRuleEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleEventMetadata]
  }
  @scala.inline
  implicit class ApprovalRuleEventMetadataOps[Self <: ApprovalRuleEventMetadata] (val x: Self) extends AnyVal {
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
    def setApprovalRuleContent(value: ApprovalRuleContent): Self = this.set("approvalRuleContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleContent: Self = this.set("approvalRuleContent", js.undefined)
    @scala.inline
    def setApprovalRuleId(value: ApprovalRuleId): Self = this.set("approvalRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleId: Self = this.set("approvalRuleId", js.undefined)
    @scala.inline
    def setApprovalRuleName(value: ApprovalRuleName): Self = this.set("approvalRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleName: Self = this.set("approvalRuleName", js.undefined)
  }
  
}

