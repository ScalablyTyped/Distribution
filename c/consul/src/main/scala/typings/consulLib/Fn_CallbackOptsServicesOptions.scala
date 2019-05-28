package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsServicesOptions extends js.Object {
  def apply[TData](): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.ServicesOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.ServicesOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

