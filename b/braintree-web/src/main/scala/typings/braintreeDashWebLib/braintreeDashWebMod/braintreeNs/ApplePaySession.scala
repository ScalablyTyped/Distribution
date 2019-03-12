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

object ApplePaySession {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    begin: () => scala.Unit,
    canMakePayments: () => scala.Boolean,
    canMakePaymentsWithActiveCard: java.lang.String => scala.Boolean,
    completeMerchantValidation: js.Any => scala.Unit,
    completePayment: ApplePayStatusCodes => scala.Unit,
    completePaymentMethodSelection: (js.Any, js.Any) => scala.Unit,
    completeShippingContactSelection: (ApplePayStatusCodes, js.Any, js.Any, js.Any) => scala.Unit,
    completeShippingMethodSelection: (ApplePayStatusCodes, js.Any, js.Any) => scala.Unit,
    oncancel: js.Any => scala.Unit,
    onpaymentauthorized: js.Any => scala.Unit,
    onpaymentmethodselected: js.Any => scala.Unit,
    onshippingcontactselected: js.Any => scala.Unit,
    onshippingmethodselected: js.Any => scala.Unit,
    onvalidatemerchant: js.Any => scala.Unit,
    supportsVersion: scala.Double => scala.Boolean
  ): ApplePaySession = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), begin = js.Any.fromFunction0(begin), canMakePayments = js.Any.fromFunction0(canMakePayments), canMakePaymentsWithActiveCard = js.Any.fromFunction1(canMakePaymentsWithActiveCard), completeMerchantValidation = js.Any.fromFunction1(completeMerchantValidation), completePayment = js.Any.fromFunction1(completePayment), completePaymentMethodSelection = js.Any.fromFunction2(completePaymentMethodSelection), completeShippingContactSelection = js.Any.fromFunction4(completeShippingContactSelection), completeShippingMethodSelection = js.Any.fromFunction3(completeShippingMethodSelection), oncancel = js.Any.fromFunction1(oncancel), onpaymentauthorized = js.Any.fromFunction1(onpaymentauthorized), onpaymentmethodselected = js.Any.fromFunction1(onpaymentmethodselected), onshippingcontactselected = js.Any.fromFunction1(onshippingcontactselected), onshippingmethodselected = js.Any.fromFunction1(onshippingmethodselected), onvalidatemerchant = js.Any.fromFunction1(onvalidatemerchant), supportsVersion = js.Any.fromFunction1(supportsVersion))
  
    __obj.asInstanceOf[ApplePaySession]
  }
}

