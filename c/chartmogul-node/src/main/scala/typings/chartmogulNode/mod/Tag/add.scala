package typings.chartmogulNode.mod.Tag

import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.mod.Config
import typings.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chartmogul-node", "Tag.add")
@js.native
object add extends js.Object {
  
  def apply(config: Config, uuid: String, data: Tags): js.Promise[Tags] = js.native
  def apply(config: Config, uuid: String, data: TagsWithEmail): js.Promise[Entries[Customer]] = js.native
}
