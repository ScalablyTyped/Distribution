package typings
package consulLib.consulMod.ConsulNs.AgentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var consul: consulLib.consulMod.ConsulNs.Consul = js.native
  /**
    * Deregister a local service
    */
  @JSName("deregister")
  var deregister_Original: consulLib.Anon_IdCallbackOptsTDataString = js.native
  /**
    * Returns the services local agent is managing
    */
  @JSName("list")
  var list_Original: consulLib.Anon_OptsCallbackTDataListOptions = js.native
  /**
    * Manages node maintenance mode
    */
  @JSName("maintenance")
  var maintenance_Original: consulLib.Anon_OptsCallbackTData = js.native
  /**
    * Registers a new local service
    */
  @JSName("register")
  var register_Original: consulLib.Anon_NameCallbackOpts = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](id: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.DeregisterOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Deregister a local service
    */
  def deregister[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.DeregisterOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.ListOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def list[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.ListOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.MaintenanceOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.MaintenanceOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](name: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Registers a new local service
    */
  def register[TData](opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.RegisterOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Registers a new local service
    */
  def register[TData](
    opts: consulLib.consulMod.ConsulNs.AgentNs.ServiceNs.RegisterOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

