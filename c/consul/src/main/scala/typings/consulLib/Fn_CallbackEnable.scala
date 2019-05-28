package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackEnable extends js.Object {
  def apply[TData](enable: scala.Boolean): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](enable: scala.Boolean, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.MaintenanceOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.AgentNs.MaintenanceOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

