package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends StObject {
  
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.native
  
  /**
    * (CaptionDescriptions) contains groups of captions settings. For each output that has captions, include one instance of (CaptionDescriptions). (CaptionDescriptions) can contain multiple groups of captions settings.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ContainerSettings] = js.native
  
  /**
    * Use Extension (Extension) to specify the file extension for outputs in File output groups. If you do not specify a value, the service will use default extensions by container type as follows * MPEG-2 transport stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container, mp4 * WebM container, webm * No Container, the service will use codec extensions (e.g. AAC, H265, H265, AC3)
    */
  var Extension: js.UndefOr[string] = js.native
  
  /**
    * Use Name modifier (NameModifier) to have the service add a string to the end of each output filename. You specify the base filename as part of your destination URI. When you create multiple outputs in the same output group, Name modifier (NameModifier) is required. Name modifier also accepts format identifiers. For DASH ISO outputs, if you use the format identifiers $Number$ or $Time$ in one output, you must use them in the same way in all outputs of the output group.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.native
  
  /**
    * Specific settings for this type of output.
    */
  var OutputSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.OutputSettings] = js.native
  
  /**
    * Use Preset (Preset) to specifiy a preset for your transcoding settings. Provide the system or custom preset name. You can specify either Preset (Preset) or Container settings (ContainerSettings), but not both.
    */
  var Preset: js.UndefOr[stringMin0] = js.native
  
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typings.awsSdk.mediaconvertMod.VideoDescription] = js.native
}
object Output {
  
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDescriptionsUndefined: Self = StObject.set(x, "AudioDescriptions", js.undefined)
    
    @scala.inline
    def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescription): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setContainerSettings(value: ContainerSettings): Self = StObject.set(x, "ContainerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSettingsUndefined: Self = StObject.set(x, "ContainerSettings", js.undefined)
    
    @scala.inline
    def setExtension(value: string): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
    
    @scala.inline
    def setNameModifier(value: stringMin1): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
    
    @scala.inline
    def setOutputSettings(value: OutputSettings): Self = StObject.set(x, "OutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSettingsUndefined: Self = StObject.set(x, "OutputSettings", js.undefined)
    
    @scala.inline
    def setPreset(value: stringMin0): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
    
    @scala.inline
    def setVideoDescription(value: VideoDescription): Self = StObject.set(x, "VideoDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionUndefined: Self = StObject.set(x, "VideoDescription", js.undefined)
  }
}
