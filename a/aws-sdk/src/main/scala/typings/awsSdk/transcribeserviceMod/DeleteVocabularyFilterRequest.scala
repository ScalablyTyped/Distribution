package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the vocabulary filter to remove.
    */
  var VocabularyFilterName: typings.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
}
object DeleteVocabularyFilterRequest {
  
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): DeleteVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit class DeleteVocabularyFilterRequestMutableBuilder[Self <: DeleteVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}
