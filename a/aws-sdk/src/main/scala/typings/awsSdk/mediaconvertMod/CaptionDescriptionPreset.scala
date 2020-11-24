package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionDescriptionPreset extends js.Object {
  
  /**
    * Specify the language for this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information when automatically selecting the font script for rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
    */
  var CustomLanguageCode: js.UndefOr[stringPatternAZaZ23AZaZ] = js.native
  
  /**
    * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.native
  
  /**
    * Specify the language of this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font language for rendering the captions text.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.mediaconvertMod.LanguageCode] = js.native
  
  /**
    * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for display on the end-viewer's player device. For outputs in other output groups, the service ignores this setting.
    */
  var LanguageDescription: js.UndefOr[string] = js.native
}
object CaptionDescriptionPreset {
  
  @scala.inline
  def apply(): CaptionDescriptionPreset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDescriptionPreset]
  }
  
  @scala.inline
  implicit class CaptionDescriptionPresetOps[Self <: CaptionDescriptionPreset] (val x: Self) extends AnyVal {
    
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
    def setCustomLanguageCode(value: stringPatternAZaZ23AZaZ): Self = this.set("CustomLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLanguageCode: Self = this.set("CustomLanguageCode", js.undefined)
    
    @scala.inline
    def setDestinationSettings(value: CaptionDestinationSettings): Self = this.set("DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationSettings: Self = this.set("DestinationSettings", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageDescription(value: string): Self = this.set("LanguageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDescription: Self = this.set("LanguageDescription", js.undefined)
  }
}
