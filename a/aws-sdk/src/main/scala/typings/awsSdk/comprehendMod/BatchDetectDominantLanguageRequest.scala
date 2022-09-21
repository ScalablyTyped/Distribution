package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectDominantLanguageRequest extends StObject {
  
  /**
    * A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25 documents. Each document should contain at least 20 characters. The maximum size of each document is 5 KB.
    */
  var TextList: CustomerInputStringList
}
object BatchDetectDominantLanguageRequest {
  
  inline def apply(TextList: CustomerInputStringList): BatchDetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
  }
  
  extension [Self <: BatchDetectDominantLanguageRequest](x: Self) {
    
    inline def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    inline def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value*))
  }
}
