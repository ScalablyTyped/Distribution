package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashIsoEncryptionSettings extends js.Object {
  /**
    * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
    */
  var PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility] = js.native
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
}

object DashIsoEncryptionSettings {
  @scala.inline
  def apply(
    PlaybackDeviceCompatibility: DashIsoPlaybackDeviceCompatibility = null,
    SpekeKeyProvider: SpekeKeyProvider = null
  ): DashIsoEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (PlaybackDeviceCompatibility != null) __obj.updateDynamic("PlaybackDeviceCompatibility")(PlaybackDeviceCompatibility.asInstanceOf[js.Any])
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashIsoEncryptionSettings]
  }
}

