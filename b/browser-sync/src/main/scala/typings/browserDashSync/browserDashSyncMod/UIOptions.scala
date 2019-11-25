package typings.browserDashSync.browserDashSyncMod

import typings.browserDashSync.Anon_Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions extends js.Object {
  /** set the default port */
  var port: js.UndefOr[Double] = js.undefined
  /** set the default weinre port */
  var weinre: js.UndefOr[Anon_Port] = js.undefined
}

object UIOptions {
  @scala.inline
  def apply(port: Int | Double = null, weinre: Anon_Port = null): UIOptions = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (weinre != null) __obj.updateDynamic("weinre")(weinre.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIOptions]
  }
}

