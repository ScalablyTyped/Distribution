package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImscDestinationSettings extends StObject {
  
  /**
    * Set Accessibility subtitles to Enabled if the ISMC or WebVTT captions track is intended to provide accessibility for people who are deaf or hard of hearing. When you enable this feature, MediaConvert adds the following attributes under EXT-X-MEDIA in the HLS or CMAF manifest for this track: CHARACTERISTICS="public.accessibility.describes-spoken-dialog,public.accessibility.describes-music-and-sound" and AUTOSELECT="YES". Keep the default value, Disabled, if the captions track is not intended to provide such accessibility. MediaConvert will not add the above attributes.
    */
  var Accessibility: js.UndefOr[ImscAccessibilitySubs] = js.undefined
  
  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  var StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.undefined
}
object ImscDestinationSettings {
  
  inline def apply(): ImscDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImscDestinationSettings]
  }
  
  extension [Self <: ImscDestinationSettings](x: Self) {
    
    inline def setAccessibility(value: ImscAccessibilitySubs): Self = StObject.set(x, "Accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "Accessibility", js.undefined)
    
    inline def setStylePassthrough(value: ImscStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    inline def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
  }
}
