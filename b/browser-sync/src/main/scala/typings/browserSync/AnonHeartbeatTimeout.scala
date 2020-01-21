package typings.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeartbeatTimeout extends js.Object {
  var heartbeatTimeout: js.UndefOr[Double] = js.undefined
}

object AnonHeartbeatTimeout {
  @scala.inline
  def apply(heartbeatTimeout: Int | Double = null): AnonHeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeartbeatTimeout]
  }
}

