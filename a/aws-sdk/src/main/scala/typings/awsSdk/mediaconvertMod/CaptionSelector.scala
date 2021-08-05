package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSelector extends StObject {
  
  /**
    * The specific language to extract from source, using the ISO 639-2 or ISO 639-3 three-letter language code. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.undefined
  
  /**
    * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.mediaconvertMod.LanguageCode] = js.undefined
  
  /**
    * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  var SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined
}
object CaptionSelector {
  
  inline def apply(): CaptionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSelector]
  }
  
  extension [Self <: CaptionSelector](x: Self) {
    
    inline def setCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setSourceSettings(value: CaptionSourceSettings): Self = StObject.set(x, "SourceSettings", value.asInstanceOf[js.Any])
    
    inline def setSourceSettingsUndefined: Self = StObject.set(x, "SourceSettings", js.undefined)
  }
}
