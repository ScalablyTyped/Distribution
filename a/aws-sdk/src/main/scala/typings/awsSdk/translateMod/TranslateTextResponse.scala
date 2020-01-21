package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateTextResponse extends js.Object {
  /**
    * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text response.
    */
  var AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.native
  /**
    * The language code for the language of the source text.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  /**
    * The language code for the language of the target text. 
    */
  var TargetLanguageCode: LanguageCodeString = js.native
  /**
    * The translated text.
    */
  var TranslatedText: String = js.native
}

object TranslateTextResponse {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    TranslatedText: String,
    AppliedTerminologies: AppliedTerminologyList = null
  ): TranslateTextResponse = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], TranslatedText = TranslatedText.asInstanceOf[js.Any])
    if (AppliedTerminologies != null) __obj.updateDynamic("AppliedTerminologies")(AppliedTerminologies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextResponse]
  }
}

