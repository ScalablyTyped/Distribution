package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.Health.NodeOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNodeOptsNodeOptions extends js.Object {
  def apply[TData](node: String): Thenable[TData] = js.native
  def apply[TData](node: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: NodeOptions): Thenable[TData] = js.native
  def apply[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
}

