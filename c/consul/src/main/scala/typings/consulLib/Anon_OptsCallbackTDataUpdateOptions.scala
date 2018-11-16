package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsCallbackTDataUpdateOptions extends js.Object {
  def apply[TData](opts: consulLib.consulMod.ConsulNs.AclNs.UpdateOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.AclNs.UpdateOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

