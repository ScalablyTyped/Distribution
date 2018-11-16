package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplePaySession extends js.Object {
  def abort(): scala.Unit
  def begin(): scala.Unit
  def canMakePayments(): scala.Boolean
  def canMakePaymentsWithActiveCard(merchantIdentifier: java.lang.String): scala.Boolean
  def completeMerchantValidation(merchantSession: js.Any): scala.Unit
  def completePayment(status: ApplePayStatusCodes): scala.Unit
  def completePaymentMethodSelection(newTotal: js.Any, newLineItems: js.Any): scala.Unit
  def completeShippingContactSelection(status: ApplePayStatusCodes, newShippingMethods: js.Any, newTotal: js.Any, newLineItems: js.Any): scala.Unit
  def completeShippingMethodSelection(status: ApplePayStatusCodes, newTotal: js.Any, newLineItems: js.Any): scala.Unit
  def oncancel(event: js.Any): scala.Unit
  def onpaymentauthorized(event: js.Any): scala.Unit
  def onpaymentmethodselected(event: js.Any): scala.Unit
  def onshippingcontactselected(event: js.Any): scala.Unit
  def onshippingmethodselected(event: js.Any): scala.Unit
  def onvalidatemerchant(event: js.Any): scala.Unit
  def supportsVersion(version: scala.Double): scala.Boolean
}

