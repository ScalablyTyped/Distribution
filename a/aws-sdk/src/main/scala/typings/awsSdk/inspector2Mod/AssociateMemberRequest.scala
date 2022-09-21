package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMemberRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the member account to be associated.
    */
  var accountId: AccountId
}
object AssociateMemberRequest {
  
  inline def apply(accountId: AccountId): AssociateMemberRequest = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberRequest]
  }
  
  extension [Self <: AssociateMemberRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
