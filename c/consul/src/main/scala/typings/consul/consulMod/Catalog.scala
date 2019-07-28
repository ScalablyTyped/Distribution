package typings.consul.consulMod

import typings.consul.Fn_CallbackDcOptsNodesOptions
import typings.consul.Fn_CallbackDcOptsServicesOptions
import typings.consul.Fn_CallbackOptsDatacentersOptions
import typings.consul.consulMod.CatalogNs.DatacentersOptions
import typings.consul.consulMod.CatalogNs.Node
import typings.consul.consulMod.CatalogNs.NodesOptions
import typings.consul.consulMod.CatalogNs.Service
import typings.consul.consulMod.CatalogNs.ServicesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Catalog extends js.Object {
  var consul: Consul = js.native
  /**
    * Lists known datacenters
    */
  @JSName("datacenters")
  var datacenters_Original: Fn_CallbackOptsDatacentersOptions = js.native
  var node: Node = js.native
  /**
    * Lists nodes in a given DC
    */
  @JSName("nodes")
  var nodes_Original: Fn_CallbackDcOptsNodesOptions = js.native
  var service: Service = js.native
  /**
    * Lists services in a given DC
    */
  @JSName("services")
  var services_Original: Fn_CallbackDcOptsServicesOptions = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](callback: Callback[TData]): Unit = js.native
  def datacenters[TData](opts: DatacentersOptions): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](opts: DatacentersOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](callback: Callback[TData]): Unit = js.native
  def nodes[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def nodes[TData](opts: NodesOptions): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](opts: NodesOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}

