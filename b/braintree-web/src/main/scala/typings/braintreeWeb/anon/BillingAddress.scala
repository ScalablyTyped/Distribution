package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAddress extends StObject {
  
  var billingAddress: js.UndefOr[Any] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var vault: js.UndefOr[Boolean] = js.undefined
}
object BillingAddress {
  
  inline def apply(): BillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAddress]
  }
  
  extension [Self <: BillingAddress](x: Self) {
    
    inline def setBillingAddress(value: Any): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
