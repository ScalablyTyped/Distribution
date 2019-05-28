package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsMaintenanceOptions extends js.Object {
  def apply[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.MaintenanceOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.MaintenanceOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

