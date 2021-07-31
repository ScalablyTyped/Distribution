package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.BillingAddress
import typings.braintreeWebDropIn.anon.Bin
import typings.braintreeWebDropIn.anon.CardHolderName
import typings.braintreeWebDropIn.anon.CardType
import typings.braintreeWebDropIn.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.braintreeWebDropIn.mod.applePayPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.cardPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.googlePayPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.paypalPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.venmoPaymentMethodPayload
*/
trait PaymentMethodPayload extends StObject
object PaymentMethodPayload {
  
  @scala.inline
  def applePayPaymentMethodPayload(binData: binData, description: String, details: CardHolderName, nonce: String): typings.braintreeWebDropIn.mod.applePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ApplePayCard")
    __obj.asInstanceOf[typings.braintreeWebDropIn.mod.applePayPaymentMethodPayload]
  }
  
  @scala.inline
  def cardPaymentMethodPayload(binData: binData, details: Bin, nonce: String): typings.braintreeWebDropIn.mod.cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CreditCard")
    __obj.asInstanceOf[typings.braintreeWebDropIn.mod.cardPaymentMethodPayload]
  }
  
  @scala.inline
  def googlePayPaymentMethodPayload(binData: binData, details: CardType, nonce: String): typings.braintreeWebDropIn.mod.googlePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AndroidPayCard")
    __obj.asInstanceOf[typings.braintreeWebDropIn.mod.googlePayPaymentMethodPayload]
  }
  
  @scala.inline
  def paypalPaymentMethodPayload(details: BillingAddress, nonce: String): typings.braintreeWebDropIn.mod.paypalPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PayPalAccount")
    __obj.asInstanceOf[typings.braintreeWebDropIn.mod.paypalPaymentMethodPayload]
  }
  
  @scala.inline
  def venmoPaymentMethodPayload(details: Username, nonce: String): typings.braintreeWebDropIn.mod.venmoPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VenmoAccount")
    __obj.asInstanceOf[typings.braintreeWebDropIn.mod.venmoPaymentMethodPayload]
  }
}
