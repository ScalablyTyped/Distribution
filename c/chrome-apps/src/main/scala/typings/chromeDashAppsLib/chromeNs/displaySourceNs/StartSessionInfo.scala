package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSessionInfo extends js.Object {
  var audioTrack: js.UndefOr[js.Object] = js.undefined
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.undefined
  var sinkId: chromeDashAppsLib.chromeNs.integer
  var videoTrack: js.UndefOr[js.Object] = js.undefined
}

object StartSessionInfo {
  @scala.inline
  def apply(
    sinkId: chromeDashAppsLib.chromeNs.integer,
    audioTrack: js.Object = null,
    authenticationInfo: AuthenticationInfo = null,
    videoTrack: js.Object = null
  ): StartSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sinkId")(sinkId)
    if (audioTrack != null) __obj.updateDynamic("audioTrack")(audioTrack)
    if (authenticationInfo != null) __obj.updateDynamic("authenticationInfo")(authenticationInfo)
    if (videoTrack != null) __obj.updateDynamic("videoTrack")(videoTrack)
    __obj.asInstanceOf[StartSessionInfo]
  }
}

