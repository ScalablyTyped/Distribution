package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE extends js.Object {
  var FAILURE: chromeDashAppsLib.chromeDashAppsLibStrings.failure
  var IN_USE: chromeDashAppsLib.chromeDashAppsLibStrings.in_use
  var NO_SUCH_DEVICE: chromeDashAppsLib.chromeDashAppsLibStrings.no_such_device
  var SUCCESS: chromeDashAppsLib.chromeDashAppsLibStrings.success
}

object Anon_FAILURE {
  @scala.inline
  def apply(
    FAILURE: chromeDashAppsLib.chromeDashAppsLibStrings.failure,
    IN_USE: chromeDashAppsLib.chromeDashAppsLibStrings.in_use,
    NO_SUCH_DEVICE: chromeDashAppsLib.chromeDashAppsLibStrings.no_such_device,
    SUCCESS: chromeDashAppsLib.chromeDashAppsLibStrings.success
  ): Anon_FAILURE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FAILURE")(FAILURE)
    __obj.updateDynamic("IN_USE")(IN_USE)
    __obj.updateDynamic("NO_SUCH_DEVICE")(NO_SUCH_DEVICE)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.asInstanceOf[Anon_FAILURE]
  }
}

