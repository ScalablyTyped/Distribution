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
    abort: js.Function0[scala.Unit],
    begin: js.Function0[scala.Unit],
    canMakePayments: js.Function0[scala.Boolean],
    canMakePaymentsWithActiveCard: js.Function1[java.lang.String, scala.Boolean],
    completeMerchantValidation: js.Function1[js.Any, scala.Unit],
    completePayment: js.Function1[ApplePayStatusCodes, scala.Unit],
    completePaymentMethodSelection: js.Function2[js.Any, js.Any, scala.Unit],
    completeShippingContactSelection: js.Function4[ApplePayStatusCodes, js.Any, js.Any, js.Any, scala.Unit],
    completeShippingMethodSelection: js.Function3[ApplePayStatusCodes, js.Any, js.Any, scala.Unit],
    oncancel: js.Function1[js.Any, scala.Unit],
    onpaymentauthorized: js.Function1[js.Any, scala.Unit],
    onpaymentmethodselected: js.Function1[js.Any, scala.Unit],
    onshippingcontactselected: js.Function1[js.Any, scala.Unit],
    onshippingmethodselected: js.Function1[js.Any, scala.Unit],
    onvalidatemerchant: js.Function1[js.Any, scala.Unit],
    supportsVersion: js.Function1[scala.Double, scala.Boolean]
  ): ApplePaySession = {
    val __obj = js.Dynamic.literal(abort = abort, begin = begin, canMakePayments = canMakePayments, canMakePaymentsWithActiveCard = canMakePaymentsWithActiveCard, completeMerchantValidation = completeMerchantValidation, completePayment = completePayment, completePaymentMethodSelection = completePaymentMethodSelection, completeShippingContactSelection = completeShippingContactSelection, completeShippingMethodSelection = completeShippingMethodSelection, oncancel = oncancel, onpaymentauthorized = onpaymentauthorized, onpaymentmethodselected = onpaymentmethodselected, onshippingcontactselected = onshippingcontactselected, onshippingmethodselected = onshippingmethodselected, onvalidatemerchant = onvalidatemerchant, supportsVersion = supportsVersion)
  
    __obj.asInstanceOf[ApplePaySession]
  }
}

