package typings.chartmogulNode.mod.Metrics

import typings.chartmogulNode.commonMod.EntriesSummary
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chartmogul-node", "Metrics.customerChurnRate")
@js.native
object customerChurnRate extends js.Object {
  
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate_]] = js.native
}
