package typings
package consulLib.consulMod.ConsulNs.CatalogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var consul: consulLib.consulMod.ConsulNs.Consul = js.native
  /**
    * Lists nodes in a given DC
    */
  @JSName("list")
  var list_Original: consulLib.Anon_Dc = js.native
  /**
    * Lists the services provided by a node
    */
  @JSName("services")
  var services_Original: consulLib.Anon_NodeCallbackOptsTData = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](dc: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](dc: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ListOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](
    opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ListOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: java.lang.String): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: java.lang.String, callback: consulLib.consulMod.ConsulNs.Callback[TData]): scala.Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ServicesOptions): consulLib.consulMod.ConsulNs.Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](
    opts: consulLib.consulMod.ConsulNs.CatalogNs.NodeNs.ServicesOptions,
    callback: consulLib.consulMod.ConsulNs.Callback[TData]
  ): scala.Unit = js.native
}

