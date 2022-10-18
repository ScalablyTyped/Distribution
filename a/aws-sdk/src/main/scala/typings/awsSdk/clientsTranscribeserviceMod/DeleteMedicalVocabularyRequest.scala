package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMedicalVocabularyRequest extends StObject {
  
  /**
    * The name of the custom medical vocabulary you want to delete. Vocabulary names are case sensitive.
    */
  var VocabularyName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyName
}
object DeleteMedicalVocabularyRequest {
  
  inline def apply(VocabularyName: VocabularyName): DeleteMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMedicalVocabularyRequest]
  }
  
  extension [Self <: DeleteMedicalVocabularyRequest](x: Self) {
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
