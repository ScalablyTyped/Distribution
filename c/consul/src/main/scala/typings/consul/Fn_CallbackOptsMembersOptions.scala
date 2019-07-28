package typings.consul

import typings.consul.consulMod.AgentNs.MembersOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsMembersOptions extends js.Object {
  def apply[TData](): Thenable[TData] = js.native
  def apply[TData](callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: MembersOptions): Thenable[TData] = js.native
  def apply[TData](opts: MembersOptions, callback: Callback[TData]): Unit = js.native
}

