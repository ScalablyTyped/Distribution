package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashManifest extends js.Object {
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.native
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.native
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typings.awsSdk.mediapackagevodMod.Profile] = js.native
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackagevodMod.StreamSelection] = js.native
}

object DashManifest {
  @scala.inline
  def apply(
    ManifestName: string = null,
    MinBufferTimeSeconds: Int | Double = null,
    Profile: Profile = null,
    StreamSelection: StreamSelection = null
  ): DashManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (MinBufferTimeSeconds != null) __obj.updateDynamic("MinBufferTimeSeconds")(MinBufferTimeSeconds.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashManifest]
  }
}

