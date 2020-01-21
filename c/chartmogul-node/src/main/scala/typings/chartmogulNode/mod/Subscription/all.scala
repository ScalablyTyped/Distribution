package typings.chartmogulNode.mod.Subscription

import typings.chartmogulNode.commonMod.CursorParams
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Subscription.all")
@js.native
object all extends js.Object {
  def apply(config: Config, uuid: String, data: CursorParams): js.Promise[Subscriptions] = js.native
}

