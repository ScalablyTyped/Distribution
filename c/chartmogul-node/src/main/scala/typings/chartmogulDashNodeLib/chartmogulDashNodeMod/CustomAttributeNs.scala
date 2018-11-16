package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute")
@js.native
object CustomAttributeNs extends js.Object {
  
  trait CustomAttributes extends js.Object {
    var custom: chartmogulDashNodeLib.commonMod.Map
  }
  
  def add(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: chartmogulDashNodeLib.Anon_CustomArray
  ): stdLib.Promise[CustomAttributes] = js.native
  def add(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: chartmogulDashNodeLib.Anon_CustomEmail
  ): stdLib.Promise[
    chartmogulDashNodeLib.commonMod.Entries[chartmogulDashNodeLib.chartmogulDashNodeMod.CustomerNs.Customer]
  ] = js.native
  def remove(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: chartmogulDashNodeLib.Anon_Custom
  ): stdLib.Promise[CustomAttributes] = js.native
  def update(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: CustomAttributes
  ): stdLib.Promise[CustomAttributes] = js.native
}

