package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Preset extends StObject {
  
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
  implicit class PresetMutableBuilder[Self <: Preset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAudio(value: AudioParameters): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
    
    @scala.inline
    def setContainer(value: PresetContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setThumbnails(value: Thumbnails): Self = StObject.set(x, "Thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "Thumbnails", js.undefined)
    
    @scala.inline
    def setType(value: PresetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoParameters): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
