package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAccountsResult extends StObject {
  
  /**
    * (Discontinued) A list of the Amazon Macie Classic member accounts returned by the action. The current Macie Classic administrator account is also included in this list.
    */
  var memberAccounts: js.UndefOr[MemberAccounts] = js.undefined
  
  /**
    * (Discontinued) When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMemberAccountsResult {
  
  inline def apply(): ListMemberAccountsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResult]
  }
  
  extension [Self <: ListMemberAccountsResult](x: Self) {
    
    inline def setMemberAccounts(value: MemberAccounts): Self = StObject.set(x, "memberAccounts", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountsUndefined: Self = StObject.set(x, "memberAccounts", js.undefined)
    
    inline def setMemberAccountsVarargs(value: MemberAccount*): Self = StObject.set(x, "memberAccounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
