package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerChurnRate extends js.Object {
  var `customer-churn-rate`: Double
  var date: String
}

object CustomerChurnRate {
  @scala.inline
  def apply(`customer-churn-rate`: Double, date: String): CustomerChurnRate = {
    val __obj = js.Dynamic.literal(date = date)
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`)
    __obj.asInstanceOf[CustomerChurnRate]
  }
}

@JSImport("chartmogul-node", "Metrics.customerChurnRate")
@js.native
object customerChurnRate extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate]] = js.native
}

