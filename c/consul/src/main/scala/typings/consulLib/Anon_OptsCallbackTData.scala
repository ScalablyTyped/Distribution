package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsCallbackTData extends js.Object {
  def apply[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.MaintenanceOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.MaintenanceOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

