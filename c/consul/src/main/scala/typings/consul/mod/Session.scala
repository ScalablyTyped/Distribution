package typings.consul.mod

import typings.consul.mod.Session.CreateOptions
import typings.consul.mod.Session.DestroyOptions
import typings.consul.mod.Session.GetOptions
import typings.consul.mod.Session.InfoOptions
import typings.consul.mod.Session.ListOptions
import typings.consul.mod.Session.NodeOptions
import typings.consul.mod.Session.RenewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Creates a new session
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  
  def get[TData](id: String): Thenable[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Queries a given session
    */
  def info[TData](id: String): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions): Thenable[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists all the active sessions
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions): Thenable[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions): Thenable[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions, callback: Callback[TData]): Unit = js.native
}
object Session {
  
  @js.native
  trait CreateOptions extends CommonOptions {
    
    var behavior: js.UndefOr[String] = js.native
    
    var checks: js.UndefOr[js.Array[String]] = js.native
    
    var lockdelay: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var node: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[String] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: String): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setChecks(value: js.Array[String]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      @scala.inline
      def setChecksVarargs(value: String*): Self = StObject.set(x, "checks", js.Array(value :_*))
      
      @scala.inline
      def setLockdelay(value: String): Self = StObject.set(x, "lockdelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockdelayUndefined: Self = StObject.set(x, "lockdelay", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait DestroyOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object DestroyOptions {
    
    @scala.inline
    def apply(id: String): DestroyOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestroyOptions]
    }
    
    @scala.inline
    implicit class DestroyOptionsMutableBuilder[Self <: DestroyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type GetOptions = InfoOptions
  
  @js.native
  trait InfoOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object InfoOptions {
    
    @scala.inline
    def apply(id: String): InfoOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoOptions]
    }
    
    @scala.inline
    implicit class InfoOptionsMutableBuilder[Self <: InfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOptions extends CommonOptions
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
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
  trait RenewOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object RenewOptions {
    
    @scala.inline
    def apply(id: String): RenewOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenewOptions]
    }
    
    @scala.inline
    implicit class RenewOptionsMutableBuilder[Self <: RenewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
