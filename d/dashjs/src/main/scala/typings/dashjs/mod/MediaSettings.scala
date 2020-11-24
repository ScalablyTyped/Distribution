package typings.dashjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSettings extends js.Object {
  
  var accessibility: js.UndefOr[js.Any] = js.native
  
  var audioChannelConfiguration: js.UndefOr[js.Array[_]] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var viewpoint: js.UndefOr[js.Any] = js.native
}
object MediaSettings {
  
  @scala.inline
  def apply(): MediaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSettings]
  }
  
  @scala.inline
  implicit class MediaSettingsOps[Self <: MediaSettings] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(value: js.Any): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAudioChannelConfigurationVarargs(value: js.Any*): Self = this.set("audioChannelConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setAudioChannelConfiguration(value: js.Array[_]): Self = this.set("audioChannelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioChannelConfiguration: Self = this.set("audioChannelConfiguration", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setViewpoint(value: js.Any): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
  }
}
