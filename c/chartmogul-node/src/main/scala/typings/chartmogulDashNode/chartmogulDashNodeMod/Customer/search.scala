package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Customer.search")
@js.native
object search extends js.Object {
  def apply(config: Config): js.Promise[Entries[typings.chartmogulDashNode.chartmogulDashNodeMod.Customer.Customer]] = js.native
  def apply(config: Config, params: SearchCustomersParams): js.Promise[Entries[typings.chartmogulDashNode.chartmogulDashNodeMod.Customer.Customer]] = js.native
}

