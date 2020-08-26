package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLexiconOutput extends js.Object {
  /**
    * Lexicon object that provides name and the string content of the lexicon. 
    */
  var Lexicon: js.UndefOr[typings.awsSdk.pollyMod.Lexicon] = js.native
  /**
    * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
    */
  var LexiconAttributes: js.UndefOr[typings.awsSdk.pollyMod.LexiconAttributes] = js.native
}

object GetLexiconOutput {
  @scala.inline
  def apply(): GetLexiconOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLexiconOutput]
  }
  @scala.inline
  implicit class GetLexiconOutputOps[Self <: GetLexiconOutput] (val x: Self) extends AnyVal {
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
    def setLexicon(value: Lexicon): Self = this.set("Lexicon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexicon: Self = this.set("Lexicon", js.undefined)
    @scala.inline
    def setLexiconAttributes(value: LexiconAttributes): Self = this.set("LexiconAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexiconAttributes: Self = this.set("LexiconAttributes", js.undefined)
  }
  
}

