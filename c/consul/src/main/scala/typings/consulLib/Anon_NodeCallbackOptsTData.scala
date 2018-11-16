package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NodeCallbackOptsTData extends js.Object {
  def apply[TData](node: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](node: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ServicesOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ServicesOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

