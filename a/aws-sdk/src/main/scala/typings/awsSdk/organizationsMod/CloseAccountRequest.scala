package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseAccountRequest extends StObject {
  
  /**
    * Retrieves the Amazon Web Services account Id for the current CloseAccount API request. 
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId
}
object CloseAccountRequest {
  
  inline def apply(AccountId: AccountId): CloseAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseAccountRequest]
  }
  
  extension [Self <: CloseAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
