package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.Event.FireOptions
import typings.consul.consulMod.Thenable
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNameOpts extends js.Object {
  def apply[TData](name: String): Thenable[TData] = js.native
  def apply[TData](name: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](name: String, payload: String): Thenable[TData] = js.native
  def apply[TData](name: String, payload: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](name: String, payload: Buffer): Thenable[TData] = js.native
  def apply[TData](name: String, payload: Buffer, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: FireOptions): Thenable[TData] = js.native
  def apply[TData](opts: FireOptions, callback: Callback[TData]): Unit = js.native
}

