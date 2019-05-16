package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionGateway extends js.Object {
  def cancel(subscriptionId: java.lang.String): js.Promise[scala.Unit] = js.native
  def create(request: SubscriptionRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
  def find(subscriptionId: java.lang.String): js.Promise[Subscription] = js.native
  def retryCharge(subscriptionId: java.lang.String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: java.lang.String, amount: java.lang.String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: java.lang.String, amount: java.lang.String, submitForSettlement: scala.Boolean): js.Promise[ValidatedResponse[Subscription]] = js.native
  def search(searchFn: js.Any): js.Promise[js.Array[Subscription]] = js.native
  def update(subscriptionId: java.lang.String, updates: SubscriptionRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
}

