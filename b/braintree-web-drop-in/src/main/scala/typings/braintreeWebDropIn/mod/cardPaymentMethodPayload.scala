package typings.braintreeWebDropIn.mod

import typings.braintreeWeb.threeDSecureMod.ThreeDSecureVerifyPayload
import typings.braintreeWebDropIn.anon.Bin
import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cardPaymentMethodPayload extends PaymentMethodPayload {
  
  var binData: typings.braintreeWebDropIn.mod.binData = js.native
  
  var details: Bin = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var liabilityShiftPossible: js.UndefOr[Boolean] = js.native
  
  var liabilityShifted: js.UndefOr[Boolean] = js.native
  
  var nonce: String = js.native
  
  var threeDSecureInfo: js.UndefOr[ThreeDSecureVerifyPayload] = js.native
  
  var `type`: CreditCard = js.native
  
  var vaulted: js.UndefOr[Boolean] = js.native
}
object cardPaymentMethodPayload {
  
  @scala.inline
  def apply(binData: binData, details: Bin, nonce: String, `type`: CreditCard): cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class cardPaymentMethodPayloadOps[Self <: cardPaymentMethodPayload] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: Bin): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CreditCard): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = this.set("liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiabilityShiftPossible: Self = this.set("liabilityShiftPossible", js.undefined)
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = this.set("liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiabilityShifted: Self = this.set("liabilityShifted", js.undefined)
    
    @scala.inline
    def setThreeDSecureInfo(value: ThreeDSecureVerifyPayload): Self = this.set("threeDSecureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreeDSecureInfo: Self = this.set("threeDSecureInfo", js.undefined)
    
    @scala.inline
    def setVaulted(value: Boolean): Self = this.set("vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaulted: Self = this.set("vaulted", js.undefined)
  }
}
