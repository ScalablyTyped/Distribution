package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.SentenceOptions ]: std.Pick<chance.Chance.SentenceOptions, K>} */
trait KinkeyofSentenceOptionsPi extends js.Object {
  var punctuation: PickSentenceOptionspunctu
  var words: PickSentenceOptionswords
}

object KinkeyofSentenceOptionsPi {
  @scala.inline
  def apply(punctuation: PickSentenceOptionspunctu, words: PickSentenceOptionswords): KinkeyofSentenceOptionsPi = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofSentenceOptionsPi]
  }
}

