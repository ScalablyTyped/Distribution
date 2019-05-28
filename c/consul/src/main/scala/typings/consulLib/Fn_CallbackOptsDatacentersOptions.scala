package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsDatacentersOptions extends js.Object {
  def apply[TData](): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.CatalogNs.DatacentersOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.CatalogNs.DatacentersOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

