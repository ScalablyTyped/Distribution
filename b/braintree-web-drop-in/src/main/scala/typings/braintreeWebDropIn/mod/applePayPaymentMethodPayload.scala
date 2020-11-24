package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.CardHolderName
import typings.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait applePayPaymentMethodPayload extends PaymentMethodPayload {
  
  var binData: typings.braintreeWebDropIn.mod.binData = js.native
  
  var description: String = js.native
  
  var details: CardHolderName = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var `type`: ApplePayCard = js.native
  
  var vaulted: js.UndefOr[Boolean] = js.native
}
object applePayPaymentMethodPayload {
  
  @scala.inline
  def apply(
    binData: binData,
    description: String,
    details: CardHolderName,
    nonce: String,
    `type`: ApplePayCard
  ): applePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class applePayPaymentMethodPayloadOps[Self <: applePayPaymentMethodPayload] (val x: Self) extends AnyVal {
    
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
    def setBinData(value: binData): Self = this.set("binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: CardHolderName): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApplePayCard): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
