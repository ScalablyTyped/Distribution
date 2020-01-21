package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.AnonCard
import typings.braintreeWebDropIn.AnonCreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.noPaymentMethodRequestable
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paymentMethodRequestable
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paymentOptionSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropin extends js.Object {
  def clearSelectedPaymentMethod(): Unit = js.native
  def isPaymentMethodRequestable(): Boolean = js.native
  @JSName("on")
  def on_noPaymentMethodRequestable(event: noPaymentMethodRequestable, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_paymentMethodRequestable(event: paymentMethodRequestable, handler: js.Function1[/* payload */ AnonCreditCard, Unit]): Unit = js.native
  @JSName("on")
  def on_paymentOptionSelected(event: paymentOptionSelected, handler: js.Function1[/* payload */ AnonCard, Unit]): Unit = js.native
  def requestPaymentMethod(): js.Promise[PaymentMethodPayload] = js.native
  def requestPaymentMethod(
    callback: js.Function2[/* error */ js.Object | Null, /* payload */ js.UndefOr[PaymentMethodPayload], Unit]
  ): Unit = js.native
  def teardown(): js.Promise[Unit] = js.native
  def teardown(callback: js.Function1[/* error */ js.UndefOr[js.Object | Null], Unit]): Unit = js.native
}

