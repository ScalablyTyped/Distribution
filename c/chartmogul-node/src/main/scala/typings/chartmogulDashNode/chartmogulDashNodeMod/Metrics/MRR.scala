package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MRR extends js.Object {
  var date: String
  var mrr: Double
  var `mrr-churn`: Double
  var `mrr-contraction`: Double
  var `mrr-expansion`: Double
  var `mrr-new-business`: Double
  var `mrr-reactivation`: Double
}

object MRR {
  @scala.inline
  def apply(
    date: String,
    mrr: Double,
    `mrr-churn`: Double,
    `mrr-contraction`: Double,
    `mrr-expansion`: Double,
    `mrr-new-business`: Double,
    `mrr-reactivation`: Double
  ): MRR = {
    val __obj = js.Dynamic.literal(date = date, mrr = mrr)
    __obj.updateDynamic("mrr-churn")(`mrr-churn`)
    __obj.updateDynamic("mrr-contraction")(`mrr-contraction`)
    __obj.updateDynamic("mrr-expansion")(`mrr-expansion`)
    __obj.updateDynamic("mrr-new-business")(`mrr-new-business`)
    __obj.updateDynamic("mrr-reactivation")(`mrr-reactivation`)
    __obj.asInstanceOf[MRR]
  }
}

@JSImport("chartmogul-node", "Metrics.mrr")
@js.native
object mrr extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[MRR]] = js.native
}

