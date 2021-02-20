package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIAMPolicyAssignmentsResponse extends StObject {
  
  /**
    * Information describing the IAM policy assignments.
    */
  var IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList] = js.native
  
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
object ListIAMPolicyAssignmentsResponse {
  
  @scala.inline
  def apply(): ListIAMPolicyAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIAMPolicyAssignmentsResponse]
  }
  
  @scala.inline
  implicit class ListIAMPolicyAssignmentsResponseMutableBuilder[Self <: ListIAMPolicyAssignmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIAMPolicyAssignments(value: IAMPolicyAssignmentSummaryList): Self = StObject.set(x, "IAMPolicyAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMPolicyAssignmentsUndefined: Self = StObject.set(x, "IAMPolicyAssignments", js.undefined)
    
    @scala.inline
    def setIAMPolicyAssignmentsVarargs(value: IAMPolicyAssignmentSummary*): Self = StObject.set(x, "IAMPolicyAssignments", js.Array(value :_*))
    
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
