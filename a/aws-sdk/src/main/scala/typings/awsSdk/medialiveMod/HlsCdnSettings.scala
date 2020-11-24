package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsCdnSettings extends js.Object {
  
  var HlsAkamaiSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsAkamaiSettings] = js.native
  
  var HlsBasicPutSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsBasicPutSettings] = js.native
  
  var HlsMediaStoreSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsMediaStoreSettings] = js.native
  
  var HlsWebdavSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsWebdavSettings] = js.native
}
object HlsCdnSettings {
  
  @scala.inline
  def apply(): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCdnSettings]
  }
  
  @scala.inline
  implicit class HlsCdnSettingsOps[Self <: HlsCdnSettings] (val x: Self) extends AnyVal {
    
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
    def setHlsAkamaiSettings(value: HlsAkamaiSettings): Self = this.set("HlsAkamaiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsAkamaiSettings: Self = this.set("HlsAkamaiSettings", js.undefined)
    
    @scala.inline
    def setHlsBasicPutSettings(value: HlsBasicPutSettings): Self = this.set("HlsBasicPutSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsBasicPutSettings: Self = this.set("HlsBasicPutSettings", js.undefined)
    
    @scala.inline
    def setHlsMediaStoreSettings(value: HlsMediaStoreSettings): Self = this.set("HlsMediaStoreSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsMediaStoreSettings: Self = this.set("HlsMediaStoreSettings", js.undefined)
    
    @scala.inline
    def setHlsWebdavSettings(value: HlsWebdavSettings): Self = this.set("HlsWebdavSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsWebdavSettings: Self = this.set("HlsWebdavSettings", js.undefined)
  }
}
