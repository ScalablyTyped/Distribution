package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required
  var DISABLED: chromeDashAppsLib.chromeDashAppsLibStrings.disabled
  var INITIALIZING: chromeDashAppsLib.chromeDashAppsLibStrings.initializing
  var RUNNING: chromeDashAppsLib.chromeDashAppsLibStrings.running
  var TEMPORARY_UNAVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable
}

object Anon_AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required,
    DISABLED: chromeDashAppsLib.chromeDashAppsLibStrings.disabled,
    INITIALIZING: chromeDashAppsLib.chromeDashAppsLibStrings.initializing,
    RUNNING: chromeDashAppsLib.chromeDashAppsLibStrings.running,
    TEMPORARY_UNAVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable
  ): Anon_AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUTHENTICATION_REQUIRED")(AUTHENTICATION_REQUIRED)
    __obj.updateDynamic("DISABLED")(DISABLED)
    __obj.updateDynamic("INITIALIZING")(INITIALIZING)
    __obj.updateDynamic("RUNNING")(RUNNING)
    __obj.updateDynamic("TEMPORARY_UNAVAILABLE")(TEMPORARY_UNAVAILABLE)
    __obj.asInstanceOf[Anon_AUTHENTICATIONREQUIRED]
  }
}

