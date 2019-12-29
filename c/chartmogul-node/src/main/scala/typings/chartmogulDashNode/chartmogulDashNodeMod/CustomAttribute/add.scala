package typings.chartmogulDashNode.chartmogulDashNodeMod.CustomAttribute

import typings.chartmogulDashNode.Anon_Custom
import typings.chartmogulDashNode.Anon_CustomArray
import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.chartmogulDashNodeMod.Customer.Customer
import typings.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Anon_Custom): js.Promise[Entries[Customer]] = js.native
  def apply(config: Config, uuid: String, data: Anon_CustomArray): js.Promise[CustomAttributes] = js.native
}

