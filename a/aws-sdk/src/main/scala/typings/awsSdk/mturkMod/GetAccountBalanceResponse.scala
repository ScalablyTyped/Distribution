package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountBalanceResponse extends StObject {
  
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.undefined
  
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.undefined
}
object GetAccountBalanceResponse {
  
  inline def apply(): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
  
  extension [Self <: GetAccountBalanceResponse](x: Self) {
    
    inline def setAvailableBalance(value: CurrencyAmount): Self = StObject.set(x, "AvailableBalance", value.asInstanceOf[js.Any])
    
    inline def setAvailableBalanceUndefined: Self = StObject.set(x, "AvailableBalance", js.undefined)
    
    inline def setOnHoldBalance(value: CurrencyAmount): Self = StObject.set(x, "OnHoldBalance", value.asInstanceOf[js.Any])
    
    inline def setOnHoldBalanceUndefined: Self = StObject.set(x, "OnHoldBalance", js.undefined)
  }
}
