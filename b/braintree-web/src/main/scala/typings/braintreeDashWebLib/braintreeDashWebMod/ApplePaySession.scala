package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web", "ApplePaySession")
@js.native
class ApplePaySession protected ()
  extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePaySession {
  def this(version: scala.Double, request: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayPaymentRequest) = this()
  /* CompleteClass */
  override def abort(): scala.Unit = js.native
  /* CompleteClass */
  override def begin(): scala.Unit = js.native
  /* CompleteClass */
  override def canMakePayments(): scala.Boolean = js.native
  /* CompleteClass */
  override def canMakePaymentsWithActiveCard(merchantIdentifier: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def completeMerchantValidation(merchantSession: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def completePayment(status: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes): scala.Unit = js.native
  /* CompleteClass */
  override def completePaymentMethodSelection(newTotal: js.Any, newLineItems: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def completeShippingContactSelection(
    status: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes,
    newShippingMethods: js.Any,
    newTotal: js.Any,
    newLineItems: js.Any
  ): scala.Unit = js.native
  /* CompleteClass */
  override def completeShippingMethodSelection(
    status: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes,
    newTotal: js.Any,
    newLineItems: js.Any
  ): scala.Unit = js.native
  /* CompleteClass */
  override def oncancel(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onpaymentauthorized(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onpaymentmethodselected(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onshippingcontactselected(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onshippingmethodselected(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def onvalidatemerchant(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def supportsVersion(version: scala.Double): scala.Boolean = js.native
}

