package typings.consul.consulMod

import typings.consul.consulMod.Health.ChecksOptions
import typings.consul.consulMod.Health.NodeOptions
import typings.consul.consulMod.Health.ServiceOptions
import typings.consul.consulMod.Health.StateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Health")
@js.native
trait Health_ extends js.Object {
  var consul: Consul = js.native
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

