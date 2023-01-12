package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.CardHolderName
import typings.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait applePayPaymentMethodPayload
  extends StObject
     with PaymentMethodPayload {
  
  var binData: typings.braintreeWebDropIn.mod.binData
  
  var description: String
  
  var details: CardHolderName
  
  var deviceData: js.UndefOr[String] = js.undefined
  
  var nonce: String
  
  var `type`: ApplePayCard
  
  var vaulted: js.UndefOr[Boolean] = js.undefined
}
object applePayPaymentMethodPayload {
  
  inline def apply(binData: binData, description: String, details: CardHolderName, nonce: String): applePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ApplePayCard")
    __obj.asInstanceOf[applePayPaymentMethodPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: applePayPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    inline def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: CardHolderName): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    inline def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setType(value: ApplePayCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    inline def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
