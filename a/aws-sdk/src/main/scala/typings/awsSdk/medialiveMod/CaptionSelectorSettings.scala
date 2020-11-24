package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSelectorSettings extends js.Object {
  
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.AncillarySourceSettings] = js.native
  
  var AribSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribSourceSettings] = js.native
  
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubSourceSettings] = js.native
  
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedSourceSettings] = js.native
  
  var Scte20SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20SourceSettings] = js.native
  
  var Scte27SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27SourceSettings] = js.native
  
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextSourceSettings] = js.native
}
object CaptionSelectorSettings {
  
  @scala.inline
  def apply(): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
  
  @scala.inline
  implicit class CaptionSelectorSettingsOps[Self <: CaptionSelectorSettings] (val x: Self) extends AnyVal {
    
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
    def setAncillarySourceSettings(value: AncillarySourceSettings): Self = this.set("AncillarySourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncillarySourceSettings: Self = this.set("AncillarySourceSettings", js.undefined)
    
    @scala.inline
    def setAribSourceSettings(value: AribSourceSettings): Self = this.set("AribSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAribSourceSettings: Self = this.set("AribSourceSettings", js.undefined)
    
    @scala.inline
    def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = this.set("DvbSubSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbSubSourceSettings: Self = this.set("DvbSubSourceSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = this.set("EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedSourceSettings: Self = this.set("EmbeddedSourceSettings", js.undefined)
    
    @scala.inline
    def setScte20SourceSettings(value: Scte20SourceSettings): Self = this.set("Scte20SourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte20SourceSettings: Self = this.set("Scte20SourceSettings", js.undefined)
    
    @scala.inline
    def setScte27SourceSettings(value: Scte27SourceSettings): Self = this.set("Scte27SourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte27SourceSettings: Self = this.set("Scte27SourceSettings", js.undefined)
    
    @scala.inline
    def setTeletextSourceSettings(value: TeletextSourceSettings): Self = this.set("TeletextSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeletextSourceSettings: Self = this.set("TeletextSourceSettings", js.undefined)
  }
}
