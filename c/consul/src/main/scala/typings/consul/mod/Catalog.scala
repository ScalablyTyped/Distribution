package typings.consul.mod

import org.scalablytyped.runtime.Instantiable1
import typings.consul.mod.Catalog.DatacentersOptions
import typings.consul.mod.Catalog.Node
import typings.consul.mod.Catalog.Node.ListOptions
import typings.consul.mod.Catalog.NodesOptions
import typings.consul.mod.Catalog.Service
import typings.consul.mod.Catalog.ServicesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Catalog extends StObject {
  
  var consul: Consul = js.native
  
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
  
  var node: Node = js.native
  
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
  
  var service: Service = js.native
  
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
object Catalog {
  
  type DatacentersOptions = CommonOptions
  
  @js.native
  trait Node extends StObject {
    
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
  object Node {
    
    trait ListOptions
      extends StObject
         with CommonOptions
    object ListOptions {
      
      inline def apply(): ListOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListOptions]
      }
    }
    
    trait ServicesOptions
      extends StObject
         with CommonOptions {
      
      var node: String
    }
    object ServicesOptions {
      
      inline def apply(node: String): typings.consul.mod.Catalog.Node.ServicesOptions = {
        val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Catalog.Node.ServicesOptions]
      }
      
      extension [Self <: typings.consul.mod.Catalog.Node.ServicesOptions](x: Self) {
        
        inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait NodeStatic
    extends StObject
       with Instantiable1[/* consul */ Consul, Node]
  
  type NodesOptions = ListOptions
  
  @js.native
  trait Service extends StObject {
    
    var consul: Consul = js.native
    
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
    def list[TData](opts: typings.consul.mod.Catalog.Service.ListOptions): Thenable[TData] = js.native
    /**
      * Lists services in a given DC
      */
    def list[TData](opts: typings.consul.mod.Catalog.Service.ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](opts: typings.consul.mod.Catalog.Service.NodesOptions): Thenable[TData] = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](opts: typings.consul.mod.Catalog.Service.NodesOptions, callback: Callback[TData]): Unit = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](service: String): Thenable[TData] = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](service: String, callback: Callback[TData]): Unit = js.native
  }
  object Service {
    
    trait ListOptions
      extends StObject
         with CommonOptions
    object ListOptions {
      
      inline def apply(): typings.consul.mod.Catalog.Service.ListOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.consul.mod.Catalog.Service.ListOptions]
      }
    }
    
    trait NodesOptions
      extends StObject
         with CommonOptions {
      
      var service: String
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object NodesOptions {
      
      inline def apply(service: String): typings.consul.mod.Catalog.Service.NodesOptions = {
        val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Catalog.Service.NodesOptions]
      }
      
      extension [Self <: typings.consul.mod.Catalog.Service.NodesOptions](x: Self) {
        
        inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
  }
  
  @js.native
  trait ServiceStatic
    extends StObject
       with Instantiable1[/* consul */ Consul, Service]
  
  type ServicesOptions = typings.consul.mod.Catalog.Service.ListOptions
}
