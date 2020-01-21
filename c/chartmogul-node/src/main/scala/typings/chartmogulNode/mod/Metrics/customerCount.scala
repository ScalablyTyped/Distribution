package typings.chartmogulNode.mod.Metrics

import typings.chartmogulNode.commonMod.EntriesSummary
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.customerCount")
@js.native
object customerCount extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount_]] = js.native
}

