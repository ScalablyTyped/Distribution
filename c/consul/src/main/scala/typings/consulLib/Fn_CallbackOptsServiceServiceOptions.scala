package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsServiceServiceOptions extends js.Object {
  def apply[TData](opts: consulLib.consulMod.HealthNs.ServiceOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.HealthNs.ServiceOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](service: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](service: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

