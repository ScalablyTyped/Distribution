package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDelegatedAdminAccountResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the successfully disabled delegated administrator.
    */
  var delegatedAdminAccountId: AccountId
}
object DisableDelegatedAdminAccountResponse {
  
  inline def apply(delegatedAdminAccountId: AccountId): DisableDelegatedAdminAccountResponse = {
    val __obj = js.Dynamic.literal(delegatedAdminAccountId = delegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDelegatedAdminAccountResponse]
  }
  
  extension [Self <: DisableDelegatedAdminAccountResponse](x: Self) {
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "delegatedAdminAccountId", value.asInstanceOf[js.Any])
  }
}
