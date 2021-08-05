package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMembersRequest extends StObject {
  
  /**
    * The account IDs of the member accounts to disassociate from the master account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}
object DisassociateMembersRequest {
  
  inline def apply(): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  
  extension [Self <: DisassociateMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
