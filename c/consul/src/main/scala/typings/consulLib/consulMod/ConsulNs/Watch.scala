package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watch
  extends nodeLib.NodeJSNs.EventEmitter {
  var consul: Consul = js.native
  /**
           * End watch
           */
  def end(): scala.Unit = js.native
  /**
           * Is running
           */
  def isRunning(): scala.Boolean = js.native
  /**
           * Update time
           */
  def updateTime(): scala.Double = js.native
}

