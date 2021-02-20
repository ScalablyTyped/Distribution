package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.BillingAddress
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait paypalPaymentMethodPayload extends PaymentMethodPayload {
  
  var details: BillingAddress = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var `type`: PayPalAccount = js.native
  
  var vaulted: js.UndefOr[Boolean] = js.native
}
object paypalPaymentMethodPayload {
  
  @scala.inline
  def apply(details: BillingAddress, nonce: String, `type`: PayPalAccount): paypalPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[paypalPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class paypalPaymentMethodPayloadMutableBuilder[Self <: paypalPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: BillingAddress): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PayPalAccount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
