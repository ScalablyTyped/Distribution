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

