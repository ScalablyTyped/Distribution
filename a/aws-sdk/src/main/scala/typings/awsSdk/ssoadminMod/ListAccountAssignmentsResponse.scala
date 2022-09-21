package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssignmentsResponse extends StObject {
  
  /**
    * The list of assignments that match the input AWS account and permission set.
    */
  var AccountAssignments: js.UndefOr[AccountAssignmentList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountAssignmentsResponse {
  
  inline def apply(): ListAccountAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentsResponse]
  }
  
  extension [Self <: ListAccountAssignmentsResponse](x: Self) {
    
    inline def setAccountAssignments(value: AccountAssignmentList): Self = StObject.set(x, "AccountAssignments", value.asInstanceOf[js.Any])
    
    inline def setAccountAssignmentsUndefined: Self = StObject.set(x, "AccountAssignments", js.undefined)
    
    inline def setAccountAssignmentsVarargs(value: AccountAssignment*): Self = StObject.set(x, "AccountAssignments", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
