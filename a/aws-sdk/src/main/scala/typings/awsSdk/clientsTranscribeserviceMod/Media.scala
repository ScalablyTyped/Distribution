package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  /**
    * The Amazon S3 location of the media file you want to transcribe. For example:    s3://DOC-EXAMPLE-BUCKET/my-media-file.flac     s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac    Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services Region where you're making your transcription request.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The Amazon S3 location of the media file you want to redact. For example:    s3://DOC-EXAMPLE-BUCKET/my-media-file.flac     s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac    Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services Region where you're making your transcription request.   RedactedMediaFileUri is only supported for Call Analytics (StartCallAnalyticsJob) transcription requests. 
    */
  var RedactedMediaFileUri: js.UndefOr[Uri] = js.undefined
}
object Media {
  
  inline def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    inline def setMediaFileUri(value: Uri): Self = StObject.set(x, "MediaFileUri", value.asInstanceOf[js.Any])
    
    inline def setMediaFileUriUndefined: Self = StObject.set(x, "MediaFileUri", js.undefined)
    
    inline def setRedactedMediaFileUri(value: Uri): Self = StObject.set(x, "RedactedMediaFileUri", value.asInstanceOf[js.Any])
    
    inline def setRedactedMediaFileUriUndefined: Self = StObject.set(x, "RedactedMediaFileUri", js.undefined)
  }
}
