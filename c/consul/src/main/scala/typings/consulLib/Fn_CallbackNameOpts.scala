package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNameOpts extends js.Object {
  def apply[TData](name: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](name: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](name: java.lang.String, payload: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](name: java.lang.String, payload: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](name: java.lang.String, payload: nodeLib.Buffer): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](name: java.lang.String, payload: nodeLib.Buffer, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.EventNs.FireOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.EventNs.FireOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

