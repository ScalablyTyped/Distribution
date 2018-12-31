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

