package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.no_update
import typings.chromeApps.chromeAppsStrings.throttled
import typings.chromeApps.chromeAppsStrings.update_available
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNOUPDATE extends js.Object {
  var NO_UPDATE: no_update
  var THROTTLED: throttled
  var UPDATE_AVAILABLE: update_available
}

object AnonNOUPDATE {
  @scala.inline
  def apply(NO_UPDATE: no_update, THROTTLED: throttled, UPDATE_AVAILABLE: update_available): AnonNOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNOUPDATE]
  }
}

