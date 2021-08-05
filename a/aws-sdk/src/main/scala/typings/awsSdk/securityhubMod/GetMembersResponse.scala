package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembersResponse extends StObject {
  
  /**
    * The list of details about the Security Hub member accounts.
    */
  var Members: js.UndefOr[MemberList] = js.undefined
  
  /**
    * The list of AWS accounts that could not be processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}
object GetMembersResponse {
  
  inline def apply(): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembersResponse]
  }
  
  extension [Self <: GetMembersResponse](x: Self) {
    
    inline def setMembers(value: MemberList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    inline def setUnprocessedAccounts(value: ResultList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    inline def setUnprocessedAccountsVarargs(value: Result*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
