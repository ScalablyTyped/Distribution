package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsCallbackTDataCreateOptions extends js.Object {
  def apply[TData](): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.ConsulNs.AclNs.CreateOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.AclNs.CreateOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

