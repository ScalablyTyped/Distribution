package typings.consul.mod

import typings.consul.mod.Lock.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consul extends StObject {
  
  var acl: Acl
  
  var agent: Agent
  
  var catalog: Catalog
  
  var event: Event
  
  var health: Health
  
  var kv: Kv
  
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock
  
  var session: Session
  
  var status: Status
  
  /**
    * Watch helper.
    */
  def watch(opts: typings.consul.mod.Watch.Options): Watch
}
object Consul {
  
  inline def apply(
    acl: Acl,
    agent: Agent,
    catalog: Catalog,
    event: Event,
    health: Health,
    kv: Kv,
    lock: Options => Lock,
    session: Session,
    status: Status,
    watch: typings.consul.mod.Watch.Options => Watch
  ): Consul = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], kv = kv.asInstanceOf[js.Any], lock = js.Any.fromFunction1(lock), session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[Consul]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consul] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: Acl): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHealth(value: Health): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setKv(value: Kv): Self = StObject.set(x, "kv", value.asInstanceOf[js.Any])
    
    inline def setLock(value: Options => Lock): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: typings.consul.mod.Watch.Options => Watch): Self = StObject.set(x, "watch", js.Any.fromFunction1(value))
  }
}
