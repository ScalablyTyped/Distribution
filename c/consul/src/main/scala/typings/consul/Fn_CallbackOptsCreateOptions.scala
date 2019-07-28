package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.SessionNs.CreateOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsCreateOptions extends js.Object {
  def apply[TData](): Thenable[TData] = js.native
  def apply[TData](callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: CreateOptions): Thenable[TData] = js.native
  def apply[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
}

