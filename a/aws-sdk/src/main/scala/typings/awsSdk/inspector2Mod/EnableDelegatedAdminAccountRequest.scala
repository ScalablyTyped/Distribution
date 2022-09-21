package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDelegatedAdminAccountRequest extends StObject {
  
  /**
    * The idempotency token for the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
    */
  var delegatedAdminAccountId: AccountId
}
object EnableDelegatedAdminAccountRequest {
  
  inline def apply(delegatedAdminAccountId: AccountId): EnableDelegatedAdminAccountRequest = {
    val __obj = js.Dynamic.literal(delegatedAdminAccountId = delegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDelegatedAdminAccountRequest]
  }
  
  extension [Self <: EnableDelegatedAdminAccountRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "delegatedAdminAccountId", value.asInstanceOf[js.Any])
  }
}
