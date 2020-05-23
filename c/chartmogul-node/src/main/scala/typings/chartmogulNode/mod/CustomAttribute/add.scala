package typings.chartmogulNode.mod.CustomAttribute

import typings.chartmogulNode.anon.Custom
import typings.chartmogulNode.anon.CustomArray
import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.mod.Config
import typings.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Custom): js.Promise[Entries[Customer]] = js.native
  def apply(config: Config, uuid: String, data: CustomArray): js.Promise[CustomAttributes] = js.native
}

