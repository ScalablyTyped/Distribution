package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackKeyOptsValue extends js.Object {
  def apply[TData](key: java.lang.String, value: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](key: java.lang.String, value: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: java.lang.String, opts: consulLib.consulMod.KvNs.SetOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: java.lang.String,
    opts: consulLib.consulMod.KvNs.SetOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: nodeLib.Buffer): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](key: java.lang.String, value: nodeLib.Buffer, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](key: java.lang.String, value: nodeLib.Buffer, opts: consulLib.consulMod.KvNs.SetOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    key: java.lang.String,
    value: nodeLib.Buffer,
    opts: consulLib.consulMod.KvNs.SetOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.SetOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.SetOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

