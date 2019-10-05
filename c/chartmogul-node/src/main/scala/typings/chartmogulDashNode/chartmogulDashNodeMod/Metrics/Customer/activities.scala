package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics.Customer

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.CursorParams
import typings.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.Customer.activities")
@js.native
object activities extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = js.native
}

