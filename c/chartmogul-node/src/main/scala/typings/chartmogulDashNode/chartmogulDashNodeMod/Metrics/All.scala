package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typings.chartmogulDashNode.Anon_Arpa
import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
  var entries: Anon_Arpa
}

object All {
  @scala.inline
  def apply(entries: Anon_Arpa): All = {
    val __obj = js.Dynamic.literal(entries = entries)
  
    __obj.asInstanceOf[All]
  }
}

@JSImport("chartmogul-node", "Metrics.all")
@js.native
object all extends js.Object {
  def apply(config: Config, params: Params): js.Promise[All] = js.native
}

