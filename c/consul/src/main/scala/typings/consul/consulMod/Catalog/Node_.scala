package typings.consul.consulMod.Catalog

import typings.consul.Fn_CallbackDc
import typings.consul.Fn_CallbackNodeOpts
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Catalog.Node.ListOptions
import typings.consul.consulMod.Consul
import typings.consul.consulMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Node")
@js.native
trait Node_ extends js.Object {
  var consul: Consul = js.native
  /**
    * Lists nodes in a given DC
    */
  @JSName("list")
  var list_Original: Fn_CallbackDc = js.native
  /**
    * Lists the services provided by a node
    */
  @JSName("services")
  var services_Original: Fn_CallbackNodeOpts = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: String): Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](opts: typings.consul.consulMod.Catalog.Node.ServicesOptions): Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](opts: typings.consul.consulMod.Catalog.Node.ServicesOptions, callback: Callback[TData]): Unit = js.native
}

