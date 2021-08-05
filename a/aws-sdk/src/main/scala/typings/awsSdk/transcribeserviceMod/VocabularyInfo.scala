package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VocabularyInfo extends StObject {
  
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyName] = js.undefined
  
  /**
    * The processing state of the vocabulary. If the state is READY you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyState] = js.undefined
}
object VocabularyInfo {
  
  inline def apply(): VocabularyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VocabularyInfo]
  }
  
  extension [Self <: VocabularyInfo](x: Self) {
    
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
