package typings.braintree.braintreeMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionGateway extends js.Object {
  def cancel(subscriptionId: String): js.Promise[Unit] = js.native
  def create(request: SubscriptionRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
  def find(subscriptionId: String): js.Promise[Subscription] = js.native
  def retryCharge(subscriptionId: String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: String, amount: String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: String, amount: String, submitForSettlement: Boolean): js.Promise[ValidatedResponse[Subscription]] = js.native
  def search(searchFn: js.Any): Readable = js.native
  def update(subscriptionId: String, updates: SubscriptionRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
}

