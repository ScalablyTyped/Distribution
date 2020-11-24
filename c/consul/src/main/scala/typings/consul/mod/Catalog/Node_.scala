package typings.consul.mod.Catalog

import typings.consul.mod.Callback
import typings.consul.mod.Catalog.Node.ListOptions
import typings.consul.mod.Consul
import typings.consul.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node_ extends js.Object {
  
  var consul: Consul = js.native
  
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
  def services[TData](opts: typings.consul.mod.Catalog.Node.ServicesOptions): Thenable[TData] = js.native
  /**
    * Lists the services provided by a node
    */
  def services[TData](opts: typings.consul.mod.Catalog.Node.ServicesOptions, callback: Callback[TData]): Unit = js.native
}
