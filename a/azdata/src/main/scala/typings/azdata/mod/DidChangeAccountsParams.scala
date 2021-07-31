package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeAccountsParams extends StObject {
  
  // Updated accounts
  var accounts: js.Array[Account]
}
object DidChangeAccountsParams {
  
  @scala.inline
  def apply(accounts: js.Array[Account]): DidChangeAccountsParams = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeAccountsParams]
  }
  
  @scala.inline
  implicit class DidChangeAccountsParamsMutableBuilder[Self <: DidChangeAccountsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
