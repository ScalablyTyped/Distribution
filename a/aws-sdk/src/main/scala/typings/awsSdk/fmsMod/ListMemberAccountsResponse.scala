package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberAccountsResponse extends StObject {
  
  /**
    * An array of account IDs.
    */
  var MemberAccounts: js.UndefOr[typings.awsSdk.fmsMod.MemberAccounts] = js.native
  
  /**
    * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListMemberAccountsResponse {
  
  @scala.inline
  def apply(): ListMemberAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResponse]
  }
  
  @scala.inline
  implicit class ListMemberAccountsResponseMutableBuilder[Self <: ListMemberAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccounts(value: MemberAccounts): Self = StObject.set(x, "MemberAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountsUndefined: Self = StObject.set(x, "MemberAccounts", js.undefined)
    
    @scala.inline
    def setMemberAccountsVarargs(value: AWSAccountId*): Self = StObject.set(x, "MemberAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
