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
  var Text: CustomerInputString = js.native
}

object DetectSyntaxRequest {
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, Text: CustomerInputString): DetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSyntaxRequest]
  }
  @scala.inline
  implicit class DetectSyntaxRequestOps[Self <: DetectSyntaxRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguageCode(value: SyntaxLanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: CustomerInputString): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

