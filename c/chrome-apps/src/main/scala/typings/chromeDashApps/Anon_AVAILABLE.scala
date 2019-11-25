package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.available
import typings.chromeDashApps.chromeDashAppsStrings.enabled_
import typings.chromeDashApps.chromeDashAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AVAILABLE extends js.Object {
  var AVAILABLE: available
  var ENABLED: enabled_
  var UNKNOWN: unknown_
}

object Anon_AVAILABLE {
  @scala.inline
  def apply(AVAILABLE: available, ENABLED: enabled_, UNKNOWN: unknown_): Anon_AVAILABLE = {
    val __obj = js.Dynamic.literal(AVAILABLE = AVAILABLE.asInstanceOf[js.Any], ENABLED = ENABLED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AVAILABLE]
  }
}

