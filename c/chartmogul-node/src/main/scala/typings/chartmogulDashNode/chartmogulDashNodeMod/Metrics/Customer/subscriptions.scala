package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics.Customer

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.CursorParams
import typings.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
@js.native
object subscriptions extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
}

