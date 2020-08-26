package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetSettings extends js.Object {
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.native
  /**
    * Caption settings for this preset. There can be multiple caption settings in a single output.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescriptionPreset] = js.native
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ContainerSettings] = js.native
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typings.awsSdk.mediaconvertMod.VideoDescription] = js.native
}

object PresetSettings {
  @scala.inline
  def apply(): PresetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetSettings]
  }
  @scala.inline
  implicit class PresetSettingsOps[Self <: PresetSettings] (val x: Self) extends AnyVal {
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
    def setCaptionDescriptionsVarargs(value: CaptionDescriptionPreset*): Self = this.set("CaptionDescriptions", js.Array(value :_*))
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescriptionPreset): Self = this.set("CaptionDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionDescriptions: Self = this.set("CaptionDescriptions", js.undefined)
    @scala.inline
    def setContainerSettings(value: ContainerSettings): Self = this.set("ContainerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerSettings: Self = this.set("ContainerSettings", js.undefined)
    @scala.inline
    def setVideoDescription(value: VideoDescription): Self = this.set("VideoDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDescription: Self = this.set("VideoDescription", js.undefined)
  }
  
}

