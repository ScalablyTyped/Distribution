package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobInput extends StObject {
  
  /**
    *  The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect ratio of the input file, specify auto. If you want to specify the aspect ratio for the output file, enter one of the following values:   1:1, 4:3, 3:2, 16:9   If you specify a value other than auto, Elastic Transcoder disables automatic detection of the aspect ratio. 
    */
  var AspectRatio: js.UndefOr[typings.awsSdk.elastictranscoderMod.AspectRatio] = js.native
  
  /**
    * The container type for the input file. If you want Elastic Transcoder to automatically detect the container type of the input file, specify auto. If you want to specify the container type for the input file, enter one of the following values:   3gp, aac, asf, avi, divx, flv, m4a, mkv, mov, mp3, mp4, mpeg, mpeg-ps, mpeg-ts, mxf, ogg, vob, wav, webm 
    */
  var Container: js.UndefOr[JobContainer] = js.native
  
  /**
    * The detected properties of the input file.
    */
  var DetectedProperties: js.UndefOr[typings.awsSdk.elastictranscoderMod.DetectedProperties] = js.native
  
  /**
    * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file.
    */
  var Encryption: js.UndefOr[typings.awsSdk.elastictranscoderMod.Encryption] = js.native
  
  /**
    * The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of the input file, specify auto. If you want to specify the frame rate for the input file, enter one of the following values:   10, 15, 23.97, 24, 25, 29.97, 30, 60  If you specify a value other than auto, Elastic Transcoder disables automatic detection of the frame rate.
    */
  var FrameRate: js.UndefOr[typings.awsSdk.elastictranscoderMod.FrameRate] = js.native
  
  /**
    * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All captions must be in UTF-8. Elastic Transcoder supports two types of captions:    Embedded: Embedded captions are included in the same file as the audio and video. Elastic Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per file. Valid input values include: CEA-608 (EIA-608, first non-empty channel only), CEA-708 (EIA-708, first non-empty channel only), and mov-text  Valid outputs include: mov-text  Elastic Transcoder supports a maximum of one embedded format per output.    Sidecar: Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar captions require a player that is capable of understanding the relationship between the video file and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar captions per file. Valid input values include: dfxp (first div element only), ebu-tt, scc, smpt, srt, ttml (first div element only), and webvtt  Valid outputs include: dfxp (first div element only), scc, srt, and webvtt.   If you want ttml or smpte-tt compatible captions, specify dfxp as your output format. Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text formatting (for example, italics) during the transcoding process. To remove captions or leave the captions empty, set Captions to null. To pass through existing captions unchanged, set the MergePolicy to MergeRetain, and pass in a null CaptionSources array. For more information on embedded files, see the Subtitles Wikipedia page. For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
    */
  var InputCaptions: js.UndefOr[typings.awsSdk.elastictranscoderMod.InputCaptions] = js.native
  
  /**
    * Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the input file is interlaced, specify auto. If you want to specify whether the input file is interlaced, enter one of the following values:  true, false  If you specify a value other than auto, Elastic Transcoder disables automatic detection of interlacing.
    */
  var Interlaced: js.UndefOr[typings.awsSdk.elastictranscoderMod.Interlaced] = js.native
  
  /**
    *  The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline to use for processing the job. The InputBucket object in that pipeline tells Elastic Transcoder which Amazon S3 bucket to get the file from.  If the file name includes a prefix, such as cooking/lasagna.mpg, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
    */
  var Key: js.UndefOr[LongKey] = js.native
  
  /**
    * This value must be auto, which causes Elastic Transcoder to automatically detect the resolution of the input file.
    */
  var Resolution: js.UndefOr[typings.awsSdk.elastictranscoderMod.Resolution] = js.native
  
  /**
    * Settings for clipping an input. Each input can have different clip settings.
    */
  var TimeSpan: js.UndefOr[typings.awsSdk.elastictranscoderMod.TimeSpan] = js.native
}
object JobInput {
  
  @scala.inline
  def apply(): JobInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobInput]
  }
  
  @scala.inline
  implicit class JobInputMutableBuilder[Self <: JobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "AspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "AspectRatio", js.undefined)
    
    @scala.inline
    def setContainer(value: JobContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    @scala.inline
    def setDetectedProperties(value: DetectedProperties): Self = StObject.set(x, "DetectedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedPropertiesUndefined: Self = StObject.set(x, "DetectedProperties", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFrameRate(value: FrameRate): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    @scala.inline
    def setInputCaptions(value: InputCaptions): Self = StObject.set(x, "InputCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputCaptionsUndefined: Self = StObject.set(x, "InputCaptions", js.undefined)
    
    @scala.inline
    def setInterlaced(value: Interlaced): Self = StObject.set(x, "Interlaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlacedUndefined: Self = StObject.set(x, "Interlaced", js.undefined)
    
    @scala.inline
    def setKey(value: LongKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setResolution(value: Resolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: TimeSpan): Self = StObject.set(x, "TimeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "TimeSpan", js.undefined)
  }
}
