package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.local_to_remote_
import typings.chromeApps.chromeAppsStrings.remote_to_local_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOCALTOREMOTE extends js.Object {
  var LOCAL_TO_REMOTE: local_to_remote_
  var REMOTE_TO_LOCAL: remote_to_local_
}

object AnonLOCALTOREMOTE {
  @scala.inline
  def apply(LOCAL_TO_REMOTE: local_to_remote_, REMOTE_TO_LOCAL: remote_to_local_): AnonLOCALTOREMOTE = {
    val __obj = js.Dynamic.literal(LOCAL_TO_REMOTE = LOCAL_TO_REMOTE.asInstanceOf[js.Any], REMOTE_TO_LOCAL = REMOTE_TO_LOCAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLOCALTOREMOTE]
  }
}

