package typings.consul

import typings.consul.consulMod.AgentNs.JoinOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Address extends js.Object {
  def apply[TData](address: String): Thenable[TData] = js.native
  def apply[TData](address: String, callback: Callback[TData]): Unit = js.native
  def apply[TData](opts: JoinOptions): Thenable[TData] = js.native
  def apply[TData](opts: JoinOptions, callback: Callback[TData]): Unit = js.native
}

