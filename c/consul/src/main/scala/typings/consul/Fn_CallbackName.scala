package typings.consul

import typings.consul.consulMod.Agent.Service.RegisterOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackName extends js.Object {
  def apply[TData](name: String): Thenable[TData] = js.native
  def apply[TData](name: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: RegisterOptions): Thenable[TData] = js.native
  def apply[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
}

