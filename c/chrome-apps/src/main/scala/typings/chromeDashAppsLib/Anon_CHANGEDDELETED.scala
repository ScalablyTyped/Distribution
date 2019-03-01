package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHANGEDDELETED extends js.Object {
  var CHANGED: chromeDashAppsLib.chromeDashAppsLibStrings.CHANGED
  var DELETED: chromeDashAppsLib.chromeDashAppsLibStrings.DELETED
}

object Anon_CHANGEDDELETED {
  @scala.inline
  def apply(
    CHANGED: chromeDashAppsLib.chromeDashAppsLibStrings.CHANGED,
    DELETED: chromeDashAppsLib.chromeDashAppsLibStrings.DELETED
  ): Anon_CHANGEDDELETED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHANGED")(CHANGED)
    __obj.updateDynamic("DELETED")(DELETED)
    __obj.asInstanceOf[Anon_CHANGEDDELETED]
  }
}

