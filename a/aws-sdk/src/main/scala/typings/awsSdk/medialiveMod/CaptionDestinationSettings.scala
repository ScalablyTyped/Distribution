package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionDestinationSettings extends StObject {
  
  var AribDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.AribDestinationSettings] = js.native
  
  var BurnInDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.BurnInDestinationSettings] = js.native
  
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSubDestinationSettings] = js.native
  
  var EbuTtDDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EbuTtDDestinationSettings] = js.native
  
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedDestinationSettings] = js.native
  
  var EmbeddedPlusScte20DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.EmbeddedPlusScte20DestinationSettings] = js.native
  
  var RtmpCaptionInfoDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpCaptionInfoDestinationSettings] = js.native
  
  var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte20PlusEmbeddedDestinationSettings] = js.native
  
  var Scte27DestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.Scte27DestinationSettings] = js.native
  
  var SmpteTtDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.SmpteTtDestinationSettings] = js.native
  
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TeletextDestinationSettings] = js.native
  
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.TtmlDestinationSettings] = js.native
  
  var WebvttDestinationSettings: js.UndefOr[typings.awsSdk.medialiveMod.WebvttDestinationSettings] = js.native
}
object CaptionDestinationSettings {
  
  @scala.inline
  def apply(): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
  
  @scala.inline
  implicit class CaptionDestinationSettingsMutableBuilder[Self <: CaptionDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAribDestinationSettings(value: AribDestinationSettings): Self = StObject.set(x, "AribDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAribDestinationSettingsUndefined: Self = StObject.set(x, "AribDestinationSettings", js.undefined)
    
    @scala.inline
    def setBurnInDestinationSettings(value: BurnInDestinationSettings): Self = StObject.set(x, "BurnInDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurnInDestinationSettingsUndefined: Self = StObject.set(x, "BurnInDestinationSettings", js.undefined)
    
    @scala.inline
    def setDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = StObject.set(x, "DvbSubDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbSubDestinationSettingsUndefined: Self = StObject.set(x, "DvbSubDestinationSettings", js.undefined)
    
    @scala.inline
    def setEbuTtDDestinationSettings(value: EbuTtDDestinationSettings): Self = StObject.set(x, "EbuTtDDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbuTtDDestinationSettingsUndefined: Self = StObject.set(x, "EbuTtDDestinationSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = StObject.set(x, "EmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDestinationSettingsUndefined: Self = StObject.set(x, "EmbeddedDestinationSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedPlusScte20DestinationSettings(value: EmbeddedPlusScte20DestinationSettings): Self = StObject.set(x, "EmbeddedPlusScte20DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedPlusScte20DestinationSettingsUndefined: Self = StObject.set(x, "EmbeddedPlusScte20DestinationSettings", js.undefined)
    
    @scala.inline
    def setRtmpCaptionInfoDestinationSettings(value: RtmpCaptionInfoDestinationSettings): Self = StObject.set(x, "RtmpCaptionInfoDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpCaptionInfoDestinationSettingsUndefined: Self = StObject.set(x, "RtmpCaptionInfoDestinationSettings", js.undefined)
    
    @scala.inline
    def setScte20PlusEmbeddedDestinationSettings(value: Scte20PlusEmbeddedDestinationSettings): Self = StObject.set(x, "Scte20PlusEmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte20PlusEmbeddedDestinationSettingsUndefined: Self = StObject.set(x, "Scte20PlusEmbeddedDestinationSettings", js.undefined)
    
    @scala.inline
    def setScte27DestinationSettings(value: Scte27DestinationSettings): Self = StObject.set(x, "Scte27DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte27DestinationSettingsUndefined: Self = StObject.set(x, "Scte27DestinationSettings", js.undefined)
    
    @scala.inline
    def setSmpteTtDestinationSettings(value: SmpteTtDestinationSettings): Self = StObject.set(x, "SmpteTtDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmpteTtDestinationSettingsUndefined: Self = StObject.set(x, "SmpteTtDestinationSettings", js.undefined)
    
    @scala.inline
    def setTeletextDestinationSettings(value: TeletextDestinationSettings): Self = StObject.set(x, "TeletextDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextDestinationSettingsUndefined: Self = StObject.set(x, "TeletextDestinationSettings", js.undefined)
    
    @scala.inline
    def setTtmlDestinationSettings(value: TtmlDestinationSettings): Self = StObject.set(x, "TtmlDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtmlDestinationSettingsUndefined: Self = StObject.set(x, "TtmlDestinationSettings", js.undefined)
    
    @scala.inline
    def setWebvttDestinationSettings(value: WebvttDestinationSettings): Self = StObject.set(x, "WebvttDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebvttDestinationSettingsUndefined: Self = StObject.set(x, "WebvttDestinationSettings", js.undefined)
  }
}
