package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackDcOptsServicesOptions extends js.Object {
  def apply[TData](): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](dc: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](dc: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.CatalogNs.ServicesOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.CatalogNs.ServicesOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

