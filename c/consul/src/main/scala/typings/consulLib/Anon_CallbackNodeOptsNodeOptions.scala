package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackNodeOptsNodeOptions extends js.Object {
  def apply[TData](node: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](node: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.HealthNs.NodeOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.HealthNs.NodeOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

