package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscript extends StObject {
  
  /**
    * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript. If you included OutputBucketName in your transcription job request, this is the URI of that bucket. If you also included OutputKey in your request, your output is located in the path you specified in your request. If you didn't include OutputBucketName in your transcription job request, your transcript is stored in a service-managed bucket, and TranscriptFileUri provides you with a temporary URI you can use for secure access to your transcript.  Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an AccesDenied error, you can get a new temporary URI by running a GetTranscriptionJob or ListTranscriptionJob request. 
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.undefined
}
object MedicalTranscript {
  
  inline def apply(): MedicalTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscript]
  }
  
  extension [Self <: MedicalTranscript](x: Self) {
    
    inline def setTranscriptFileUri(value: Uri): Self = StObject.set(x, "TranscriptFileUri", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFileUriUndefined: Self = StObject.set(x, "TranscriptFileUri", js.undefined)
  }
}
