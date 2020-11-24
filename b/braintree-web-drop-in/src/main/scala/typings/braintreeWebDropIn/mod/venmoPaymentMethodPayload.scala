package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.Username
import typings.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
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
  implicit class venmoPaymentMethodPayloadOps[Self <: venmoPaymentMethodPayload] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: Username): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VenmoAccount): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
