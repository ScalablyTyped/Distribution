package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKey extends js.Object {
  def apply[TData](key: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](key: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.GetOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.GetOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

