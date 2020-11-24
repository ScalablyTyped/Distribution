package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalRuleOverriddenEventMetadata extends js.Object {
  
  /**
    * The status of the override event.
    */
  var overrideStatus: js.UndefOr[OverrideStatus] = js.native
  
  /**
    * The revision ID of the pull request when the override event occurred.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}
object ApprovalRuleOverriddenEventMetadata {
  
  @scala.inline
  def apply(): ApprovalRuleOverriddenEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
  }
  
  @scala.inline
  implicit class ApprovalRuleOverriddenEventMetadataOps[Self <: ApprovalRuleOverriddenEventMetadata] (val x: Self) extends AnyVal {
    
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
    def setOverrideStatus(value: OverrideStatus): Self = this.set("overrideStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideStatus: Self = this.set("overrideStatus", js.undefined)
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
