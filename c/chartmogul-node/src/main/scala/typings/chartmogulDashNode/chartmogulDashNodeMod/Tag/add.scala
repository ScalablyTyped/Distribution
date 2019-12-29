package typings.chartmogulDashNode.chartmogulDashNodeMod.Tag

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.chartmogulDashNodeMod.Customer.Customer
import typings.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Tag.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Tags): js.Promise[Tags] = js.native
  def apply(config: Config, uuid: String, data: TagsWithEmail): js.Promise[Entries[Customer]] = js.native
}

