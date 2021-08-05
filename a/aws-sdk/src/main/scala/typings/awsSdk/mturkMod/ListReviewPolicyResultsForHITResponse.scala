package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReviewPolicyResultsForHITResponse extends StObject {
  
  /**
    *  The name of the Assignment-level Review Policy. This contains only the PolicyName element. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
  
  /**
    *  Contains both ReviewResult and ReviewAction elements for an Assignment. 
    */
  var AssignmentReviewReport: js.UndefOr[ReviewReport] = js.undefined
  
  /**
    * The HITId of the HIT for which results have been returned.
    */
  var HITId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The name of the HIT-level Review Policy. This contains only the PolicyName element.
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
  
  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT. 
    */
  var HITReviewReport: js.UndefOr[ReviewReport] = js.undefined
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListReviewPolicyResultsForHITResponse {
  
  inline def apply(): ListReviewPolicyResultsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewPolicyResultsForHITResponse]
  }
  
  extension [Self <: ListReviewPolicyResultsForHITResponse](x: Self) {
    
    inline def setAssignmentReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "AssignmentReviewPolicy", value.asInstanceOf[js.Any])
    
    inline def setAssignmentReviewPolicyUndefined: Self = StObject.set(x, "AssignmentReviewPolicy", js.undefined)
    
    inline def setAssignmentReviewReport(value: ReviewReport): Self = StObject.set(x, "AssignmentReviewReport", value.asInstanceOf[js.Any])
    
    inline def setAssignmentReviewReportUndefined: Self = StObject.set(x, "AssignmentReviewReport", js.undefined)
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    inline def setHITReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "HITReviewPolicy", value.asInstanceOf[js.Any])
    
    inline def setHITReviewPolicyUndefined: Self = StObject.set(x, "HITReviewPolicy", js.undefined)
    
    inline def setHITReviewReport(value: ReviewReport): Self = StObject.set(x, "HITReviewReport", value.asInstanceOf[js.Any])
    
    inline def setHITReviewReportUndefined: Self = StObject.set(x, "HITReviewReport", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
