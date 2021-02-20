package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionDescription extends StObject {
  
  /**
    * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The name should be of the format "Caption Selector ", which denotes that the Nth Caption Selector will be used from each input.
    */
  var CaptionSelectorName: js.UndefOr[stringMin1] = js.native
  
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
object CaptionDescription {
  
  @scala.inline
  def apply(): CaptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDescription]
  }
  
  @scala.inline
  implicit class CaptionDescriptionMutableBuilder[Self <: CaptionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionSelectorName(value: stringMin1): Self = StObject.set(x, "CaptionSelectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionSelectorNameUndefined: Self = StObject.set(x, "CaptionSelectorName", js.undefined)
    
    @scala.inline
    def setCustomLanguageCode(value: stringPatternAZaZ23AZaZ): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    @scala.inline
    def setDestinationSettings(value: CaptionDestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageDescription(value: string): Self = StObject.set(x, "LanguageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDescriptionUndefined: Self = StObject.set(x, "LanguageDescription", js.undefined)
  }
}
