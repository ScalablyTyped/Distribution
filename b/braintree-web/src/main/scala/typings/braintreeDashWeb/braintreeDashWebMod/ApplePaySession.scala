package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web", "ApplePaySession")
@js.native
class ApplePaySession protected () extends js.Object {
  def this(version: Double, request: ApplePayPaymentRequest) = this()
  def abort(): Unit = js.native
  def begin(): Unit = js.native
  def canMakePayments(): Boolean = js.native
  def canMakePaymentsWithActiveCard(merchantIdentifier: String): Boolean = js.native
  def completeMerchantValidation(merchantSession: js.Any): Unit = js.native
  def completePayment(status: ApplePayStatusCodes): Unit = js.native
  def completePaymentMethodSelection(newTotal: js.Any, newLineItems: js.Any): Unit = js.native
  def completeShippingContactSelection(status: ApplePayStatusCodes, newShippingMethods: js.Any, newTotal: js.Any, newLineItems: js.Any): Unit = js.native
  def completeShippingMethodSelection(status: ApplePayStatusCodes, newTotal: js.Any, newLineItems: js.Any): Unit = js.native
  def oncancel(event: js.Any): Unit = js.native
  def onpaymentauthorized(event: js.Any): Unit = js.native
  def onpaymentmethodselected(event: js.Any): Unit = js.native
  def onshippingcontactselected(event: js.Any): Unit = js.native
  def onshippingmethodselected(event: js.Any): Unit = js.native
  def onvalidatemerchant(event: js.Any): Unit = js.native
  def supportsVersion(version: Double): Boolean = js.native
}

