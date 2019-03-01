package typings
package consulLib.consulMod.ConsulNs

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
  def lock(opts: consulLib.consulMod.ConsulNs.LockNs.Options): Lock
  /**
    * Watch helper.
    */
  def watch(opts: consulLib.consulMod.ConsulNs.WatchNs.Options): Watch
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
    lock: js.Function1[consulLib.consulMod.ConsulNs.LockNs.Options, Lock],
    session: Session,
    status: Status,
    watch: js.Function1[consulLib.consulMod.ConsulNs.WatchNs.Options, Watch]
  ): Consul = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acl")(acl)
    __obj.updateDynamic("agent")(agent)
    __obj.updateDynamic("catalog")(catalog)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("health")(health)
    __obj.updateDynamic("kv")(kv)
    __obj.updateDynamic("lock")(lock)
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Consul]
  }
}

