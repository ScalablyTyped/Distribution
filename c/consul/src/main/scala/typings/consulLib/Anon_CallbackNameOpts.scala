package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackNameOpts extends js.Object {
  def apply[TData](name: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](name: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def apply[TData](name: java.lang.String, payload: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    name: java.lang.String,
    payload: java.lang.String,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](name: java.lang.String, payload: nodeLib.Buffer): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    name: java.lang.String,
    payload: nodeLib.Buffer,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.ConsulNs.EventNs.FireOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.EventNs.FireOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

