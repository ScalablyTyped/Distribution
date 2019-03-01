package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions extends js.Object {
  /** set the default port */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** set the default weinre port */
  var weinre: js.UndefOr[browserDashSyncLib.Anon_Port] = js.undefined
}

object UIOptions {
  @scala.inline
  def apply(port: scala.Int | scala.Double = null, weinre: browserDashSyncLib.Anon_Port = null): UIOptions = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (weinre != null) __obj.updateDynamic("weinre")(weinre)
    __obj.asInstanceOf[UIOptions]
  }
}

