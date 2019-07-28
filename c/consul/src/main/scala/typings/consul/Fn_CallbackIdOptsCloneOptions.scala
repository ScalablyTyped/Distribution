package typings.consul

import typings.consul.consulMod.AclNs.CloneOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackIdOptsCloneOptions extends js.Object {
  def apply[TData](id: String): Thenable[TData] = js.native
  def apply[TData](id: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: CloneOptions): Thenable[TData] = js.native
  def apply[TData](opts: CloneOptions, callback: Callback[TData]): Unit = js.native
}

