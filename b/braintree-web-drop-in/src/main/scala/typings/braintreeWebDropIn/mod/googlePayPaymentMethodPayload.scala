package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.CardType
import typings.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import org.scalablytyped.runtime.StObject
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
  implicit class googlePayPaymentMethodPayloadMutableBuilder[Self <: googlePayPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: CardType): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AndroidPayCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
