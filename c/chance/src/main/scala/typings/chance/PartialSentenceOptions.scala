package typings.chance

import typings.chance.chanceStrings.Colon
import typings.chance.chanceStrings.Dot
import typings.chance.chanceStrings.Exclamationmark
import typings.chance.chanceStrings.Questionmark
import typings.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.SentenceOptions> */
trait PartialSentenceOptions extends js.Object {
  var punctuation: js.UndefOr[Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean] = js.undefined
  var words: js.UndefOr[Double] = js.undefined
}

object PartialSentenceOptions {
  @scala.inline
  def apply(
    punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean = null,
    words: Int | Double = null
  ): PartialSentenceOptions = {
    val __obj = js.Dynamic.literal()
    if (punctuation != null) __obj.updateDynamic("punctuation")(punctuation.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSentenceOptions]
  }
}

