package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexiconAttributes extends js.Object {
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typings.awsSdk.pollyMod.Alphabet] = js.native
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[typings.awsSdk.pollyMod.LastModified] = js.native
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typings.awsSdk.pollyMod.LexemesCount] = js.native
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typings.awsSdk.pollyMod.LexiconArn] = js.native
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typings.awsSdk.pollyMod.Size] = js.native
}

object LexiconAttributes {
  @scala.inline
  def apply(
    Alphabet: Alphabet = null,
    LanguageCode: LanguageCode = null,
    LastModified: LastModified = null,
    LexemesCount: js.UndefOr[LexemesCount] = js.undefined,
    LexiconArn: LexiconArn = null,
    Size: js.UndefOr[Size] = js.undefined
  ): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    if (Alphabet != null) __obj.updateDynamic("Alphabet")(Alphabet.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (!js.isUndefined(LexemesCount)) __obj.updateDynamic("LexemesCount")(LexemesCount.get.asInstanceOf[js.Any])
    if (LexiconArn != null) __obj.updateDynamic("LexiconArn")(LexiconArn.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexiconAttributes]
  }
}

