package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMedicalVocabularyRequest extends StObject {
  
  /**
    * The name of the vocabulary that you want information about. The value is case sensitive. 
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object GetMedicalVocabularyRequest {
  
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMedicalVocabularyRequest]
  }
  
  @scala.inline
  implicit class GetMedicalVocabularyRequestMutableBuilder[Self <: GetMedicalVocabularyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
