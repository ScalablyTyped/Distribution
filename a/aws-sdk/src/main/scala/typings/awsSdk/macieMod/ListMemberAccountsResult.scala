package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAccountsResult extends StObject {
  
  /**
    * A list of the Amazon Macie Classic member accounts returned by the action. The current master account is also included in this list. 
    */
  var memberAccounts: js.UndefOr[MemberAccounts] = js.undefined
  
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMemberAccountsResult {
  
  @scala.inline
  def apply(): ListMemberAccountsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResult]
  }
  
  @scala.inline
  implicit class ListMemberAccountsResultMutableBuilder[Self <: ListMemberAccountsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccounts(value: MemberAccounts): Self = StObject.set(x, "memberAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountsUndefined: Self = StObject.set(x, "memberAccounts", js.undefined)
    
    @scala.inline
    def setMemberAccountsVarargs(value: MemberAccount*): Self = StObject.set(x, "memberAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
