package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropin extends js.Object {
  def clearSelectedPaymentMethod(): scala.Unit = js.native
  def isPaymentMethodRequestable(): scala.Boolean = js.native
  @JSName("on")
  def on_noPaymentMethodRequestable(
    event: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.noPaymentMethodRequestable,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_paymentMethodRequestable(
    event: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.paymentMethodRequestable,
    handler: js.Function1[/* payload */ braintreeDashWebDashDropDashInLib.Anon_CreditCard, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_paymentOptionSelected(
    event: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.paymentOptionSelected,
    handler: js.Function1[/* payload */ braintreeDashWebDashDropDashInLib.Anon_Card, scala.Unit]
  ): scala.Unit = js.native
  def requestPaymentMethod(): js.Promise[PaymentMethodPayload] = js.native
  def requestPaymentMethod(
    callback: js.Function2[
      /* error */ js.Object | scala.Null, 
      /* payload */ js.UndefOr[PaymentMethodPayload], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def teardown(): js.Promise[scala.Unit] = js.native
  def teardown(callback: js.Function1[/* error */ js.UndefOr[js.Object | scala.Null], scala.Unit]): scala.Unit = js.native
}

