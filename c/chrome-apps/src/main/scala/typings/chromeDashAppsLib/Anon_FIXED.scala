package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FIXED extends js.Object {
  var FIXED: chromeDashAppsLib.chromeDashAppsLibStrings.fixed
  var REMOVABLE: chromeDashAppsLib.chromeDashAppsLibStrings.removable
  var UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
}

object Anon_FIXED {
  @scala.inline
  def apply(
    FIXED: chromeDashAppsLib.chromeDashAppsLibStrings.fixed,
    REMOVABLE: chromeDashAppsLib.chromeDashAppsLibStrings.removable,
    UNKNOWN: chromeDashAppsLib.chromeDashAppsLibStrings.unknown
  ): Anon_FIXED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FIXED")(FIXED)
    __obj.updateDynamic("REMOVABLE")(REMOVABLE)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.asInstanceOf[Anon_FIXED]
  }
}

