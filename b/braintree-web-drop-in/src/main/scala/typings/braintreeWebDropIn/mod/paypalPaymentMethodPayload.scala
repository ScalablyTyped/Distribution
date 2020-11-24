package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.BillingAddress
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
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
  implicit class paypalPaymentMethodPayloadOps[Self <: paypalPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetails(value: BillingAddress): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PayPalAccount): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
    
    @scala.inline
    def setVaulted(value: Boolean): Self = this.set("vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaulted: Self = this.set("vaulted", js.undefined)
  }
}
