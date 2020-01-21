package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafPackageCreateOrUpdateParameters extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[listOfHlsManifestCreateOrUpdateParameters] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  /**
    * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
    */
  var SegmentPrefix: js.UndefOr[string] = js.native
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackageMod.StreamSelection] = js.native
}

object CmafPackageCreateOrUpdateParameters {
  @scala.inline
  def apply(
    Encryption: CmafEncryption = null,
    HlsManifests: listOfHlsManifestCreateOrUpdateParameters = null,
    SegmentDurationSeconds: Int | Double = null,
    SegmentPrefix: string = null,
    StreamSelection: StreamSelection = null
  ): CmafPackageCreateOrUpdateParameters = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (HlsManifests != null) __obj.updateDynamic("HlsManifests")(HlsManifests.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (SegmentPrefix != null) __obj.updateDynamic("SegmentPrefix")(SegmentPrefix.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackageCreateOrUpdateParameters]
  }
}

