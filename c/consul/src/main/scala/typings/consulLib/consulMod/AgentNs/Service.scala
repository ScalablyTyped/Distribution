package typings
package consulLib.consulMod.AgentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var consul: consulLib.consulMod.Consul = js.native
  /**
    * Deregister a local service
    */
  @JSName("deregister")
  var deregister_Original: consulLib.Fn_CallbackIdOptsDeregisterOptionsString = js.native
  /**
    * Returns the services local agent is managing
    */
  @JSName("list")
  var list_Original: consulLib.Fn_CallbackOptsListOptionsTDataThenable = js.native
  /**
    * Manages node maintenance mode
    */
  @JSName("maintenance")
  var maintenance_Original: consulLib.Fn_CallbackOptsMaintenanceOptions = js.native
  /**
    * Registers a new local service
    */
  @JSName("register")
  var register_Original: consulLib.Fn_CallbackName = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.DeregisterOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.DeregisterOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.ListOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.ListOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.MaintenanceOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.MaintenanceOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](opts: consulLib.consulMod.AgentNs.ServiceNs.RegisterOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](
    opts: consulLib.consulMod.AgentNs.ServiceNs.RegisterOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

