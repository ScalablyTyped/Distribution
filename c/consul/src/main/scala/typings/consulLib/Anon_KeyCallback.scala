package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyCallback extends js.Object {
  def apply[TData](key: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](key: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.ConsulNs.KvNs.DeleteOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.KvNs.DeleteOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

