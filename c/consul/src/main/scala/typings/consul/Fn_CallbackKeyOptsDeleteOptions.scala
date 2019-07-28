package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.KvNs.DeleteOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKeyOptsDeleteOptions extends js.Object {
  def apply[TData](key: String): Thenable[TData] = js.native
  def apply[TData](key: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: DeleteOptions): Thenable[TData] = js.native
  def apply[TData](opts: DeleteOptions, callback: Callback[TData]): Unit = js.native
}

