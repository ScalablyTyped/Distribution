package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Container: PresetContainer, Name: Name): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
  
  @scala.inline
  implicit class CreatePresetRequestOps[Self <: CreatePresetRequest] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: PresetContainer): Self = this.set("Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio(value: AudioParameters): Self = this.set("Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("Audio", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setThumbnails(value: Thumbnails): Self = this.set("Thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("Thumbnails", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoParameters): Self = this.set("Video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("Video", js.undefined)
  }
}
