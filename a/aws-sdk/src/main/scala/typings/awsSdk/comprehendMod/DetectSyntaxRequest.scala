package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectSyntaxRequest extends js.Object {
  /**
    * The language code of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt").
    */
  var LanguageCode: SyntaxLanguageCode = js.native
  /**
    * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF encoded characters.
    */
  var Text: String = js.native
}

object DetectSyntaxRequest {
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, Text: String): DetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSyntaxRequest]
  }
}

