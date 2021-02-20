package typings.consul.mod

import typings.consul.mod.Health.ChecksOptions
import typings.consul.mod.Health.NodeOptions
import typings.consul.mod.Health.ServiceOptions
import typings.consul.mod.Health.StateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Health extends StObject {
  
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: String): Thenable[TData] = js.native
  /**
    * Returns the checks of a service
    */
  def checks[TData](service: String, callback: Callback[TData]): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Returns the health info of a node
    */
  def node[TData](node: String): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: NodeOptions): Thenable[TData] = js.native
  /**
    * Returns the health info of a node
    */
  def node[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: ServiceOptions): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](opts: ServiceOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: String): Thenable[TData] = js.native
  /**
    * Returns the nodes and health info of a service
    */
  def service[TData](service: String, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: StateOptions): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](opts: StateOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: String): Thenable[TData] = js.native
  /**
    * Returns the checks in a given state
    */
  def state[TData](state: String, callback: Callback[TData]): Unit = js.native
}
object Health {
  
  @js.native
  trait ChecksOptions extends CommonOptions {
    
    var service: String = js.native
  }
  object ChecksOptions {
    
    @scala.inline
    def apply(service: String): ChecksOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChecksOptions]
    }
    
    @scala.inline
    implicit class ChecksOptionsMutableBuilder[Self <: ChecksOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeOptions extends CommonOptions {
    
    var node: String = js.native
  }
  object NodeOptions {
    
    @scala.inline
    def apply(node: String): NodeOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeOptions]
    }
    
    @scala.inline
    implicit class NodeOptionsMutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceOptions extends CommonOptions {
    
    var near: js.UndefOr[String] = js.native
    
    var passing: js.UndefOr[Boolean] = js.native
    
    var service: String = js.native
    
    var tag: js.UndefOr[String] = js.native
  }
  object ServiceOptions {
    
    @scala.inline
    def apply(service: String): ServiceOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceOptions]
    }
    
    @scala.inline
    implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNear(value: String): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
      
      @scala.inline
      def setPassing(value: Boolean): Self = StObject.set(x, "passing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassingUndefined: Self = StObject.set(x, "passing", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  @js.native
  trait StateOptions extends CommonOptions {
    
    var state: String = js.native
  }
  object StateOptions {
    
    @scala.inline
    def apply(state: String): StateOptions = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateOptions]
    }
    
    @scala.inline
    implicit class StateOptionsMutableBuilder[Self <: StateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
