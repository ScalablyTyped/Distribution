package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_available_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNOUPDATE extends js.Object {
  var NO_UPDATE: no_update_
  var THROTTLED: throttled_
  var UPDATE_AVAILABLE: update_available_
}

object AnonNOUPDATE {
  @scala.inline
  def apply(NO_UPDATE: no_update_, THROTTLED: throttled_, UPDATE_AVAILABLE: update_available_): AnonNOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNOUPDATE]
  }
}

