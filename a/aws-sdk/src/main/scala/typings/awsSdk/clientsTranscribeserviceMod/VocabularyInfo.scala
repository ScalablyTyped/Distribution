package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VocabularyInfo extends StObject {
  
  /**
    * The language code used to create your custom vocabulary. Each vocabulary must contain terms in only one language. A custom vocabulary can only be used to transcribe files in the same language as the vocabulary. For example, if you create a vocabulary using US English (en-US), you can only apply this vocabulary to files that contain English audio.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time the specified vocabulary was last modified. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique name, chosen by you, for your custom vocabulary. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
  
  /**
    * The processing state of your custom vocabulary. If the state is READY, you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyState] = js.undefined
}
object VocabularyInfo {
  
  inline def apply(): VocabularyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VocabularyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VocabularyInfo] (val x: Self) extends AnyVal {
    
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
