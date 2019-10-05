package typings.consul

import typings.consul.consulMod.Acl.UpdateOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOpts extends js.Object {
  def apply[TData](opts: UpdateOptions): Thenable[TData] = js.native
  def apply[TData](opts: UpdateOptions, callback: Callback[TData]): Unit = js.native
}

