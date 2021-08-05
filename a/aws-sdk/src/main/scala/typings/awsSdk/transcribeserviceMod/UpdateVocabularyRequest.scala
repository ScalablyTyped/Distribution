package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVocabularyRequest extends StObject {
  
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode
  
  /**
    * An array of strings containing the vocabulary entries.
    */
  var Phrases: js.UndefOr[typings.awsSdk.transcribeserviceMod.Phrases] = js.undefined
  
  /**
    * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the same region as the API endpoint that you are calling. The general form is  For example: For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same name as a previous vocabulary you will receive a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object UpdateVocabularyRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): UpdateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyRequest]
  }
  
  extension [Self <: UpdateVocabularyRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setPhrases(value: Phrases): Self = StObject.set(x, "Phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "Phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: Phrase*): Self = StObject.set(x, "Phrases", js.Array(value :_*))
    
    inline def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFileUriUndefined: Self = StObject.set(x, "VocabularyFileUri", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
