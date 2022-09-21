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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Creates a new session
    */
  def create[TData](): js.Promise[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): js.Promise[TData] = js.native
  /**
    * Creates a new session
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String): js.Promise[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions): js.Promise[TData] = js.native
  /**
    * Destroys a given session
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  
  def get[TData](id: String): js.Promise[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): js.Promise[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Queries a given session
    */
  def info[TData](id: String): js.Promise[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions): js.Promise[TData] = js.native
  /**
    * Queries a given session
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists all the active sessions
    */
  def list[TData](): js.Promise[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): js.Promise[TData] = js.native
  /**
    * Lists all the active sessions
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String): js.Promise[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions): js.Promise[TData] = js.native
  /**
    * Lists sessions belonging to a node
    */
  def node[TData](opts: NodeOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String): js.Promise[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions): js.Promise[TData] = js.native
  /**
    * Renews a TTL-based session
    */
  def renew[TData](opts: RenewOptions, callback: Callback[TData]): Unit = js.native
}
object Session {
  
  trait CreateOptions
    extends StObject
       with CommonOptions {
    
    var behavior: js.UndefOr[String] = js.undefined
    
    var checks: js.UndefOr[js.Array[String]] = js.undefined
    
    var lockdelay: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var node: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[String] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setBehavior(value: String): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setChecks(value: js.Array[String]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      inline def setChecksVarargs(value: String*): Self = StObject.set(x, "checks", js.Array(value*))
      
      inline def setLockdelay(value: String): Self = StObject.set(x, "lockdelay", value.asInstanceOf[js.Any])
      
      inline def setLockdelayUndefined: Self = StObject.set(x, "lockdelay", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait DestroyOptions
    extends StObject
       with CommonOptions {
    
    var id: String
  }
  object DestroyOptions {
    
    inline def apply(id: String): DestroyOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestroyOptions]
    }
    
    extension [Self <: DestroyOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type GetOptions = InfoOptions
  
  trait InfoOptions
    extends StObject
       with CommonOptions {
    
    var id: String
  }
  object InfoOptions {
    
    inline def apply(id: String): InfoOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoOptions]
    }
    
    extension [Self <: InfoOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions
    extends StObject
       with CommonOptions
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
  }
  
  trait NodeOptions
    extends StObject
       with CommonOptions {
    
    var node: String
  }
  object NodeOptions {
    
    inline def apply(node: String): NodeOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeOptions]
    }
    
    extension [Self <: NodeOptions](x: Self) {
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenewOptions
    extends StObject
       with CommonOptions {
    
    var id: String
  }
  object RenewOptions {
    
    inline def apply(id: String): RenewOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenewOptions]
    }
    
    extension [Self <: RenewOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
