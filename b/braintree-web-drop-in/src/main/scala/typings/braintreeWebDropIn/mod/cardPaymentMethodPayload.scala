package typings.braintreeWebDropIn.mod

import typings.braintreeWeb.threeDSecureMod.ThreeDSecureVerifyPayload
import typings.braintreeWebDropIn.anon.Bin
import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cardPaymentMethodPayload
  extends StObject
     with PaymentMethodPayload {
  
  var binData: typings.braintreeWebDropIn.mod.binData
  
  var details: Bin
  
  var deviceData: js.UndefOr[String] = js.undefined
  
  var liabilityShiftPossible: js.UndefOr[Boolean] = js.undefined
  
  var liabilityShifted: js.UndefOr[Boolean] = js.undefined
  
  var nonce: String
  
  var threeDSecureInfo: js.UndefOr[ThreeDSecureVerifyPayload] = js.undefined
  
  var `type`: CreditCard
  
  var vaulted: js.UndefOr[Boolean] = js.undefined
}
object cardPaymentMethodPayload {
  
  @scala.inline
  def apply(binData: binData, details: Bin, nonce: String): cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CreditCard")
    __obj.asInstanceOf[cardPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class cardPaymentMethodPayloadMutableBuilder[Self <: cardPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Bin): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftPossibleUndefined: Self = StObject.set(x, "liabilityShiftPossible", js.undefined)
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftedUndefined: Self = StObject.set(x, "liabilityShifted", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureInfo(value: ThreeDSecureVerifyPayload): Self = StObject.set(x, "threeDSecureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureInfoUndefined: Self = StObject.set(x, "threeDSecureInfo", js.undefined)
    
    @scala.inline
    def setType(value: CreditCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
