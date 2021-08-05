package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transcript extends StObject {
  
  /**
    * The S3 object location of the redacted transcript. Use this URI to access the redacted transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var RedactedTranscriptFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The S3 object location of the transcript. Use this URI to access the transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.undefined
}
object Transcript {
  
  inline def apply(): Transcript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcript]
  }
  
  extension [Self <: Transcript](x: Self) {
    
    inline def setRedactedTranscriptFileUri(value: Uri): Self = StObject.set(x, "RedactedTranscriptFileUri", value.asInstanceOf[js.Any])
    
    inline def setRedactedTranscriptFileUriUndefined: Self = StObject.set(x, "RedactedTranscriptFileUri", js.undefined)
    
    inline def setTranscriptFileUri(value: Uri): Self = StObject.set(x, "TranscriptFileUri", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFileUriUndefined: Self = StObject.set(x, "TranscriptFileUri", js.undefined)
  }
}
