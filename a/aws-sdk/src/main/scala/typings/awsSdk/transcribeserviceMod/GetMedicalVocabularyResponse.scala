package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalVocabularyResponse extends StObject {
  
  /**
    * The S3 location where the specified medical vocabulary is stored; use this URI to view or download the vocabulary.
    */
  var DownloadUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * If VocabularyState is FAILED, FailureReason contains information about why the medical vocabulary request failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time the specified custom medical vocabulary was last modified. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the custom medical vocabulary you requested information about.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.undefined
  
  /**
    * The processing state of your custom medical vocabulary. If the state is READY, you can use the vocabulary in a StartMedicalTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.undefined
}
object GetMedicalVocabularyResponse {
  
  inline def apply(): GetMedicalVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMedicalVocabularyResponse]
  }
  
  extension [Self <: GetMedicalVocabularyResponse](x: Self) {
    
    inline def setDownloadUri(value: Uri): Self = StObject.set(x, "DownloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "DownloadUri", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    inline def setVocabularyState(value: VocabularyState): Self = StObject.set(x, "VocabularyState", value.asInstanceOf[js.Any])
    
    inline def setVocabularyStateUndefined: Self = StObject.set(x, "VocabularyState", js.undefined)
  }
}
