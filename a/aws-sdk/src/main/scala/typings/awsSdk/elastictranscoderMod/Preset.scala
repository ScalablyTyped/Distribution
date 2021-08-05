package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preset extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the preset.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * A section of the response body that provides information about the audio preset values.
    */
  var Audio: js.UndefOr[AudioParameters] = js.undefined
  
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: js.UndefOr[PresetContainer] = js.undefined
  
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typings.awsSdk.elastictranscoderMod.Description] = js.undefined
  
  /**
    * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
    */
  var Id: js.UndefOr[typings.awsSdk.elastictranscoderMod.Id] = js.undefined
  
  /**
    * The name of the preset.
    */
  var Name: js.UndefOr[typings.awsSdk.elastictranscoderMod.Name] = js.undefined
  
  /**
    * A section of the response body that provides information about the thumbnail preset values, if any.
    */
  var Thumbnails: js.UndefOr[typings.awsSdk.elastictranscoderMod.Thumbnails] = js.undefined
  
  /**
    * Whether the preset is a default preset provided by Elastic Transcoder (System) or a preset that you have defined (Custom).
    */
  var Type: js.UndefOr[PresetType] = js.undefined
  
  /**
    * A section of the response body that provides information about the video preset values.
    */
  var Video: js.UndefOr[VideoParameters] = js.undefined
}
object Preset {
  
  inline def apply(): Preset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preset]
  }
  
  extension [Self <: Preset](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAudio(value: AudioParameters): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
    
    inline def setContainer(value: PresetContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setThumbnails(value: Thumbnails): Self = StObject.set(x, "Thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "Thumbnails", js.undefined)
    
    inline def setType(value: PresetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVideo(value: VideoParameters): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
