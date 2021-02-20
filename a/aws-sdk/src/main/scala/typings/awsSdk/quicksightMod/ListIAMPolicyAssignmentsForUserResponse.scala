package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIAMPolicyAssignmentsForUserResponse extends StObject {
  
  /**
    * The active assignments for this user.
    */
  var ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList] = js.native
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListIAMPolicyAssignmentsForUserResponse {
  
  @scala.inline
  def apply(): ListIAMPolicyAssignmentsForUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserResponse]
  }
  
  @scala.inline
  implicit class ListIAMPolicyAssignmentsForUserResponseMutableBuilder[Self <: ListIAMPolicyAssignmentsForUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAssignments(value: ActiveIAMPolicyAssignmentList): Self = StObject.set(x, "ActiveAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAssignmentsUndefined: Self = StObject.set(x, "ActiveAssignments", js.undefined)
    
    @scala.inline
    def setActiveAssignmentsVarargs(value: ActiveIAMPolicyAssignment*): Self = StObject.set(x, "ActiveAssignments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
