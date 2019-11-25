package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.no_update
import typings.chromeDashApps.chromeDashAppsStrings.throttled
import typings.chromeDashApps.chromeDashAppsStrings.update_available
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NOUPDATE extends js.Object {
  var NO_UPDATE: no_update
  var THROTTLED: throttled
  var UPDATE_AVAILABLE: update_available
}

object Anon_NOUPDATE {
  @scala.inline
  def apply(NO_UPDATE: no_update, THROTTLED: throttled, UPDATE_AVAILABLE: update_available): Anon_NOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NOUPDATE]
  }
}

