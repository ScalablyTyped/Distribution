package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MRRChurnRate extends js.Object {
  var date: String
  var `mrr-churn-rate`: Double
}

object MRRChurnRate {
  @scala.inline
  def apply(date: String, `mrr-churn-rate`: Double): MRRChurnRate = {
    val __obj = js.Dynamic.literal(date = date)
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`)
    __obj.asInstanceOf[MRRChurnRate]
  }
}

@JSImport("chartmogul-node", "Metrics.mrrChurnRate")
@js.native
object mrrChurnRate extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[MRRChurnRate]] = js.native
}

