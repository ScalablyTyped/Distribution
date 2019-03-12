package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenIterator extends js.Object {
  /**
    * Returns the current tokenized string.
    **/
  def getCurrentToken(): TokenInfo
  /**
    * Returns the current column.
    **/
  def getCurrentTokenColumn(): scala.Double
  /**
    * Returns the current row.
    **/
  def getCurrentTokenRow(): scala.Double
  /**
    * Tokenizes all the items from the current point to the row prior in the document.
    **/
  def stepBackward(): js.Array[java.lang.String]
  /**
    * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
    **/
  def stepForward(): java.lang.String
}

object TokenIterator {
  @scala.inline
  def apply(
    getCurrentToken: () => TokenInfo,
    getCurrentTokenColumn: () => scala.Double,
    getCurrentTokenRow: () => scala.Double,
    stepBackward: () => js.Array[java.lang.String],
    stepForward: () => java.lang.String
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = js.Any.fromFunction0(getCurrentToken), getCurrentTokenColumn = js.Any.fromFunction0(getCurrentTokenColumn), getCurrentTokenRow = js.Any.fromFunction0(getCurrentTokenRow), stepBackward = js.Any.fromFunction0(stepBackward), stepForward = js.Any.fromFunction0(stepForward))
  
    __obj.asInstanceOf[TokenIterator]
  }
}

