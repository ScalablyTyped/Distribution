package typings.chance.ChanceNs

import typings.chance.chanceStrings.DOT
import typings.chance.chanceStrings.`!`
import typings.chance.chanceStrings.`:`
import typings.chance.chanceStrings.`;`
import typings.chance.chanceStrings.`?`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentenceOptions extends js.Object {
  var punctuation: DOT | `?` | `;` | `!` | `:` | Boolean
  var words: Double
}

object SentenceOptions {
  @scala.inline
  def apply(punctuation: DOT | `?` | `;` | `!` | `:` | Boolean, words: Double): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words)
  
    __obj.asInstanceOf[SentenceOptions]
  }
}

