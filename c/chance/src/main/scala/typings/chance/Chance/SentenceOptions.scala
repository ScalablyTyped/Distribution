package typings.chance.Chance

import typings.chance.chanceStrings.Colon
import typings.chance.chanceStrings.Dot
import typings.chance.chanceStrings.Exclamationmark
import typings.chance.chanceStrings.Questionmark
import typings.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentenceOptions extends js.Object {
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean = js.native
  var words: Double = js.native
}

object SentenceOptions {
  @scala.inline
  def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean, words: Double): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceOptions]
  }
  @scala.inline
  implicit class SentenceOptionsOps[Self <: SentenceOptions] (val x: Self) extends AnyVal {
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
    def setPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = this.set("punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

