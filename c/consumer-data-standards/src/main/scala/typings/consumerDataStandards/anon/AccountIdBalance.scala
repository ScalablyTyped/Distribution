package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdBalance
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The ID of the account. In accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Object containing account service usage summary
    */
  var balance: js.UndefOr[Services] = js.undefined
}
object AccountIdBalance {
  
  inline def apply(): AccountIdBalance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountIdBalance] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBalance(value: Services): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
  }
}
