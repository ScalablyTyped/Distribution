package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the vocabulary filter for which to return information.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName
}
object GetVocabularyFilterRequest {
  
  inline def apply(VocabularyFilterName: VocabularyFilterName): GetVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyFilterRequest]
  }
  
  extension [Self <: GetVocabularyFilterRequest](x: Self) {
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}
