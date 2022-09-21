package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectSyntaxRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.
    */
  var LanguageCode: SyntaxLanguageCode
  
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList
}
object BatchDetectSyntaxRequest {
  
  inline def apply(LanguageCode: SyntaxLanguageCode, TextList: CustomerInputStringList): BatchDetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSyntaxRequest]
  }
  
  extension [Self <: BatchDetectSyntaxRequest](x: Self) {
    
    inline def setLanguageCode(value: SyntaxLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    inline def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value*))
  }
}
