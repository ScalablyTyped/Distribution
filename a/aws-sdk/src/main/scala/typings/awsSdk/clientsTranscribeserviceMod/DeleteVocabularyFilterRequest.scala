package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the custom vocabulary filter you want to delete. Custom vocabulary filter names are case sensitive.
    */
  var VocabularyFilterName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName
}
object DeleteVocabularyFilterRequest {
  
  inline def apply(VocabularyFilterName: VocabularyFilterName): DeleteVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}
