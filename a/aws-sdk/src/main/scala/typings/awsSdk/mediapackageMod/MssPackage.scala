package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackageMod.StreamSelection] = js.native
}

object MssPackage {
  @scala.inline
  def apply(
    Encryption: MssEncryption = null,
    ManifestWindowSeconds: js.UndefOr[integer] = js.undefined,
    SegmentDurationSeconds: js.UndefOr[integer] = js.undefined,
    StreamSelection: StreamSelection = null
  ): MssPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(ManifestWindowSeconds)) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.get.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
}

