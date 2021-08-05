package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteMembersRequest extends StObject {
  
  /**
    * The list of account IDs of the AWS accounts to invite to Security Hub as members. 
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}
object InviteMembersRequest {
  
  inline def apply(): InviteMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteMembersRequest]
  }
  
  extension [Self <: InviteMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
  }
}
