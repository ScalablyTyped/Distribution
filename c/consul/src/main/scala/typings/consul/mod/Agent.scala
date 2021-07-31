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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agent extends StObject {
  
  var check: Check = js.native
  
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](callback: Callback[TData]): Unit = js.native
  def checks[TData](opts: ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String, callback: Callback[TData]): Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](callback: Callback[TData]): Unit = js.native
  def members[TData](opts: MembersOptions): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](opts: MembersOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the local node configuration
    */
  def self[TData](): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](callback: Callback[TData]): Unit = js.native
  def self[TData](opts: SelfOptions): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](opts: SelfOptions, callback: Callback[TData]): Unit = js.native
  
  var service: Service = js.native
  
  /**
    * Returns the services local agent is managing
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): Thenable[TData] = js.native
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
    def deregister[TData](id: String): Thenable[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions): Thenable[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions): Thenable[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: ListOptions): Thenable[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions): Thenable[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions): Thenable[TData] = js.native
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](opts: WarnOptions): Thenable[TData] = js.native
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
      
      @scala.inline
      def apply(id: String): DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeregisterOptions]
      }
      
      @scala.inline
      implicit class DeregisterOptionsMutableBuilder[Self <: DeregisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait FailOptions
      extends StObject
         with CommonOptions {
      
      var id: String
      
      var note: js.UndefOr[String] = js.undefined
    }
    object FailOptions {
      
      @scala.inline
      def apply(id: String): FailOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailOptions]
      }
      
      @scala.inline
      implicit class FailOptionsMutableBuilder[Self <: FailOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
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
      
      @scala.inline
      def apply(id: String): PassOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[PassOptions]
      }
      
      @scala.inline
      implicit class PassOptionsMutableBuilder[Self <: PassOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
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
      
      @scala.inline
      def apply(name: String): RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisterOptions]
      }
      
      @scala.inline
      implicit class RegisterOptionsMutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        @scala.inline
        def setServiceid(value: String): Self = StObject.set(x, "serviceid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceidUndefined: Self = StObject.set(x, "serviceid", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait WarnOptions
      extends StObject
         with CommonOptions {
      
      var id: String
      
      var note: js.UndefOr[String] = js.undefined
    }
    object WarnOptions {
      
      @scala.inline
      def apply(id: String): WarnOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[WarnOptions]
      }
      
      @scala.inline
      implicit class WarnOptionsMutableBuilder[Self <: WarnOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
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
    
    @scala.inline
    def apply(node: String): ForceLeaveOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceLeaveOptions]
    }
    
    @scala.inline
    implicit class ForceLeaveOptionsMutableBuilder[Self <: ForceLeaveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait JoinOptions
    extends StObject
       with CommonOptions {
    
    var address: String
  }
  object JoinOptions {
    
    @scala.inline
    def apply(address: String): JoinOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    @scala.inline
    implicit class JoinOptionsMutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaintenanceOptions
    extends StObject
       with CommonOptions {
    
    var enable: Boolean
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object MaintenanceOptions {
    
    @scala.inline
    def apply(enable: Boolean): MaintenanceOptions = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceOptions]
    }
    
    @scala.inline
    implicit class MaintenanceOptionsMutableBuilder[Self <: MaintenanceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
  
  trait MembersOptions
    extends StObject
       with CommonOptions
  object MembersOptions {
    
    @scala.inline
    def apply(): MembersOptions = {
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
    def deregister[TData](id: String): Thenable[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typings.consul.mod.Agent.Service.DeregisterOptions): Thenable[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typings.consul.mod.Agent.Service.DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the services local agent is managing
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: typings.consul.mod.Agent.Service.ListOptions): Thenable[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](opts: typings.consul.mod.Agent.Service.ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typings.consul.mod.Agent.Service.MaintenanceOptions): Thenable[TData] = js.native
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typings.consul.mod.Agent.Service.MaintenanceOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local service
      */
    def register[TData](name: String): Thenable[TData] = js.native
    /**
      * Registers a new local service
      */
    def register[TData](name: String, callback: Callback[TData]): Unit = js.native
    /**
      * Registers a new local service
      */
    def register[TData](opts: typings.consul.mod.Agent.Service.RegisterOptions): Thenable[TData] = js.native
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
      
      @scala.inline
      def apply(id: String): typings.consul.mod.Agent.Service.DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.DeregisterOptions]
      }
      
      @scala.inline
      implicit class DeregisterOptionsMutableBuilder[Self <: typings.consul.mod.Agent.Service.DeregisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
      
      @scala.inline
      def apply(enable: Boolean, id: String): typings.consul.mod.Agent.Service.MaintenanceOptions = {
        val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.MaintenanceOptions]
      }
      
      @scala.inline
      implicit class MaintenanceOptionsMutableBuilder[Self <: typings.consul.mod.Agent.Service.MaintenanceOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
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
      
      @scala.inline
      def apply(): RegisterCheck = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RegisterCheck]
      }
      
      @scala.inline
      implicit class RegisterCheckMutableBuilder[Self <: RegisterCheck] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait RegisterOptions
      extends StObject
         with CommonOptions {
      
      var address: js.UndefOr[String] = js.undefined
      
      var check: js.UndefOr[RegisterCheck] = js.undefined
      
      var checks: js.UndefOr[js.Array[RegisterCheck]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var name: String
      
      var port: js.UndefOr[Double] = js.undefined
      
      var tags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object RegisterOptions {
      
      @scala.inline
      def apply(name: String): typings.consul.mod.Agent.Service.RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.consul.mod.Agent.Service.RegisterOptions]
      }
      
      @scala.inline
      implicit class RegisterOptionsMutableBuilder[Self <: typings.consul.mod.Agent.Service.RegisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        @scala.inline
        def setCheck(value: RegisterCheck): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
        
        @scala.inline
        def setChecks(value: js.Array[RegisterCheck]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
        
        @scala.inline
        def setChecksVarargs(value: RegisterCheck*): Self = StObject.set(x, "checks", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  trait ServiceStatic
    extends StObject
       with Instantiable1[/* consul */ Consul, Service]
  
  type ServicesOptions = typings.consul.mod.Agent.Service.ListOptions
}
