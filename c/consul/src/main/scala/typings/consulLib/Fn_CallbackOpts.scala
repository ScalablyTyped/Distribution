package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOpts extends js.Object {
  def apply[TData](opts: consulLib.consulMod.AclNs.UpdateOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.AclNs.UpdateOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

