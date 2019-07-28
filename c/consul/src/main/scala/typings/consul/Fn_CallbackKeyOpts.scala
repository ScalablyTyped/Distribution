package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.KvNs.KeysOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKeyOpts extends js.Object {
  def apply[TData](): Thenable[TData] = js.native
  def apply[TData](callback: Callback[TData]): Unit = js.native
  def apply[TData](key: String): Thenable[TData] = js.native
  def apply[TData](key: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: KeysOptions): Thenable[TData] = js.native
  def apply[TData](opts: KeysOptions, callback: Callback[TData]): Unit = js.native
}

