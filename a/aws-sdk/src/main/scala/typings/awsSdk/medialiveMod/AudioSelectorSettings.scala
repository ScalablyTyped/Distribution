package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelectorSettings extends StObject {
  
  var AudioHlsRenditionSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioHlsRenditionSelection] = js.undefined
  
  var AudioLanguageSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioLanguageSelection] = js.undefined
  
  var AudioPidSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioPidSelection] = js.undefined
  
  var AudioTrackSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioTrackSelection] = js.undefined
}
object AudioSelectorSettings {
  
  inline def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  
  extension [Self <: AudioSelectorSettings](x: Self) {
    
    inline def setAudioHlsRenditionSelection(value: AudioHlsRenditionSelection): Self = StObject.set(x, "AudioHlsRenditionSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioHlsRenditionSelectionUndefined: Self = StObject.set(x, "AudioHlsRenditionSelection", js.undefined)
    
    inline def setAudioLanguageSelection(value: AudioLanguageSelection): Self = StObject.set(x, "AudioLanguageSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioLanguageSelectionUndefined: Self = StObject.set(x, "AudioLanguageSelection", js.undefined)
    
    inline def setAudioPidSelection(value: AudioPidSelection): Self = StObject.set(x, "AudioPidSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioPidSelectionUndefined: Self = StObject.set(x, "AudioPidSelection", js.undefined)
    
    inline def setAudioTrackSelection(value: AudioTrackSelection): Self = StObject.set(x, "AudioTrackSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackSelectionUndefined: Self = StObject.set(x, "AudioTrackSelection", js.undefined)
  }
}
