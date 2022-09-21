package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIAMPolicyAssignmentsForUserResponse extends StObject {
  
  /**
    * The active assignments for this user.
    */
  var ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListIAMPolicyAssignmentsForUserResponse {
  
  inline def apply(): ListIAMPolicyAssignmentsForUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserResponse]
  }
  
  extension [Self <: ListIAMPolicyAssignmentsForUserResponse](x: Self) {
    
    inline def setActiveAssignments(value: ActiveIAMPolicyAssignmentList): Self = StObject.set(x, "ActiveAssignments", value.asInstanceOf[js.Any])
    
    inline def setActiveAssignmentsUndefined: Self = StObject.set(x, "ActiveAssignments", js.undefined)
    
    inline def setActiveAssignmentsVarargs(value: ActiveIAMPolicyAssignment*): Self = StObject.set(x, "ActiveAssignments", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
