package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSyntaxRequest extends js.Object {
  /**
    * The language of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.
    */
  var LanguageCode: SyntaxLanguageCode = js.native
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: StringList = js.native
}

object BatchDetectSyntaxRequest {
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, TextList: StringList): BatchDetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDetectSyntaxRequest]
  }
}

