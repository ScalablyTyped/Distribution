package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurOptions
  extends Loggable
     with Forceable

object BlurOptions {
  @scala.inline
  def apply(force: scala.Boolean, log: scala.Boolean): BlurOptions = {
    val __obj = js.Dynamic.literal(force = force, log = log)
  
    __obj.asInstanceOf[BlurOptions]
  }
}

