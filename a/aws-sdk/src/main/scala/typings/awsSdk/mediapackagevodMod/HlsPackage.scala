package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsPackage extends js.Object {
  var Encryption: js.UndefOr[HlsEncryption] = js.native
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest = js.native
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[boolean] = js.native
}

object HlsPackage {
  @scala.inline
  def apply(
    HlsManifests: listOfHlsManifest,
    Encryption: HlsEncryption = null,
    SegmentDurationSeconds: js.UndefOr[integer] = js.undefined,
    UseAudioRenditionGroup: js.UndefOr[boolean] = js.undefined
  ): HlsPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UseAudioRenditionGroup)) __obj.updateDynamic("UseAudioRenditionGroup")(UseAudioRenditionGroup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsPackage]
  }
}

