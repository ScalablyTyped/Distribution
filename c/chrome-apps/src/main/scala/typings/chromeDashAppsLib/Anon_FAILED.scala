package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILED extends js.Object {
  var FAILED: chromeDashAppsLib.chromeDashAppsLibStrings.failed
  var REJECTED: chromeDashAppsLib.chromeDashAppsLibStrings.rejected
  var SUCCEEDED: chromeDashAppsLib.chromeDashAppsLibStrings.succeeded
  var UNHANDLED: chromeDashAppsLib.chromeDashAppsLibStrings.unhandled
}

object Anon_FAILED {
  @scala.inline
  def apply(
    FAILED: chromeDashAppsLib.chromeDashAppsLibStrings.failed,
    REJECTED: chromeDashAppsLib.chromeDashAppsLibStrings.rejected,
    SUCCEEDED: chromeDashAppsLib.chromeDashAppsLibStrings.succeeded,
    UNHANDLED: chromeDashAppsLib.chromeDashAppsLibStrings.unhandled
  ): Anon_FAILED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FAILED")(FAILED)
    __obj.updateDynamic("REJECTED")(REJECTED)
    __obj.updateDynamic("SUCCEEDED")(SUCCEEDED)
    __obj.updateDynamic("UNHANDLED")(UNHANDLED)
    __obj.asInstanceOf[Anon_FAILED]
  }
}

