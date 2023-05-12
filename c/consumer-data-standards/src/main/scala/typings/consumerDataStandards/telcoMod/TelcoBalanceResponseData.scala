package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Services
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBalanceResponseData
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
object TelcoBalanceResponseData {
  
  inline def apply(): TelcoBalanceResponseData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoBalanceResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBalanceResponseData] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBalance(value: Services): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
  }
}
