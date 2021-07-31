package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSelectorSettings extends StObject {
  
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.AncillarySourceSettings] = js.undefined
  
  var AribSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribSourceSettings] = js.undefined
  
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubSourceSettings] = js.undefined
  
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedSourceSettings] = js.undefined
  
  var Scte20SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20SourceSettings] = js.undefined
  
  var Scte27SourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27SourceSettings] = js.undefined
  
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextSourceSettings] = js.undefined
}
object CaptionSelectorSettings {
  
  @scala.inline
  def apply(): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
  
  @scala.inline
  implicit class CaptionSelectorSettingsMutableBuilder[Self <: CaptionSelectorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncillarySourceSettings(value: AncillarySourceSettings): Self = StObject.set(x, "AncillarySourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncillarySourceSettingsUndefined: Self = StObject.set(x, "AncillarySourceSettings", js.undefined)
    
    @scala.inline
    def setAribSourceSettings(value: AribSourceSettings): Self = StObject.set(x, "AribSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAribSourceSettingsUndefined: Self = StObject.set(x, "AribSourceSettings", js.undefined)
    
    @scala.inline
    def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = StObject.set(x, "DvbSubSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbSubSourceSettingsUndefined: Self = StObject.set(x, "DvbSubSourceSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = StObject.set(x, "EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedSourceSettingsUndefined: Self = StObject.set(x, "EmbeddedSourceSettings", js.undefined)
    
    @scala.inline
    def setScte20SourceSettings(value: Scte20SourceSettings): Self = StObject.set(x, "Scte20SourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte20SourceSettingsUndefined: Self = StObject.set(x, "Scte20SourceSettings", js.undefined)
    
    @scala.inline
    def setScte27SourceSettings(value: Scte27SourceSettings): Self = StObject.set(x, "Scte27SourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte27SourceSettingsUndefined: Self = StObject.set(x, "Scte27SourceSettings", js.undefined)
    
    @scala.inline
    def setTeletextSourceSettings(value: TeletextSourceSettings): Self = StObject.set(x, "TeletextSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextSourceSettingsUndefined: Self = StObject.set(x, "TeletextSourceSettings", js.undefined)
  }
}
