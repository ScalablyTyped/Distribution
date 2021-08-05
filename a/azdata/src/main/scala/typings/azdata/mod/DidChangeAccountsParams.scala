package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeAccountsParams extends StObject {
  
  // Updated accounts
  var accounts: js.Array[Account]
}
object DidChangeAccountsParams {
  
  inline def apply(accounts: js.Array[Account]): DidChangeAccountsParams = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeAccountsParams]
  }
  
  extension [Self <: DidChangeAccountsParams](x: Self) {
    
    inline def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
