package typings.consul.consulMod.Catalog

import typings.consul.Fn_CallbackDcOpts
import typings.consul.Fn_CallbackOptsService
import typings.consul.consulMod.Callback
import typings.consul.consulMod.Catalog.Service.ListOptions
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
    * Lists services in a given DC
    */
  @JSName("list")
  var list_Original: Fn_CallbackDcOpts = js.native
  /**
    * Lists the nodes in a given service
    */
  @JSName("nodes")
  var nodes_Original: Fn_CallbackOptsService = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typings.consul.consulMod.Catalog.Service.NodesOptions): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typings.consul.consulMod.Catalog.Service.NodesOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String, callback: Callback[TData]): Unit = js.native
}

