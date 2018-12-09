package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Tag")
@js.native
object TagNs extends js.Object {
  
  trait Tags extends js.Object {
    var tags: chartmogulDashNodeLib.commonMod.Strings
  }
  
  
  trait TagsWithEmail extends js.Object {
    var email: java.lang.String
    var tags: chartmogulDashNodeLib.commonMod.Strings
  }
  
  def add(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String, data: Tags): js.Promise[Tags] = js.native
  def add(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: TagsWithEmail
  ): js.Promise[
    chartmogulDashNodeLib.commonMod.Entries[chartmogulDashNodeLib.chartmogulDashNodeMod.CustomerNs.Customer]
  ] = js.native
  def remove(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String, data: Tags): js.Promise[Tags] = js.native
}

