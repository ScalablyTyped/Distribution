package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresetSettings extends StObject {
  
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.undefined
  
  /**
    * Caption settings for this preset. There can be multiple caption settings in a single output.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescriptionPreset] = js.undefined
  
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ContainerSettings] = js.undefined
  
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typings.awsSdk.mediaconvertMod.VideoDescription] = js.undefined
}
object PresetSettings {
  
  inline def apply(): PresetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetSettings]
  }
  
  extension [Self <: PresetSettings](x: Self) {
    
    inline def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAudioDescriptionsUndefined: Self = StObject.set(x, "AudioDescriptions", js.undefined)
    
    inline def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value :_*))
    
    inline def setCaptionDescriptions(value: listOfCaptionDescriptionPreset): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    inline def setCaptionDescriptionsVarargs(value: CaptionDescriptionPreset*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value :_*))
    
    inline def setContainerSettings(value: ContainerSettings): Self = StObject.set(x, "ContainerSettings", value.asInstanceOf[js.Any])
    
    inline def setContainerSettingsUndefined: Self = StObject.set(x, "ContainerSettings", js.undefined)
    
    inline def setVideoDescription(value: VideoDescription): Self = StObject.set(x, "VideoDescription", value.asInstanceOf[js.Any])
    
    inline def setVideoDescriptionUndefined: Self = StObject.set(x, "VideoDescription", js.undefined)
  }
}
