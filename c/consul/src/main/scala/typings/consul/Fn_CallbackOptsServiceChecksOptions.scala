package typings.consul

import typings.consul.consulMod.Callback
import typings.consul.consulMod.HealthNs.ChecksOptions
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsServiceChecksOptions extends js.Object {
  def apply[TData](opts: ChecksOptions): Thenable[TData] = js.native
  def apply[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  def apply[TData](service: String): Thenable[TData] = js.native
  def apply[TData](service: String, callback: Callback[TData]): Unit = js.native
}

