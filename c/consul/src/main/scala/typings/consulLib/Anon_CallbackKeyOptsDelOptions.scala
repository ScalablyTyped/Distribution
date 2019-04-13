package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackKeyOptsDelOptions extends js.Object {
  def apply[TData](key: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](key: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.DelOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.KvNs.DelOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

