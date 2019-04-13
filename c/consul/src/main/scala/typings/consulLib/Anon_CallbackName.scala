package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackName extends js.Object {
  def apply[TData](name: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](name: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.RegisterOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.RegisterOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

