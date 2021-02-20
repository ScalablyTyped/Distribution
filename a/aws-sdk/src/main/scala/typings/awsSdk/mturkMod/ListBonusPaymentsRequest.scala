package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBonusPaymentsRequest extends StObject {
  
  /**
    * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  
  /**
    * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var HITId: js.UndefOr[EntityId] = js.native
  
  var MaxResults: js.UndefOr[ResultSize] = js.native
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListBonusPaymentsRequest {
  
  @scala.inline
  def apply(): ListBonusPaymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsRequest]
  }
  
  @scala.inline
  implicit class ListBonusPaymentsRequestMutableBuilder[Self <: ListBonusPaymentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
