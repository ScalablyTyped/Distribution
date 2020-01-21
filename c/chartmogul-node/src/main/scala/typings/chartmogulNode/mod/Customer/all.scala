package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Customer.all")
@js.native
object all extends js.Object {
  def apply(config: Config): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
  def apply(config: Config, params: ListCustomersParams): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = js.native
}

