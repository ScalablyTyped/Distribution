package typings.chance.Chance

import typings.chance.chanceStrings.Colon
import typings.chance.chanceStrings.Dot
import typings.chance.chanceStrings.Exclamationmark
import typings.chance.chanceStrings.Questionmark
import typings.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentenceOptions extends js.Object {
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean
  var words: Double
}

object SentenceOptions {
  @scala.inline
  def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean, words: Double): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentenceOptions]
  }
}

