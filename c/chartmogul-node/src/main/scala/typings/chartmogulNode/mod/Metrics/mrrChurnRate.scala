package typings.chartmogulNode.mod.Metrics

import typings.chartmogulNode.commonMod.EntriesSummary
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.mrrChurnRate")
@js.native
object mrrChurnRate extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[MRRChurnRate_]] = js.native
}

