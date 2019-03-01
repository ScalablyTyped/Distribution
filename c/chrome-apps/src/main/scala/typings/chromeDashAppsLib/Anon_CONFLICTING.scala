package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONFLICTING extends js.Object {
  var CONFLICTING: chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
  var PENDING: chromeDashAppsLib.chromeDashAppsLibStrings.pending
  var SYNCED: chromeDashAppsLib.chromeDashAppsLibStrings.synced
}

object Anon_CONFLICTING {
  @scala.inline
  def apply(
    CONFLICTING: chromeDashAppsLib.chromeDashAppsLibStrings.conflicting,
    PENDING: chromeDashAppsLib.chromeDashAppsLibStrings.pending,
    SYNCED: chromeDashAppsLib.chromeDashAppsLibStrings.synced
  ): Anon_CONFLICTING = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CONFLICTING")(CONFLICTING)
    __obj.updateDynamic("PENDING")(PENDING)
    __obj.updateDynamic("SYNCED")(SYNCED)
    __obj.asInstanceOf[Anon_CONFLICTING]
  }
}

