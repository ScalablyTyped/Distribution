package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.Anon_Custom
import typings.chartmogulDashNode.Anon_CustomArray
import typings.chartmogulDashNode.Anon_CustomStrings
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomAttributeNs.CustomAttributes
import typings.chartmogulDashNode.chartmogulDashNodeMod.CustomerNs.Customer
import typings.chartmogulDashNode.commonMod.Entries
import typings.chartmogulDashNode.commonMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute")
@js.native
object CustomAttributeNs extends js.Object {
  trait CustomAttributes extends js.Object {
    var custom: Map
  }
  
  def add(config: Config, uuid: String, data: Anon_Custom): js.Promise[Entries[Customer]] = js.native
  def add(config: Config, uuid: String, data: Anon_CustomArray): js.Promise[CustomAttributes] = js.native
  def remove(config: Config, uuid: String, data: Anon_CustomStrings): js.Promise[CustomAttributes] = js.native
  def update(config: Config, uuid: String, data: CustomAttributes): js.Promise[CustomAttributes] = js.native
}

