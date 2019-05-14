package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentenceOptions extends js.Object {
  var punctuation: chanceLib.chanceLibStrings.DOT | chanceLib.chanceLibStrings.`?` | chanceLib.chanceLibStrings.`;` | chanceLib.chanceLibStrings.`!` | chanceLib.chanceLibStrings.`:` | scala.Boolean
  var words: scala.Double
}

object SentenceOptions {
  @scala.inline
  def apply(
    punctuation: chanceLib.chanceLibStrings.DOT | chanceLib.chanceLibStrings.`?` | chanceLib.chanceLibStrings.`;` | chanceLib.chanceLibStrings.`!` | chanceLib.chanceLibStrings.`:` | scala.Boolean,
    words: scala.Double
  ): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words)
  
    __obj.asInstanceOf[SentenceOptions]
  }
}

