package typings.consul.consulMod.Agent

import typings.consul.consulMod.Agent.Service.DeregisterOptions
import typings.consul.consulMod.Agent.Service.ListOptions
import typings.consul.consulMod.Agent.Service.RegisterOptions
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Consul
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Service")
@js.native
trait Service_ extends js.Object {
  var consul: Consul = js.native
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
  def maintenance[TData](opts: typings.consul.consulMod.Agent.Service.MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: typings.consul.consulMod.Agent.Service.MaintenanceOptions, callback: Callback[TData]): Unit = js.native
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

