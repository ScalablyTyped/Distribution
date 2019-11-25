package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARR extends js.Object {
  var arr: Double
  var date: String
}

object ARR {
  @scala.inline
  def apply(arr: Double, date: String): ARR = {
    val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ARR]
  }
}

@JSImport("chartmogul-node", "Metrics.arr")
@js.native
object arr extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[ARR]] = js.native
}

