package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAccountsResponse extends StObject {
  
  /**
    * An array of account IDs.
    */
  var MemberAccounts: js.UndefOr[typings.awsSdk.fmsMod.MemberAccounts] = js.undefined
  
  /**
    * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMemberAccountsResponse {
  
  inline def apply(): ListMemberAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResponse]
  }
  
  extension [Self <: ListMemberAccountsResponse](x: Self) {
    
    inline def setMemberAccounts(value: MemberAccounts): Self = StObject.set(x, "MemberAccounts", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountsUndefined: Self = StObject.set(x, "MemberAccounts", js.undefined)
    
    inline def setMemberAccountsVarargs(value: AWSAccountId*): Self = StObject.set(x, "MemberAccounts", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
