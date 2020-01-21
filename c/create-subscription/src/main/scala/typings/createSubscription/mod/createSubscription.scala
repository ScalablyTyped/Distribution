package typings.createSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-subscription", "createSubscription")
@js.native
object createSubscription extends js.Object {
  def apply[S, T](config: SubscriptionConfig[S, T]): Subscription[S, T] = js.native
}

