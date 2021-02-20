package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionDestinationSettings extends StObject {
  
  /**
    * Burn-In Destination Settings.
    */
  var BurninDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.BurninDestinationSettings] = js.native
  
  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  var DestinationType: js.UndefOr[CaptionDestinationType] = js.native
  
  /**
    * DVB-Sub Destination Settings
    */
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbSubDestinationSettings] = js.native
  
  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.EmbeddedDestinationSettings] = js.native
  
  /**
    * Settings specific to IMSC caption outputs.
    */
  var ImscDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ImscDestinationSettings] = js.native
  
  /**
    * Settings for SCC caption output.
    */
  var SccDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.SccDestinationSettings] = js.native
  
  /**
    * Settings for Teletext caption output
    */
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TeletextDestinationSettings] = js.native
  
  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TtmlDestinationSettings] = js.native
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
    def setBurninDestinationSettings(value: BurninDestinationSettings): Self = StObject.set(x, "BurninDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurninDestinationSettingsUndefined: Self = StObject.set(x, "BurninDestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationType(value: CaptionDestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    @scala.inline
    def setDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = StObject.set(x, "DvbSubDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbSubDestinationSettingsUndefined: Self = StObject.set(x, "DvbSubDestinationSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = StObject.set(x, "EmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDestinationSettingsUndefined: Self = StObject.set(x, "EmbeddedDestinationSettings", js.undefined)
    
    @scala.inline
    def setImscDestinationSettings(value: ImscDestinationSettings): Self = StObject.set(x, "ImscDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImscDestinationSettingsUndefined: Self = StObject.set(x, "ImscDestinationSettings", js.undefined)
    
    @scala.inline
    def setSccDestinationSettings(value: SccDestinationSettings): Self = StObject.set(x, "SccDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSccDestinationSettingsUndefined: Self = StObject.set(x, "SccDestinationSettings", js.undefined)
    
    @scala.inline
    def setTeletextDestinationSettings(value: TeletextDestinationSettings): Self = StObject.set(x, "TeletextDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextDestinationSettingsUndefined: Self = StObject.set(x, "TeletextDestinationSettings", js.undefined)
    
    @scala.inline
    def setTtmlDestinationSettings(value: TtmlDestinationSettings): Self = StObject.set(x, "TtmlDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtmlDestinationSettingsUndefined: Self = StObject.set(x, "TtmlDestinationSettings", js.undefined)
  }
}
