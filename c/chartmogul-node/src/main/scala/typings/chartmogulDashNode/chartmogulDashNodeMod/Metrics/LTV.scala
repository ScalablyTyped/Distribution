package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LTV extends js.Object {
  var date: String
  var ltv: Double
}

object LTV {
  @scala.inline
  def apply(date: String, ltv: Double): LTV = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LTV]
  }
}

@JSImport("chartmogul-node", "Metrics.ltv")
@js.native
object ltv extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[LTV]] = js.native
}

