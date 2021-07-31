package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalResult extends StObject {
  
  /**
    * The response submitted by a reviewer assigned to an approval action request.
    */
  var status: ApprovalStatus
  
  /**
    * The summary of the current status of the approval request.
    */
  var summary: ApprovalSummary
}
object ApprovalResult {
  
  @scala.inline
  def apply(status: ApprovalStatus, summary: ApprovalSummary): ApprovalResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalResult]
  }
  
  @scala.inline
  implicit class ApprovalResultMutableBuilder[Self <: ApprovalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ApprovalStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: ApprovalSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
