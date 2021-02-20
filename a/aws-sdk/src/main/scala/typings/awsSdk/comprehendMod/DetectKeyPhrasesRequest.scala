package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectKeyPhrasesRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode = js.native
  
  /**
    * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: CustomerInputString = js.native
}
object DetectKeyPhrasesRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, Text: CustomerInputString): DetectKeyPhrasesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectKeyPhrasesRequest]
  }
  
  @scala.inline
  implicit class DetectKeyPhrasesRequestMutableBuilder[Self <: DetectKeyPhrasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
