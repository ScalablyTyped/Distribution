package typings
package consulLib.consulMod.CatalogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var consul: consulLib.consulMod.Consul = js.native
  /**
    * Lists nodes in a given DC
    */
  @JSName("list")
  var list_Original: consulLib.Fn_CallbackDc = js.native
  /**
    * Lists the services provided by a node
    */
  @JSName("services")
  var services_Original: consulLib.Fn_CallbackNodeOpts = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def list[TData](dc: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](dc: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.CatalogNs.NodeNs.ListOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def list[TData](
    opts: consulLib.consulMod.CatalogNs.NodeNs.ListOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](node: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](opts: consulLib.consulMod.CatalogNs.NodeNs.ServicesOptions): consulLib.consulMod.Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](
    opts: consulLib.consulMod.CatalogNs.NodeNs.ServicesOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

