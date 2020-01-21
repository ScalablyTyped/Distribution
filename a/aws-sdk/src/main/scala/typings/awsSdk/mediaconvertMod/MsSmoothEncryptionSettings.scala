package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothEncryptionSettings extends js.Object {
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
}

object MsSmoothEncryptionSettings {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider = null): MsSmoothEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothEncryptionSettings]
  }
}

