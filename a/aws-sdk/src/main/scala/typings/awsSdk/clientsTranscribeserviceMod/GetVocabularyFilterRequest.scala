package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the custom vocabulary filter you want information about. Custom vocabulary filter names are case sensitive.
    */
  var VocabularyFilterName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName
}
object GetVocabularyFilterRequest {
  
  inline def apply(VocabularyFilterName: VocabularyFilterName): GetVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}
