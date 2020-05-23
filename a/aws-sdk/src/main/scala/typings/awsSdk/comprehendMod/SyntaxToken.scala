package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxToken extends js.Object {
  /**
    * The zero-based offset from the beginning of the source text to the first character in the word.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The zero-based offset from the beginning of the source text to the last character in the word.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
    */
  var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.native
  /**
    * The word that was recognized in the source text.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * A unique identifier for a token.
    */
  var TokenId: js.UndefOr[Integer] = js.native
}

object SyntaxToken {
  @scala.inline
  def apply(
    BeginOffset: js.UndefOr[Integer] = js.undefined,
    EndOffset: js.UndefOr[Integer] = js.undefined,
    PartOfSpeech: PartOfSpeechTag = null,
    Text: String = null,
    TokenId: js.UndefOr[Integer] = js.undefined
  ): SyntaxToken = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BeginOffset)) __obj.updateDynamic("BeginOffset")(BeginOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EndOffset)) __obj.updateDynamic("EndOffset")(EndOffset.get.asInstanceOf[js.Any])
    if (PartOfSpeech != null) __obj.updateDynamic("PartOfSpeech")(PartOfSpeech.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (!js.isUndefined(TokenId)) __obj.updateDynamic("TokenId")(TokenId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxToken]
  }
}

