package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashManifest extends js.Object {
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typings.awsSdk.mediapackagevodMod.ManifestLayout] = js.native
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
    ManifestLayout: ManifestLayout = null,
    ManifestName: string = null,
    MinBufferTimeSeconds: js.UndefOr[integer] = js.undefined,
    Profile: Profile = null,
    StreamSelection: StreamSelection = null
  ): DashManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestLayout != null) __obj.updateDynamic("ManifestLayout")(ManifestLayout.asInstanceOf[js.Any])
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (!js.isUndefined(MinBufferTimeSeconds)) __obj.updateDynamic("MinBufferTimeSeconds")(MinBufferTimeSeconds.get.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashManifest]
  }
}

