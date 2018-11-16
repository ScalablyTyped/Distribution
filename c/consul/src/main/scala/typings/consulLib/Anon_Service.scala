package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Service extends js.Object {
  def apply[TData](opts: consulLib.consulMod.ConsulNs.HealthNs.ServiceOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.HealthNs.ServiceOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  def apply[TData](service: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](service: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
}

