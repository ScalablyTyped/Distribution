package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableResponse extends StObject {
  
  /**
    * Information on the accounts that have had Amazon Inspector scans successfully enabled. Details are provided for each account.
    */
  var accounts: AccountList
  
  /**
    * Information on any accounts for which Amazon Inspector scans could not be enabled. Details are provided for each account.
    */
  var failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
}
object EnableResponse {
  
  inline def apply(accounts: AccountList): EnableResponse = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableResponse]
  }
  
  extension [Self <: EnableResponse](x: Self) {
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setFailedAccounts(value: FailedAccountList): Self = StObject.set(x, "failedAccounts", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountsUndefined: Self = StObject.set(x, "failedAccounts", js.undefined)
    
    inline def setFailedAccountsVarargs(value: FailedAccount*): Self = StObject.set(x, "failedAccounts", js.Array(value*))
  }
}
