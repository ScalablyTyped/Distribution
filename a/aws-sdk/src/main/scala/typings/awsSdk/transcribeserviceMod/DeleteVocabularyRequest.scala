package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVocabularyRequest extends StObject {
  
  /**
    * The name of the custom vocabulary you want to delete. Vocabulary names are case sensitive.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object DeleteVocabularyRequest {
  
  inline def apply(VocabularyName: VocabularyName): DeleteVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyRequest]
  }
  
  extension [Self <: DeleteVocabularyRequest](x: Self) {
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
