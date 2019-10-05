package typings.chromeDashApps.chrome.displaySource

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSessionInfo extends js.Object {
  var audioTrack: js.UndefOr[js.Object] = js.undefined
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.undefined
  var sinkId: integer
  var videoTrack: js.UndefOr[js.Object] = js.undefined
}

object StartSessionInfo {
  @scala.inline
  def apply(
    sinkId: integer,
    audioTrack: js.Object = null,
    authenticationInfo: AuthenticationInfo = null,
    videoTrack: js.Object = null
  ): StartSessionInfo = {
    val __obj = js.Dynamic.literal(sinkId = sinkId)
    if (audioTrack != null) __obj.updateDynamic("audioTrack")(audioTrack)
    if (authenticationInfo != null) __obj.updateDynamic("authenticationInfo")(authenticationInfo)
    if (videoTrack != null) __obj.updateDynamic("videoTrack")(videoTrack)
    __obj.asInstanceOf[StartSessionInfo]
  }
}

