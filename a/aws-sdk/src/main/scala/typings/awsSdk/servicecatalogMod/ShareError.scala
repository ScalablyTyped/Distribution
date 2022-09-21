package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareError extends StObject {
  
  /**
    * List of accounts impacted by the error.
    */
  var Accounts: js.UndefOr[Namespaces] = js.undefined
  
  /**
    * Error type that happened when processing the operation.
    */
  var Error: js.UndefOr[typings.awsSdk.servicecatalogMod.Error] = js.undefined
  
  /**
    * Information about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.servicecatalogMod.Message] = js.undefined
}
object ShareError {
  
  inline def apply(): ShareError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareError]
  }
  
  extension [Self <: ShareError](x: Self) {
    
    inline def setAccounts(value: Namespaces): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: AccountId*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setError(value: Error): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
