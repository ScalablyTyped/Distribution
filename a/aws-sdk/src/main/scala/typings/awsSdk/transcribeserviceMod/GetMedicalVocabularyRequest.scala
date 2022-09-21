package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalVocabularyRequest extends StObject {
  
  /**
    * The name of the custom medical vocabulary you want information about. Vocabulary names are case sensitive.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object GetMedicalVocabularyRequest {
  
  inline def apply(VocabularyName: VocabularyName): GetMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalVocabularyRequest]
  }
  
  extension [Self <: GetMedicalVocabularyRequest](x: Self) {
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
