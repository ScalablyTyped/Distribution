package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsSmoothEncryptionSettings extends js.Object {
  
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsSdk.mediaconvertMod.SpekeKeyProvider] = js.native
}
object MsSmoothEncryptionSettings {
  
  @scala.inline
  def apply(): MsSmoothEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothEncryptionSettings]
  }
  
  @scala.inline
  implicit class MsSmoothEncryptionSettingsOps[Self <: MsSmoothEncryptionSettings] (val x: Self) extends AnyVal {
    
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
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpekeKeyProvider: Self = this.set("SpekeKeyProvider", js.undefined)
  }
}
