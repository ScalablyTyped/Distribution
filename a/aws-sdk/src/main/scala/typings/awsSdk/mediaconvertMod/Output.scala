package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
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
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setAudioDescriptionsVarargs(value: AudioDescription*): Self = this.set("AudioDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setAudioDescriptions(value: listOfAudioDescription): Self = this.set("AudioDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioDescriptions: Self = this.set("AudioDescriptions", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = this.set("CaptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescription): Self = this.set("CaptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionDescriptions: Self = this.set("CaptionDescriptions", js.undefined)
    
    @scala.inline
    def setContainerSettings(value: ContainerSettings): Self = this.set("ContainerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSettings: Self = this.set("ContainerSettings", js.undefined)
    
    @scala.inline
    def setExtension(value: string): Self = this.set("Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("Extension", js.undefined)
    
    @scala.inline
    def setNameModifier(value: stringMin1): Self = this.set("NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameModifier: Self = this.set("NameModifier", js.undefined)
    
    @scala.inline
    def setOutputSettings(value: OutputSettings): Self = this.set("OutputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSettings: Self = this.set("OutputSettings", js.undefined)
    
    @scala.inline
    def setPreset(value: stringMin0): Self = this.set("Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("Preset", js.undefined)
    
    @scala.inline
    def setVideoDescription(value: VideoDescription): Self = this.set("VideoDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDescription: Self = this.set("VideoDescription", js.undefined)
  }
}
