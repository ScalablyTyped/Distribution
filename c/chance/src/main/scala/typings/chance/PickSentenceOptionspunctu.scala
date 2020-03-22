package typings.chance

import typings.chance.chanceStrings.Colon
import typings.chance.chanceStrings.Dot
import typings.chance.chanceStrings.Exclamationmark
import typings.chance.chanceStrings.Questionmark
import typings.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.SentenceOptions, 'punctuation'> */
trait PickSentenceOptionspunctu extends js.Object {
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean
}

object PickSentenceOptionspunctu {
  @scala.inline
  def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): PickSentenceOptionspunctu = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickSentenceOptionspunctu]
  }
}

