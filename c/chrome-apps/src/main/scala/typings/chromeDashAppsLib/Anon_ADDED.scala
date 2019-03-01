package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADDED extends js.Object {
  var ADDED: chromeDashAppsLib.chromeDashAppsLibStrings.added
  var DELETED: chromeDashAppsLib.chromeDashAppsLibStrings.deleted
  var UPDATED: chromeDashAppsLib.chromeDashAppsLibStrings.updated
}

object Anon_ADDED {
  @scala.inline
  def apply(
    ADDED: chromeDashAppsLib.chromeDashAppsLibStrings.added,
    DELETED: chromeDashAppsLib.chromeDashAppsLibStrings.deleted,
    UPDATED: chromeDashAppsLib.chromeDashAppsLibStrings.updated
  ): Anon_ADDED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADDED")(ADDED)
    __obj.updateDynamic("DELETED")(DELETED)
    __obj.updateDynamic("UPDATED")(UPDATED)
    __obj.asInstanceOf[Anon_ADDED]
  }
}

