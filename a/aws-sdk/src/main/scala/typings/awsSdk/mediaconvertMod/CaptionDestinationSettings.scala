package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionDestinationSettings extends js.Object {
  
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
  implicit class CaptionDestinationSettingsOps[Self <: CaptionDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setBurninDestinationSettings(value: BurninDestinationSettings): Self = this.set("BurninDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurninDestinationSettings: Self = this.set("BurninDestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationType(value: CaptionDestinationType): Self = this.set("DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationType: Self = this.set("DestinationType", js.undefined)
    
    @scala.inline
    def setDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = this.set("DvbSubDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbSubDestinationSettings: Self = this.set("DvbSubDestinationSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = this.set("EmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedDestinationSettings: Self = this.set("EmbeddedDestinationSettings", js.undefined)
    
    @scala.inline
    def setImscDestinationSettings(value: ImscDestinationSettings): Self = this.set("ImscDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImscDestinationSettings: Self = this.set("ImscDestinationSettings", js.undefined)
    
    @scala.inline
    def setSccDestinationSettings(value: SccDestinationSettings): Self = this.set("SccDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSccDestinationSettings: Self = this.set("SccDestinationSettings", js.undefined)
    
    @scala.inline
    def setTeletextDestinationSettings(value: TeletextDestinationSettings): Self = this.set("TeletextDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeletextDestinationSettings: Self = this.set("TeletextDestinationSettings", js.undefined)
    
    @scala.inline
    def setTtmlDestinationSettings(value: TtmlDestinationSettings): Self = this.set("TtmlDestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtmlDestinationSettings: Self = this.set("TtmlDestinationSettings", js.undefined)
  }
}
