package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.local_to_remote
import typings.chromeDashApps.chromeDashAppsStrings.remote_to_local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCALTOREMOTE extends js.Object {
  var LOCAL_TO_REMOTE: local_to_remote
  var REMOTE_TO_LOCAL: remote_to_local
}

object Anon_LOCALTOREMOTE {
  @scala.inline
  def apply(LOCAL_TO_REMOTE: local_to_remote, REMOTE_TO_LOCAL: remote_to_local): Anon_LOCALTOREMOTE = {
    val __obj = js.Dynamic.literal(LOCAL_TO_REMOTE = LOCAL_TO_REMOTE.asInstanceOf[js.Any], REMOTE_TO_LOCAL = REMOTE_TO_LOCAL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LOCALTOREMOTE]
  }
}

