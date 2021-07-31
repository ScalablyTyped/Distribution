package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReviewPolicyResultsForHITRequest extends StObject {
  
  /**
    * The unique identifier of the HIT to retrieve review results for.
    */
  var HITId: EntityId
  
  /**
    * Limit the number of results returned.
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to retrieve all data for both policy levels. For a list of all the described policies, see Review Policies. 
    */
  var PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined
  
  /**
    *  Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their outcomes. 
    */
  var RetrieveActions: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specify if the operation should retrieve a list of the results computed by the Review Policies. 
    */
  var RetrieveResults: js.UndefOr[Boolean] = js.undefined
}
object ListReviewPolicyResultsForHITRequest {
  
  @scala.inline
  def apply(HITId: EntityId): ListReviewPolicyResultsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewPolicyResultsForHITRequest]
  }
  
  @scala.inline
  implicit class ListReviewPolicyResultsForHITRequestMutableBuilder[Self <: ListReviewPolicyResultsForHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyLevels(value: ReviewPolicyLevelList): Self = StObject.set(x, "PolicyLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyLevelsUndefined: Self = StObject.set(x, "PolicyLevels", js.undefined)
    
    @scala.inline
    def setPolicyLevelsVarargs(value: ReviewPolicyLevel*): Self = StObject.set(x, "PolicyLevels", js.Array(value :_*))
    
    @scala.inline
    def setRetrieveActions(value: Boolean): Self = StObject.set(x, "RetrieveActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveActionsUndefined: Self = StObject.set(x, "RetrieveActions", js.undefined)
    
    @scala.inline
    def setRetrieveResults(value: Boolean): Self = StObject.set(x, "RetrieveResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveResultsUndefined: Self = StObject.set(x, "RetrieveResults", js.undefined)
  }
}
