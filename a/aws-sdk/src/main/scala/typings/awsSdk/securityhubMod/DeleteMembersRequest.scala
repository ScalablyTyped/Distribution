package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersRequest extends StObject {
  
  /**
    * The list of account IDs for the member accounts to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}
object DeleteMembersRequest {
  
  inline def apply(): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  extension [Self <: DeleteMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
