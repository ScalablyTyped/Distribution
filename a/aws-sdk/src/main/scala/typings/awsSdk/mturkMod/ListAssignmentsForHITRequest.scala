package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssignmentsForHITRequest extends StObject {
  
  /**
    * The status of the assignments to return: Submitted | Approved | Rejected
    */
  var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined
  
  /**
    * The ID of the HIT.
    */
  var HITId: EntityId
  
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssignmentsForHITRequest {
  
  inline def apply(HITId: EntityId): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
  
  extension [Self <: ListAssignmentsForHITRequest](x: Self) {
    
    inline def setAssignmentStatuses(value: AssignmentStatusList): Self = StObject.set(x, "AssignmentStatuses", value.asInstanceOf[js.Any])
    
    inline def setAssignmentStatusesUndefined: Self = StObject.set(x, "AssignmentStatuses", js.undefined)
    
    inline def setAssignmentStatusesVarargs(value: AssignmentStatus*): Self = StObject.set(x, "AssignmentStatuses", js.Array(value :_*))
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
