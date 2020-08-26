package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectKeyPhrasesRequest extends js.Object {
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
  implicit class DetectKeyPhrasesRequestOps[Self <: DetectKeyPhrasesRequest] (val x: Self) extends AnyVal {
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
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: CustomerInputString): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

