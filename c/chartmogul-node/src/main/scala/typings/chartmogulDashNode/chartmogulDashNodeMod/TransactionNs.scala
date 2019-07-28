package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.chartmogulDashNodeMod.TransactionNs.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Transaction")
@js.native
object TransactionNs extends js.Object {
  trait Transaction extends js.Object {
    var date: String
    var external_id: js.UndefOr[String] = js.undefined
    var result: String
    var `type`: String
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  def create(config: Config, uuid: String, data: Transaction): js.Promise[Transaction] = js.native
}

