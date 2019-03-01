package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AVAILABLE extends js.Object {
  var AVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.available
  var ENABLED: chromeDashAppsLib.chromeDashAppsLibStrings.enabled
  var UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
}

object Anon_AVAILABLE {
  @scala.inline
  def apply(
    AVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.available,
    ENABLED: chromeDashAppsLib.chromeDashAppsLibStrings.enabled,
    UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
  ): Anon_AVAILABLE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AVAILABLE")(AVAILABLE)
    __obj.updateDynamic("ENABLED")(ENABLED)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.asInstanceOf[Anon_AVAILABLE]
  }
}

