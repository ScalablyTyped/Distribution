package typings.browserSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeartbeatTimeout extends js.Object {
  var heartbeatTimeout: js.UndefOr[Double] = js.undefined
}

object HeartbeatTimeout {
  @scala.inline
  def apply(heartbeatTimeout: js.UndefOr[Double] = js.undefined): HeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heartbeatTimeout)) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeartbeatTimeout]
  }
}

