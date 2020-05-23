package typings.badWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadWordsFilter extends js.Object {
  def addWords(words: String*): Unit
  def clean(text: String): String
  def isProfane(text: String): Boolean
  def removeWords(words: String*): Unit
  def replaceWord(text: String): String
}

object BadWordsFilter {
  @scala.inline
  def apply(
    addWords: /* repeated */ String => Unit,
    clean: String => String,
    isProfane: String => Boolean,
    removeWords: /* repeated */ String => Unit,
    replaceWord: String => String
  ): BadWordsFilter = {
    val __obj = js.Dynamic.literal(addWords = js.Any.fromFunction1(addWords), clean = js.Any.fromFunction1(clean), isProfane = js.Any.fromFunction1(isProfane), removeWords = js.Any.fromFunction1(removeWords), replaceWord = js.Any.fromFunction1(replaceWord))
    __obj.asInstanceOf[BadWordsFilter]
  }
}

