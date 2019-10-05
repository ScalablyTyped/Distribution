package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASP extends js.Object {
  var asp: Double
  var date: String
}

object ASP {
  @scala.inline
  def apply(asp: Double, date: String): ASP = {
    val __obj = js.Dynamic.literal(asp = asp, date = date)
  
    __obj.asInstanceOf[ASP]
  }
}

@JSImport("chartmogul-node", "Metrics.asp")
@js.native
object asp extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[ASP]] = js.native
}

