package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafPackage extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest = js.native
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}

object CmafPackage {
  @scala.inline
  def apply(
    HlsManifests: listOfHlsManifest,
    Encryption: CmafEncryption = null,
    SegmentDurationSeconds: Int | Double = null
  ): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
}

