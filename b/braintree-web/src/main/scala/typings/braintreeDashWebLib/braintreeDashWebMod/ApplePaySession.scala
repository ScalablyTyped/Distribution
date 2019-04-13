package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web", "ApplePaySession")
@js.native
class ApplePaySession protected () extends js.Object {
  def this(version: scala.Double, request: ApplePayPaymentRequest) = this()
  def abort(): scala.Unit = js.native
  def begin(): scala.Unit = js.native
  def canMakePayments(): scala.Boolean = js.native
  def canMakePaymentsWithActiveCard(merchantIdentifier: java.lang.String): scala.Boolean = js.native
  def completeMerchantValidation(merchantSession: js.Any): scala.Unit = js.native
  def completePayment(status: ApplePayStatusCodes): scala.Unit = js.native
  def completePaymentMethodSelection(newTotal: js.Any, newLineItems: js.Any): scala.Unit = js.native
  def completeShippingContactSelection(status: ApplePayStatusCodes, newShippingMethods: js.Any, newTotal: js.Any, newLineItems: js.Any): scala.Unit = js.native
  def completeShippingMethodSelection(status: ApplePayStatusCodes, newTotal: js.Any, newLineItems: js.Any): scala.Unit = js.native
  def oncancel(event: js.Any): scala.Unit = js.native
  def onpaymentauthorized(event: js.Any): scala.Unit = js.native
  def onpaymentmethodselected(event: js.Any): scala.Unit = js.native
  def onshippingcontactselected(event: js.Any): scala.Unit = js.native
  def onshippingmethodselected(event: js.Any): scala.Unit = js.native
  def onvalidatemerchant(event: js.Any): scala.Unit = js.native
  def supportsVersion(version: scala.Double): scala.Boolean = js.native
}

