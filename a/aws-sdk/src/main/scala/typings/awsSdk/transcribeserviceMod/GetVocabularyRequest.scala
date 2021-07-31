package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVocabularyRequest extends StObject {
  
  /**
    * The name of the vocabulary to return information about. The name is case sensitive.
    */
  var VocabularyName: typings.awsSdk.transcribeserviceMod.VocabularyName
}
object GetVocabularyRequest {
  
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyRequest]
  }
  
  @scala.inline
  implicit class GetVocabularyRequestMutableBuilder[Self <: GetVocabularyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
