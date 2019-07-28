package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.CatalogNs.ServiceNs.NodesOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsService extends js.Object {
  def apply[TData](opts: NodesOptions): Thenable[TData] = js.native
  def apply[TData](opts: NodesOptions, callback: Callback[TData]): Unit = js.native
  def apply[TData](service: String): Thenable[TData] = js.native
  def apply[TData](service: String, callback: Callback[TData]): Unit = js.native
}

