package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSettings extends js.Object {
  
  /**
    * Settings for HLS output groups
    */
  var HlsSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.HlsSettings] = js.native
}
object OutputSettings {
  
  @scala.inline
  def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  
  @scala.inline
  implicit class OutputSettingsOps[Self <: OutputSettings] (val x: Self) extends AnyVal {
    
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
    def setHlsSettings(value: HlsSettings): Self = this.set("HlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsSettings: Self = this.set("HlsSettings", js.undefined)
  }
}
