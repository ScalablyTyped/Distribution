package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.Customer
import typings.chartmogulDashNode.chartmogulDashNodeMod.TagNs.Tags
import typings.chartmogulDashNode.chartmogulDashNodeMod.TagNs.TagsWithEmail
import typings.chartmogulDashNode.commonMod.Entries
import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Tag")
@js.native
object TagNs extends js.Object {
  trait Tags extends js.Object {
    var tags: Strings
  }
  
  trait TagsWithEmail extends js.Object {
    var email: String
    var tags: Strings
  }
  
  def add(config: Config, uuid: String, data: Tags): js.Promise[Tags] = js.native
  def add(config: Config, uuid: String, data: TagsWithEmail): js.Promise[Entries[Customer]] = js.native
  def remove(config: Config, uuid: String, data: Tags): js.Promise[Tags] = js.native
}

