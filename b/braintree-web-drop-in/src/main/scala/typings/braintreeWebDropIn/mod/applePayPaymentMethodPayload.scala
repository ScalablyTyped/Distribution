package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.CardHolderName
import typings.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import org.scalablytyped.runtime.StObject
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
  implicit class applePayPaymentMethodPayloadMutableBuilder[Self <: applePayPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: CardHolderName): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApplePayCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
