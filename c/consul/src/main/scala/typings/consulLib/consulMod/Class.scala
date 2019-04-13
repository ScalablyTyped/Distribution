package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consul", JSImport.Namespace)
@js.native
class Class () extends Consul {
  def this(opts: ConsulOptions) = this()
  /* CompleteClass */
  override var acl: Acl = js.native
  /* CompleteClass */
  override var agent: Agent = js.native
  /* CompleteClass */
  override var catalog: Catalog = js.native
  /* CompleteClass */
  override var event: Event = js.native
  /* CompleteClass */
  override var health: Health = js.native
  /* CompleteClass */
  override var kv: Kv = js.native
  /* CompleteClass */
  override var session: Session = js.native
  /* CompleteClass */
  override var status: Status = js.native
  /**
    * Lock helper.
    */
  /* CompleteClass */
  override def lock(opts: consulLib.consulMod.LockNs.Options): Lock = js.native
  /**
    * Watch helper.
    */
  /* CompleteClass */
  override def watch(opts: consulLib.consulMod.WatchNs.Options): Watch = js.native
}

