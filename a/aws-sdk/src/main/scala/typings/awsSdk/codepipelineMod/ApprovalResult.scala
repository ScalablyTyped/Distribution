package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalResult extends js.Object {
  
  /**
    * The response submitted by a reviewer assigned to an approval action request.
    */
  var status: ApprovalStatus = js.native
  
  /**
    * The summary of the current status of the approval request.
    */
  var summary: ApprovalSummary = js.native
}
object ApprovalResult {
  
  @scala.inline
  def apply(status: ApprovalStatus, summary: ApprovalSummary): ApprovalResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalResult]
  }
  
  @scala.inline
  implicit class ApprovalResultOps[Self <: ApprovalResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ApprovalStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: ApprovalSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
}
