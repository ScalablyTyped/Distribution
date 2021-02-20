package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVocabularyResponse extends StObject {
  
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * The date and time that the vocabulary was updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the vocabulary that was updated.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  
  /**
    * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}
object UpdateVocabularyResponse {
  
  @scala.inline
  def apply(): UpdateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVocabularyResponse]
  }
  
  @scala.inline
  implicit class UpdateVocabularyResponseMutableBuilder[Self <: UpdateVocabularyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    @scala.inline
    def setVocabularyState(value: VocabularyState): Self = StObject.set(x, "VocabularyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyStateUndefined: Self = StObject.set(x, "VocabularyState", js.undefined)
  }
}
