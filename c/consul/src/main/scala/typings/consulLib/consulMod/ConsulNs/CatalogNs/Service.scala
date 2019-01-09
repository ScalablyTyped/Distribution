package typings
package consulLib.consulMod.ConsulNs.CatalogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var consul: consulLib.consulMod.ConsulNs.Consul = js.native
  /**
    * Lists services in a given DC
    */
  @JSName("list")
  var list_Original: consulLib.Anon_CallbackDcOpts = js.native
  /**
    * Lists the nodes in a given service
    */
  @JSName("nodes")
  var nodes_Original: consulLib.Anon_CallbackOptsService = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](dc: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](dc: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.ServiceNs.ListOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](
    opts: consulLib.consulMod.ConsulNs.CatalogNs.ServiceNs.ListOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.ServiceNs.NodesOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](
    opts: consulLib.consulMod.ConsulNs.CatalogNs.ServiceNs.NodesOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
}

