package typings.chartmogulNode.mod.Subscription

import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Subscription.cancel")
@js.native
object cancel extends js.Object {
  def apply(config: Config, uuid: String, data: CancelSubscriptionParams): js.Promise[typings.chartmogulNode.mod.Subscription.Subscription] = js.native
}

