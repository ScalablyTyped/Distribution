package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReviewPolicyResultsForHITResponse extends js.Object {
  
  /**
    *  The name of the Assignment-level Review Policy. This contains only the PolicyName element. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  
  /**
    *  Contains both ReviewResult and ReviewAction elements for an Assignment. 
    */
  var AssignmentReviewReport: js.UndefOr[ReviewReport] = js.native
  
  /**
    * The HITId of the HIT for which results have been returned.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  
  /**
    * The name of the HIT-level Review Policy. This contains only the PolicyName element.
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  
  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT. 
    */
  var HITReviewReport: js.UndefOr[ReviewReport] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListReviewPolicyResultsForHITResponse {
  
  @scala.inline
  def apply(): ListReviewPolicyResultsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewPolicyResultsForHITResponse]
  }
  
  @scala.inline
  implicit class ListReviewPolicyResultsForHITResponseOps[Self <: ListReviewPolicyResultsForHITResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignmentReviewPolicy(value: ReviewPolicy): Self = this.set("AssignmentReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentReviewPolicy: Self = this.set("AssignmentReviewPolicy", js.undefined)
    
    @scala.inline
    def setAssignmentReviewReport(value: ReviewReport): Self = this.set("AssignmentReviewReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentReviewReport: Self = this.set("AssignmentReviewReport", js.undefined)
    
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHITId: Self = this.set("HITId", js.undefined)
    
    @scala.inline
    def setHITReviewPolicy(value: ReviewPolicy): Self = this.set("HITReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHITReviewPolicy: Self = this.set("HITReviewPolicy", js.undefined)
    
    @scala.inline
    def setHITReviewReport(value: ReviewReport): Self = this.set("HITReviewReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHITReviewReport: Self = this.set("HITReviewReport", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
