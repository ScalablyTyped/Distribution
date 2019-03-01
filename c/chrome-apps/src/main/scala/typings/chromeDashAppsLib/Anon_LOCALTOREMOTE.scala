package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCALTOREMOTE extends js.Object {
  var LOCAL_TO_REMOTE: chromeDashAppsLib.chromeDashAppsLibStrings.local_to_remote
  var REMOTE_TO_LOCAL: chromeDashAppsLib.chromeDashAppsLibStrings.remote_to_local
}

object Anon_LOCALTOREMOTE {
  @scala.inline
  def apply(
    LOCAL_TO_REMOTE: chromeDashAppsLib.chromeDashAppsLibStrings.local_to_remote,
    REMOTE_TO_LOCAL: chromeDashAppsLib.chromeDashAppsLibStrings.remote_to_local
  ): Anon_LOCALTOREMOTE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOCAL_TO_REMOTE")(LOCAL_TO_REMOTE)
    __obj.updateDynamic("REMOTE_TO_LOCAL")(REMOTE_TO_LOCAL)
    __obj.asInstanceOf[Anon_LOCALTOREMOTE]
  }
}

