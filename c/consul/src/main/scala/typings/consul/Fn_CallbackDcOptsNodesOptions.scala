package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.Catalog.NodesOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackDcOptsNodesOptions extends js.Object {
  def apply[TData](): Thenable[TData] = js.native
  def apply[TData](callback: Callback[TData]): Unit = js.native
  def apply[TData](dc: String): Thenable[TData] = js.native
  def apply[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: NodesOptions): Thenable[TData] = js.native
  def apply[TData](opts: NodesOptions, callback: Callback[TData]): Unit = js.native
}

