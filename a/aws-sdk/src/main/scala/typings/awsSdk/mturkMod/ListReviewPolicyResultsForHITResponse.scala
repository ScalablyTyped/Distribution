package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReviewPolicyResultsForHITResponse extends StObject {
  
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
  implicit class ListReviewPolicyResultsForHITResponseMutableBuilder[Self <: ListReviewPolicyResultsForHITResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "AssignmentReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentReviewPolicyUndefined: Self = StObject.set(x, "AssignmentReviewPolicy", js.undefined)
    
    @scala.inline
    def setAssignmentReviewReport(value: ReviewReport): Self = StObject.set(x, "AssignmentReviewReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentReviewReportUndefined: Self = StObject.set(x, "AssignmentReviewReport", js.undefined)
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    @scala.inline
    def setHITReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "HITReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITReviewPolicyUndefined: Self = StObject.set(x, "HITReviewPolicy", js.undefined)
    
    @scala.inline
    def setHITReviewReport(value: ReviewReport): Self = StObject.set(x, "HITReviewReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITReviewReportUndefined: Self = StObject.set(x, "HITReviewReport", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
