package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMedicalVocabularyResponse extends StObject {
  
  /**
    * If the VocabularyState field is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code for Amazon Transcribe Medical.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time that you created the vocabulary.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.undefined
  
  /**
    * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is READY, you can use the vocabulary in a StartMedicalTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.undefined
}
object CreateMedicalVocabularyResponse {
  
  inline def apply(): CreateMedicalVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMedicalVocabularyResponse]
  }
  
  extension [Self <: CreateMedicalVocabularyResponse](x: Self) {
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    inline def setVocabularyState(value: VocabularyState): Self = StObject.set(x, "VocabularyState", value.asInstanceOf[js.Any])
    
    inline def setVocabularyStateUndefined: Self = StObject.set(x, "VocabularyState", js.undefined)
  }
}
