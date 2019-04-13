package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Health extends js.Object {
  /**
    * Returns the checks of a service
    */
  @JSName("checks")
  var checks_Original: consulLib.Anon_CallbackOptsServiceChecksOptions = js.native
  var consul: Consul = js.native
  /**
    * Returns the health info of a node
    */
  @JSName("node")
  var node_Original: consulLib.Anon_CallbackNodeOptsNodeOptions = js.native
  /**
    * Returns the nodes and health info of a service
    */
  @JSName("service")
  var service_Original: consulLib.Anon_CallbackOptsServiceServiceOptions = js.native
  /**
    * Returns the checks in a given state
    */
  @JSName("state")
  var state_Original: consulLib.Anon_CallbackOptsState = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: consulLib.consulMod.HealthNs.ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: consulLib.consulMod.HealthNs.ChecksOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: java.lang.String): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](node: java.lang.String): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](node: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: consulLib.consulMod.HealthNs.NodeOptions): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: consulLib.consulMod.HealthNs.NodeOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: consulLib.consulMod.HealthNs.ServiceOptions): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: consulLib.consulMod.HealthNs.ServiceOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: java.lang.String): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: consulLib.consulMod.HealthNs.StateOptions): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: consulLib.consulMod.HealthNs.StateOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: java.lang.String): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
}

