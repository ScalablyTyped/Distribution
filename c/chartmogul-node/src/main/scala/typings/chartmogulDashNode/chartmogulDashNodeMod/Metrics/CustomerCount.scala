package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerCount extends js.Object {
  var customers: Double
  var date: String
}

object CustomerCount {
  @scala.inline
  def apply(customers: Double, date: String): CustomerCount = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomerCount]
  }
}

@JSImport("chartmogul-node", "Metrics.customerCount")
@js.native
object customerCount extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount]] = js.native
}

