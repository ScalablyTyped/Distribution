package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsCreateOptions extends js.Object {
  def apply[TData](): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.SessionNs.CreateOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.SessionNs.CreateOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

