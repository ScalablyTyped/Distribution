package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.Username
import typings.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait venmoPaymentMethodPayload extends PaymentMethodPayload {
  
  var details: Username = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var `type`: VenmoAccount = js.native
  
  var vaulted: js.UndefOr[Boolean] = js.native
}
object venmoPaymentMethodPayload {
  
  @scala.inline
  def apply(details: Username, nonce: String, `type`: VenmoAccount): venmoPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[venmoPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class venmoPaymentMethodPayloadMutableBuilder[Self <: venmoPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Username): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VenmoAccount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
