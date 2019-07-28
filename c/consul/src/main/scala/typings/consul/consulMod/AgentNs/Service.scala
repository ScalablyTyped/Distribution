package typings.consul.consulMod.AgentNs

import typings.consul.Fn_CallbackIdOptsDeregisterOptionsString
import typings.consul.Fn_CallbackName
import typings.consul.Fn_CallbackOptsListOptionsTDataThenable
import typings.consul.Fn_CallbackOptsMaintenanceOptions
import typings.consul.consulMod.AgentNs.ServiceNs.DeregisterOptions
import typings.consul.consulMod.AgentNs.ServiceNs.ListOptions
import typings.consul.consulMod.AgentNs.ServiceNs.RegisterOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Consul
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var consul: Consul = js.native
  /**
    * Deregister a local service
    */
  @JSName("deregister")
  var deregister_Original: Fn_CallbackIdOptsDeregisterOptionsString = js.native
  /**
    * Returns the services local agent is managing
    */
  @JSName("list")
  var list_Original: Fn_CallbackOptsListOptionsTDataThenable = js.native
  /**
    * Manages node maintenance mode
    */
  @JSName("maintenance")
  var maintenance_Original: Fn_CallbackOptsMaintenanceOptions = js.native
  /**
    * Registers a new local service
    */
  @JSName("register")
  var register_Original: Fn_CallbackName = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: String): Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](opts: DeregisterOptions): Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](opts: DeregisterOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: typings.consul.consulMod.AgentNs.ServiceNs.MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: typings.consul.consulMod.AgentNs.ServiceNs.MaintenanceOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: String): Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: String, callback: Callback[TData]): Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](opts: RegisterOptions): Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
}

