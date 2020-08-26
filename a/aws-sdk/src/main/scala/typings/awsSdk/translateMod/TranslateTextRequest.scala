package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateTextRequest extends js.Object {
  /**
    * The language code for the language of the source text. The language must be a language supported by Amazon Translate. For a list of language codes, see what-is-languages. To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  /**
    * The language code requested for the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCode: LanguageCodeString = js.native
  /**
    * The name of the terminology list file to be used in the TranslateText request. You can use 1 terminology list at most in a TranslateText request. Terminology lists can contain a maximum of 256 terms.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
  /**
    * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set, this may be fewer than 5,000 characters.
    */
  var Text: BoundedLengthString = js.native
}

object TranslateTextRequest {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    Text: BoundedLengthString
  ): TranslateTextRequest = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextRequest]
  }
  @scala.inline
  implicit class TranslateTextRequestOps[Self <: TranslateTextRequest] (val x: Self) extends AnyVal {
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
    def setSourceLanguageCode(value: LanguageCodeString): Self = this.set("SourceLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetLanguageCode(value: LanguageCodeString): Self = this.set("TargetLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: BoundedLengthString): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminologyNamesVarargs(value: ResourceName*): Self = this.set("TerminologyNames", js.Array(value :_*))
    @scala.inline
    def setTerminologyNames(value: ResourceNameList): Self = this.set("TerminologyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminologyNames: Self = this.set("TerminologyNames", js.undefined)
  }
  
}

