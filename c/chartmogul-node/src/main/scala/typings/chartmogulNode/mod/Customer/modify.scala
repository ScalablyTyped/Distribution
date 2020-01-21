package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Customer.modify")
@js.native
object modify extends js.Object {
  def apply(config: Config, uuid: String, data: UpdateCustomer): js.Promise[typings.chartmogulNode.mod.Customer.Customer] = js.native
}

