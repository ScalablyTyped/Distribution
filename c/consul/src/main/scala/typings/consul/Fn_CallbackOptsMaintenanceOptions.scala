package typings.consul

import typings.consul.consulMod.Agent.Service.MaintenanceOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsMaintenanceOptions extends js.Object {
  def apply[TData](opts: MaintenanceOptions): Thenable[TData] = js.native
  def apply[TData](opts: MaintenanceOptions, callback: Callback[TData]): Unit = js.native
}

