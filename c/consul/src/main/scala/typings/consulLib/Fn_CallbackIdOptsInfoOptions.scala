package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackIdOptsInfoOptions extends js.Object {
  def apply[TData](id: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](id: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.SessionNs.InfoOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.SessionNs.InfoOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

