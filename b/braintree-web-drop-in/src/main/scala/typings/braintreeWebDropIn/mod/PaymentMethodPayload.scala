package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.BillingAddress
import typings.braintreeWebDropIn.anon.Bin
import typings.braintreeWebDropIn.anon.CardHolderName
import typings.braintreeWebDropIn.anon.CardType
import typings.braintreeWebDropIn.anon.Username
import typings.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import typings.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.braintreeWebDropIn.mod.applePayPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.cardPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.googlePayPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.paypalPaymentMethodPayload
  - typings.braintreeWebDropIn.mod.venmoPaymentMethodPayload
*/
trait PaymentMethodPayload extends js.Object
object PaymentMethodPayload {
  
  @scala.inline
  def applePayPaymentMethodPayload(
    binData: binData,
    description: String,
    details: CardHolderName,
    nonce: String,
    `type`: ApplePayCard
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def googlePayPaymentMethodPayload(binData: binData, details: CardType, nonce: String, `type`: AndroidPayCard): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def paypalPaymentMethodPayload(details: BillingAddress, nonce: String, `type`: PayPalAccount): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def venmoPaymentMethodPayload(details: Username, nonce: String, `type`: VenmoAccount): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def cardPaymentMethodPayload(binData: binData, details: Bin, nonce: String, `type`: CreditCard): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}
