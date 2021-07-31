package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectDominantLanguageRequest extends StObject {
  
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document should contain at least 20 characters and must contain fewer than 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList
}
object BatchDetectDominantLanguageRequest {
  
  @scala.inline
  def apply(TextList: CustomerInputStringList): BatchDetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
  }
  
  @scala.inline
  implicit class BatchDetectDominantLanguageRequestMutableBuilder[Self <: BatchDetectDominantLanguageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value :_*))
  }
}
