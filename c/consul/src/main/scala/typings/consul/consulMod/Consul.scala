package typings.consul.consulMod

import typings.consul.consulMod.Lock.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consul extends js.Object {
  var acl: Acl
  var agent: Agent
  var catalog: Catalog
  var event: Event
  var health: Health
  var kv: Kv
  var session: Session
  var status: Status
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock
  /**
    * Watch helper.
    */
  def watch(opts: typings.consul.consulMod.Watch.Options): Watch
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
    watch: typings.consul.consulMod.Watch.Options => Watch
  ): Consul = {
    val __obj = js.Dynamic.literal(acl = acl, agent = agent, catalog = catalog, event = event, health = health, kv = kv, lock = js.Any.fromFunction1(lock), session = session, status = status, watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[Consul]
  }
}

