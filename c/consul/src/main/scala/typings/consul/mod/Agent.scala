package typings.consul.mod

import org.scalablytyped.runtime.Instantiable1
import typings.consul.mod.Agent.Check
import typings.consul.mod.Agent.Check.DeregisterOptions
import typings.consul.mod.Agent.Check.FailOptions
import typings.consul.mod.Agent.Check.ListOptions
import typings.consul.mod.Agent.Check.PassOptions
import typings.consul.mod.Agent.Check.RegisterOptions
import typings.consul.mod.Agent.Check.WarnOptions
import typings.consul.mod.Agent.ChecksOptions
import typings.consul.mod.Agent.ForceLeaveOptions
import typings.consul.mod.Agent.JoinOptions
import typings.consul.mod.Agent.MaintenanceOptions
import typings.consul.mod.Agent.MembersOptions
import typings.consul.mod.Agent.SelfOptions
import typings.consul.mod.Agent.Service
import typings.consul.mod.Agent.ServicesOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agent extends StObject {
  
  var check: Check = js.native
  
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](): js.Promise[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](callback: Callback[TData]): Unit = js.native
  def checks[TData](opts: ChecksOptions): js.Promise[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String): js.Promise[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions): js.Promise[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String): js.Promise[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String, callback: Callback[TData]): Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions): js.Promise[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean): js.Promise[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions): js.Promise[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](): js.Promise[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](callback: Callback[TData]): Unit = js.native
  def members[TData](opts: MembersOptions): js.Promise[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](opts: MembersOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the local node configuration
    */
  def self[TData](): js.Promise[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](callback: Callback[TData]): Unit = js.native
  def self[TData](opts: SelfOptions): js.Promise[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](opts: SelfOptions, callback: Callback[TData]): Unit = js.native
  
  var service: Service = js.native
  
  /**
    * Returns the services local agent is managing
    */
  def services[TData](): js.Promise[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): js.Promise[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}
object Agent {
  
  @js.native
  trait Check extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Deregister a local check
      */
    def deregister[TData](id: String): js.Promise[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions): js.Promise[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String): js.Promise[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions): js.Promise[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](): js.Promise[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: ListOptions): js.Promise[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String): js.Promise[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions): js.Promise[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions): js.Promise[TData] = js.native
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String): js.Promise[TData] = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](opts: WarnOptions): js.Promise[TData] = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](opts: WarnOptions, callback: Callback[TData]): Unit = js.native
  }
  object Check {
    
    trait DeregisterOptions
      extends StObject
         with CommonOptions {
      
      var id: String
    }
    object DeregisterOptions {
      
      inline def apply(id: String): DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeregisterOptions]
      }
      
      extension [Self <: DeregisterOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait FailOptions
      extends StObject
         with CommonOptions {
      
      var id: String
      
      var note: js.UndefOr[String] = js.undefined
    }
    object FailOptions {
      
      inline def apply(id: String): FailOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailOptions]
      }
      
      extension [Self <: FailOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
    
    type ListOptions = CommonOptions
    
    trait PassOptions
      extends StObject
         with CommonOptions {
      
      var id: String
      
      var note: js.UndefOr[String] = js.undefined
    }
    object PassOptions {
      
      inline def apply(id: String): PassOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[PassOptions]
      }
      
      extension [Self <: PassOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
    
    trait RegisterOptions
      extends StObject
         with CommonOptions {
      
      var http: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var interval: js.UndefOr[String] = js.undefined
      
      var name: String
      
      var notes: js.UndefOr[String] = js.undefined
      
      var script: js.UndefOr[String] = js.undefined
      
      var serviceid: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var ttl: js.UndefOr[String] = js.undefined
    }
    object RegisterOptions {
      
      inline def apply(name: String): RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisterOptions]
      }
      
      extension [Self <: RegisterOptions](x: Self) {
        
        inline def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        inline def setServiceid(value: String): Self = StObject.set(x, "serviceid", value.asInstanceOf[js.Any])
        
        inline def setServiceidUndefined: Self = StObject.set(x, "serviceid", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait WarnOptions
      extends StObject
         with CommonOptions {
      
      var id: String
      
      var note: js.UndefOr[String] = js.undefined
    }
    object WarnOptions {
      
      inline def apply(id: String): WarnOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[WarnOptions]
      }
      
      extension [Self <: WarnOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
  }
  
  @js.native
  trait CheckStatic
    extends StObject
       with Instantiable1[/* consul */ Consul, Check]
  
  type ChecksOptions = ListOptions
  
  trait ForceLeaveOptions
    extends StObject
       with CommonOptions {
    
    var node: String
  }
  object ForceLeaveOptions {
    
    inline def apply(node: String): ForceLeaveOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceLeaveOptions]
    }
    
    extension [Self <: ForceLeaveOptions](x: Self) {
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait JoinOptions
    extends StObject
       with CommonOptions {
    
    var address: String
  }
  object JoinOptions {
    
    inline def apply(address: String): JoinOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    extension [Self <: JoinOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaintenanceOptions
    extends StObject
       with CommonOptions {
    
    var enable: Boolean
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object MaintenanceOptions {
    
    inline def apply(enable: Boolean): MaintenanceOptions = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceOptions]
    }
    
    extension [Self <: MaintenanceOptions](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
  
  trait MembersOptions
    extends StObject
       with CommonOptions
  object MembersOptions {
    
    inline def apply(): MembersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MembersOptions]
    }
  }
  
  type SelfOptions = CommonOptions
  
  @js.native
  trait Service extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Deregister a local service
      */
    def deregister[TData](id: String): js.Promise[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typings.consul.mod.Agent.Service.DeregisterOptions): js.Promise[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typings.consul.mod.Agent.Service.DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the services local agent is managing
      */
    def list[TData](): js.Promise[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: typings.consul.mod.Agent.Service.ListOptions): js.Promise[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](opts: typings.consul.mod.Agent.Service.ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typings.consul.mod.Agent.Service.MaintenanceOptions): js.Promise[TData] = js.native
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typings.consul.mod.Agent.Service.MaintenanceOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local service
      */
    def register[TData](name: String): js.Promise[TData] = js.native
    /**
      * Registers a new local service
      */
    def register[TData](name: String, callback: Callback[TData]): Unit = js.native
    /**
      * Registers a new local service
      */
    def register[TData](opts: typings.consul.mod.Agent.Service.RegisterOptions): js.Promise[TData] = js.native
    /**
      * Registers a new local service
      */
    def register[TData](opts: typings.consul.mod.Agent.Service.RegisterOptions, callback: Callback[TData]): Unit = js.native
  }
  object Service {
    
    trait DeregisterOptions
      extends StObject
         with CommonOptions {
      
      var id: String
    }
    object DeregisterOptions {
      
      inline def apply(id: String): typings.consul.mod.Agent.Service.DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.DeregisterOptions]
      }
      
      extension [Self <: typings.consul.mod.Agent.Service.DeregisterOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    type ListOptions = CommonOptions
    
    trait MaintenanceOptions
      extends StObject
         with CommonOptions {
      
      var enable: Boolean
      
      var id: String
      
      var reason: js.UndefOr[String] = js.undefined
    }
    object MaintenanceOptions {
      
      inline def apply(enable: Boolean, id: String): typings.consul.mod.Agent.Service.MaintenanceOptions = {
        val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.MaintenanceOptions]
      }
      
      extension [Self <: typings.consul.mod.Agent.Service.MaintenanceOptions](x: Self) {
        
        inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    trait RegisterCheck extends StObject {
      
      var http: js.UndefOr[String] = js.undefined
      
      var interval: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var script: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var ttl: js.UndefOr[String] = js.undefined
    }
    object RegisterCheck {
      
      inline def apply(): RegisterCheck = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RegisterCheck]
      }
      
      extension [Self <: RegisterCheck](x: Self) {
        
        inline def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait RegisterOptions
      extends StObject
         with CommonOptions {
      
      var address: js.UndefOr[String] = js.undefined
      
      var check: js.UndefOr[RegisterCheck] = js.undefined
      
      var checks: js.UndefOr[js.Array[RegisterCheck]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var meta: js.UndefOr[Record[String, String]] = js.undefined
      
      var name: String
      
      var port: js.UndefOr[Double] = js.undefined
      
      var tags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object RegisterOptions {
      
      inline def apply(name: String): typings.consul.mod.Agent.Service.RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.RegisterOptions]
      }
      
      extension [Self <: typings.consul.mod.Agent.Service.RegisterOptions](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setCheck(value: RegisterCheck): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
        
        inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
        
        inline def setChecks(value: js.Array[RegisterCheck]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
        
        inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
        
        inline def setChecksVarargs(value: RegisterCheck*): Self = StObject.set(x, "checks", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMeta(value: Record[String, String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
  }
  
  @js.native
  trait ServiceStatic
    extends StObject
       with Instantiable1[/* consul */ Consul, Service]
  
  type ServicesOptions = typings.consul.mod.Agent.Service.ListOptions
}
