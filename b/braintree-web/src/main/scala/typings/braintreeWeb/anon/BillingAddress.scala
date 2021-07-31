package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAddress extends StObject {
  
  var billingAddress: js.UndefOr[js.Any] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var vault: js.UndefOr[Boolean] = js.undefined
}
object BillingAddress {
  
  @scala.inline
  def apply(): BillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAddress]
  }
  
  @scala.inline
  implicit class BillingAddressMutableBuilder[Self <: BillingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: js.Any): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    @scala.inline
    def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
