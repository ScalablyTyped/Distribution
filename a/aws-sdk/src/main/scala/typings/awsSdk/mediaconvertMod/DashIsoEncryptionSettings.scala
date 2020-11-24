package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DashIsoEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoEncryptionSettings]
  }
  
  @scala.inline
  implicit class DashIsoEncryptionSettingsOps[Self <: DashIsoEncryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlaybackDeviceCompatibility(value: DashIsoPlaybackDeviceCompatibility): Self = this.set("PlaybackDeviceCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackDeviceCompatibility: Self = this.set("PlaybackDeviceCompatibility", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpekeKeyProvider: Self = this.set("SpekeKeyProvider", js.undefined)
  }
}
