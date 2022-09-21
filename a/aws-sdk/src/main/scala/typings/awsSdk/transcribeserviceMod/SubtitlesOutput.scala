package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitlesOutput extends StObject {
  
  /**
    * Provides the format of your subtitle files. If your request included both WebVTT (vtt) and SubRip (srt) formats, both formats are shown.
    */
  var Formats: js.UndefOr[SubtitleFormats] = js.undefined
  
  /**
    * Provides the start index value for your subtitle files. If you did not specify a value in your request, the default value of 0 is used.
    */
  var OutputStartIndex: js.UndefOr[SubtitleOutputStartIndex] = js.undefined
  
  /**
    * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle formats, two URIs are provided. If you included OutputBucketName in your transcription job request, this is the URI of that bucket. If you also included OutputKey in your request, your output is located in the path you specified in your request. If you didn't include OutputBucketName in your transcription job request, your subtitle file is stored in a service-managed bucket, and TranscriptFileUri provides you with a temporary URI you can use for secure access to your subtitle file.  Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an AccesDenied error, you can get a new temporary URI by running a GetTranscriptionJob or ListTranscriptionJob request. 
    */
  var SubtitleFileUris: js.UndefOr[typings.awsSdk.transcribeserviceMod.SubtitleFileUris] = js.undefined
}
object SubtitlesOutput {
  
  inline def apply(): SubtitlesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtitlesOutput]
  }
  
  extension [Self <: SubtitlesOutput](x: Self) {
    
    inline def setFormats(value: SubtitleFormats): Self = StObject.set(x, "Formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "Formats", js.undefined)
    
    inline def setFormatsVarargs(value: SubtitleFormat*): Self = StObject.set(x, "Formats", js.Array(value*))
    
    inline def setOutputStartIndex(value: SubtitleOutputStartIndex): Self = StObject.set(x, "OutputStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOutputStartIndexUndefined: Self = StObject.set(x, "OutputStartIndex", js.undefined)
    
    inline def setSubtitleFileUris(value: SubtitleFileUris): Self = StObject.set(x, "SubtitleFileUris", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFileUrisUndefined: Self = StObject.set(x, "SubtitleFileUris", js.undefined)
    
    inline def setSubtitleFileUrisVarargs(value: Uri*): Self = StObject.set(x, "SubtitleFileUris", js.Array(value*))
  }
}
