package typings.consul.consulMod

import typings.consul.consulMod.Agent.Check
import typings.consul.consulMod.Agent.ChecksOptions
import typings.consul.consulMod.Agent.ForceLeaveOptions
import typings.consul.consulMod.Agent.JoinOptions
import typings.consul.consulMod.Agent.MaintenanceOptions
import typings.consul.consulMod.Agent.MembersOptions
import typings.consul.consulMod.Agent.SelfOptions
import typings.consul.consulMod.Agent.Service
import typings.consul.consulMod.Agent.ServicesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Agent")
@js.native
trait Agent_ extends js.Object {
  var check: Check = js.native
  var consul: Consul = js.native
  var service: Service = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](callback: Callback[TData]): Unit = js.native
  def checks[TData](opts: ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String, callback: Callback[TData]): Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](callback: Callback[TData]): Unit = js.native
  def members[TData](opts: MembersOptions): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](opts: MembersOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](callback: Callback[TData]): Unit = js.native
  def self[TData](opts: SelfOptions): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](opts: SelfOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}

