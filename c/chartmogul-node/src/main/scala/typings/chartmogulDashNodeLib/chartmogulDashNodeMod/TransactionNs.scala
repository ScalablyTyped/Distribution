package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Transaction")
@js.native
object TransactionNs extends js.Object {
  trait Transaction extends js.Object {
    var date: java.lang.String
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var result: java.lang.String
    var `type`: java.lang.String
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def create(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: Transaction
  ): js.Promise[Transaction] = js.native
}

