package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackKeyOptsValue extends js.Object {
  def apply[TData](key: java.lang.String, value: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: java.lang.String,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: java.lang.String, opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: java.lang.String,
    opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: nodeLib.Buffer): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: nodeLib.Buffer,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: nodeLib.Buffer, opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: nodeLib.Buffer,
    opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.KvNs.SetOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

