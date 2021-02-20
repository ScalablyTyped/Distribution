package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountAssignmentCreationStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentsCreationStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAccountAssignmentCreationStatusResponse {
  
  @scala.inline
  def apply(): ListAccountAssignmentCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentCreationStatusResponse]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentCreationStatusResponseMutableBuilder[Self <: ListAccountAssignmentCreationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAssignmentsCreationStatus(value: AccountAssignmentOperationStatusList): Self = StObject.set(x, "AccountAssignmentsCreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAssignmentsCreationStatusUndefined: Self = StObject.set(x, "AccountAssignmentsCreationStatus", js.undefined)
    
    @scala.inline
    def setAccountAssignmentsCreationStatusVarargs(value: AccountAssignmentOperationStatusMetadata*): Self = StObject.set(x, "AccountAssignmentsCreationStatus", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
