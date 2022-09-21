package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssignmentDeletionStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment deletion operation.
    */
  var AccountAssignmentsDeletionStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountAssignmentDeletionStatusResponse {
  
  inline def apply(): ListAccountAssignmentDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentDeletionStatusResponse]
  }
  
  extension [Self <: ListAccountAssignmentDeletionStatusResponse](x: Self) {
    
    inline def setAccountAssignmentsDeletionStatus(value: AccountAssignmentOperationStatusList): Self = StObject.set(x, "AccountAssignmentsDeletionStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountAssignmentsDeletionStatusUndefined: Self = StObject.set(x, "AccountAssignmentsDeletionStatus", js.undefined)
    
    inline def setAccountAssignmentsDeletionStatusVarargs(value: AccountAssignmentOperationStatusMetadata*): Self = StObject.set(x, "AccountAssignmentsDeletionStatus", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
