package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountBalanceResponse extends StObject {
  
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.native
  
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.native
}
object GetAccountBalanceResponse {
  
  @scala.inline
  def apply(): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
  
  @scala.inline
  implicit class GetAccountBalanceResponseMutableBuilder[Self <: GetAccountBalanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableBalance(value: CurrencyAmount): Self = StObject.set(x, "AvailableBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableBalanceUndefined: Self = StObject.set(x, "AvailableBalance", js.undefined)
    
    @scala.inline
    def setOnHoldBalance(value: CurrencyAmount): Self = StObject.set(x, "OnHoldBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHoldBalanceUndefined: Self = StObject.set(x, "OnHoldBalance", js.undefined)
  }
}
