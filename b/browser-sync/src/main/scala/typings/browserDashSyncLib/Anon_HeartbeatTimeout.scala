package typings
package browserDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeartbeatTimeout extends js.Object {
  var heartbeatTimeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeartbeatTimeout {
  @scala.inline
  def apply(heartbeatTimeout: scala.Int | scala.Double = null): Anon_HeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeartbeatTimeout]
  }
}

