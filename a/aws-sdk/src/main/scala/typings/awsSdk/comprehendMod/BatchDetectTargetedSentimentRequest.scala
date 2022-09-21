package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectTargetedSentimentRequest extends StObject {
  
  /**
    * The language of the input documents. Currently, English is the only supported language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode
  
  /**
    * A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25 documents. The maximum size of each document is 5 KB.
    */
  var TextList: CustomerInputStringList
}
object BatchDetectTargetedSentimentRequest {
  
  inline def apply(LanguageCode: LanguageCode, TextList: CustomerInputStringList): BatchDetectTargetedSentimentRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectTargetedSentimentRequest]
  }
  
  extension [Self <: BatchDetectTargetedSentimentRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    inline def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value*))
  }
}
