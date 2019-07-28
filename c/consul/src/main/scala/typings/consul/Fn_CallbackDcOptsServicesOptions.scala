package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.CatalogNs.ServicesOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackDcOptsServicesOptions extends js.Object {
  def apply[TData](): Thenable[TData] = js.native
  def apply[TData](callback: Callback[TData]): Unit = js.native
  def apply[TData](dc: String): Thenable[TData] = js.native
  def apply[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: ServicesOptions): Thenable[TData] = js.native
  def apply[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}

