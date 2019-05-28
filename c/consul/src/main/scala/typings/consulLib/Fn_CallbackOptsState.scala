package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsState extends js.Object {
  def apply[TData](opts: consulLib.consulMod.HealthNs.StateOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.HealthNs.StateOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](state: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](state: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

