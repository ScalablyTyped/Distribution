package typings.consul.mod

import typings.consul.mod.Lock.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consul extends js.Object {
  
  var acl: Acl = js.native
  
  var agent: Agent = js.native
  
  var catalog: Catalog = js.native
  
  var event: Event = js.native
  
  var health: Health = js.native
  
  var kv: Kv = js.native
  
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock = js.native
  
  var session: Session = js.native
  
  var status: Status = js.native
  
  /**
    * Watch helper.
    */
  def watch(opts: typings.consul.mod.Watch.Options): Watch = js.native
}
object Consul {
  
  @scala.inline
  def apply(
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
  implicit class ConsulOps[Self <: Consul] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcl(value: Acl): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalog(value: Catalog): Self = this.set("catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealth(value: Health): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKv(value: Kv): Self = this.set("kv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: Options => Lock): Self = this.set("lock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatch(value: typings.consul.mod.Watch.Options => Watch): Self = this.set("watch", js.Any.fromFunction1(value))
  }
}
