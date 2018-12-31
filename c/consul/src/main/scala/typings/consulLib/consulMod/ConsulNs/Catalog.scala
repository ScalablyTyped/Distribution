package typings
package consulLib.consulMod.ConsulNs

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
  var datacenters_Original: consulLib.Anon_OptsCallbackTDataDatacentersOptions = js.native
  var node: consulLib.consulMod.ConsulNs.CatalogNs.Node = js.native
  /**
    * Lists nodes in a given DC
    */
  @JSName("nodes")
  var nodes_Original: consulLib.Anon_DcCallbackOptsTData = js.native
  var service: consulLib.consulMod.ConsulNs.CatalogNs.Service = js.native
  /**
    * Lists services in a given DC
    */
  @JSName("services")
  var services_Original: consulLib.Anon_DcCallbackOpts = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](callback: Callback[TData]): scala.Unit = js.native
  def datacenters[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.DatacentersOptions): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.DatacentersOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](callback: Callback[TData]): scala.Unit = js.native
  def nodes[TData](dc: java.lang.String): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](dc: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def nodes[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.NodesOptions): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.NodesOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](callback: Callback[TData]): scala.Unit = js.native
  def services[TData](dc: java.lang.String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](dc: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def services[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.ServicesOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.ServicesOptions, callback: Callback[TData]): scala.Unit = js.native
}

