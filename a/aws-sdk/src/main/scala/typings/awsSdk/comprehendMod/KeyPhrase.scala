package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPhrase extends js.Object {
  /**
    * A character offset in the input text that shows where the key phrase begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * A character offset in the input text where the key phrase ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The text of a key noun phrase.
    */
  var Text: js.UndefOr[String] = js.native
}

object KeyPhrase {
  @scala.inline
  def apply(): KeyPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrase]
  }
  @scala.inline
  implicit class KeyPhraseOps[Self <: KeyPhrase] (val x: Self) extends AnyVal {
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
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOffset: Self = this.set("EndOffset", js.undefined)
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
  
}

