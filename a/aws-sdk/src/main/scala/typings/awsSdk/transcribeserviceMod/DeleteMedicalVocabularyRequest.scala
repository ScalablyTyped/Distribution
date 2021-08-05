package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMedicalVocabularyRequest extends StObject {
  
  /**
    * The name of the vocabulary that you want to delete.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
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
