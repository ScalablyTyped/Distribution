package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountAssignmentsResponse extends StObject {
  
  /**
    * The list of assignments that match the input AWS account and permission set.
    */
  var AccountAssignments: js.UndefOr[AccountAssignmentList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountAssignmentsResponse {
  
  @scala.inline
  def apply(): ListAccountAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentsResponse]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentsResponseMutableBuilder[Self <: ListAccountAssignmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAssignments(value: AccountAssignmentList): Self = StObject.set(x, "AccountAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAssignmentsUndefined: Self = StObject.set(x, "AccountAssignments", js.undefined)
    
    @scala.inline
    def setAccountAssignmentsVarargs(value: AccountAssignment*): Self = StObject.set(x, "AccountAssignments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
