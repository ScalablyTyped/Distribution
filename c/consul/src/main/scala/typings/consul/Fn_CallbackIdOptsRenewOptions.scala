package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.SessionNs.RenewOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackIdOptsRenewOptions extends js.Object {
  def apply[TData](id: String): Thenable[TData] = js.native
  def apply[TData](id: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: RenewOptions): Thenable[TData] = js.native
  def apply[TData](opts: RenewOptions, callback: Callback[TData]): Unit = js.native
}

