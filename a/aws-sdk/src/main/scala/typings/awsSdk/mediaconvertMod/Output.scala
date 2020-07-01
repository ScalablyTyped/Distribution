package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AudioDescriptions: listOfAudioDescription = null,
    CaptionDescriptions: listOfCaptionDescription = null,
    ContainerSettings: ContainerSettings = null,
    Extension: string = null,
    NameModifier: stringMin1 = null,
    OutputSettings: OutputSettings = null,
    Preset: stringMin0 = null,
    VideoDescription: VideoDescription = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (AudioDescriptions != null) __obj.updateDynamic("AudioDescriptions")(AudioDescriptions.asInstanceOf[js.Any])
    if (CaptionDescriptions != null) __obj.updateDynamic("CaptionDescriptions")(CaptionDescriptions.asInstanceOf[js.Any])
    if (ContainerSettings != null) __obj.updateDynamic("ContainerSettings")(ContainerSettings.asInstanceOf[js.Any])
    if (Extension != null) __obj.updateDynamic("Extension")(Extension.asInstanceOf[js.Any])
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    if (OutputSettings != null) __obj.updateDynamic("OutputSettings")(OutputSettings.asInstanceOf[js.Any])
    if (Preset != null) __obj.updateDynamic("Preset")(Preset.asInstanceOf[js.Any])
    if (VideoDescription != null) __obj.updateDynamic("VideoDescription")(VideoDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

