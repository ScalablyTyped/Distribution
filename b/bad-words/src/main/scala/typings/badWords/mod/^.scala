package typings.badWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bad-words", JSImport.Namespace)
@js.native
class ^ () extends BadWordsFilter {
  def this(options: Options) = this()
  /* CompleteClass */
  override def addWords(words: String*): Unit = js.native
  /* CompleteClass */
  override def clean(text: String): String = js.native
  /* CompleteClass */
  override def isProfane(text: String): Boolean = js.native
  /* CompleteClass */
  override def removeWords(words: String*): Unit = js.native
  /* CompleteClass */
  override def replaceWord(text: String): String = js.native
}

