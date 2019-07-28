package typings.consul.consulMod

import typings.consul.Fn_CallbackNodeOptsNodeOptions
import typings.consul.Fn_CallbackOptsServiceChecksOptions
import typings.consul.Fn_CallbackOptsServiceServiceOptions
import typings.consul.Fn_CallbackOptsState
import typings.consul.consulMod.HealthNs.ChecksOptions
import typings.consul.consulMod.HealthNs.NodeOptions
import typings.consul.consulMod.HealthNs.ServiceOptions
import typings.consul.consulMod.HealthNs.StateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Health extends js.Object {
  /**
    * Returns the checks of a service
    */
  @JSName("checks")
  var checks_Original: Fn_CallbackOptsServiceChecksOptions = js.native
  var consul: Consul = js.native
  /**
    * Returns the health info of a node
    */
  @JSName("node")
  var node_Original: Fn_CallbackNodeOptsNodeOptions = js.native
  /**
    * Returns the nodes and health info of a service
    */
  @JSName("service")
  var service_Original: Fn_CallbackOptsServiceServiceOptions = js.native
  /**
    * Returns the checks in a given state
    */
  @JSName("state")
  var state_Original: Fn_CallbackOptsState = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: String): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: String, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](node: String): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: NodeOptions): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: ServiceOptions): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: ServiceOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: String): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: String, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: StateOptions): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: StateOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: String): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: String, callback: Callback[TData]): Unit = js.native
}

