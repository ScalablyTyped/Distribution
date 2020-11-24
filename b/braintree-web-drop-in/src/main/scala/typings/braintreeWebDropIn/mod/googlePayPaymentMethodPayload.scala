package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.CardType
import typings.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait googlePayPaymentMethodPayload extends PaymentMethodPayload {
  
  var binData: typings.braintreeWebDropIn.mod.binData = js.native
  
  var details: CardType = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var `type`: AndroidPayCard = js.native
}
object googlePayPaymentMethodPayload {
  
  @scala.inline
  def apply(binData: binData, details: CardType, nonce: String, `type`: AndroidPayCard): googlePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[googlePayPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class googlePayPaymentMethodPayloadOps[Self <: googlePayPaymentMethodPayload] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: CardType): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AndroidPayCard): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
  }
}
