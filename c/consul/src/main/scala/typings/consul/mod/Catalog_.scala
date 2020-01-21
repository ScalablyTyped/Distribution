package typings.consul.mod

import typings.consul.mod.Catalog.DatacentersOptions
import typings.consul.mod.Catalog.Node
import typings.consul.mod.Catalog.NodesOptions
import typings.consul.mod.Catalog.Service
import typings.consul.mod.Catalog.ServicesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Catalog_ extends js.Object {
  var consul: Consul = js.native
  var node: Node = js.native
  var service: Service = js.native
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

