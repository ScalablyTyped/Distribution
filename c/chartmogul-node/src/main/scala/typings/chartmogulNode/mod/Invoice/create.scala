package typings.chartmogulNode.mod.Invoice

import typings.chartmogulNode.AnonInvoices
import typings.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Invoice.create")
@js.native
object create extends js.Object {
  def apply(config: Config, uuid: String, data: AnonInvoices): js.Promise[typings.chartmogulNode.mod.Invoice.Invoice] = js.native
}

