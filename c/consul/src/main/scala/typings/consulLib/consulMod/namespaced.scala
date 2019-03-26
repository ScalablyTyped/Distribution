package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consul", JSImport.Namespace)
@js.native
class namespaced ()
  extends consulLib.consulMod.ConsulNs.Consul {
  def this(opts: consulLib.consulMod.ConsulNs.ConsulOptions) = this()
  /* CompleteClass */
  override var acl: consulLib.consulMod.ConsulNs.Acl = js.native
  /* CompleteClass */
  override var agent: consulLib.consulMod.ConsulNs.Agent = js.native
  /* CompleteClass */
  override var catalog: consulLib.consulMod.ConsulNs.Catalog = js.native
  /* CompleteClass */
  override var event: consulLib.consulMod.ConsulNs.Event = js.native
  /* CompleteClass */
  override var health: consulLib.consulMod.ConsulNs.Health = js.native
  /* CompleteClass */
  override var kv: consulLib.consulMod.ConsulNs.Kv = js.native
  /* CompleteClass */
  override var session: consulLib.consulMod.ConsulNs.Session = js.native
  /* CompleteClass */
  override var status: consulLib.consulMod.ConsulNs.Status = js.native
  /**
    * Lock helper.
    */
  /* CompleteClass */
  override def lock(opts: consulLib.consulMod.ConsulNs.LockNs.Options): consulLib.consulMod.ConsulNs.Lock = js.native
  /**
    * Watch helper.
    */
  /* CompleteClass */
  override def watch(opts: consulLib.consulMod.ConsulNs.WatchNs.Options): consulLib.consulMod.ConsulNs.Watch = js.native
}

