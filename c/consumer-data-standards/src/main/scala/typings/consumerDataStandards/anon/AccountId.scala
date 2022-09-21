package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * ID of the account that is the source of funds for the payment
    */
  var accountId: String
}
object AccountId {
  
  inline def apply(accountId: String): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
  
  extension [Self <: AccountId](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
