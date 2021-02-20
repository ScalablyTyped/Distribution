package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignmentsForHITRequest extends StObject {
  
  /**
    * The status of the assignments to return: Submitted | Approved | Rejected
    */
  var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.native
  
  /**
    * The ID of the HIT.
    */
  var HITId: EntityId = js.native
  
  var MaxResults: js.UndefOr[ResultSize] = js.native
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssignmentsForHITRequest {
  
  @scala.inline
  def apply(HITId: EntityId): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
  
  @scala.inline
  implicit class ListAssignmentsForHITRequestMutableBuilder[Self <: ListAssignmentsForHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentStatuses(value: AssignmentStatusList): Self = StObject.set(x, "AssignmentStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentStatusesUndefined: Self = StObject.set(x, "AssignmentStatuses", js.undefined)
    
    @scala.inline
    def setAssignmentStatusesVarargs(value: AssignmentStatus*): Self = StObject.set(x, "AssignmentStatuses", js.Array(value :_*))
    
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
  }
}
