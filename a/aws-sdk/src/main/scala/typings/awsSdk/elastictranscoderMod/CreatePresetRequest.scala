package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetRequest extends js.Object {
  /**
    * A section of the request body that specifies the audio parameters.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: PresetContainer = js.native
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typings.awsSdk.elastictranscoderMod.Description] = js.native
  /**
    * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not enforced.
    */
  var Name: typings.awsSdk.elastictranscoderMod.Name = js.native
  /**
    * A section of the request body that specifies the thumbnail parameters, if any.
    */
  var Thumbnails: js.UndefOr[typings.awsSdk.elastictranscoderMod.Thumbnails] = js.native
  /**
    * A section of the request body that specifies the video parameters.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}

object CreatePresetRequest {
  @scala.inline
  def apply(
    Container: PresetContainer,
    Name: Name,
    Audio: AudioParameters = null,
    Description: Description = null,
    Thumbnails: Thumbnails = null,
    Video: VideoParameters = null
  ): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Audio != null) __obj.updateDynamic("Audio")(Audio.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Thumbnails != null) __obj.updateDynamic("Thumbnails")(Thumbnails.asInstanceOf[js.Any])
    if (Video != null) __obj.updateDynamic("Video")(Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
}

