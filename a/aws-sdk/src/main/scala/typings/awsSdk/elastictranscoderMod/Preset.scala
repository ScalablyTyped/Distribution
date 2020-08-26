package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preset extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the preset.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * A section of the response body that provides information about the audio preset values.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: js.UndefOr[PresetContainer] = js.native
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typings.awsSdk.elastictranscoderMod.Description] = js.native
  /**
    * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
    */
  var Id: js.UndefOr[typings.awsSdk.elastictranscoderMod.Id] = js.native
  /**
    * The name of the preset.
    */
  var Name: js.UndefOr[typings.awsSdk.elastictranscoderMod.Name] = js.native
  /**
    * A section of the response body that provides information about the thumbnail preset values, if any.
    */
  var Thumbnails: js.UndefOr[typings.awsSdk.elastictranscoderMod.Thumbnails] = js.native
  /**
    * Whether the preset is a default preset provided by Elastic Transcoder (System) or a preset that you have defined (Custom).
    */
  var Type: js.UndefOr[PresetType] = js.native
  /**
    * A section of the response body that provides information about the video preset values.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}

object Preset {
  @scala.inline
  def apply(): Preset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preset]
  }
  @scala.inline
  implicit class PresetOps[Self <: Preset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAudio(value: AudioParameters): Self = this.set("Audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("Audio", js.undefined)
    @scala.inline
    def setContainer(value: PresetContainer): Self = this.set("Container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("Container", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setThumbnails(value: Thumbnails): Self = this.set("Thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("Thumbnails", js.undefined)
    @scala.inline
    def setType(value: PresetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVideo(value: VideoParameters): Self = this.set("Video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("Video", js.undefined)
  }
  
}

