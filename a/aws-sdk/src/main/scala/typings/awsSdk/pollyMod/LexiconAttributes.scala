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
  def apply(): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconAttributes]
  }
  @scala.inline
  implicit class LexiconAttributesOps[Self <: LexiconAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlphabet(value: Alphabet): Self = this.set("Alphabet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphabet: Self = this.set("Alphabet", js.undefined)
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLastModified(value: LastModified): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setLexemesCount(value: LexemesCount): Self = this.set("LexemesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexemesCount: Self = this.set("LexemesCount", js.undefined)
    @scala.inline
    def setLexiconArn(value: LexiconArn): Self = this.set("LexiconArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexiconArn: Self = this.set("LexiconArn", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

