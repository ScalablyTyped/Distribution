package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNodeOpts extends js.Object {
  def apply[TData](node: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](node: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.CatalogNs.NodeNs.ServicesOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.CatalogNs.NodeNs.ServicesOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

