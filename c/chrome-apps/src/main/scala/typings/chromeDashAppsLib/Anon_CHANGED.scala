package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHANGED extends js.Object {
  var CHANGED: chromeDashAppsLib.chromeDashAppsLibStrings.changed
  var CREATED: chromeDashAppsLib.chromeDashAppsLibStrings.created
  var REMOVED: chromeDashAppsLib.chromeDashAppsLibStrings.removed
}

object Anon_CHANGED {
  @scala.inline
  def apply(
    CHANGED: chromeDashAppsLib.chromeDashAppsLibStrings.changed,
    CREATED: chromeDashAppsLib.chromeDashAppsLibStrings.created,
    REMOVED: chromeDashAppsLib.chromeDashAppsLibStrings.removed
  ): Anon_CHANGED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHANGED")(CHANGED)
    __obj.updateDynamic("CREATED")(CREATED)
    __obj.updateDynamic("REMOVED")(REMOVED)
    __obj.asInstanceOf[Anon_CHANGED]
  }
}

