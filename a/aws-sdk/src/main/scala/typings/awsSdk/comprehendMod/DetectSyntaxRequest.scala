package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectSyntaxRequest extends StObject {
  
  /**
    * The language code of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt").
    */
  var LanguageCode: SyntaxLanguageCode
  
  /**
    * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF encoded characters.
    */
  var Text: CustomerInputString
}
object DetectSyntaxRequest {
  
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, Text: CustomerInputString): DetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSyntaxRequest]
  }
  
  @scala.inline
  implicit class DetectSyntaxRequestMutableBuilder[Self <: DetectSyntaxRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: SyntaxLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
