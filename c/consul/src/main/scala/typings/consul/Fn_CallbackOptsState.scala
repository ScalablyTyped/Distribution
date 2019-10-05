package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.Health.StateOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsState extends js.Object {
  def apply[TData](opts: StateOptions): Thenable[TData] = js.native
  def apply[TData](opts: StateOptions, callback: Callback[TData]): Unit = js.native
  def apply[TData](state: String): Thenable[TData] = js.native
  def apply[TData](state: String, callback: Callback[TData]): Unit = js.native
}

