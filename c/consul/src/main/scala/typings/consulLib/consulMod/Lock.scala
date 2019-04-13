package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lock
  extends nodeLib.NodeJSNs.EventEmitter {
  var consul: Consul = js.native
  /**
    * Acquire lock
    */
  def acquire(): scala.Unit = js.native
  /**
    * Release lock
    */
  def release(): scala.Unit = js.native
}

