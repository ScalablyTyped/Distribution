package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.KvNs.SetOptions
import typings.consul.consulMod.Thenable
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKeyOptsValue extends js.Object {
  def apply[TData](key: String, value: String): Thenable[TData] = js.native
  def apply[TData](key: String, value: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](key: String, value: String, opts: SetOptions): Thenable[TData] = js.native
  def apply[TData](key: String, value: String, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  def apply[TData](key: String, value: Buffer): Thenable[TData] = js.native
  def apply[TData](key: String, value: Buffer, callback: Callback[TData]): Unit = js.native
  def apply[TData](key: String, value: Buffer, opts: SetOptions): Thenable[TData] = js.native
  def apply[TData](key: String, value: Buffer, opts: SetOptions, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: SetOptions): Thenable[TData] = js.native
  def apply[TData](opts: SetOptions, callback: Callback[TData]): Unit = js.native
}

