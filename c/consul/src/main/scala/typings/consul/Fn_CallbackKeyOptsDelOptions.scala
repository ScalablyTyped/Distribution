package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.Kv.DelOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKeyOptsDelOptions extends js.Object {
  def apply[TData](key: String): Thenable[TData] = js.native
  def apply[TData](key: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: DelOptions): Thenable[TData] = js.native
  def apply[TData](opts: DelOptions, callback: Callback[TData]): Unit = js.native
}

