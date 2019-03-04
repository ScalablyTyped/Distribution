package typings
package chromeDashAppsLib.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object ButtonOptions {
  @scala.inline
  def apply(title: java.lang.String, iconUrl: java.lang.String = null): ButtonOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.asInstanceOf[ButtonOptions]
  }
}

