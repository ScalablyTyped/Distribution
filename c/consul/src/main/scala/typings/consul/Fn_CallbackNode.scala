package typings.consul

import typings.consul.consulMod.Agent.ForceLeaveOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNode extends js.Object {
  def apply[TData](node: String): Thenable[TData] = js.native
  def apply[TData](node: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: ForceLeaveOptions): Thenable[TData] = js.native
  def apply[TData](opts: ForceLeaveOptions, callback: Callback[TData]): Unit = js.native
}

